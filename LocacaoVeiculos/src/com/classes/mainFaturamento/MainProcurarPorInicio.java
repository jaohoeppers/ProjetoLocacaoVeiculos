package com.classes.mainFaturamento;

import java.sql.Date;

import com.classes.BO.FaturamentoBO;
import com.classes.DTO.Faturamento;

public class MainProcurarPorInicio {

	public static void main(String[] args) {
		
		Date inicio = new Date(0);

		// Teste Procurar por Descricao
		// retorna o primeiro encontrado
		FaturamentoBO marcaBO = new FaturamentoBO();
		Faturamento marca = new Faturamento(inicio);
		marca = marcaBO.procurarPorInicio(marca);
		System.out.println(marca);

	}
}