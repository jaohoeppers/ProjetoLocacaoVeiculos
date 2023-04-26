package com.classes.mainVeiculo;

import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainExclusao {

	public static void main(String[] args) {

		// Teste Excluir
		VeiculoBO marcaBO = new VeiculoBO();
		Veiculo marca = new Veiculo(1);
		if (marcaBO.excluir(marca))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}
}