package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoCompras;

    public CarrinhoDeCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("O total de itens é: " + carrinhoDeCompras.obterNumeroTotalItens());

        carrinhoDeCompras.adicionarItem("Casa", 18.99, 1);

        System.out.println("O total de itens é: " + carrinhoDeCompras.obterNumeroTotalItens());

        carrinhoDeCompras.removerItem("Casa");

        carrinhoDeCompras.adicionarItem("Guitarra", 180.99, 2);
        carrinhoDeCompras.adicionarItem("Mouse", 10.00, 2);

        System.out.println("O total de itens é: " + carrinhoDeCompras.obterNumeroTotalItens());

        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total dos itens do carrinho: " + carrinhoDeCompras.calcularValorTotal());
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item i : carrinhoCompras) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        carrinhoCompras.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double total = 0;

        for (Item i : carrinhoCompras) {
            total += i.getPreco() * i.getQuantidade();
        }

        return total;
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    public int obterNumeroTotalItens() {
        return carrinhoCompras.size();
    }

    public void exibirItens() {
        System.out.println(carrinhoCompras);
    }
}
