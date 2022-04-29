package com.filipe.serviceinfo.dominian;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.filipe.serviceinfo.dominian.enums.Prioridade;
import com.filipe.serviceinfo.dominian.enums.Status;

@Entity
public class OS implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate dataIni;
	
	private String nome_cliente;
	private String fone_cliente;
	private String endereco_cliente;
	private Integer prioridade;
	private Integer status;
	private String observacoes;
	
	@OneToOne
	@JoinColumn(name = "funcionario_id")
	private Funcionario funcionario;
	
	public OS() {
		super();
		this.setDataIni(LocalDate.now());
		this.setPrioridade(Prioridade.BAIXA);
		this.setStatus(Status.ANDAMENTO);
	}

	public OS(Long id, String nome_cliente, String fone_cliente,
			String endereco_cliente, Prioridade prioridade, Status status, String observacoes, Funcionario funcionario) {
		super();
		this.id = id;
		this.nome_cliente = nome_cliente;
		this.fone_cliente = fone_cliente;
		this.endereco_cliente = endereco_cliente;
		this.setDataIni(LocalDate.now());
		this.prioridade = (prioridade == null) ? 0 : prioridade.getCod();
		this.status = (status == null) ? 0 : status.getCod();
		this.observacoes = observacoes;
		this.funcionario = funcionario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public LocalDate getDataIni() {
		return dataIni;
	}

	public void setDataIni(LocalDate dataIni) {
		this.dataIni = dataIni;
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

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
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
		OS other = (OS) obj;
		return Objects.equals(id, other.id);
	}

}
