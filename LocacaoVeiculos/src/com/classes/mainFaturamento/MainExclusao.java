package com.classes.mainFaturamento;

import com.classes.BO.FaturamentoBO;
import com.classes.DTO.Faturamento;

public class MainExclusao {

	public static void main(String[] args) {

		// Teste Excluir
		FaturamentoBO marcaBO = new FaturamentoBO();
		Faturamento marca = new Faturamento(1);
		if (marcaBO.excluir(marca))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}
}