package br.senai.exercicios.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {
    private Long id;
    private String nome;
    private String descricao;
}
