package pacoteExemplo;

public class ClasseExemplo {

	public static void main(String[] args) {
		String nome, nome2;
		nome = "Herick Portugal Bomtorin";
		nome2 = "Jo�o Valmir Araujo Bomtorin";
		
		System.out.println(nome);
		System.out.println(nome2);
		
		int tamanhoDoNome = nome.length(), tamanhoDoNome2 = nome2.length();
		
		System.out.println("A variavel nome tem " + tamanhoDoNome + " caracteres.");
		System.out.println("A variavel nome tem " + tamanhoDoNome2 + " caracteres.");
		int totalCaracteres = tamanhoDoNome + tamanhoDoNome2;
		System.out.println("O Total de caracteres das duas variaveis �: " + totalCaracteres);
		
		String nomesConcatenados = nome.concat(nome2);
		System.out.println(nomesConcatenados);
		
		String nomeSemA = nome.replace('a', '9');
		System.out.println(nomeSemA);
		
		String somenteNome = nome2.substring(5, 11);
		System.out.println(somenteNome);
		
		String nomeTudoMaisculo = nome2.toUpperCase();
		System.out.println(nomeTudoMaisculo);
		
		String nomeTudoMinisculo = nome2.toLowerCase();
		System.out.println(nomeTudoMinisculo);
	}

}
