package com.classes.mainCliente;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;

public class MainExisteEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Teste Existe
				// Verifica se existe outro item com a mesma descricao
				ClienteBO marcaBO = new ClienteBO();
				Cliente marca = new Cliente("JOAO","JOAO@GMAIL.COM","SIM");
				if (marcaBO.existeEmail(marca))
					System.out.println("Email Encontrado");
				else
					System.out.println("Email Nao Encontrado");
	}

}
