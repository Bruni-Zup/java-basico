import java.util.Scanner;

public class BinarioParaDecima {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira um número binário
        System.out.print("Digite um número binário: ");
        String binario = scanner.nextLine();

        // Converte o número binário para decimal
        int decimal = Integer.parseInt(binario, 2);

        // Exibe o resultado
        System.out.println("O número decimal correspondente a " + binario + " é: " + decimal);

        // Fecha o scanner
        scanner.close();
    }
}

