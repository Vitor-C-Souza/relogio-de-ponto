package br.com.vitorcsouza.relogiodeponto.service;

import br.com.vitorcsouza.relogiodeponto.dto.EntradaDto;
import br.com.vitorcsouza.relogiodeponto.dto.SaidaDto;
import br.com.vitorcsouza.relogiodeponto.model.Ponto;
import br.com.vitorcsouza.relogiodeponto.repository.PontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Service
public class PontoService {

    private final DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", new Locale("pt", "BR"));

    @Autowired
    PontoRepository repository;

    public EntradaDto entrada() {

        Ponto ponto = new Ponto(LocalDateTime.now());
        repository.save(ponto);

        return new EntradaDto(
                ponto.getId(),
                ponto.getEntrada().format(formatador));
    }


    public SaidaDto saida(Long id) {
        Ponto ponto = repository.getReferenceById(id);
        ponto.setSaida(LocalDateTime.now());

        Duration duration = Duration.between(ponto.getEntrada(), ponto.getSaida());
        String saldo = duration.toHours() + ":" + duration.toMinutes() + ":" + duration.toSecondsPart();
        ponto.setSaldo_de_horas(saldo);

//        repository.save(ponto);

        return new SaidaDto(
                ponto.getId(),
                ponto.getEntrada().format(formatador),
                ponto.getSaida().format(formatador),
                saldo
        );
    }
}
