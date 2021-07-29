package exercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MediaEscolar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat dec =new DecimalFormat("0.00");

		double mediaFinal = 0;
		
		for (int i = 1; i <= 4; i++) {
			
			System.out.println("\nInsira as notas do "+i+"° Bimestre:");

			System.out.print("\nDigite a 1° nota: ");
			double n1 = sc.nextDouble();

			System.out.print("\nDigite a 2° nota: ");
			double n2 = sc.nextDouble();

			System.out.print("\nDigite a 3° nota: ");
			double n3 = sc.nextDouble();

			double media = (n1 + n2 + n3) / 3;
			
			System.out.println("\nSua media do "+i+"° Bimestre foi: "+dec.format(media)+"\n");
			
			if(media < 6){
				
				
				System.out.print("Digite a nota da recuperação: ");
				double rec = sc.nextDouble();
				
				if(n1 > n2 && n1 > n3){
					
					n1 = rec;
					media = (n1 + n2 + n3) / 3;
					
				}else if(n2> n1 && n2 > n3) {
					
					n2 = rec;
					media = (n1 + n2 + n3) / 3;
				
				}else {
					
					n3 = rec;
					media = (n1 + n2 + n3) / 3;
				}
				
				System.out.println("\nSua nota do "+i+"° Bimestre agora é: "+dec.format(media));
			}

			 
		
			mediaFinal +=media; 
			
		}
		
		
		mediaFinal =  mediaFinal/4;
		
		System.out.println("Sua media final foi de "+dec.format(mediaFinal));
		sc.close();

	}

}
