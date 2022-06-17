package br.gov.sp.fatec.avaliacao.service;

import java.util.List;

import br.gov.sp.fatec.avaliacao.entity.Trabalho;

public interface AvaliacaoService {

    public Trabalho cadastrarTrabalho(Trabalho trabalho);

    public void avaliarTrabalho(Long idTrabalho, Integer nota);

    public List<Trabalho> buscarTrabalhos();
    
}
