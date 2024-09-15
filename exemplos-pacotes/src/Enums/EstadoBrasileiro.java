package Enums;

public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo", 1),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 2),
    PIAUI("PI", "Piauí", 3),
    MARANHAO("MA", "Maranhão", 4);

    private String sigla;
    private String nome;
    private int ibge;

    EstadoBrasileiro(String nome, String sigla, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
