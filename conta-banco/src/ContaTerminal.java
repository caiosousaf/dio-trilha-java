import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua conta!");
        System.out.println("");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua Agência!");
        System.out.println("");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome!");
        System.out.println("");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu saldo!");
        System.out.println("");
        double saldo = scanner.nextDouble();

        Usuario usuario = new Usuario(nome, numeroConta, agencia, saldo);

        System.out.println(String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                usuario.getNome(), usuario.getAgencia(), usuario.getConta(), usuario.getSaldo()));

        int operacaoEscolhida = -1;
        while (operacaoEscolhida != 0) {
            System.out.println("Qual operação voce gostaria de realizar");
            System.out.println("Sair das operações: Digite 0");
            System.out.println("Sacar: Digite 1");
            System.out.println("Depositar: Digite 2");
            operacaoEscolhida = scanner.nextInt();

            if (operacaoEscolhida == 1) {
                System.out.println("Qual o valor que voce gostaria de sacar");
                double saque = scanner.nextDouble();

                usuario.sacar(saque);

                System.out.println(String.format("Seu novo saldo é %.2f", usuario.getSaldo()));
            }

            if (operacaoEscolhida == 2) {
                System.out.println("Qual o valor que voce gostaria de depositar?");
                double valorDeposito = scanner.nextDouble();

                usuario.depositar(valorDeposito);

                System.out.println(String.format("Seu novo saldo é %.2f", usuario.getSaldo()));
            }
        }

        scanner.close();
    }
}
