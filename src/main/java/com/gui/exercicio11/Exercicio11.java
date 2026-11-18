package com.gui.exercicio11;

public class Exercicio11 {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(150);
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
