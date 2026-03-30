package br.com.exercicioDaAula.model;

public class Veiculo {
    private int anoDeFabricacao;
    private String placa;
    private String marca;
    private String modelo;
    private double capacidadeDoTanque;
    private boolean motorLigado;
    private double nivelDoCombustivel;

    public Veiculo(String placa, String modelo, double capacidadeDoTanque, String marca, int anoDeFabricacao) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidadeDoTanque;
        this.marca = marca;
        this.motorLigado = false;
        this.anoDeFabricacao = anoDeFabricacao;
        this.nivelDoCombustivel = 10;
    }

    public void alterarEstadoDoMotor() {
        if (isMotorLigado()) {
            setMotorLigado(false);
            System.out.println("Desligando o motor!");
        } else {
            setMotorLigado(true);
            System.out.println("Ligando o motor!");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public void setCapacidadeDoTanque(double capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }

    public boolean isMotorLigado() {
        return motorLigado;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public double getNivelDoCombustivel() {
        return nivelDoCombustivel;
    }

    public void setNivelDoCombustivel(double nivelDoCombustivel) {
        this.nivelDoCombustivel = nivelDoCombustivel;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "anoDeFabricacao=" + anoDeFabricacao +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadeDoTanque=" + capacidadeDoTanque +
                ", motorLigado=" + motorLigado +
                ", nivelDoCombustivel=" + nivelDoCombustivel +
                '}';
    }
}
