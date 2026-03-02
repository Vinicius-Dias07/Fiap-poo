package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Passageiro passageiro = new Passageiro("cleber", "12345678999");

        passageiro.adicionarSaldo(10);
        passageiro.adicionarSaldo(45);
        passageiro.pagarViagem(80);
    }
}
