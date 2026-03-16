package br.com.fiapride.model;

public class Veiculo {
    private String modelo;
    private String placa;


    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.setPlaca(placa);
    }

    public void alterarPlaca(String placa) {
        setPlaca(placa);
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }

    public String getModelo() {
        return modelo;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}