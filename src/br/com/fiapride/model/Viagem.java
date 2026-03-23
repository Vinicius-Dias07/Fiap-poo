package br.com.fiapride.model;

public class Viagem {
    private Passageiro solicitante;
    private Veiculo veiculoUtilizado;
    private String destino;
    private double valor;

    public Viagem(Passageiro solicitante, Veiculo veiculoUtilizado, String destino) {
        this.setSolicitante(solicitante);
        this.setVeiculoUtilizado(veiculoUtilizado);
        this.setDestino(destino);
        this.setValor(0);
    }

    public void exibirViagem() {
        System.out.println("Passageiro: "+this.solicitante.getNome());
        System.out.println("Destino: "+ getDestino());
        System.out.println("Veiculo: "+ getVeiculoUtilizado());

    }

    public Passageiro getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Passageiro solicitante) {
        this.solicitante = solicitante;
    }

    public Veiculo getVeiculoUtilizado() {
        return veiculoUtilizado;
    }

    public void setVeiculoUtilizado(Veiculo veiculoUtilizado) {
        this.veiculoUtilizado = veiculoUtilizado;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
