package com.classes.DTO;

public class Cliente {
	
	private int codigo;
	private String nome;
	private String email;
	private String ativo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public Cliente(String nome, String email, String ativo) {
		setNome(nome);
		setEmail(email);
		setAtivo(ativo);
	}
	public Cliente(int codigo, String nome, String email, String ativo) {
		setNome(nome);
		setEmail(email);
		setAtivo(ativo);
		setCodigo(codigo);
	}
	public Cliente(String nome){
		setNome(nome);
	}
	public Cliente(int codigo){
		setCodigo(codigo);
	}
	public Cliente(){}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", email=");
		builder.append(email);
		builder.append(", ativo=");
		builder.append(ativo);
		builder.append("]");
		return builder.toString();
	};
			
	
	
	
	
}
