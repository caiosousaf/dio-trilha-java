package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavraSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra) {
        Palavra palavrasParaRemover = null;
        for (Palavra p : palavraSet) {
            if (p.getPalavra().equalsIgnoreCase(palavra)) {
                palavrasParaRemover = p;
            }
        }
        palavraSet.remove(palavrasParaRemover);
    }

    public boolean verificarPalavra(String palavra) {
        boolean existe = false;
        for (Palavra p : palavraSet) {
            if (p.getPalavra().equalsIgnoreCase(palavra)) {
                existe = true;
                break;
            }
        }

        return existe;
    }

    public int contarPalavras() {
        return palavraSet.size();
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        System.out.println("Temos " + conjuntoPalavrasUnicas.contarPalavras() + " no nosso conjunto de palavras");

        conjuntoPalavrasUnicas.adicionarPalavra("Casa");
        conjuntoPalavrasUnicas.adicionarPalavra("Casa");
        conjuntoPalavrasUnicas.adicionarPalavra("Papel");

        System.out.println("Temos " + conjuntoPalavrasUnicas.contarPalavras() + " no nosso conjunto de palavras");

        conjuntoPalavrasUnicas.removerPalavra("Papel");

        System.out.println("Temos " + conjuntoPalavrasUnicas.contarPalavras() + " no nosso conjunto de palavras");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
