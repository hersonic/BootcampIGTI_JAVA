package pacote01;

import java.util.*;

public class Classe04 {

	public static void main(String[] args) {

		         Scanner entrada = new Scanner(System.in);

		        int[] numeros = new int[50];

		         int contaNros = 0;

		        char continuar = 'S';

		        for (int i = 0; i < contaNros; i++) {
		            System.out.printf("%d\n", numeros[i]);
		         
	        }
		        
		        while (continuar == 'S' || continuar == 's') {

		           System.out.printf("Digite o %d� n�mero:\n", contaNros+1);
		           
		           numeros[contaNros] = entrada.nextInt();

		           contaNros++;

		           for (int i = 0; i < contaNros; i++) {
			            System.out.printf("%d\n", numeros[i]);
			          
		        }
		           entrada.nextLine();

		           System.out.println("Deseja continuar digitando n�meros (S � Sim. N � N�o)?");

		           continuar = entrada.nextLine().charAt(0);

		        }

		    }

		 }