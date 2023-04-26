package com.classes.DTO;

import java.util.List;

import java.util.ArrayList;

public class Locadora {
	
	private Double taxafixa;
	private List<Veiculo> veiculos = new ArrayList<Veiculo>();
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Locacao> locacoes = new ArrayList<Locacao>();
	private List<Faturamento> faturamentos= new ArrayList<Faturamento>();
	
	
	
	public List<Veiculo> getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}	
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	public List<Locacao> getLocacoes() {
		return locacoes;
	}
	public void setLocacoes(List<Locacao> locacoes) {
		this.locacoes = locacoes;
	}
	public List<Faturamento> getFaturamentos() {
		return faturamentos;
	}
	public void setFaturamentos(List<Faturamento> faturamentos) {
		this.faturamentos = faturamentos;
	}
	public double getTaxafixa() {
		return taxafixa;
	}
	public void setTaxafixa(double taxafixa) {
		this.taxafixa = taxafixa;
	}
	
	public Locadora(Double taxafixa) {
		setTaxafixa(taxafixa);
	}
	public Locadora(){};
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Locadora [taxafixa=");
		builder.append(taxafixa);
		builder.append(", veiculos=");
		builder.append(veiculos);
		builder.append(", clientes=");
		builder.append(clientes);
		builder.append(", locacoes=");
		builder.append(locacoes);
		builder.append(", faturamentos=");
		builder.append(faturamentos);
		builder.append("]");
		return builder.toString();
	}
	


	

}
