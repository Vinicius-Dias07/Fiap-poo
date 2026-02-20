package br.com.exercicioDaAula.main;

import br.com.exercicioDaAula.model.Onibus;

public class OnibusTeste {
    public static void main(String[] args) {
        Onibus onibus = new Onibus();
        Onibus onibus2 = new Onibus();
        onibus.marca = "Mercedes-Benz";
        onibus.modelo = "Mercedes-Benz O-500U";
        onibus.capacidade = 75;
        onibus.anoDeFabricacao = 2019;
        onibus.nivelDisel = 87.8;

        onibus2.marca = "Volvo";
        onibus2.modelo = "Volvo B270F";
        onibus2.capacidade = 65;
        onibus2.anoDeFabricacao = 2022;
        onibus2.nivelDisel = 120;


        System.out.println("---Ficha-tecnica-onibus---");

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



    }
}
