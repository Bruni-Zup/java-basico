public class Multiplos import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira o número n (base) e o limite m
        System.out.print("Digite o número n: ");
        int n = scanner.nextInt();
        System.out.print("Digite o limite m: ");
        int m = scanner.nextInt();

        // Imprime os múltiplos de n até m
        System.out.print("Múltiplos de " + n + " até " + m + ": ");
        for (int i = n; i <= m; i += n) {
            System.out.print(i);
            if (i + n <= m) {
                System.out.print(", ");  // Adiciona uma vírgula entre os múltiplos
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}

{
}
