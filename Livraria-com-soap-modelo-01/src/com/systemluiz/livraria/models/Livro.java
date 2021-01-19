package com.systemluiz.livraria.models;

import java.util.List;

public class Livro {
	
	private String nome;
	private String editora;
	private Integer anoDePublicacao;
	private List<String> autores;
	private String resumo;
	
	Livro(){}
	
	public Livro(String nome, String editora, Integer anoDePublicacao, List<String> autores, String resumo){
		super();
		this.nome = nome;
		this.editora = editora;
		this.anoDePublicacao = anoDePublicacao;
		this.autores = autores;
		this.resumo = resumo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Integer getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(Integer anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public List<String> getAutores() {
		return autores;
	}

	public void setAutores(List<String> autores) {
		this.autores = autores;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
}
