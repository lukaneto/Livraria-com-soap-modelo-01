package com.systemluiz.livraria.services;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.systemluiz.livraria.daos.LivroDAO;
import com.systemluiz.livraria.models.Livro;

@WebService
public class ListagemLivros {
	public List<Livro> listarLivros(){
		
		LivroDAO livroDAO = obterDAO();
		
		return livroDAO.insereEmLivro();
	}

	private LivroDAO obterDAO() {
		
		return new LivroDAO();
	}
	
	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8087/livros", new ListagemLivros());
		System.out.println("Sistema inicializado!");
	}
}