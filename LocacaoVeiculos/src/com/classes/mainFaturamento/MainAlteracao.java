package com.classes.mainFaturamento;

import java.sql.Date;

import com.classes.BO.FaturamentoBO;
import com.classes.DTO.Faturamento;

public class MainAlteracao {

	public static void main(String[] args) {
		
		Date inicio = new Date(0);
		Date fim = new Date(0);
			
		// Teste Alterar	
		FaturamentoBO marcaBO = new FaturamentoBO();
		Faturamento marca = new Faturamento(1 ,300.00, inicio, fim);
		marcaBO.alterar(marca);
		marca = marcaBO.procurarPorCodigo(marca);
		System.out.println(marca);
		
	}
}