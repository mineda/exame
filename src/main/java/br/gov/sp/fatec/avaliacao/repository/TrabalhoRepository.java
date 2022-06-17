package br.gov.sp.fatec.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.avaliacao.entity.Trabalho;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long>{
    
}
