package br.senai.exercicios.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resposta {
    private Long id;
    private String texto;
    private Long id_pergunta;
}
