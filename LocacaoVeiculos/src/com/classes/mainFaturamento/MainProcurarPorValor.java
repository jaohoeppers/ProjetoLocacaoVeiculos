package com.classes.mainFaturamento;

import com.classes.BO.FaturamentoBO;
import com.classes.DTO.Faturamento;

public class MainProcurarPorValor {

	public static void main(String[] args) {

		// Teste Procurar por Descricao
		// retorna o primeiro encontrado
		FaturamentoBO marcaBO = new FaturamentoBO();
		Faturamento marca = new Faturamento(200.00);
		marca = marcaBO.procurarPorValor(marca);
		System.out.println(marca);

	}
}