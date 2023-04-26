package com.classes.mainCliente;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;

public class MainInsercao {
	public static void main(String[] args) {
		// Teste Inserir
		ClienteBO marcaBO = new ClienteBO();
		Cliente marca = new Cliente("JOAO","JOAO@GMAIL.COM","SIM");
		if (marcaBO.inserir(marca))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		marca = new Cliente("PAULO","PAULO@GMAIL.COM","SIM");
		if (marcaBO.inserir(marca))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		marca = new Cliente("SIRLENE","SIRLA@GMAIL.COM","SIM");
		if (marcaBO.inserir(marca))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}
}