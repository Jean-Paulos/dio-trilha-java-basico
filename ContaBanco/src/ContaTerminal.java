package ContaBanco.src;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, insira o número da Agência: ");
        String agencia = sc.nextLine();

        System.out.print("Agora, insira o número da Conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome do Titular da Conta: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Agora, insira o Saldo da Conta: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}