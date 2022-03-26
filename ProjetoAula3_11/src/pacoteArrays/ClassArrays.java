package pacoteArrays;

import java.util.*;

public class ClassArrays {

	public static void main(String[] args) {
		int [] numeros = new int[10];
		int total = 0, i = 0;
		Scanner ent = new Scanner(System.in);
		
		for(i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº número. \n", i + 1);
			numeros[i] = ent.nextInt();
			total = total + numeros[i];
			System.out.printf("Total Parcial: %d.\n", total);
		}		
		
		System.out.printf("O valor total é: %d", total);
		

	}
}
