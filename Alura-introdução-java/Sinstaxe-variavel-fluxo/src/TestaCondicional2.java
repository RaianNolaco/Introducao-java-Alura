
public class TestaCondicional2 {
	
	public static void main(String[] args) {
		
		System.out.println("+----------------------+");
		System.out.println("|Testeando condicionais|");
		System.out.println("+----------------------+\n\n");
		
		
		int idade = 18;
		int qntPessoas = 3;
		
		boolean acompanhado = qntPessoas >= 2; 
		
		//  ||  = ou 
		// &&  = e
		
		System.out.println("Sua idade é: " + idade);	
		System.out.println("Pessoas presentes: " + qntPessoas +"\n");
		
		// como a variavel "acompanhado" ja é booleana não precimaos fazer um teste logico nela
		if(idade >= 18 && acompanhado){
			
			System.out.println("Seja bem-vindo");
			
			
		}else {	
				
				System.out.println("Infelizmente você não pode entrar");
		}
		
	}

}
