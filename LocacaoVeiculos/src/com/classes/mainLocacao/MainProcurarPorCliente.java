package com.classes.mainLocacao;

import com.classes.BO.LocacaoBO;
import com.classes.DTO.*;

public class MainProcurarPorCliente {

	public static void main(String[] args) {

		// Teste Procurar por Descricao
		// retorna o primeiro encontrado
		
		Cliente cliente = new Cliente("JOAO");
		LocacaoBO LocacaoBO = new LocacaoBO();
		Locacao Locacao = new Locacao(cliente);
		Locacao = LocacaoBO.procurarPorCliente(Locacao);
		System.out.println(Locacao);

	}
}