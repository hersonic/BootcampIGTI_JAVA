package pacoteExemploLogicos;

public class ClassesExemplos {

	public static void main(String[] args) {
		boolean ult3emprestiQuitadosPrazo, possuiRendaComprovada, clienteDezEstrelas, restricaoCredito;
		
		ult3emprestiQuitadosPrazo = true;
		possuiRendaComprovada = false;
		clienteDezEstrelas = false;
		restricaoCredito = false;
		
		boolean concederEmprestimo = (ult3emprestiQuitadosPrazo &&  possuiRendaComprovada || clienteDezEstrelas) && !restricaoCredito;
        System.out.printf("Emprestimo concedido? \n%b", concederEmprestimo);
	}

}
