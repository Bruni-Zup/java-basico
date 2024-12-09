import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Armazena o número original para comparação
        int numeroOriginal = numero;

        // Variável para armazenar o número invertido
        int numeroInvertido = 0;

        // Loop para inverter os dígitos do número
        while (numero != 0) {
            int ultimoDigito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + ultimoDigito;
            numero /= 10;
        }

        // Verifica se o número original é igual ao número invertido
        if (numeroOriginal == numeroInvertido) {
            System.out.println("O número é palíndromo: true");
        } else {
            System.out.println("O número é palíndromo: false");
        }

        // Fecha o scanner
        scanner.close();
    }
}
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Armazena o número original para comparação
        int numeroOriginal = numero;

        // Variável para armazenar o número invertido
        int numeroInvertido = 0;

        // Loop para inverter os dígitos do número
        while (numero != 0) {
            int ultimoDigito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + ultimoDigito;
            numero /= 10;
        }

        // Verifica se o número original é igual ao número invertido
        if (numeroOriginal == numeroInvertido) {
            System.out.println("O número é palíndromo: true");
        } else {
            System.out.println("O número é palíndromo: false");
        }

        // Fecha o scanner
        scanner.close();
    }
}

