public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "CASA" + "PAPEL";

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        concatenacao = 1 + "1" + 1 + "1";

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(nomeCompleto + concatenacao);

        int a, b;

        a = 1;
        b = 2;

        String resultado = a == 1 && b == 2 ? "true" : "false";

        System.out.println(resultado);
    }
}
