package br.gov.sp.fatec.avaliacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.avaliacao.entity.Trabalho;
import br.gov.sp.fatec.avaliacao.service.AvaliacaoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/avaliacao")
public class AvaliacaoController {
    
    @Autowired    
    private AvaliacaoService service;

    @PostMapping(value = "/trabalho")
    public Trabalho novoTrabalho(@RequestBody Trabalho trabalho) {
        service.cadastrarTrabalho(trabalho);
        return trabalho;
    }

    @PostMapping(value = "/{idTrabalho}/{nota}")
    public void avaliar(@PathVariable("idTrabalho") Long idTrabalho, @PathVariable("nota") Integer nota) {
        service.avaliarTrabalho(idTrabalho, nota);
    }

    @GetMapping(value = "/trabalho")
    public List<Trabalho> buscarTrabalhos() {
        return service.buscarTrabalhos();
    }
}
