package br.com.digivalle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.digivalle.model.Requisicao;
import br.com.digivalle.repository.RequisicaoRepository;

public class RequisicaoService {

	@Autowired
	private RequisicaoRepository repository;

	public RequisicaoService(RequisicaoRepository repository) {
		this.repository = repository;
	}

	public Requisicao salvar(Requisicao requisicao) {
		return repository.save(requisicao);
	}

	public Requisicao getRequisicaoById(Long id) {
		return repository.findById(id).get();
	}

	public List<Requisicao> getRequisicoes() {
		return repository.findAll();
	}

	public Requisicao update(Requisicao requisicao, Long id) {
		return repository.findById(id).map(r -> {
			r.setId(requisicao.getId());
			r.setCliente(requisicao.getCliente());
			r.setLocalEntrega(requisicao.getLocalEntrega());
			r.setProdutos(requisicao.getProdutos());
			return repository.save(r);
		}).orElseGet(() -> {
			requisicao.setId(id);
			return repository.save(requisicao);
		});
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}