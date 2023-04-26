package com.classes.mainLocacao;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.LocacaoBO;
import com.classes.DTO.*;

public class MainPesquisarTodos {

	public static void main(String[] args) {
		
		// Teste Pesquisar Todos (Retorna a Lista de Marcas)
		LocacaoBO LocacaoBO = new LocacaoBO();
		List<Locacao> lista = new ArrayList<Locacao>();
		lista = LocacaoBO.pesquisarTodos();	
		for (Locacao marca : lista) {
			System.out.println(marca.toString());
		}
	
	}
}