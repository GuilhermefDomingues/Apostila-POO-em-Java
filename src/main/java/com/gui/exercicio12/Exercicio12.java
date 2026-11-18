package com.gui.exercicio12;

public class Exercicio12 {
    public static void main(String[] args) {
        Produto produto = new Produto("Caderno", 25);
        System.out.printf("%s - R$ %.2f%n", produto.getNome(), produto.getPreco());
    }
}
