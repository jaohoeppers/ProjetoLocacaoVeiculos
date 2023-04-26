package com.classes.mainCliente;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;

public class MainProcurarPorNome {

	public static void main(String[] args) {

		// Teste Procurar por Descricao
		// retorna o primeiro encontrado
		ClienteBO marcaBO = new ClienteBO();
		Cliente marca = new Cliente("JOAO","JOAO@GMAIL.COM","SIM");
		marca = marcaBO.procurarPorNome(marca);
		System.out.println(marca);

	}
}