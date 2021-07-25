package exercicios;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int termo = 10;
		int n1 = 1;
		int n2 = 1;
		int calc = 1;
		
		for(int i = 1; i <= termo;i++){
					
		   System.out.println(calc);
           calc = n1 + n2;
		   
   
		   n2 = n1;
		   n1 = calc;
		   
		}
		
	}

}
