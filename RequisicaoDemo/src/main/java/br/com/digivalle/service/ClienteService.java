package br.com.digivalle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.digivalle.model.Cliente;
import br.com.digivalle.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public ClienteService(ClienteRepository repository) {
		this.repository = repository;
	}

	public Cliente salvar(Cliente cliente) {
		return repository.save(cliente);
	}

	public Cliente getClienteById(Long id) {
		return repository.findById(id).get();
	}

	public List<Cliente> getClientes() {
		return repository.findAll();
	}

	public Cliente update(Cliente cliente, Long id) {
		return repository.findById(id).map(c -> {
			c.setEmail(cliente.getEmail());
			c.setNome(cliente.getNome());
			c.setTelefone(cliente.getTelefone());
			return repository.save(c);
		}).orElseGet(() -> {
			cliente.setId(id);
			return repository.save(cliente);
		});
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}