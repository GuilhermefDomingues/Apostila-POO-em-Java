package com.gui.exercicio13;

class Cliente {
    String nome;
    String email;

    Cliente(String nome) {
        this(nome, "Não informado");
    }

    Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
