package com.classes.mainCliente;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;

public class MainPesquisarTodos {

	public static void main(String[] args) {
		
		// Teste Pesquisar Todos (Retorna a Lista de Marcas)
		ClienteBO marcaBO = new ClienteBO();
		List<Cliente> lista = new ArrayList<Cliente>();
		lista = marcaBO.pesquisarTodos();	
		for (Cliente marca : lista) {
			System.out.println(marca.toString());
		}
	
	}
}