package com.classes.mainLocacao;

import java.util.Calendar;

import com.classes.BO.LocacaoBO;
import com.classes.DTO.Cliente;
import com.classes.DTO.Locacao;
import com.classes.DTO.Veiculo;

public class MainAlteracao {

	public static void main(String[] args) {
			
		// Teste Alterar	
		Calendar inicio=Calendar.getInstance();
		Calendar fim=Calendar.getInstance();
		Cliente cliente=new Cliente();
		Veiculo veiculo=new Veiculo();
		Locacao locacao = new Locacao();
		
		LocacaoBO locacaoBO = new LocacaoBO();
		
		inicio.set(Calendar.DAY_OF_MONTH, 1);
		inicio.set(Calendar.MONTH, 11);
		inicio.set(Calendar.YEAR, 2021);
		inicio.set(Calendar.HOUR_OF_DAY, 19);
		fim.set(Calendar.DAY_OF_MONTH, 20);
		fim.set(Calendar.MONTH, 9);
		fim.set(Calendar.YEAR, 2022);
		fim.set(Calendar.HOUR_OF_DAY, 14);
		cliente = new Cliente("SIRLEN");
		veiculo = new Veiculo("Marea quebrado");
		locacao = new Locacao(cliente,veiculo);
		locacao.contadias(inicio, fim);
		locacaoBO.alterar(locacao);
		locacao = locacaoBO.procurarPorCodigo(locacao);
		System.out.println(locacao);
		
		
		
	}
}