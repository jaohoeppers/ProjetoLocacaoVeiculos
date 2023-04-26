package com.classes.mainVeiculo;

import java.util.ArrayList;
import java.util.List;

import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("INSERIR E PESQUISAR TODOS");
		System.out.println();
		
		VeiculoBO VeiculoBO = new VeiculoBO();
		Veiculo Veiculo = new Veiculo("Celtinha rebaixado", (float) 13.60,"SIM");
		if (VeiculoBO.inserir(Veiculo))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		Veiculo = new Veiculo("Saveiro cross de trilha",(float) 60.20,"SIM");
		if (VeiculoBO.inserir(Veiculo))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		Veiculo = new Veiculo("Marea quebrado",(float) 3.60,"SIM");
		if (VeiculoBO.inserir(Veiculo))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		VeiculoBO = new VeiculoBO();
		List<Veiculo> lista = new ArrayList<Veiculo>();
		lista = VeiculoBO.pesquisarTodos();	
		for (Veiculo marca : lista) {
			System.out.println(marca.toString());
		}
		
		////////////////////////////////////////////////////////
		System.out.println("///////////////////////////////////////////////");
		
		System.out.println("EXISTE MODELO 'MAREA QUEBRADO'");
		System.out.println();
		
		VeiculoBO = new VeiculoBO();
		Veiculo = new Veiculo("Marea quebrado");
		if (VeiculoBO.existeModelo(Veiculo))
			System.out.println("Modelo Encontrado");
		else
			System.out.println("Modelo nao Encontrado");
		
		///////////////////////////////////////////////////////
		System.out.println("///////////////////////////////////////////////");
		
		System.out.println("PROCURAR POR CODIGO '2'");
		System.out.println();
		
		VeiculoBO = new VeiculoBO();
		Veiculo = new Veiculo(2);
		Veiculo = VeiculoBO.procurarPorCodigo(Veiculo);
		System.out.println(Veiculo);
		
		///////////////////////////////////////////////////////
		System.out.println("///////////////////////////////////////////////");
		
		System.out.println("PROCURAR POR MODELO 'UNO MILLE DA FIRMA'");
		System.out.println("PESQUISAR TODOS");
		System.out.println();
		
		VeiculoBO = new VeiculoBO();
		Veiculo = new Veiculo("Uno mille da firma");
		Veiculo = VeiculoBO.procurarPorModelo(Veiculo);
		System.out.println(Veiculo);
		
		System.out.println();
		
		VeiculoBO = new VeiculoBO();
		List<Veiculo> lista1 = new ArrayList<Veiculo>();
		lista1 = VeiculoBO.pesquisarTodos();	
		for (Veiculo marca : lista1) {
			System.out.println(marca.toString());
		}
		
		///////////////////////////////////////////////////////
		System.out.println("///////////////////////////////////////////////");
		
		System.out.println("EXCLUIR VEICULO '1'");
		System.out.println("PESQUISAR TODOS");
		System.out.println();
		
		VeiculoBO = new VeiculoBO();
		Veiculo = new Veiculo(1);
		if (VeiculoBO.excluir(Veiculo))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");
		
		System.out.println();
		
		VeiculoBO = new VeiculoBO();
		List<Veiculo> lista2 = new ArrayList<Veiculo>();
		lista2 = VeiculoBO.pesquisarTodos();	
		for (Veiculo marca : lista2) {
			System.out.println(marca.toString());
		}
		
		
		
		
	}

}
