package com.gui.exercicio07;

class Livro {
    String titulo;
    boolean disponivel = true;

    Livro(String titulo) {
        this.titulo = titulo;
    }

    void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println(titulo + " foi emprestado.");
        } else {
            System.out.println(titulo + " já está emprestado.");
        }
    }

    void devolver() {
        disponivel = true;
    }
}
