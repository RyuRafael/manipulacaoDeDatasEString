package Data;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
//import java.time.LocalTime;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		LocalDateTime dataHora = LocalDateTime.now();
		Locale brasil = new Locale("pt","BR");
		//LocalTime hora = LocalTime.now();
		Scanner input = new Scanner(System.in);
		
		System.out.println(dataHora.getHour());
		
		String dia = dataHora.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
		String mensagem,nome;
		
		System.out.print("Digite o Seu nome ");
		nome = input.nextLine();
		
		if(dataHora.getHour() > 0 && dataHora.getHour() <= 12) {
			mensagem = "bom dia";	
		}
		else if(dataHora.getHour() > 12 && dataHora.getHour() < 18) {
			mensagem = "boa tarde";
		}
		else if(dataHora.getHour() >= 18 && dataHora.getHour() < 24) {
			mensagem = "boa noite";
		}
		else { mensagem = "ola";}
		
		System.out.printf("%s %s, Hoje é %s:",mensagem,nome,dia);
		
	}
}
