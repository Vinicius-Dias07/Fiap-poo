package br.com.exercicioDaAula.main;

import br.com.exercicioDaAula.model.Onibus;

public class OnibusTeste {
    public static void main(String[] args) {
        Onibus onibus = new Onibus("Mercedes-Benz O-500U", "Mercedes-Benz", 2019, 75,500);
        Onibus onibus2 = new Onibus("Volvo B270F","Volvo", 2022,65,400);



        System.out.println("---Ficha-tecnica-onibus---");

        onibus.alterarEstadoDoMotor();
        onibus.alterarEstadoDoMotor();
/*
        System.out.println("Marca:"+ onibus.marca);
        System.out.println("Modelo:"+ onibus.modelo);
        System.out.println("Capacidade:"+ onibus.capacidade+ " pessoas");
        System.out.println("Ano de fabricacao:"+ onibus.anoDeFabricacao);
        System.out.println("Nivel do disel:"+ onibus.nivelDisel+" L");
        System.out.println("--------------------------");
        System.out.println("Marca:"+ onibus2.marca);
        System.out.println("Modelo:"+ onibus2.modelo);
        System.out.println("Capacidade:"+ onibus2.capacidade+ " pessoas");
        System.out.println("Ano de fabricacao:"+ onibus2.anoDeFabricacao);
        System.out.println("Nivel do disel:"+ onibus2.nivelDisel+" L");

*/

    }
}
