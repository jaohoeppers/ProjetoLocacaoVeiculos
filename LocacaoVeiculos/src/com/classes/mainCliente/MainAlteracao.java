package com.classes.mainCliente;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;

public class MainAlteracao {

	public static void main(String[] args) {
			
		// Teste Alterar	
		ClienteBO marcaBO = new ClienteBO();
		Cliente marca = new Cliente(1,"CARLA","CARLA@GMAIL.COM","SIM");
		marcaBO.alterar(marca);
		marca = marcaBO.procurarPorCodigo(marca);
		System.out.println(marca);
		
	}
}