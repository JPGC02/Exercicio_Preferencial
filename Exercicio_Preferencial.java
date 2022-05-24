//importar a classe scanner
import java.util.Scanner;

public class Exercicio_Preferencial  {

	public static void main(String[] args) {
		// declarando scanner para entrada de dados
		Scanner Pref = new Scanner(System.in);
		// inserindo as Variaveis
		int OLD, DEF, GRAV;
		System.out.println("Digite: \n1 para sim\n2 para não!");
		System.out.println("Voce e Idoso?\n1.sim\n2.não");
		// atribuindo um valorores as variantes
		OLD = Pref.nextInt();
		System.out.println("Voce e uma pessoa com alguma Deficiência?\n1.sim\n2.não");
		DEF = Pref.nextInt();
		System.out.println("Voce esta Gravida?\n1.sim\n2.não");
		GRAV = Pref.nextInt();
		// criando uma condição
		if (OLD == 1 || DEF == 1 || GRAV == 1) {
			System.out.println("Voce pode estacionar nas vagas Preferenciais!");
		} else {
			System.out.println("Voce não pode estacionar em vagas Preferenciais!\nSujeito a Multa!");
		}
	}

}
