// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class DesafioExtra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();
        double saldoFinal = saldoInicial;

        // TODO: Na linha abaixo, implemente a entrada das três transações:
        for (int i = 0; i < 3; i++) {
            // Entrada do valor da transação
            saldoFinal += scanner.nextDouble();
        }

        // TODO: Na linha abaixo, realize o cálculo do saldo final:

        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}