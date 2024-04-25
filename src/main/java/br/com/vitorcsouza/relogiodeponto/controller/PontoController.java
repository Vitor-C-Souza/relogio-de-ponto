package br.com.vitorcsouza.relogiodeponto.controller;

import br.com.vitorcsouza.relogiodeponto.dto.EntradaDto;
import br.com.vitorcsouza.relogiodeponto.dto.SaidaDto;
import br.com.vitorcsouza.relogiodeponto.service.PontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ponto")
public class PontoController {
    @Autowired
    PontoService service;

    @GetMapping("/entrada")
    public ResponseEntity<EntradaDto> entrada() {
        EntradaDto dto = service.entrada();

        return ResponseEntity.ok(dto);
    }

    @GetMapping("/saida/{id}")
    public ResponseEntity<SaidaDto> saida(@PathVariable Long id) {
        SaidaDto dto = service.saida(id);

        return ResponseEntity.ok(dto);
    }
}
