package soma_multiplos;

import java.util.Scanner;

public class soma_multiplos {

	public static void main(String[] args) {
		// Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três
		// e que se encontram no conjunto dos números de 1 até 500.
		
		Scanner input = new Scanner(System.in);{
			
			int soma = 0;
		
				for(int i = 0; i <= 500; i+=3) {
					if (i % 2 != 0);{
					soma = soma + i;
					System.out.println(i);
					}
				}	

			System.out.println("A soma de todos o números ímpares múltiplos de três entre 1 até 500 é: " +soma);
			input.close();
	
		}
	}
}
