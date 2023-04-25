package br.senai.exercicios.controllers;

import br.senai.exercicios.models.Pergunta;
import br.senai.exercicios.services.PerguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perguntas")
public class PerguntaController {
    @Autowired
    private PerguntaService service;

    @GetMapping("/{id}")
    public Pergunta lista(@PathVariable Long id) {
        return service.lista(id);
    }

    @GetMapping
    public List<Pergunta> lista() {
        return service.lista();
    }

    @PostMapping
    public void cadastra(@RequestBody Pergunta pergunta) {
        service.cadastra(pergunta);
    }

}