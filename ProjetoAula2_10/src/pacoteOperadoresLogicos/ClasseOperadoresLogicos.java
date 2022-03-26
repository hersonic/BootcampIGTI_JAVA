package pacoteOperadoresLogicos;

public class ClasseOperadoresLogicos {

	public static void main(String[] args) {
		int var1 = 10, var2 = 20;
		boolean resultado;
		
		resultado = (var1 == var2);
		
		System.out.printf("As variaveis são iguais? \nResposta: %b\n", resultado);
		
		var1 = 20; 
		var2 = 20;
		
		resultado = (var1 != var2);
		
		System.out.printf("As variaveis são diferentes? \nResposta: %b\n", resultado);
		
		var1 = 40; 
		var2 = 20;
		
		resultado = (var1 > var2);
		
		System.out.printf("As variaveis é maior que a var2? \nResposta: %b\n", resultado);
		
		var1 = 4; 
		var2 = 20;
		
		resultado = (var1 < var2);
		
		System.out.printf("As variaveis é menor que a var2? \nResposta: %b\n\n", resultado);
		
		boolean p, q, s;
		p = false; q = false;
		s = p && q;
		System.out.printf("p: %b; q: %b; s: %b\n", p, q, s);
		
		p = true; q = false;
		s = p && q;
		System.out.printf("p: %b; q: %b; s: %b\n", p, q, s);
		
		p = false; q = true;
		s= p && q;
		System.out.printf("p: %b; q: %b; s: %b\n", p, q, s);
		
		p = true; q = true;
		s= p && q;
		System.out.printf("p: %b; q: %b; s: %b\n", p, q, s);
		
		p = true;
		s = !p;
		System.out.printf("p: %b; s: %b\n", p, s);

		p = false;
		s = !p;
		System.out.printf("p: %b; s: %b\n", p, s);
	}

}
