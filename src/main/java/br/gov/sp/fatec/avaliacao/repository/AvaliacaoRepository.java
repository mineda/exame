package br.gov.sp.fatec.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.avaliacao.entity.Avaliacao;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long>{
    
}
