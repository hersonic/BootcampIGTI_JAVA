package pacoteCalculadora;

import java.util.Scanner;

public class ClasseCalculadora {

	public static void main(String[] args) {
		double n1, n2, total;
		char operacao;
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner entradaChar = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo numero");
		n2 = entrada.nextDouble();
		
		System.out.println("Digite a operação desejada (+,-,*,/): ");
		operacao = entradaChar.nextLine().charAt(0);
		
		if (operacao == '+') {
			total = n1 + n2;
		}
		else if (operacao == '-'){
			total = n1 - n2;
		}
		else if(operacao == '*') {
			total = n1 * n2;
		}
		else  
		total = n1 / n2;
		
		System.out.printf("%.2f %c %.2f = %2f", n1, operacao, n2, total);
		
	}

}
