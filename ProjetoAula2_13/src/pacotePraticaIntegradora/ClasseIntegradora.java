package pacotePraticaIntegradora;

public class ClasseIntegradora {
	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, frequencia, totalNota;
		char statusAluno;
		boolean aprovado;
		String nomeAluno;
		
		nomeAluno = "Herick Portugal Bomtorin";
		statusAluno = 'H';
		
		nota1 = 20;
		nota2 = 20;
		nota3 = 30;
		nota4 = 5;
		
		frequencia = 0.80;
		
		totalNota = nota1 + nota2 + nota3 + nota4;
		
		aprovado = totalNota >= 70 && frequencia >= 0.75;
		
		System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequencia %.2f%%. A situação do(a) aluno(a) é %c.\n"
		        + "Aluno aprovado? %b", nomeAluno, totalNota, frequencia*100, statusAluno, aprovado);
		
	}

}
