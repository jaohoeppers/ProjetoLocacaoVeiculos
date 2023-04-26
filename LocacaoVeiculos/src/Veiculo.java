
public class Veiculo {
	
	private String modelo;
	private double taxa;
	private int locacoes;
	private boolean ativo;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public int getLocacoes() {
		return locacoes;
	}
	public void setLocacoes(int locacoes) {
		this.locacoes = locacoes;
	}
	public boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public Veiculo(String modelo, double taxa, boolean ativo) {
		this.locacoes=0;
		this.modelo=modelo;
		this.taxa=taxa;
		this.ativo=ativo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculo [modelo=");
		builder.append(modelo);
		builder.append(", taxa=");
		builder.append(taxa);
		builder.append(", locacoes=");
		builder.append(locacoes);
		builder.append("]");
		return builder.toString();
	}

}
