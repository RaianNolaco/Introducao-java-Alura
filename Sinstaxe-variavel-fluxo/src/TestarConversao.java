
public class TestarConversao {

	public static void main(String [] args){
		
		double salario = 1250.55;
		
		//Uma conversão dessa maneira não funciona 
		//int valor  =  salario;
		
		//para que funcione temos que fazer algo chamado de casting
	    // para "forçar uma conversão"
		int valor = (int) salario;
		System.out.println(valor);
		
		
		//variavel mt grande colocar l no final 
		//long numeroGrande = 32432423523L;
		
		//variavel pequena e mt pequena
		//short numeroPequeno = 2131; 
		//byte numeroMuitoPequeno =  127;
		
		//outro tipo de ponto flutuante colocar f no finalk
		//float pontoFlutuante = 3.14f;
		
		//numero bizzaro
		double valor1 = 0.2;
		double valor2 = 0.1;		
		double soma =  valor1 + valor2;
		System.out.println(soma);
	}
	
}
