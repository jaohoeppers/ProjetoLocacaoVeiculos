package com.classes.mainLocacao;

import com.classes.BO.LocacaoBO;
import com.classes.DTO.*;

public class MainProcurarPorCodigo {

	public static void main(String[] args) {
			
		// Teste Procurar por Codigo
		LocacaoBO LocacaoBO = new LocacaoBO();
		Locacao Locacao = new Locacao(1);
		Locacao = LocacaoBO.procurarPorCodigo(Locacao);
		System.out.println(Locacao);
		
	}
}