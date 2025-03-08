import java.util.Scanner;
/*
* This project is dedicated to submitting the 'Flow Control' Challenge 
* https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo
* from the Java course at Digital Innovation One (DIO) - https://web.dio.me/.
* The project uses try-catch, if, and for to practice the concepts of exception handling, 
* conditional structures, and repetition structure.
*/

public class Contador {
	public static void main(String[] args) {
		// Create an object of Scanner to read user input
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int firstParam = scanner.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int secondParam = scanner.nextInt();

		try {
			contar(firstParam, secondParam);
		} catch (ParametrosInvalidosException exception) {
			// Print the message: The second parameter must be greater than the first.
			System.out.println(exception.getMessage());
		}
		scanner.close();
	}

	static void contar(int firstParam, int secondParam) throws ParametrosInvalidosException {
		// Validate if the first parameter is greater than the second parameter
		// and throw the personalized exception
		if (firstParam >= secondParam) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		// Calculate the difference between the second and first parameters
		int counter = secondParam - firstParam;
		// Use counter as the limit of the for loop
		for (int i = 1; i <= counter; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}