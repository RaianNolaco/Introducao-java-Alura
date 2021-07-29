
public class TestaEscopo {

	public static void main(String[] args) {

		System.out.println("+----------------------+");
		System.out.println("|Testeando condicionais|");
		System.out.println("+----------------------+\n\n");

		int idade = 18;
		int qntPessoas = 1;

		boolean acompanhado;

		if (qntPessoas >= 2) {

			acompanhado =  true;
			
		} else {

			acompanhado = false;
		}
		
		
		System.out.println("Sua idade é: " + idade);
		System.out.println("Pessoas presentes: " + qntPessoas + "\n");


		if (idade >= 18 && acompanhado) {

			System.out.println("Seja bem-vindo");

		} else {

			System.out.println("Infelizmente você não pode entrar");
		}

	}

}
