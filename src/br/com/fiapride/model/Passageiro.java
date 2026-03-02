package br.com.fiapride.model;

public class Passageiro {
    private String nome;
    private double saldo;
    private  String cpf;

    //construtor
    public Passageiro(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(0);
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            this.setSaldo(valor);
        } else {
            System.out.println("O valor a ser adicionado deve ser maior que 0.");
        }
    }

    public void pagarViagem(double valorViagem) {
        if (getSaldo() < valorViagem) {
            System.out.println("saldo insuficiente!");
        } else {
            this.saldo = this.saldo - valorViagem;
            System.out.println("Viagem paga com sucesso!");
            System.out.println("Saldo restante: "+ getSaldo());
        }
    }


    // getter e setters
    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo += saldo;
            System.out.println("Saldo atual: "+ getSaldo());
        } else {
            System.out.println("O valor a ser adicionado deve ser maior que 0.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
         this.cpf = cpf;
    }
}
