import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Calendar;
import java.util.Scanner;

public class LocacaoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ent = new Scanner(System.in);
		
		/*
		
		Calendar data = Calendar.getInstance();
		Calendar data1 = Calendar.getInstance();
		
		data.set(Calendar.DATE, 22);
		data.set(Calendar.MONTH, 12);
		data.set(Calendar.YEAR, 2022);
		data.set(Calendar.HOUR, 16);
		
		data1.set(Calendar.DATE, 5);
		data1.set(Calendar.MONTH, 2);
		data1.set(Calendar.YEAR,2026);
		data1.set(Calendar.HOUR_OF_DAY,11);
		
		Locacao tempo = new Locacao(data);
		
		System.out.println(tempo.validardata());
		
		//System.out.println("dias total + dias meses "+tempo.contadias(data1));
		
		*/
		
		Locadora localiza=new Locadora();
		
		//Cliente joao=new Cliente("Joao Augusto Hoeppers", "jaohoeppers@gmail.com" );
		
		//localiza.
		
		
		
		
		System.out.println("Digite a data inicial da locaçao");
		
		Calendar peg=Calendar.getInstance();
		
		System.out.print("Ano: ");
		peg.set(Calendar.YEAR,ent.nextInt());
		System.out.print("Mes: ");
		peg.set(Calendar.MONTH,ent.nextInt());
		System.out.print("Dia: ");
		peg.set(Calendar.DATE,ent.nextInt());
		
		Locacao loc=new Locacao(joao);
				
		while(!(loc.validardata(peg))){
			
			System.out.println("ESSA DATA NAO EXISTE, DIGITE UMA DATA VALIDA");
			
			System.out.print("Ano: ");
			peg.set(Calendar.YEAR,ent.nextInt());
			System.out.print("Mes: ");
			peg.set(Calendar.MONTH,ent.nextInt());
			System.out.print("Dia: ");
			peg.set(Calendar.DATE,ent.nextInt());
			
		}
		
		System.out.println("Digite a data e hora da devolução do veiculo");
		System.out.println("Hora em formato 24HORAS");
		System.out.println("Apenas a hora, sem os minutos");
		
		Calendar dev=Calendar.getInstance();
		
		System.out.print("Ano: ");
		dev.set(Calendar.YEAR,ent.nextInt());
		System.out.print("Mes: ");
		dev.set(Calendar.MONTH,ent.nextInt());
		System.out.print("Dia: ");
		dev.set(Calendar.DATE,ent.nextInt());
		System.out.print("Hora: ");
		dev.set(Calendar.HOUR_OF_DAY,ent.nextInt());
		
		while(!(loc.validardata(dev))){
			
			System.out.println("ESSA DATA NAO EXISTE, DIGITE UMA DATA VALIDA");
			
			System.out.print("Ano: ");
			dev.set(Calendar.YEAR,ent.nextInt());
			System.out.print("Mes: ");
			dev.set(Calendar.MONTH,ent.nextInt());
			System.out.print("Dia: ");
			dev.set(Calendar.DATE,ent.nextInt());
			System.out.print("Hora: ");
			dev.set(Calendar.HOUR_OF_DAY,ent.nextInt());
			
			
		}
		
		System.out.println("Dias totais de uso foram: "+loc.contadias(peg, dev));
		
		
		
		
		
		
		
		
		

	}
	
	public static boolean isDateValid(String strDate) {
		
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
	
	
	

	

}
