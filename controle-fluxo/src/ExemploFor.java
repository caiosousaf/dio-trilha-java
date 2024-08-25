public class ExemploFor {
    public static void main(String[] args) {
        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Carneirinhos " + carneirinhos);
        }

        String alunos[] = {"Caio", "Gleyson", "Jonas", "Julia"};

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
