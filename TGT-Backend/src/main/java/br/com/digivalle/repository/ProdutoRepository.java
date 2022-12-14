package br.com.digivalle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.digivalle.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
