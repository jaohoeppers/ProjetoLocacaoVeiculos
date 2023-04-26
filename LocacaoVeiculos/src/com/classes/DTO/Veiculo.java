package com.classes.DTO;

public class Veiculo {
	
	private int codigo;
	private String modelo;
	private float taxa;
	private int locacoes;
	private String ativo;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	public int getLocacoes() {
		return locacoes;
	}
	public void setLocacoes(int locacoes) {
		this.locacoes = locacoes;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Veiculo(String modelo, float taxa, String ativo) {
		setLocacoes(0);
		setModelo(modelo);
		setTaxa(taxa);
		setAtivo(ativo);
	}
	public Veiculo(int codigo, String modelo, float taxa, String ativo) {
		setLocacoes(0);
		setModelo(modelo);
		setTaxa(taxa);
		setAtivo(ativo);
		setCodigo(codigo);
	}
	public Veiculo(String modelo, float taxa) {
		setModelo(modelo);
		setTaxa(taxa);
	}
	public Veiculo(int codigo){
		setCodigo(codigo);
	}
	public Veiculo(String modelo){
		setModelo(modelo);
	}
	public Veiculo(){}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculo [codigo=");
		builder.append(codigo);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", taxa=");
		builder.append(taxa);
		builder.append(", locacoes=");
		builder.append(locacoes);
		builder.append(", ativo=");
		builder.append(ativo);
		builder.append("]");
		return builder.toString();
	};
	
	

}
