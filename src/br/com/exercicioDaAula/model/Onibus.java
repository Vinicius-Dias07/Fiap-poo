package br.com.exercicioDaAula.model;

public class Onibus extends Veiculo {

    public Onibus(String placa, String modelo, double capacidadeDoTanque, String marca, int anoDeFabricacao) {
        super(placa, modelo, capacidadeDoTanque, marca, anoDeFabricacao);
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
}
