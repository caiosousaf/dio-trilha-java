package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao, Boolean concluida) {
        tarefasSet.add(new Tarefa(descricao, concluida));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;

        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover = t;
                break;
            }
        }
        tarefasSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(tarefasSet);
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefas = new HashSet<>();

        for (Tarefa t : tarefasSet) {
            if (t.getConcluida()) {
                tarefas.add(t);
            }
        }

        return tarefas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefas = new HashSet<>();

        for (Tarefa t : tarefasSet) {
            if (!t.getConcluida()) {
                tarefas.add(t);
            }
        }

        return tarefas;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        Set<Tarefa> tarefasParaRemover = tarefasSet;
        tarefasSet.removeAll(tarefasParaRemover);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("Temos " + listaTarefas.contarTarefas() + " tarefas cadastradas!");

        listaTarefas.adicionarTarefa("Limpar Casa", false);
        listaTarefas.adicionarTarefa("Limpar Computador", false);
        listaTarefas.adicionarTarefa("Ligar Computador", false);
        listaTarefas.adicionarTarefa("Usar Caneta", false);

        System.out.println("Temos " + listaTarefas.contarTarefas() + " tarefas cadastradas!");
        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("Limpar casa");

        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Limpar casa");

        System.out.println(listaTarefas.obterTarefasConcluidas());

        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefas();

        listaTarefas.exibirTarefas();
    }
}
