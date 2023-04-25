package br.senai.exercicios.repositories;

import br.senai.exercicios.models.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespostaRepository extends JpaRepository<Resposta, Long> {
}
