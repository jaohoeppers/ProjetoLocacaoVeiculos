package com.classes.mainVeiculo;

import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainProcurarPorModelo {

	public static void main(String[] args) {

		// Teste Procurar por Modelo
		// retorna o primeiro encontrado
		VeiculoBO marcaBO = new VeiculoBO();
		Veiculo marca = new Veiculo("Uno mille da firma");
		marca = marcaBO.procurarPorModelo(marca);
		System.out.println(marca);

	}
}