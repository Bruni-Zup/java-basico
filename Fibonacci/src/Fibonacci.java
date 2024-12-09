import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira o número n (quantidade de elementos da sequência)
        System.out.print("Digite o número n: ");
        int n = scanner.nextInt();

        // Inicializa os dois primeiros números da sequência de Fibonacci
        int a = 0, b = 1;

        // Imprime os primeiros n números da sequência de Fibonacci
        System.out.print("Os primeiros " + n + " números da sequência de Fibonacci: ");

        // Loop para imprimir a sequência de Fibonacci
        for (int i = 0; i < n; i++) {
            System.out.print(a);
            if (i < n - 1) {
                System.out.print(", ");  // Adiciona vírgula entre os números
            }

            // Atualiza os valores de a e b para os próximos números da sequência
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        // Nova linha após a impressão dos números
        System.out.println();

        // Fecha o scanner
        scanner.close();
     }
}
