//importar a classe scanner
import java.util.Scanner;

public class Exercicio_Preferencial  {

	public static void main(String[] args) {
		// declarando scanner para entrada de dados
		Scanner Pref = new Scanner(System.in);
		// inserindo as Variaveis
		int OLD, DEF, GRAV;
		System.out.println("Digite: \n1 para sim\n2 para n�o!");
		System.out.println("Voce e Idoso?\n1.sim\n2.n�o");
		// atribuindo um valorores as variantes
		OLD = Pref.nextInt();
		System.out.println("Voce e uma pessoa com alguma Defici�ncia?\n1.sim\n2.n�o");
		DEF = Pref.nextInt();
		System.out.println("Voce esta Gravida?\n1.sim\n2.n�o");
		GRAV = Pref.nextInt();
		// criando uma condi��o
		if (OLD == 1 || DEF == 1 || GRAV == 1) {
			System.out.println("Voce pode estacionar nas vagas Preferenciais!");
		} else {
			System.out.println("Voce n�o pode estacionar em vagas Preferenciais!\nSujeito a Multa!");
		}
	}

}
