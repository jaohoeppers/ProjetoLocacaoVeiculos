package com.classes.mainVeiculo;

import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainProcurarPorCodigo {

	public static void main(String[] args) {
			
		// Teste Procurar por Codigo
		VeiculoBO marcaBO = new VeiculoBO();
		Veiculo marca = new Veiculo(2);
		marca = marcaBO.procurarPorCodigo(marca);
		System.out.println(marca);
		
	}
}