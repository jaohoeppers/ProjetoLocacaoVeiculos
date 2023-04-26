package com.classes.mainLocacao;

import com.classes.BO.LocacaoBO;
import com.classes.DTO.Locacao;
import com.classes.DTO.Veiculo;

public class MainExisteVeiculo {

	public static void main(String[] args) {

		// Teste Existe
		// Verifica se existe outro item com a mesma descricao
		
		Veiculo veiculo = new Veiculo("Celtinha rebaixado");
		
		LocacaoBO LocacaoBO = new LocacaoBO();
		Locacao Locacao = new Locacao(veiculo);
		if (LocacaoBO.existeLocacaoVeiculo(Locacao))
			System.out.println("Veiculo Encontrado");
		else
			System.out.println("Veiculo nao Encontrado");

	}
}