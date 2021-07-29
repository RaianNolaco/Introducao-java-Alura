
public class TestaCondicional {
	
	public static void main(String[] args) {
		
		System.out.println("+----------------------+");
		System.out.println("|Testeando condicionais|");
		System.out.println("+----------------------+");
		
		
		int idade = 12;
		int qntPessoas = 3;
		
		if(idade >= 18){
			
			System.out.println("Você é de maior");
			
			
		}else {
			
			if(qntPessoas >= 2) {
				
				System.out.println("Você pode entrar pois esta acompanahdo");
				
			}else{
				
				System.out.println("Infelizmente você não pode entrar");
			}
		}
		
	}

}
