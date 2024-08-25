public class Usuario {
    private String nome;
    private int conta;
    private String agencia;
    private double saldo;

    public Usuario(String nome, int conta, String agencia, double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public double sacar(double valorSaque) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque;
            return saldo;
        } else {
            throw new IllegalArgumentException("Impossível realizar saque, saldo insuficiente");
        }
    }

    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getConta() {
        return conta;
    }
}
