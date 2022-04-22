package com.filipe.serviceinfo.dtos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.filipe.serviceinfo.dominian.OS;
import com.filipe.serviceinfo.dominian.enums.Prioridade;
import com.filipe.serviceinfo.dominian.enums.Status;

public class OSDTO {

	private Long id;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private LocalDateTime data;
	private String nome_cliente;
	private String fone_cliente;
	private String endereco_cliente;
	private Integer prioridade;
	private Integer status;
	private String observacoes;
	private Long funcionario;
	
	public OSDTO() {
		super();
	}

	public OSDTO(OS obj) {
		super();
		this.id = obj.getId();
		this.data = obj.getDataIni();
		this.nome_cliente = obj.getNome_cliente();
		this.fone_cliente = obj.getFone_cliente();
		this.endereco_cliente = obj.getEndereco_cliente();
		this.prioridade = obj.getPrioridade().getCod();
		this.status = obj.getStatus().getCod();
		this.observacoes = obj.getObservacoes();
		this.funcionario = obj.getFuncionario().getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getFone_cliente() {
		return fone_cliente;
	}

	public void setFone_cliente(String fone_cliente) {
		this.fone_cliente = fone_cliente;
	}

	public String getEndereco_cliente() {
		return endereco_cliente;
	}

	public void setEndereco_cliente(String endereco_cliente) {
		this.endereco_cliente = endereco_cliente;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Prioridade getPrioridade() {
		return Prioridade.toEnum(this.prioridade);
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade.getCod();
	}

	public Status getStatus() {
		return Status.toEnum(this.status);
	}

	public void setStatus(Status status) {
		this.status = status.getCod();
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Long getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Long funcionario) {
		this.funcionario = funcionario;
	}
	
	
}
