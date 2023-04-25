package br.senai.exercicios.controllers;

import br.senai.exercicios.models.Resposta;
import br.senai.exercicios.services.RespostaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/respostas")
public class RespostaController {
    @Autowired
    private RespostaService service;

    @GetMapping("/{id}")
    public Resposta lista(@PathVariable Long id) {
        return service.lista(id);
    }

    @GetMapping
    public List<Resposta> lista() {
        return service.lista();
    }

    @PostMapping
    public void cadastra(@RequestBody Resposta resposta) {
        service.cadastra(resposta);
    }

}
