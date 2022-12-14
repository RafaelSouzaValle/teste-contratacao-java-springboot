package br.com.digivalle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.digivalle.model.Endereco;
import br.com.digivalle.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository repository;

	public EnderecoService(EnderecoRepository repository) {
		this.repository = repository;
	}

	public Endereco salvar(Endereco endereco) {
		return repository.save(endereco);
	}

	public Endereco getEnderecoById(Long id) {
		return repository.findById(id).get();
	}

	public List<Endereco> getEnderecos() {
		return repository.findAll();
	}

	public Endereco update(Endereco endereco, Long id) {
		return repository.findById(id).map(e -> {
			e.setId(endereco.getId());
			e.setBairro(endereco.getBairro());
			e.setCidade(endereco.getCidade());
			e.setComplemento(endereco.getComplemento());
			e.setEstado(endereco.getEstado());
			e.setLogradouro(endereco.getLogradouro());
			e.setNumero(endereco.getNumero());
			return repository.save(e);
		}).orElseGet(() -> {
			endereco.setId(id);
			return repository.save(endereco);
		});
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
