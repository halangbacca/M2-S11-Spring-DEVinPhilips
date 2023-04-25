package br.senai.exercicios.repositories;

import br.senai.exercicios.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
