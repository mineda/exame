package br.gov.sp.fatec.avaliacao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.avaliacao.entity.Avaliacao;
import br.gov.sp.fatec.avaliacao.entity.Trabalho;
import br.gov.sp.fatec.avaliacao.repository.AvaliacaoRepository;
import br.gov.sp.fatec.avaliacao.repository.TrabalhoRepository;

@Service
public class AvaliacaoServiceImpl implements AvaliacaoService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepo;

    @Autowired
    private TrabalhoRepository trabalhoRepo;

    @Override
    public Trabalho cadastrarTrabalho(Trabalho trabalho) {
        return trabalhoRepo.save(trabalho);
    }

    @Override
    public void avaliarTrabalho(Long idTrabalho, Integer nota) {
        Optional<Trabalho> resultado = trabalhoRepo.findById(idTrabalho);
        if(resultado.isEmpty()) {
            throw new RuntimeException("Trabalho não existe!");
        }
        Trabalho trabalho = resultado.get();
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setNota(nota);
        avaliacao.setTrabalho(trabalho);

        avaliacaoRepo.save(avaliacao);

    }

    @Override
    public List<Trabalho> buscarTrabalhos() {
        return trabalhoRepo.findAll();
    }
    
}
