package com.gui.exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        Pessoa primeira = new Pessoa("Ana", 20);
        Pessoa segunda = new Pessoa("Pedro", 23);
        System.out.println(primeira.nome + " - " + primeira.idade + " anos");
        System.out.println(segunda.nome + " - " + segunda.idade + " anos");
    }
}
