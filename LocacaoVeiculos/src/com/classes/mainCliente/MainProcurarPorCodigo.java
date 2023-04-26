package com.classes.mainCliente;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;

public class MainProcurarPorCodigo {

	public static void main(String[] args) {
			
		// Teste Procurar por Codigo
		ClienteBO marcaBO = new ClienteBO();
		Cliente marca = new Cliente(2);
		marca = marcaBO.procurarPorCodigo(marca);
		System.out.println(marca);
		
	}
}