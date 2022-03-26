package pacoteLeituraDadosTeclado;

import java.math.*;
import java.util.*;

public class ClasseTeclados {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, frequencia, totalNota;
		char statusAluno;
		
		Scanner entradaNotas = new Scanner(System.in);
		Scanner entradaCaracteres = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = entradaCaracteres.nextLine();
		
		System.out.print("Digite um caractere para a situa��o do aluno (0 --> OK; P --> Pend�ncia: )");
		statusAluno = entradaCaracteres.nextLine().charAt(0);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = entradaNotas.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = entradaNotas.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = entradaNotas.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		nota4 = entradaNotas.nextDouble();
		
		System.out.print("Digite a frequ�ncia do aluno: ");
		frequencia = entradaNotas.nextDouble();
		
		totalNota = nota1 + nota2 + nota3 + nota4;
		boolean aprovado = totalNota >= 70 && frequencia >= 0.75;
		
		System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequencia %.2f%%. A situa��o do(a) aluno(a) � %c.\n"
		        + "Aluno aprovado? %b", nomeAluno, totalNota, frequencia*100, statusAluno, aprovado);

	}

}
