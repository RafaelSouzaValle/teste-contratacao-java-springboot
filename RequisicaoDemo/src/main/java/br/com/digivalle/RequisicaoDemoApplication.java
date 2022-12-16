package br.com.digivalle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import br.com.digivalle.model.Cliente;
import br.com.digivalle.model.Endereco;
import br.com.digivalle.model.Produto;
import br.com.digivalle.model.Requisicao;
import br.com.digivalle.service.RequisicaoService;

@SpringBootApplication
public class RequisicaoDemoApplication implements CommandLineRunner {

	@Autowired
	RequisicaoService requisicaoService;

	public static void main(String[] args) {
		SpringApplication.run(RequisicaoDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// TESTE DE CRIAÇÃO - Requisições para teste
//		if (requisicaoService.getRequisicoes().size() < 2) {
//			Cliente cliente1 = new Cliente(null, "Fulano", "fulano@mail.com", "(11) 88125-7737");
//			
//			Produto produto1 = new Produto(null, "Computador", "Desktop completo", 4.000);
//			Produto produto2 = new Produto(null, "Smartphone", "Motorola G100", 3.000);
//			Produto produto3 = new Produto(null, "Bicicleta", "Mountain Bike", 5.000);
//			
//			List<Produto> produtos1 = new ArrayList<>();
//			produtos1.add(produto1);
//			produtos1.add(produto2);
//			produtos1.add(produto3);
//			
//			Endereco endereco1 = new Endereco(null, "Rua Comendador Neto", "12", "Centro", "Santos", "SP", "Prédio");
//			
//			Requisicao requisicao1 = new Requisicao(null, cliente1, produtos1, endereco1);
//			
//			requisicaoService.salvar(requisicao1);
//
//			// TESTE DE CRIAÇÃO - Requisição 2 para teste
//
//			Cliente cliente2 = new Cliente(null, "Beltrano", "beltrano@mail.com", "(11) 74481-9839");
//
//			Produto produto4 = new Produto(null, "Computador Plus", "Desktop Deluxe", 5.000);
//			Produto produto5 = new Produto(null, "Smartphone Plus", "Motorola G200", 4.000);
//			Produto produto6 = new Produto(null, "Bicicleta Plus", "Mountain Bike Super", 6.000);
//
//			List<Produto> produtos2 = new ArrayList<>();
//			produtos2.add(produto4);
//			produtos2.add(produto5);
//			produtos2.add(produto6);
//
//			Endereco endereco2 = new Endereco(null, "Rua Jornalista Jeovan Pacheco", "15", "Aeroporto", "Mossoró", "RN",
//					"Casa");
//
//			Requisicao requisicao2 = new Requisicao(null, cliente2, produtos2, endereco2);
//
//			requisicaoService.salvar(requisicao2);
//		}

		// TESTE DE RETORNO - Requisição retornada por id
//			Requisicao requisicaoRetornada1 = requisicaoService.getRequisicaoById(1L);
//			Requisicao requisicaoRetornada2 = requisicaoService.getRequisicaoById(2L);
//			
//			System.out.println(requisicaoRetornada1);
//			System.out.println(requisicaoRetornada2);

		 // TESTE DE RETORNO - Lista com todas as requisições retornadas
//			List<Requisicao> requisicoes = requisicaoService.getRequisicoes();
//			
//			for (Requisicao requisicao : requisicoes) {
//				System.out.println(requisicao);
//			}

		// TESTE DE ATUALIZAÇÃO - efetua update por id
//		if(requisicaoService.getRequisicoes().size() > 1) {
//			Long id1 = requisicaoService.getRequisicoes().get(0).getId();
//			Long id2 = requisicaoService.getRequisicoes().get(1).getId();
//			
//			Requisicao requisicaoParaUpdate1 = requisicaoService.getRequisicaoById(id1);
//			requisicaoParaUpdate1.getCliente().setNome("Pessoa 01");
//			Requisicao requisicaoAtualizada1 = requisicaoService.update(requisicaoParaUpdate1, id2);
//			System.out.println(requisicaoAtualizada1);
//		}
		
//		if(requisicaoService.getRequisicoes().size() > 0) {
//			Long id = requisicaoService.getRequisicoes().get(0).getId();
//			Requisicao requisicaoParaUpdate2 = requisicaoService.getRequisicaoById(id);
//			Random random = new Random(1000);
//			Integer numAleat = Math.abs(random.nextInt());
//			requisicaoParaUpdate2.getCliente().setNome("Pessoa " + numAleat);
//			requisicaoParaUpdate2.getCliente().setEmail("pessoa" + numAleat + "@mail.com");
//			Requisicao requisicaoAtualizada2 = requisicaoService.update(requisicaoParaUpdate2, id);
//			System.out.println(requisicaoAtualizada2);
//		}
		

		// TESTE DE REMOÇÃO - efetua delete por id
//		Long idADeletar = requisicaoService.getRequisicoes().get(0).getId();
//		requisicaoService.deleteById(idADeletar);
		
		// TESTE DE REMOÇÃO - remove todas as requisições
//		for (Requisicao r : requisicaoService.getRequisicoes()) {
//			requisicaoService.deleteById(r.getId());
//		}

	}

}
