package com.classes.DTO;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
//import java.util.Date;

import com.classes.BO.ClienteBO;
//import com.classes.DTO.Cliente;
import com.classes.BO.VeiculoBO;
//import com.classes.DTO.Veiculo;

public class Locacao {
	
	private int codigo;
	protected Cliente cliente;
	protected Veiculo veiculo;
	private double valor;
	private Date inicio;
	private Date fim;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		ClienteBO clientebo = new ClienteBO();
		try {
		if(clientebo.existeNome(cliente)) {
			
			Cliente teste = new Cliente();
			teste=clientebo.procurarPorNome(cliente);
			
			if(teste.getAtivo().equalsIgnoreCase("sim")) {
			
			this.cliente = teste;
		}}else
			System.out.println("Cliente nao existente ou desativado no banco de dados");
		}catch(NullPointerException e) {
			//e.printStackTrace();
		}
	
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		VeiculoBO veiculobo = new VeiculoBO();
		try {
		if(veiculobo.existeModelo(veiculo)) {
			
			Veiculo teste = new Veiculo();
			teste=veiculobo.procurarPorModelo(veiculo);
			
			if(teste.getAtivo().equalsIgnoreCase("sim")) {
			
				this.veiculo = teste;
		}}else
			System.out.println("Veiculo nao existente ou desativado no banco de dados");
		}catch(NullPointerException e) {
			//e.printStackTrace();
		}
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date date) {
		this.inicio = date ;
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

	public  Locacao(Cliente cliente, Veiculo veiculo) {
		setCliente(cliente);
		setVeiculo(veiculo);
	}
	public  Locacao(int codigo, Cliente cliente, Veiculo veiculo) {
		setCliente(cliente);
		setVeiculo(veiculo);
		setCodigo(codigo);
	}
	public  Locacao(Veiculo veiculo) {
		setVeiculo(veiculo);
	}
	public  Locacao(Cliente cliente) {
		setCliente(cliente);
	}
	public  Locacao(int codigo) {
		setCodigo(codigo);
	}
	public Locacao(){};
	
	
///////////////////////////////////////////////////////////////////////////////
	
	
	public boolean validardata(Calendar inicioo){
		
		boolean diab=false;
		boolean mesb=false;
		String strDate=("");
		int dia=inicioo.get(Calendar.DATE);
		int mes=inicioo.get(Calendar.MONTH);
		int ano=inicioo.get(Calendar.YEAR);
		String diaa=("");
		String mess=("");
		
		if(dia<10) {
			diaa=("0"+dia);
			diab=true;
		}
		if(mes<10) {
			mess=("0"+mes);
			mesb=true;
		}
		
		if(diab) {
			strDate=(diaa+"/"+mes+"/"+ano);
		}
		if(mesb) {
			strDate=(dia+"/"+mess+"/"+ano);
		}
		if(diab&mesb) {
			strDate=(diaa+"/"+mess+"/"+ano);
		}
		else {
			strDate=(dia+"/"+mes+"/"+ano);
		}
	
	    String dateFormat = "dd/MM/uuuu";

	    DateTimeFormatter dateTimeFormatter = DateTimeFormatter
	    .ofPattern(dateFormat)
	    .withResolverStyle(ResolverStyle.STRICT);
	    try {
	        LocalDate date = LocalDate.parse(strDate, dateTimeFormatter);
	        return true;
	    } catch (DateTimeParseException e) {
	       return false;
	    } 
	
	}


///////////////////////////////////////////////////////////////////////////////////////////////////


	public long contadias(Calendar inicio, Calendar fim ) {

		LocalDate data1= LocalDate.of(inicio.get(Calendar.YEAR),(inicio.get(Calendar.MONTH)+1),inicio.get(Calendar.DATE));
		LocalDate data2= LocalDate.of(fim.get(Calendar.YEAR),(fim.get(Calendar.MONTH)+1),fim.get(Calendar.DATE));

		var dias= ChronoUnit.DAYS.between(data1, data2);
		
		if(fim.get(Calendar.HOUR_OF_DAY)>12) {
			dias=dias+1;
		}
		Date date = new Date (inicio.getTimeInMillis());	
		setInicio(date);
		Date date1 = new Date (fim.getTimeInMillis());	
		setFim(date1);
		
		setValor ((double)dias*this.veiculo.getTaxa());
		
		
		return dias;
		
	}
	

//////////////////////////////////////////////////////////////////////////////////////////////////
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Locacao [codigo=");
		builder.append(codigo);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append(", veiculo=");
		builder.append(veiculo);
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
