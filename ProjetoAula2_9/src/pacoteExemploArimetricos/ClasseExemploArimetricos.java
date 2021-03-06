package pacoteExemploArimetricos;

import java.math.*;

public class ClasseExemploArimetricos {

	public static void main(String[] args) {
		// X^2 + 12x -13 = 0
		// 2x^2 -16x -18 = 0
		
		double a, b, c;
		
	a = 3;
	b = -15;
	c = -20;
	
	double delta = 0;
	
	delta = (b * b) - (4 * a * c);
	System.out.printf("O valor do delta ?: %.0f\n", delta);
	
	double x_linha = 0;
	x_linha = (-b + Math.sqrt(delta)) / (2*a);
	System.out.printf("O valor de x ?: %.0f\n", x_linha);
	
	double x_duaslinhas = 0;
	x_duaslinhas = (-b - Math.sqrt(delta)) / (2*a);
	System.out.printf("O valor de x ?: %.0f", x_duaslinhas);
	

	}

}
