package com.classes.mainCliente;

import java.util.ArrayList;
import java.util.List;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;

public class MainCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("INSERIR E PESQUISAR TODOS");
		System.out.println();

		ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente("JOAO","JOAO@GMAIL.COM","SIM");
		if (clienteBO.inserir(cliente))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		cliente = new Cliente("PAULO","PAULO@GMAIL.COM","SIM");
		if (clienteBO.inserir(cliente))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		cliente = new Cliente("SIRLENE","SIRLA@GMAIL.COM","SIM");
		if (clienteBO.inserir(cliente))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		clienteBO = new ClienteBO();
		List<Cliente> lista = new ArrayList<Cliente>();
		lista = clienteBO.pesquisarTodos();	
		for (Cliente marca : lista) {
			System.out.println(marca.toString());}
			
		///////////////////////////////////////////////////
			System.out.println("///////////////////////////////////////////////");
			
			System.out.println("EXISTE NOME 'JOAO'");
			System.out.println();
			
		clienteBO = new ClienteBO();
		cliente = new Cliente("JOAO","JOAO@GMAIL.COM","SIM");
		if (clienteBO.existeNome(cliente))
			System.out.println("Nome Encontrado");
		else
			System.out.println("Nome Nao Encontrado");
		
		///////////////////////////////////////////////////
			System.out.println("///////////////////////////////////////////////");
			
			System.out.println("EXISTE EMAIL 'JOAO@GMAIL.COM'");
			System.out.println();
		
		clienteBO = new ClienteBO();
		cliente = new Cliente("JOAO","JOAO@GMAIL.COM","SIM");
		if (clienteBO.existeEmail(cliente))
			System.out.println("Email Encontrado");
		else
			System.out.println("Email Nao Encontrado");
			
		///////////////////////////////////////////////////
			System.out.println("///////////////////////////////////////////////");
			
			System.out.println("PROCURAR POR CODIGO '2'");
			System.out.println();
		
		clienteBO = new ClienteBO();
		cliente = new Cliente(2);
		cliente = clienteBO.procurarPorCodigo(cliente);
		System.out.println(cliente);
		
		///////////////////////////////////////////////////
			System.out.println("///////////////////////////////////////////////");
			
			System.out.println("PROCURAR POR NOME 'SIRLENE'");
			System.out.println();
		
		clienteBO = new ClienteBO();
		cliente = new Cliente("SIRLENE","SIRLENE@GMAIL.COM","SIM");
		cliente = clienteBO.procurarPorNome(cliente);
		System.out.println(cliente);
		
		//////////////////////////////////////////////////
			System.out.println("///////////////////////////////////////////////");
		
			System.out.println("PROCURAR POR EMAIL 'PAULO@GMAIL.COM'");
			System.out.println("PESQUISAR TODOS");
			System.out.println();
			
		clienteBO = new ClienteBO();
		cliente = new Cliente("PAULO","PAULO@GMAIL.COM","SIM");
		cliente = clienteBO.procurarPorEmail(cliente);
		System.out.println(cliente);
		
		System.out.println();
		
		clienteBO = new ClienteBO();
		List<Cliente> lista1 = new ArrayList<Cliente>();
		lista1 = clienteBO.pesquisarTodos();	
		for (Cliente marca8 : lista1) {
			System.out.println(marca8.toString());
		}
		
		//////////////////////////////////////////////////
			System.out.println("///////////////////////////////////////////////");
			
			System.out.println("EXCLUIR CLIENTE '3'");
			System.out.println("PESQUISAR TODOS");
			System.out.println();
		
		clienteBO = new ClienteBO();
		cliente = new Cliente(3);
		if (clienteBO.excluir(cliente))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");
		
		System.out.println();
		
		clienteBO = new ClienteBO();
		List<Cliente> lista2 = new ArrayList<Cliente>();
		lista2 = clienteBO.pesquisarTodos();	
		for (Cliente marca0 : lista2) {
			System.out.println(marca0.toString());
		}
		
		
		
		
	}

}
