package com.classes.mainLocadora;

import com.classes.BO.*;
import com.classes.DTO.*;

public class MainLocadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClienteBO clientebo = new ClienteBO();
		VeiculoBO veiculobo = new VeiculoBO();
		FaturamentoBO faturamentobo = new FaturamentoBO();
		LocacaoBO locacaobo = new LocacaoBO();
		
		Locadora locadora = new Locadora(100.00);

		locadora.setClientes(clientebo.pesquisarTodos());	
		locadora.setVeiculos(veiculobo.pesquisarTodos());
		locadora.setFaturamentos(faturamentobo.pesquisarTodos());
		locadora.setLocacoes(locacaobo.pesquisarTodos());
		
		
		System.out.println("Lista de clientes");
		System.out.println();
		
		for (Cliente marca : locadora.getClientes()) {
			System.out.println(marca.toString());}
		
		System.out.println("//////////////////////////////////////////////////");
		System.out.println();
		System.out.println("Lista de veiculos");
		System.out.println();
		
		for (Veiculo marca : locadora.getVeiculos()) {
			System.out.println(marca.toString());}
		
		System.out.println("//////////////////////////////////////////////////");
		System.out.println();
		System.out.println("Lista de faturamentos");
		System.out.println();
		
		for (Faturamento marca : locadora.getFaturamentos()) {
			System.out.println(marca.toString());}
		
		System.out.println("//////////////////////////////////////////////////");
		System.out.println();
		System.out.println("Lista de Locações");
		System.out.println();
		
		for (Locacao marca : locadora.getLocacoes()) {
			System.out.println(marca.toString());}
		

		
	}

}
