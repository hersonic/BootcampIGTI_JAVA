package pacoteContadores;

public class ClasseContador {

	public static void main(String[] args) {
		//Contador
		int contador = 0;
		System.out.printf("O valor atual do contador �...: %d\n", contador);
		contador++;
		System.out.printf("O valor atual do contador �...: %d\n", contador);
		contador = contador + 1;
		System.out.printf("O valor atual do contador �...: %d\n", contador);
		contador+= 1;
		System.out.printf("O valor atual do contador �...: %d\n\n", contador);
		
		//Acumuladores
		int notaAtividade = 0, notaTotal = 0;
		System.out.printf("Nota oficial.....: %d.\n", notaTotal);
		notaAtividade = 10;
		notaTotal = notaTotal + notaAtividade;
		System.out.printf("Nota oficial.....: %d.\n", notaTotal);
		notaAtividade = 30;
		notaTotal += notaAtividade;
		System.out.printf("Nota oficial.....: %d.\n", notaTotal);
		notaAtividade = -3;
		notaTotal = notaTotal + notaAtividade;
		System.out.printf("Nota oficial.....: %d.\n", notaTotal);
		

	}

}
