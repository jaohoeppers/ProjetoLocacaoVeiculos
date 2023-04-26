package com.classes.mainLocacao;

import com.classes.BO.LocacaoBO;
import com.classes.DTO.Cliente;
import com.classes.DTO.Locacao;

public class MainExisteCliente {

	public static void main(String[] args) {

		// Teste Existe
		// Verifica se existe outro item com a mesma descricao
		
		Cliente cliente = new Cliente("PAULO");
		
		LocacaoBO LocacaoBO = new LocacaoBO();
		Locacao Locacao = new Locacao(cliente);
		if (LocacaoBO.existeLocacaoVeiculo(Locacao))
			System.out.println("Cliente Encontrado");
		else
			System.out.println("Cliente nao Encontrado");

	}
}