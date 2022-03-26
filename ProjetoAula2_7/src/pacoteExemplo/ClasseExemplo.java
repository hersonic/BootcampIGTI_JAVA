package pacoteExemplo;

public class ClasseExemplo {

	public static void main(String[] args) {

       int idade = 39;
       double altura = 1.81;
       String nome = "Herick Portugal Bomtorin";
       boolean estudante = true;
       char sexo = 'M';
       
       //%s String
       //%d int
       //%.4f float ou double com 4 casas decimais
       //%b boolean
       //%c caractere (char)

       System.out.printf("A idade È %d e a altura È %.2f.\nO nome È %s e o sexo %c.\n… estudante? %b", idade, altura, nome, sexo, estudante);
	}

}
