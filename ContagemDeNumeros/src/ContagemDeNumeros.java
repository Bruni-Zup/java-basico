import java.util.Scanner;

public class ContagemDeDigitos {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Variável para armazenar a contagem de dígitos
        int contagem = 0;

        // Caso o número seja 0, ele possui 1 dígito
        if (numero == 0) {
            contagem = 1;
        } else {
            // Loop while para contar os dígitos
            while (numero != 0) {
                numero /= 10;  // Remove o último dígito do número
                contagem++;  // Incrementa a contagem
            }
        }

        // Exibe o resultado
        System.out.println("O número possui " + contagem + " dígitos.");

        // Fecha o scanner
        scanner.close();
    }
}


