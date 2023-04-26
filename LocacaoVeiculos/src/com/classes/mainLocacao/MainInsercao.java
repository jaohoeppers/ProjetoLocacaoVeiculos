package com.classes.mainLocacao;

import java.util.Calendar;

import com.classes.BO.LocacaoBO;
//import com.classes.DTO.Locacao;
import com.classes.DTO.*;

public class MainInsercao {
	public static void main(String[] args) {
		// Teste Inserir
		LocacaoBO marcaBO = new LocacaoBO();
		Locacao marca = new Locacao();
		
		Calendar inicio = Calendar.getInstance();
		Calendar fim = Calendar.getInstance();
		inicio.set(Calendar.DAY_OF_MONTH, 24);
		inicio.set(Calendar.MONTH, 3);
		inicio.set(Calendar.YEAR, 2022);
		inicio.set(Calendar.HOUR_OF_DAY, 13);
		fim.set(Calendar.DAY_OF_MONTH, 30);
		fim.set(Calendar.MONTH, 5);
		fim.set(Calendar.YEAR, 2022);
		fim.set(Calendar.HOUR_OF_DAY, 14);
		Cliente cliente = new Cliente("PAULO");
		Veiculo veiculo = new Veiculo("Celtinha rebaixado");
		marca = new Locacao(cliente,veiculo);
		marca.contadias(inicio, fim);
		if (marcaBO.inserir(marca))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		inicio.set(Calendar.DAY_OF_MONTH, 13);
		inicio.set(Calendar.MONTH, 2);
		inicio.set(Calendar.YEAR, 2020);
		inicio.set(Calendar.HOUR_OF_DAY, 19);
		fim.set(Calendar.DAY_OF_MONTH, 4);
		fim.set(Calendar.MONTH, 6);
		fim.set(Calendar.YEAR, 2020);
		fim.set(Calendar.HOUR_OF_DAY, 14);
		cliente = new Cliente("JOAO");
		veiculo = new Veiculo("Saveiro cross de trilha");
		marca = new Locacao(cliente,veiculo);
		marca.contadias(inicio, fim);
		if (marcaBO.inserir(marca))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		inicio.set(Calendar.DAY_OF_MONTH, 1);
		inicio.set(Calendar.MONTH, 11);
		inicio.set(Calendar.YEAR, 2021);
		inicio.set(Calendar.HOUR_OF_DAY, 19);
		fim.set(Calendar.DAY_OF_MONTH, 20);
		fim.set(Calendar.MONTH, 9);
		fim.set(Calendar.YEAR, 2022);
		fim.set(Calendar.HOUR_OF_DAY, 14);
		cliente = new Cliente("SIRLENE");
		veiculo = new Veiculo("Marea quebrado");
		marca = new Locacao(cliente,veiculo);
		marca.contadias(inicio, fim);
		if (marcaBO.inserir(marca))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
	}
}