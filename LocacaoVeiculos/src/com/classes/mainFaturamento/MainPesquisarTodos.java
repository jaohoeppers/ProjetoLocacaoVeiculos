package com.classes.mainFaturamento;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.FaturamentoBO;
import com.classes.DTO.Faturamento;

public class MainPesquisarTodos {

	public static void main(String[] args) {
		
		// Teste Pesquisar Todos (Retorna a Lista de Marcas)
		FaturamentoBO marcaBO = new FaturamentoBO();
		List<Faturamento> lista = new ArrayList<Faturamento>();
		lista = marcaBO.pesquisarTodos();	
		for (Faturamento marca : lista) {
			System.out.println(marca.toString());
		}
	
	}
}