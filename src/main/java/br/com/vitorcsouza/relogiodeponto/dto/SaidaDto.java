package br.com.vitorcsouza.relogiodeponto.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaidaDto {
    private Long id;
    private String entrada;
    private String saida;
    private String saldo_de_horas;


    public SaidaDto(Long id, String entrada, String saida, String saldo_de_horas) {
        this.id = id;
        this.entrada = entrada;
        this.saida = saida;
        this.saldo_de_horas = saldo_de_horas;
    }

}
