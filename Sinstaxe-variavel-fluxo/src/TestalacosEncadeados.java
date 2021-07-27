
public class TestalacosEncadeados {
	
	public static void main(String[] args) {
		
		for(int multiplicador = 1;multiplicador <= 10;multiplicador++){
		
			for(int contador = 1; contador <= 10; contador++){

				System.out.println(multiplicador+" x "+contador+" = "+multiplicador*contador);
				
				
			}
			
			System.out.println("------------");
			
		}
		
		for(int linha = 0;linha < 10;linha++){
			
			for(int coluna = 0; coluna <= linha; coluna++){

				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
	}

}
