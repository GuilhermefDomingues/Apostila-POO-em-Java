package com.gui.exercicio13;

public class Exercicio13 {
    public static void main(String[] args) {
        Cliente primeiro = new Cliente("Ana");
        Cliente segundo = new Cliente("Pedro", "pedro@email.com");
        System.out.println(primeiro.nome + " - " + primeiro.email);
        System.out.println(segundo.nome + " - " + segundo.email);
    }
}
