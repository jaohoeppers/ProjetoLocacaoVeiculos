package com.classes.mainLocacao;

import com.classes.BO.LocacaoBO;
import com.classes.DTO.*;

public class MainProcurarPorVeiculo {

	public static void main(String[] args) {

		// Teste Procurar por Descricao
		// retorna o primeiro encontrado
		
		Veiculo veiculo = new Veiculo("Saveiro cross de trilha");
		LocacaoBO LocacaoBO = new LocacaoBO();
		Locacao Locacao = new Locacao(veiculo);
		Locacao = LocacaoBO.procurarPorCliente(Locacao);
		System.out.println(Locacao);

	}
}