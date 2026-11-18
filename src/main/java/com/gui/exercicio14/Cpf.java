package com.gui.exercicio14;

final class Cpf {
    private final String numero;

    Cpf(String numero) {
        if (numero == null || !numero.matches("[0-9]{11}")) {
            throw new IllegalArgumentException("O CPF deve ter 11 dígitos.");
        }
        this.numero = numero;
    }

    String getNumero() {
        return numero;
    }
}
