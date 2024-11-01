package main.java.set.Pesquisa;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private Boolean concluida;

    public Boolean getConcluida() {
        return concluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(descricao, tarefa.descricao);
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public Tarefa(String descricao, Boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }
}
