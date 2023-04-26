
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
//import java.util.Date;

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
		this.cliente = cliente;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public  long getInicio() {
		return inicio.getTime();
	}

	public void setInicio(Date date) {
		this.inicio = date ;
	}

	public long getFim() {
		return fim.getTime();
	}

	public void setFim(java.util.Date fim) {
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

		LocalDate data1= LocalDate.of(inicio.get(Calendar.YEAR),inicio.get(Calendar.MONTH),inicio.get(Calendar.DATE));
		LocalDate data2= LocalDate.of(fim.get(Calendar.YEAR),fim.get(Calendar.MONTH),fim.get(Calendar.DATE));

		var dias= ChronoUnit.DAYS.between(data1, data2);
		
		if(fim.get(Calendar.HOUR_OF_DAY)>12) {
			dias=dias+1;
		}
		setInicio(inicio.getTime());
		return dias;
		
	}


///////////////////////////////////////////////////////////////////////////////////////////////////


	public double valorperiodo(int dias) {
		
		setValor(dias*veiculo.getTaxa());
		
		return (dias*veiculo.getTaxa());
		
	}
	

//////////////////////////////////////////////////////////////////////////////////////////////////
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Locacao2 [cliente=");
		builder.append(cliente);
		builder.append(", veiculo=");
		builder.append(veiculo);
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}
	
	
}
