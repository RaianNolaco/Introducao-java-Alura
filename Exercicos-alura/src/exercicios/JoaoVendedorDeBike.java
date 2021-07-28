package exercicios;

/*João vendeu sua bicicleta a 300 reais, o que era 60% do
que ele havia pago. Por quanto ele deveria ter vendido para ter um lucro de 15%?*/
		

public class JoaoVendedorDeBike {

	public static void main(String[] args) {
		
		double valorvendido = 300;
		double porcentagemValorCheio = 60;
		double lucroDesejado = 15;
		
		//descobrindo o valor da bike
		double calcValorDaBike = valorvendido * 100 / porcentagemValorCheio;
		
		//fazenodo os calcular para saber por quanto deveria ter sido vendida
		double calcLucroDesejado = 100 + lucroDesejado;
		
		double calcValorFinal = calcValorDaBike * calcLucroDesejado / 100;
		
		System.out.println("João deveria ter vendido a bike por: R$"+calcValorFinal);
		
	}
	
}
