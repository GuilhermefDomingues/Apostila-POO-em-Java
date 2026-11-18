package com.gui.exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(100);
        System.out.println("Saldo: " + conta.saldo);
    }
}
