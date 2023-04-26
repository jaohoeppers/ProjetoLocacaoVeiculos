package com.classes.mainFaturamento;

import com.classes.BO.FaturamentoBO;
import com.classes.DTO.Faturamento;

public class MainProcurarPorCodigo {

	public static void main(String[] args) {
			
		// Teste Procurar por Codigo
		FaturamentoBO marcaBO = new FaturamentoBO();
		Faturamento marca = new Faturamento(1);
		marca = marcaBO.procurarPorCodigo(marca);
		System.out.println(marca);
		
	}
}