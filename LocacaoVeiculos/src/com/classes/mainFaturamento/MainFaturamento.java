package com.classes.mainFaturamento;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.classes.BO.FaturamentoBO;
import com.classes.DTO.Faturamento;

public class MainFaturamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("INSERIR E PESQUISAR TODOS");
		System.out.println();

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
		
		faturamentoBO = new FaturamentoBO();
		List<Faturamento> lista = new ArrayList<Faturamento>();
		lista = faturamentoBO.pesquisarTodos();	
		for (Faturamento marca : lista) {
			System.out.println(marca.toString());
		}
		
		///////////////////////////////////////////////////////////
		System.out.println("///////////////////////////////////////////////");
		
		System.out.println("PROCURAR POR CODIGO '1'");
		System.out.println();
		
		faturamentoBO = new FaturamentoBO();
		faturamento = new Faturamento(1);
		faturamento = faturamentoBO.procurarPorCodigo(faturamento);
		System.out.println(faturamento);
		
		//////////////////////////////////////////////////////////
		System.out.println("///////////////////////////////////////////////");
		
		System.out.println("PROCURAR POR VALOR '200.00'");
		System.out.println();
		
		faturamentoBO = new FaturamentoBO();
		faturamento = new Faturamento(200.00);
		faturamento = faturamentoBO.procurarPorValor(faturamento);
		System.out.println(faturamento);
		
		//////////////////////////////////////////////////////////
		System.out.println("///////////////////////////////////////////////");
		
		System.out.println("PROCURAR POR INICIO '04/05/2022");
		System.out.println();
		
		inicio.set(Calendar.DAY_OF_MONTH, 4);
		inicio.set(Calendar.MONTH, 4);
		inicio.set(Calendar.YEAR, 2021);

		faturamentoBO = new FaturamentoBO();
		faturamento.setarinicio(inicio);
		faturamento = faturamentoBO.procurarPorInicio(faturamento);
		System.out.println(faturamento);
		
		//////////////////////////////////////////////////////////
		System.out.println("///////////////////////////////////////////////");
		
		System.out.println("PROCURAR POR FIM '03/06/2021'");
		System.out.println("PESQUISAR TODOS");
		System.out.println();
		
		fim.set(Calendar.DAY_OF_MONTH, 3);
		fim.set(Calendar.MONTH, 5);
		fim.set(Calendar.YEAR, 2021);

		faturamentoBO = new FaturamentoBO();
		faturamento.setarfim(fim);
		faturamento = faturamentoBO.procurarPorFim(faturamento);
		System.out.println(faturamento);
		
		System.out.println();
		
		faturamentoBO = new FaturamentoBO();
		lista = new ArrayList<Faturamento>();
		lista = faturamentoBO.pesquisarTodos();	
		for (Faturamento marca : lista) {
			System.out.println(marca.toString());
		}
		
		/////////////////////////////////////////////////////////
		System.out.println("///////////////////////////////////////////////");
		
		System.out.println("EXCLUIR FATURAMENTO '1'");
		System.out.println("PESQUISAR TODOS");
		System.out.println();
	
		
		faturamentoBO = new FaturamentoBO();
		faturamento = new Faturamento(1);
		if (faturamentoBO.excluir(faturamento))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");
		
		System.out.println();
		
		faturamentoBO = new FaturamentoBO();
		lista = new ArrayList<Faturamento>();
		lista = faturamentoBO.pesquisarTodos();	
		for (Faturamento marca : lista) {
			System.out.println(marca.toString());
		}
		
		
		
		
	}

}
