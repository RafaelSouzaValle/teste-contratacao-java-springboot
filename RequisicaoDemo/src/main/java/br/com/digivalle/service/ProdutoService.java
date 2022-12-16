package br.com.digivalle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.digivalle.model.Produto;
import br.com.digivalle.repository.ProdutoRepository;

public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	public ProdutoService(ProdutoRepository repository) {
		this.repository = repository;
	}

	public Produto salvar(Produto produto) {
		return repository.save(produto);
	}

	public Produto getProdutoById(Long id) {
		return repository.findById(id).get();
	}

	public List<Produto> getProdutos() {
		return repository.findAll();
	}

	public Produto update(Produto produto, Long id) {
		return repository.findById(id).map(p -> {
			p.setId(produto.getId());
			p.setDescricao(produto.getDescricao());
			p.setNome(produto.getNome());
			p.setPreco(produto.getPreco());
			return repository.save(p);
		}).orElseGet(() -> {
			produto.setId(id);
			return repository.save(produto);
		});
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}