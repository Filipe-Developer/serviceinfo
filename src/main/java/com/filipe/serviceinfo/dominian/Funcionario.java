package com.filipe.serviceinfo.dominian;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Funcionario extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "funcionario")
	private List<VendaAvista> listVendas = new ArrayList<>();
	
	@OneToMany(mappedBy = "funcionario")
	private List<OS> listOS = new ArrayList<>();

	public Funcionario() {
		super();
	}

	public Funcionario(Long id, String nome, String cpf, String endereco, String fone, String senha) {
		super(id, nome, cpf, endereco, fone, senha);
	}

	public List<VendaAvista> getList() {
		return listVendas;
	}

	public void setList(List<VendaAvista> list) {
		this.listVendas = list;
	}

	public List<OS> getListOS() {
		return listOS;
	}

	public void setListOS(List<OS> listOS) {
		this.listOS = listOS;
	}
	

}
