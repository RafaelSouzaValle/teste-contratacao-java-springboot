package br.com.digivalle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.digivalle.model.Requisicao;

@Repository
public interface RequisicaoRepository extends JpaRepository<Requisicao, Long> {

}
