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
		
		System.out.print("Digite um caractere para a situação do aluno (0 --> OK; P --> Pendência: )");
		statusAluno = entradaCaracteres.nextLine().charAt(0);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = entradaNotas.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = entradaNotas.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = entradaNotas.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		nota4 = entradaNotas.nextDouble();
		
		System.out.print("Digite a frequência do aluno: ");
		frequencia = entradaNotas.nextDouble();
		
		totalNota = nota1 + nota2 + nota3 + nota4;
		boolean aprovado = totalNota >= 70 && frequencia >= 0.75;
		
		System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequencia %.2f%%. A situação do(a) aluno(a) é %c.\n"
		        + "Aluno aprovado? %b", nomeAluno, totalNota, frequencia*100, statusAluno, aprovado);

	}

}
