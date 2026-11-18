package com.gui.exercicio20;

class Produto {
    private final String nome;
    private final double preco;

    Produto(String nome, double preco) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Informe o nome do produto.");
        }
        if (!Double.isFinite(preco) || preco < 0) {
            throw new IllegalArgumentException("Preço inválido.");
        }
        this.nome = nome.trim();
        this.preco = preco;
    }

    String getNome() {
        return nome;
    }

    double getPreco() {
        return preco;
    }
}
