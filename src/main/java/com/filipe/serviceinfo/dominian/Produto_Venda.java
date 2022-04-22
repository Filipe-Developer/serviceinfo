package com.filipe.serviceinfo.dominian;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Produto_Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany
	@JoinColumn
	private Produto produto;
	
	@ManyToOne
	private VendaAvista vAvista;
	
	@ManyToOne
	private VendaAprazo vAprazo;
	private Integer quantidade;
	private Double valor;
	
	public Produto_Venda() {
		super();
	}

	public Produto_Venda(Long id, Produto produto, VendaAvista vAvista, VendaAprazo vAprazo, Integer quantidade,
			Double valor) {
		super();
		this.id = id;
		this.produto = produto;
		this.vAvista = vAvista;
		this.vAprazo = vAprazo;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public VendaAvista getvAvista() {
		return vAvista;
	}

	public void setvAvista(VendaAvista vAvista) {
		this.vAvista = vAvista;
	}

	public VendaAprazo getvAprazo() {
		return vAprazo;
	}

	public void setvAprazo(VendaAprazo vAprazo) {
		this.vAprazo = vAprazo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
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
		Produto_Venda other = (Produto_Venda) obj;
		return Objects.equals(id, other.id);
	}
	
	
}