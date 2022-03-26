package notasdoaluno;

import java.util.Scanner;

public class calculodenotas {


	public static void main(String[] args) {
		Scanner nota = new Scanner(System.in);
		int nota1, nota2, nota3;
		int media, i, contAluno = 0;
		
		for(i = 0; i < 3; i++) {
			
			contAluno++;
			
			System.out.println("Aluno " + contAluno + ", digite sua 1a nota");
			nota1 = nota.nextInt();
			
			System.out.println("Aluno " + contAluno + ", digite sua 2a nota");
			nota2 = nota.nextInt();
			
			System.out.println("Aluno " + contAluno + ", digite sua 3a nota");
			nota3 = nota.nextInt();
			
			media = (nota1 + nota2 + nota3) / 3;
			System.out.println("A media aluno " + contAluno + " é " + media);

		
			if( (media >= 0) && (media <4) ){
            System.out.println("Nota E");
        } else if(media < 5){
            System.out.println("Nota D");
        } else if(media < 7){
            System.out.println("Nota C");
        } else if(media < 8){
            System.out.println("Nota B");
        } else if(media <= 10){
            System.out.println("Nota A");
        }
	}
  }
}
        
		

