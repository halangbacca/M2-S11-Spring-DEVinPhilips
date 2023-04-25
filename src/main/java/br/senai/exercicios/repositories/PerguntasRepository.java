package br.senai.exercicios.repositories;

import br.senai.exercicios.models.Perguntas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerguntasRepository extends JpaRepository<Perguntas, Long> {
}
