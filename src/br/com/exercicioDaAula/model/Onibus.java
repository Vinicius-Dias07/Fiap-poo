package br.com.exercicioDaAula.model;

public class Onibus {
    private String modelo;
    private String marca;
    private int anoDeFabricacao;
    private double nivelDisel;
    private int capacidadePessoas;
    private boolean motorLigado;
    private int capacidadeDisel;

    //construtor
    public Onibus(String modelo, String marca, int anoDeFabricacao, int capacidadePessoas, int capacidadeDisel) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoDeFabricacao = anoDeFabricacao;
        this.capacidadePessoas = capacidadePessoas;
        this.motorLigado = false;
        this.nivelDisel = 0;
        this.capacidadeDisel = capacidadeDisel;
    }

    //metodos
    public void alterarEstadoDoMotor() {
        if (isMotorLigado()) {
            setMotorLigado(false);
            System.out.println("Desligando o motor!");
        } else {
            setMotorLigado(true);
            System.out.println("Ligando o motor!");
        }
    }

    //Getters e Setters
    public String getModelo() {
        return modelo;
    }


        public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public double getNivelDisel() {
        return nivelDisel;
    }

    public void setNivelDisel(double nivelDisel) {
        this.nivelDisel = nivelDisel;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    public boolean isMotorLigado() {
        return motorLigado;
    }

    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }
}
