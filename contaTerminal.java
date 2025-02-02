 import java.util.Scanner;
public class contaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        scanner.close();
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +  " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque." );

    }   
}
