package com.classes.mainVeiculo;

import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainInsercao {
	public static void main(String[] args) {
		// Teste Inserir
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
	}
}