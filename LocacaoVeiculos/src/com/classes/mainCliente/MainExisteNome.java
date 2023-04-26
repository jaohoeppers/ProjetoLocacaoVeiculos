package com.classes.mainCliente;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;

public class MainExisteNome {

	public static void main(String[] args) {

		// Teste Existe
		// Verifica se existe outro item com a mesma descricao
		ClienteBO marcaBO = new ClienteBO();
		Cliente marca = new Cliente("JOAO","JOAO@GMAIL.COM","SIM");
		if (marcaBO.existeNome(marca))
			System.out.println("Nome Encontrado");
		else
			System.out.println("Nome Nao Encontrado");

	}
}