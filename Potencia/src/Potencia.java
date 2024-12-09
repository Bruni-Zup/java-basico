import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira o número base e o expoente
        System.out.print("Digite a base: ");
        int base = scanner.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        // Variável para armazenar o resultado da potência
        int resultado = 1;

        // Loop for para calcular a potência
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;  // Multiplica a base pelo resultado
        }

        // Exibe o resultado
        System.out.println(base + " elevado a " + expoente + " é: " + resultado);

        // Fecha o scanner
        scanner.close();
    }
}

