package com.classes.DTO;

import java.sql.Date;
import java.util.Calendar;

public class Faturamento {

	private int codigo;
	private double valor;
	private Date inicio;
	private Date fim;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {	
		this.inicio = inicio;
	}
	public Date getFim() {
		return fim;
	}
	public void setFim(Date fim) {	
		this.fim = fim;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public Faturamento(Double valor, Date inicio, Date fim) {
		setValor(valor);
		setInicio(inicio);
		setFim(fim);
	}
	public Faturamento(int codigo, Double valor, Date inicio, Date fim) {
		setValor(valor);
		setInicio(inicio);
		setFim(fim);
		setCodigo(codigo);
	}
	public Faturamento(int codigo){
		setCodigo(codigo);
	}
	public Faturamento(Date inicio){
		setInicio(inicio);
	}
	public Faturamento(Double valor){
		setValor(valor);
	}
	public Faturamento(){};
	
	
	public void setardatas(Calendar inicio, Calendar fim ) {
		Date date = new Date (inicio.getTimeInMillis());	
		setInicio(date);
		Date date1 = new Date (fim.getTimeInMillis());	
		setFim(date1);
	}
	public void setarinicio(Calendar inicio) {
		Date date = new Date (inicio.getTimeInMillis());	
		setInicio(date);;
	}
	public void setarfim(Calendar fim) {
		Date date = new Date (fim.getTimeInMillis());	
		setFim(date);;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Faturamento [codigo=");
		builder.append(codigo);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", inicio=");
		builder.append(inicio);
		builder.append(", fim=");
		builder.append(fim);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
