package com.classes.mainLocacao;

import com.classes.BO.LocacaoBO;
import com.classes.DTO.*;

public class MainExclusao {

	public static void main(String[] args) {

		// Teste Excluir
		LocacaoBO marcaBO = new LocacaoBO();
		Locacao locacao= new Locacao(1);
		if (marcaBO.excluir(locacao))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}
}