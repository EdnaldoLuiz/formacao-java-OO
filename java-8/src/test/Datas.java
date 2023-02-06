package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		
		//Pegando data atual
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		//Pegando data atual com horas
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		
		//Formatador para dia, mes e ano
		DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		String dataFormatada = form.format(agora);
		System.out.println(dataFormatada);
		
		//Formatador para dia, mes e ano com horas, minutos e segundos.
		DateTimeFormatter forms = DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm:ss");
		System.out.println(forms.format(agora));
		
		//Escolhendo a data
		LocalDate futuro = LocalDate.of(2099, 01, 25);
		System.out.println(futuro);
		
		//Escolhendo a data, com o ENUM
		LocalDate futuro2 = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(futuro2);
		
		//Calcular o periodo entre 2 datas
		Period periodo = Period.between(futuro, hoje);
		System.out.println(periodo);
		
		//LocalDate 
		
		
	}

}
