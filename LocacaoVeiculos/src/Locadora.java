
import java.util.List;

import java.util.ArrayList;

public class Locadora {
	
	private Double taxafixa;
	private List<Veiculo> veiculos = new ArrayList<Veiculo>();
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Locacao> locacoes = new ArrayList<Locacao>();
	private List<Faturamento> faturamentos= new ArrayList<Faturamento>();
	
	/*
	public int addveiculo (Veiculo veiculo) {
		
		veiculos.add(veiculo);
		return veiculos.;
	}
	public int addcliente (Cliente cliente) {
		
		clientes.add(cliente);
		return clientes.;
	}
	public int addlocacao (Locacao locacao) {
	
		locacoes.add(locacao);
		return locacao.;
	}
	*/
	
/////////////////////////////////////////////////////////////////////
	
	/*
	public void addfaturamento(Locacao locacao) {
		
		String[] array = new String[1];
		
		array[0]=(""+(locacao.getValor()+taxafixa));
		array[1]=(""+locacao.getFim());
		
		Faturamento.add(array);
	}
	
	public void setfaturamento(int num, Locacao locacao) {
		
		String[] array = new String[1];
		
		array[0]=(""+(locacao.getValor()+taxafixa));
		array[1]=(""+locacao.getFim());
		
		Faturamento.set(num,array);
	}
	
	*/
////////////////////////////////////////////////////////////////////
	
	/*
	public boolean setveiculo (int num, Veiculo veiculo) {
		
		veiculos.set(num, veiculo);
		return true;
	}
	public boolean setcliente (int num, Cliente cliente) {
		
		clientes.set(num, cliente);
		return true;
	}
	public boolean setlocacao (int num, Locacao locacao) {
	
		locacoes.set(num, locacao);
		return true;
	}
*/
	
	
	
	
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
