package com.classes.mainVeiculo;

import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainExiste {

	public static void main(String[] args) {

		// Teste Existe
		// Verifica se existe outro item com a mesma descricao
		VeiculoBO marcaBO = new VeiculoBO();
		Veiculo marca = new Veiculo("Marea quebrado");
		if (marcaBO.existeModelo(marca))
			System.out.println("Marca Encontrada");
		else
			System.out.println("Marca nao Encontrada");

	}
}