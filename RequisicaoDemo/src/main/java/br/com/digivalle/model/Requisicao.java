package br.com.digivalle.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Requisicao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(cascade = CascadeType.ALL)
	private Cliente cliente;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Produto> produtos;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Endereco localEntrega;

	public Requisicao(Long id, Cliente cliente, List<Produto> produtos, Endereco localEntrega) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.produtos = produtos;
		this.localEntrega = localEntrega;
	}

	public Requisicao() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Endereco getLocalEntrega() {
		return localEntrega;
	}

	public void setLocalEntrega(Endereco localEntrega) {
		this.localEntrega = localEntrega;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Requisicao other = (Requisicao) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Requisicao [id=" + id + ", cliente=" + cliente + ", produtos=" + produtos + ", localEntrega="
				+ localEntrega + "]";
	}

}
