package br.senai.exercicios.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Perguntas {
    private Long id;
    private String titulo;
    private String texto;
    private Long id_quiz;
}
