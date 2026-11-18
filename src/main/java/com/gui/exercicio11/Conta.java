package com.gui.exercicio11;

class Conta {
    private double saldo;

    void depositar(double valor) {
        if (!Double.isFinite(valor) || valor <= 0) {
            throw new IllegalArgumentException("Informe um valor positivo.");
        }
        saldo += valor;
    }

    double getSaldo() {
        return saldo;
    }
}
