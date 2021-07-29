package com.projetoIntegradorGeneration.projetoIntegradorGeneration.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_informacaoesfamilia")
public class InformacoesFamiliaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	private double rendaFamiliar;
	
	@NotBlank
	private int quantidadeMembrosFamilia;
	
	@NotBlank
	private boolean cadastroProgramasSociais;
	
	@NotBlank
	private boolean pessoasComDeficiencia;
	
	@NotNull
	private String descricao;
	
	@NotBlank
	private List<String> nomeMembros;
	
	@NotBlank
	private List<Integer> idadeMembros;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getRendaFamiliar() {
		return rendaFamiliar;
	}

	public void setRendaFamiliar(double rendaFamiliar) {
		this.rendaFamiliar = rendaFamiliar;
	}

	public int getQuantidadeMembrosFamilia() {
		return quantidadeMembrosFamilia;
	}

	public void setQuantidadeMembrosFamilia(int quantidadeMembrosFamilia) {
		this.quantidadeMembrosFamilia = quantidadeMembrosFamilia;
	}

	public boolean isCadastroProgramasSociais() {
		return cadastroProgramasSociais;
	}

	public void setCadastroProgramasSociais(boolean cadastroProgramasSociais) {
		this.cadastroProgramasSociais = cadastroProgramasSociais;
	}

	public boolean isPessoasComDeficiencia() {
		return pessoasComDeficiencia;
	}

	public void setPessoasComDeficiencia(boolean pessoasComDeficiencia) {
		this.pessoasComDeficiencia = pessoasComDeficiencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<String> getNomeMembros() {
		return nomeMembros;
	}

	public void setNomeMembros(List<String> nomeMembros) {
		this.nomeMembros = nomeMembros;
	}

	public List<Integer> getIdadeMembros() {
		return idadeMembros;
	}

	public void setIdadeMembros(List<Integer> idadeMembros) {
		this.idadeMembros = idadeMembros;
	}
	
}
