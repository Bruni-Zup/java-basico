import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        // Variável para armazenar o resultado do fatorial
        int fatorial = 1;

        // Verifica se o número é negativo
        if (n < 0) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
        } else {
            // Loop while para calcular o fatorial
            int i = n;
            while (i > 1) {
                fatorial *= i;  // Multiplica o fatorial pelo valor de i
                i--;  // Decrementa o valor de i
            }
        }

        // Exibe o resultado
        System.out.println("O fatorial de " + n + " é: " + fatorial);

        // Fecha o scanner
        scanner.close();
    }
}

