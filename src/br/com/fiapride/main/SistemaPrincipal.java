package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Passageiro passageiro1 = new Passageiro();
        Passageiro passageiro2 = new Passageiro();
        passageiro1.nome = "Oliver";
        passageiro1.saldo = 45.80;

        passageiro2.nome = "Sophia";
        passageiro2.saldo = 10.45;

        System.out.println("-----Sistema FiapRide-----");
        System.out.println("Passageiro1 nome:"+ passageiro1.nome );
        System.out.println("Passageiro1 saldo:"+ passageiro1.saldo );

        System.out.println("--------------------------");

        System.out.println("Passageiro2 nome:"+ passageiro2.nome );
        System.out.println("Passageiro2 saldo:"+ passageiro2.saldo );
    }
}
