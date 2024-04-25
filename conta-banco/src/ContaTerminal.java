import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do terminal.
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo o número da Agência.
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicitando e lendo o número da Conta.
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumindo a quebra de linha deixada pelo nextInt().

        // Solicitando e lendo o nome do Cliente.
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicitando e lendo o saldo.
        System.out.println("Por favor, digite o saldo:");
        double saldo;
        while (true) {
            try {
                // Tenta ler a linha de entrada como uma string e converter para um número
                // decimal (double).
                saldo = Double.parseDouble(scanner.nextLine());
                break; // Sai do loop se a conversão for bem-sucedida.
            } catch (NumberFormatException e) {
                // Se ocorrer uma exceção ao tentar converter para double (por exemplo, se o
                // usuário inserir um texto), exibe uma mensagem de erro.
                System.out.println("Por favor, digite um número válido para o saldo:");
            }
        }

        // Fechando o scanner para liberar recursos.
        scanner.close();

        // Exibindo a mensagem com os dados fornecidos pelo usuário.
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}