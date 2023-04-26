package com.classes.mainFaturamento;

import java.util.Calendar;

import com.classes.BO.FaturamentoBO;
import com.classes.DTO.Faturamento;

public class MainInsercao {
	public static void main(String[] args) {
		
		Calendar inicio = Calendar.getInstance();
		Calendar fim = Calendar.getInstance();
		inicio.set(Calendar.DAY_OF_MONTH, 23);
		inicio.set(Calendar.MONTH, 6);
		inicio.set(Calendar.YEAR, 2021);
		inicio.set(Calendar.HOUR_OF_DAY, 13);
		fim.set(Calendar.DAY_OF_MONTH, 4);
		fim.set(Calendar.MONTH, 2);
		fim.set(Calendar.YEAR, 2022);
		fim.set(Calendar.HOUR_OF_DAY, 14);
		
		// Teste Inserir
		FaturamentoBO faturamentoBO = new FaturamentoBO();
		Faturamento faturamento = new Faturamento(500.00);
		faturamento.setardatas(inicio, fim);
		if (faturamentoBO.inserir(faturamento))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		
		inicio.set(Calendar.DAY_OF_MONTH, 2);
		inicio.set(Calendar.MONTH, 11);
		inicio.set(Calendar.YEAR, 2022);
		inicio.set(Calendar.HOUR_OF_DAY, 13);
		fim.set(Calendar.DAY_OF_MONTH, 30);
		fim.set(Calendar.MONTH, 0);
		fim.set(Calendar.YEAR, 2023);
		fim.set(Calendar.HOUR_OF_DAY, 14);
		
		faturamento = new Faturamento(200.00);
		faturamento.setardatas(inicio, fim);
		if (faturamentoBO.inserir(faturamento))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		
		inicio.set(Calendar.DAY_OF_MONTH, 4);
		inicio.set(Calendar.MONTH, 4);
		inicio.set(Calendar.YEAR, 2021);
		inicio.set(Calendar.HOUR_OF_DAY, 13);
		fim.set(Calendar.DAY_OF_MONTH, 3);
		fim.set(Calendar.MONTH, 5);
		fim.set(Calendar.YEAR, 2021);
		fim.set(Calendar.HOUR_OF_DAY, 14);
		
		faturamento = new Faturamento(55.00);
		faturamento.setardatas(inicio, fim);
		if (faturamentoBO.inserir(faturamento))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}
}