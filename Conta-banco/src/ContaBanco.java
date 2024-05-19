import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá seja bem-vindo ao Banco Dio, ficamos felizes que deseja abrir sua conta. Para isso vamos precisar algumas informações:");

        ContaTerminal conta = new ContaTerminal();
        System.out.printf("Por favor, informe o numero da sua conta: ");
        conta.numero = sc.nextInt();
        sc.nextLine(); //capturando buffer do scanner
        System.out.printf("Por favor, informe o numero da sua agencia: ");
        conta.agencia = sc.nextLine();
        System.out.printf("Por favor, informe o nome: ");
        conta.nomeCliente = sc.nextLine();
        System.out.printf("Por favor, informe o seu saldo: ");
        conta.saldo = sc.nextDouble();

        sc.close();

        System.out.println("\nOlá " + conta.nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque.");

    }
}