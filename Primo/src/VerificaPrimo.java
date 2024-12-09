import java.util.Scanner;

public class VerificaPrimo {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Variável para indicar se o número é primo
        boolean ehPrimo = true;

        // Números menores que 2 não são primos
        if (numero < 2) {
            ehPrimo = false;
        } else {
            // Verifica se o número é divisível por algum número de 2 até a raiz quadrada de 'numero'
            for (int i = 2; i <= Math.sqrt(numero); i++) {

