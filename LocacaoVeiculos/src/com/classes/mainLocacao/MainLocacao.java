package com.classes.mainLocacao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.classes.BO.LocacaoBO;
import com.classes.DTO.*;

public class MainLocacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("INSERIR E PESQUISAR TODOS");
		System.out.println();

		LocacaoBO marcaBO = new LocacaoBO();
		
		Locacao locacao = new Locacao();
		Calendar inicio = Calendar.getInstance();
		inicio.set(Calendar.DAY_OF_MONTH, 24);
		inicio.set(Calendar.MONTH, 3);
		inicio.set(Calendar.YEAR, 2022);
		inicio.set(Calendar.HOUR_OF_DAY, 13);
		Calendar fim = Calendar.getInstance();
		fim.set(Calendar.DAY_OF_MONTH, 30);
		fim.set(Calendar.MONTH, 5);
		fim.set(Calendar.YEAR, 2022);
		fim.set(Calendar.HOUR_OF_DAY, 14);
		Cliente cliente = new Cliente("PAULO");
		Veiculo veiculo = new Veiculo("Saveiro cross de trilha");
		locacao = new Locacao(cliente,veiculo);
		
		locacao.contadias(inicio, fim);
		if (marcaBO.inserir(locacao))
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
		locacao = new Locacao(cliente,veiculo);
		locacao.contadias(inicio, fim);
		if (marcaBO.inserir(locacao))
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
		cliente = new Cliente("PAULO");
		veiculo = new Veiculo("Marea quebrado");
		locacao = new Locacao(cliente,veiculo);
		locacao.contadias(inicio, fim);
		if (marcaBO.inserir(locacao))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		LocacaoBO LocacaoBO = new LocacaoBO();
		List<Locacao> lista = new ArrayList<Locacao>();
		lista = LocacaoBO.pesquisarTodos();	
		for (Locacao marca : lista) {
			System.out.println(marca.toString());
		}
		
		/////////////////////////////////////////////////////
		System.out.println("///////////////////////////////////////////////");
		
		System.out.println("EXISTE LOCACAO POR CLIENTE 'PAULO'");
		System.out.println();
		
		cliente = new Cliente("PAULO");
		
		LocacaoBO = new LocacaoBO();
		locacao = new Locacao(cliente);
		if (LocacaoBO.existeLocacaoCliente(locacao))
			System.out.println("Cliente Encontrado");
		else
			System.out.println("Cliente nao Encontrado");
		
		/////////////////////////////////////////////////////
		System.out.println("///////////////////////////////////////////////");
		
		System.out.println("EXISTE LOCACAO POR VEICULO 'CELTINHA REBAIXADO'");
		System.out.println();
		
		veiculo = new Veiculo("Celtinha rebaixado");
		
		LocacaoBO = new LocacaoBO();
		locacao = new Locacao(veiculo);
		if (LocacaoBO.existeLocacaoVeiculo(locacao))
			System.out.println("Veiculo Encontrado");
		else
			System.out.println("Veiculo nao Encontrado");
		
		/////////////////////////////////////////////////////
		System.out.println("///////////////////////////////////////////////");
		
		System.out.println("PROCURAR POR CODIGO '1'");
		System.out.println();
		
		LocacaoBO = new LocacaoBO();
		locacao = new Locacao(1);
		locacao = LocacaoBO.procurarPorCodigo(locacao);
		System.out.println(locacao);
		
		/////////////////////////////////////////////////////
		System.out.println("///////////////////////////////////////////////");
		
		System.out.println("PROCURAR POR CLIENTE 'JOAO'");
		System.out.println();
		
		cliente = new Cliente("JOAO");
		LocacaoBO = new LocacaoBO();
		locacao = new Locacao(cliente);
		locacao = LocacaoBO.procurarPorCliente(locacao);
		System.out.println(locacao);
		
		/////////////////////////////////////////////////////
		System.out.println("///////////////////////////////////////////////");
		
		System.out.println("PROCURAR POR VEICULO 'SAVEIRO CROSS DE TRILHA'");
		System.out.println("PESQUISAR TODOS");
		System.out.println();
		
		veiculo = new Veiculo("Saveiro cross de trilha");
		LocacaoBO = new LocacaoBO();
		locacao = new Locacao(veiculo);
		locacao = LocacaoBO.procurarPorVeiculo(locacao);
		System.out.println(locacao);
		
		System.out.println();
		
		LocacaoBO = new LocacaoBO();
		lista = new ArrayList<Locacao>();
		lista = LocacaoBO.pesquisarTodos();	
		for (Locacao marca : lista) {
			System.out.println(marca.toString());
		}
		
		/////////////////////////////////////////////////////
		System.out.println("///////////////////////////////////////////////");
		
		System.out.println("EXCLUIR LOCAÇÃO '2'");
		System.out.println("PESQUISAR TODOS");
		System.out.println();
		
		LocacaoBO = new LocacaoBO();
		locacao= new Locacao(2);
		if (LocacaoBO.excluir(locacao))
			System.out.println("Excluido com Sucesso");
		else {
			System.out.println("Erro ao Excluir");}
		
		System.out.println();
		
		LocacaoBO = new LocacaoBO();
		lista = new ArrayList<Locacao>();
		lista = LocacaoBO.pesquisarTodos();	
		for (Locacao marca : lista) {
			System.out.println(marca.toString());
		}
		
	}
}
