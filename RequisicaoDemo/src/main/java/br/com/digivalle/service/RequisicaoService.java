package br.com.digivalle.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.digivalle.model.Produto;
import br.com.digivalle.model.Requisicao;
import br.com.digivalle.repository.ClienteRepository;
import br.com.digivalle.repository.EnderecoRepository;
import br.com.digivalle.repository.ProdutoRepository;
import br.com.digivalle.repository.RequisicaoRepository;

@Service
public class RequisicaoService {

	@Autowired
	private RequisicaoRepository requisicaoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	public RequisicaoService(RequisicaoRepository repository) {
		this.requisicaoRepository = repository;
	}

	public Requisicao salvar(Requisicao requisicao) {
		System.out.println(requisicao);
		return requisicaoRepository.save(requisicao);
	}

	public Requisicao getRequisicaoById(Long id) {
		return requisicaoRepository.findById(id).get();
	}

	public List<Requisicao> getRequisicoes() {
		return requisicaoRepository.findAll();
	}

	public Requisicao update(Requisicao requisicao, Long id) {
		return requisicaoRepository.findById(id).map(r -> {
			r.setCliente(requisicao.getCliente());
			r.setLocalEntrega(requisicao.getLocalEntrega());
			r.setProdutos(requisicao.getProdutos());
			return requisicaoRepository.save(r);
		}).orElseGet(() -> {
			requisicao.setId(id);
			return requisicaoRepository.save(requisicao);
		});
	}

	public void deleteById(Long id) {
		
		Long idCliente = requisicaoRepository.findById(id).get().getCliente().getId();
		
		List<Long> idsPprodutos = new ArrayList<>();
		for (Produto p : requisicaoRepository.findById(id).get().getProdutos()) {
			idsPprodutos.add(p.getId());
		}
		
		Long idEndereco = requisicaoRepository.findById(id).get().getLocalEntrega().getId();
		
		clienteRepository.deleteById(idCliente);
		
		
		for (Produto p : requisicaoRepository.findById(id).get().getProdutos()) {
			produtoRepository.deleteById(p.getId());
		}
		
		enderecoRepository.deleteById(idEndereco);
		requisicaoRepository.deleteById(id);
	}
}