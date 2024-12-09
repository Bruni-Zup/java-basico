public class Soma {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        // Variável para armazenar a soma
        int soma = 0;

        // Loop for para calcular a soma dos números de 1 até n
        for (int i = 1; i <= n; i++) {
            soma += i;  // Soma o valor de i à variável soma
        }

        // Exibe o resultado
        System.out.println("A soma dos números de 1 até " + n + " é: " + soma);

        // Fecha o scanner
        scanner.close();
    }
}


