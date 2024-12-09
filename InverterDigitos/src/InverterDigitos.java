public class InverterDigitos import java.util.Scanner;

public class InverterDigitos {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Variável para armazenar o número invertido
        int numeroInvertido = 0;

        // Loop para inverter os dígitos do número
        while (numero != 0) {
            // Pega o último dígito do número e adiciona ao número invertido
            int ultimoDigito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + ultimoDigito;

            // Remove o último dígito do número
            numero /= 10;
        }

        // Exibe o resultado
        System.out.println("O número invertido é: " + numeroInvertido);

        // Fecha o scanner
        scanner.close();
    }
}

{
}
