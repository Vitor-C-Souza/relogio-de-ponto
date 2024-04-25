package br.com.vitorcsouza.relogiodeponto.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntradaDto {
    private Long id;
    private String entrada;


    public EntradaDto(Long id, String entrada) {
        this.id = id;
        this.entrada = entrada;
    }
}
