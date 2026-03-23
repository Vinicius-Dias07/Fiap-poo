package br.com.exercicioDaAula.model;

public class Motorista {
    private String nome;
    private String cnh;
    private Onibus onibusDirigido;

    public Motorista(String nome, String cnh, Onibus onibusDirigido) {
        this.nome = nome;
        this.cnh = cnh;
        this.onibusDirigido = onibusDirigido;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Onibus getOnibusDirigido() {
        return onibusDirigido;
    }

    public void setOnibusDirigido(Onibus onibusDirigido) {
        this.onibusDirigido = onibusDirigido;
    }

    @Override
    public String toString() {
        return "Dados:\n" +
                "Motorista{" +
                "nome='" + nome + '\'' +
                ", cnh='" + cnh + '\'' +
                ", onibusDirigido=" + onibusDirigido +
                '}';
    }
}
