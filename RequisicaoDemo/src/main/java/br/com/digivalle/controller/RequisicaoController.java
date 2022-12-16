package br.com.digivalle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.digivalle.model.Requisicao;
import br.com.digivalle.service.RequisicaoService;

@RestController
public class RequisicaoController {
	
	@Autowired
	private RequisicaoService service;

	public RequisicaoController(RequisicaoService service) {
		this.service = service;
	}
	
	@PostMapping("/requisicoes")
	public Requisicao salvar(@RequestBody Requisicao requisicao) {
		System.out.println(requisicao);
		return service.salvar(requisicao);
	}
	
	@GetMapping(value = "/requisicao/{id}")
	public Requisicao getRequisicaoById(@PathVariable Long id) {
		return service.getRequisicaoById(id);
	}
	
	@GetMapping(value = "/requisicoes")
	public List<Requisicao> getRequisicoes() {
		return service.getRequisicoes();
	}
	
	@PutMapping("/requisicao/{id}")
	public Requisicao update(@RequestBody Requisicao requisicao, @PathVariable Long id) {
		System.out.println("Requisicao update: " + requisicao);
		return service.update(requisicao, id);
	}
	
	@DeleteMapping("/requisicao/{id}")
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}
	
}
