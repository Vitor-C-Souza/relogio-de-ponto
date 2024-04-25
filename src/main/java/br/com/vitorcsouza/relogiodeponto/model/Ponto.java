package br.com.vitorcsouza.relogiodeponto.model;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;

@Entity
@Table(name = "ponto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ponto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime entrada;
    private LocalDateTime saida;
    private String saldo_de_horas;

    public Ponto(LocalDateTime entrada) {
        this.entrada = entrada;
    }
}
