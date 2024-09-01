import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int parametroUm = 0;
        int parametroDois = 0;

        try {
            System.out.println("Digite o primeiro parâmetro");
            parametroUm = scanner.nextInt();

            System.out.println("Digite o segundo parâmetro");
            parametroDois = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("O parâmetro deve ser um número inteiro");
        }

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro!");
        }

        scanner.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int indice = 0; indice < contagem; indice++) {
            System.out.println("Imprimindo o numero " + (indice + 1));
        }
    }
}
