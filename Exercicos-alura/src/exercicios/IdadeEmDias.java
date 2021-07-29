package exercicios;

import java.util.*;

/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/

public class IdadeEmDias {

	public static void main(String[] args) {
		
		Date data = new Date();
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(data);
		
		int diaAtual,mesAtual,anoAtual;
		
		diaAtual = cal.get(Calendar.DAY_OF_MONTH);
		mesAtual = cal.get(Calendar.MONTH) + 1;
		anoAtual = cal.get(Calendar.YEAR);
		
		System.out.println("Data atual é:" + diaAtual+"/"+mesAtual+"/"+anoAtual);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Em que ano você nasceu?");
		int ano = sc.nextInt();
		
		System.out.println("Em que mês você nasceu?(Digite o numero do mês)");
		int mes = sc.nextInt();
		
		System.out.println("Em que dia você nasceu?");
		int dia = sc.nextInt();
		
		
		
		int calcDiasIdade = 0;
		
		int idade = anoAtual - ano;
		
		if(mes > mesAtual) {
			
			idade--;
			int calcMes = ((mesAtual-1) * 30) + diaAtual;
			calcDiasIdade = (idade * 365) + calcMes;
			
		}if(mes == mesAtual && dia < diaAtual){
			
			int diaIdade =  diaAtual - dia;
			calcDiasIdade = (idade * 365) + diaIdade;
			
		}if(mes < mesAtual){
			
			int calcMes = ((mesAtual - mes- 1)*30) + diaAtual;
			calcDiasIdade = (idade * 365) + calcMes;
			
		}
		
		
		//int calcMes = ((mesAtual-1) * 30) + diaAtual;
		
		System.out.println("\nVocê tem "+idade+" anos de idade"
				+ "\ne viveu por aproximadamente " + calcDiasIdade + " dias");
		
		
		
		sc.close();
		
	}
	
}
