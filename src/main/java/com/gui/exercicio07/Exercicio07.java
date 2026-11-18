package com.gui.exercicio07;

public class Exercicio07 {
    public static void main(String[] args) {
        Livro livro = new Livro("O Pequeno Príncipe");
        livro.emprestar();
        livro.emprestar();
        livro.devolver();
        System.out.println("Disponível: " + livro.disponivel);
    }
}
