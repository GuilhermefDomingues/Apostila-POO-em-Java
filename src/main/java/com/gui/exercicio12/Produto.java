package com.gui.exercicio12;

class Produto {
    private final String nome;
    private final double preco;

    Produto(String nome, double preco) {
        if (!Double.isFinite(preco) || preco < 0) {
            throw new IllegalArgumentException("Preço inválido.");
        }
        this.nome = nome;
        this.preco = preco;
    }

    String getNome() {
        return nome;
    }

    double getPreco() {
        return preco;
    }
}
