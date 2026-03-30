package br.com.exercicioDaAula.main;

import br.com.exercicioDaAula.model.Motorista;
import br.com.exercicioDaAula.model.Onibus;

public class OnibusTeste {
    public static void main(String[] args) {
        Onibus onibus = new Onibus("ABCDE", "VOLVO B270F", 120,"VOLVO", 2024);





        System.out.println("---Ficha-tecnica-onibus---");
        onibus.alterarEstadoDoMotor();
        System.out.println(onibus);
        onibus.alterarEstadoDoMotor();
        System.out.println(onibus);

        Motorista motorista = new Motorista("Cleber", "123.456.789.88", onibus);
        System.out.println(motorista);

    }
}
