package com.classes.mainCliente;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;

public class MainExclusao {

	public static void main(String[] args) {

		// Teste Excluir
		ClienteBO marcaBO = new ClienteBO();
		Cliente marca = new Cliente(1);
		if (marcaBO.excluir(marca))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}
}