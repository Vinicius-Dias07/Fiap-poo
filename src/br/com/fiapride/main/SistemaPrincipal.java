package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Passageiro passageiro = new Passageiro("cleber", "12345678999");
        Veiculo veiculo = new Veiculo("Ferrari 458", "ABCD-123");


        System.out.println(veiculo);
        passageiro.adicionarSaldo(10);
        passageiro.adicionarSaldo(45);
        passageiro.pagarViagem(80);
    }
}
