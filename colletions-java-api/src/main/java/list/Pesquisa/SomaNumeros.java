package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private final List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add(numero);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(11);
        somaNumeros.adicionarNumero(100);

        somaNumeros.exibirNumeros();

        System.out.println("A soma dos números da lista é: " + somaNumeros.calcularSoma());

        System.out.println("O maior número da lista é: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("O menor número da lista é: " + somaNumeros.encontrarMenorNumero());
    }

    public Integer calcularSoma() {
        int soma = 0;

        if (numeroList.isEmpty()) {
            return soma;
        }

        for (Integer n : numeroList) {
            soma += n;
        }

        return soma;
    }

    public Integer encontrarMaiorNumero() {
        int maiorNumero = 0;

        if (numeroList.isEmpty()) {
            return maiorNumero;
        }

        for (Integer n : numeroList) {
            if (n > maiorNumero) {
                maiorNumero = n;
            }
        }

        return maiorNumero;
    }

    public Integer encontrarMenorNumero() {
        return Collections.min(numeroList);
    }

    public void exibirNumeros() {
        System.out.println(numeroList);
    }

    @Override
    public String toString() {
        return "SomaNumeros{" + numeroList + "}";
    }
}
