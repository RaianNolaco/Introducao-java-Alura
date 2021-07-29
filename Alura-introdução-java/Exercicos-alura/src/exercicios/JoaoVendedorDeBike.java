package exercicios;

import java.util.Scanner;

/*João vendeu sua bicicleta a 300 reais, o que era 60% do
que ele havia pago. Por quanto ele deveria ter vendido para ter um lucro de 15%?*/
		

public class JoaoVendedorDeBike {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor pelo qual a bike foi vendida:");
		double valorvendido = sc.nextDouble();
		
		System.out.println("Digite a porcentagem que equivale ao valor que voce vendeu em relação "
				+ "ao valor que foi pago na bike: ");
		double porcentagemValorCheio = sc.nextDouble();
		
		System.out.println("O quanto porcento você gostaria de ter ganhado nela para lucrar em cima do preço original: ");
		double lucroDesejado = sc.nextDouble()	;
		
		/*double valorvendido = 300;
		double porcentagemValorCheio = 60;
		double lucroDesejado = 15;*/
		
		//descobrindo o valor da bike
		double calcValorDaBike = valorvendido * 100 / porcentagemValorCheio;
		
		//fazenodo os calcular para saber por quanto deveria ter sido vendida
		double calcLucroDesejado = 100 + lucroDesejado;
		
		double calcValorFinal = calcValorDaBike * calcLucroDesejado / 100;
		
		System.out.println("A bike deveria ser vendida por: R$"+calcValorFinal);
		
		sc.close();
		
	}
	
}
