import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Digite o número da Conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome do Titular: ");
        String titular = scanner.nextLine();
        System.out.println("Digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque",titular,agencia,conta,saldo));
        scanner.close();
    }
}