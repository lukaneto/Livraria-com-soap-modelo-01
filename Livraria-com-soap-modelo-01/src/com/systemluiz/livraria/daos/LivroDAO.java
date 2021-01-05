package com.systemluiz.livraria.daos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.systemluiz.livraria.models.Livro;

public class LivroDAO {
	
	public List<Livro> insereEmLivro(){
		List<Livro>  livros = new ArrayList<Livro>();
		
		livros.add(new Livro("Java com chocolate", "FTD Brasil", 2019, new ArrayList<String>(Arrays.asList("luizinho","zezinho", "pedrinho")),"livro dedicado aos desenvolvedores java que gostam de chocolate"));
		livros.add(new Livro("Amor e Paixao", "Casa do codigo", 2018, new ArrayList<String>(Arrays.asList("mariazinha","francinete","gustava")),"Comedia romantica feita para pesoas frescas"));
		return livros;
	}
}