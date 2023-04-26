package com.classes.mainVeiculo;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainPesquisarTodos {

	public static void main(String[] args) {
		
		// Teste Pesquisar Todos (Retorna a Lista de Marcas)
		VeiculoBO marcaBO = new VeiculoBO();
		List<Veiculo> lista = new ArrayList<Veiculo>();
		lista = marcaBO.pesquisarTodos();	
		for (Veiculo marca : lista) {
			System.out.println(marca.toString());
		}
	
	}
}