package br.senai.exercicios.services;

import br.senai.exercicios.models.Pergunta;
import br.senai.exercicios.repositories.PerguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerguntaService {
    @Autowired
    private PerguntaRepository repository;

    public void cadastra(Pergunta pergunta) {
        repository.save(pergunta);
    }

    public Pergunta lista(Long id) {
        return repository.findById(id).get();
    }

    public List<Pergunta> lista() {
        return repository.findAll();
    }

    public void deleta(Long id) {
        repository.deleteById(id);
    }

}
