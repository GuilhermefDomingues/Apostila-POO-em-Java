package com.gui.exercicio05;

public class Exercicio05 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.ligar();
        System.out.println("Ligada: " + lampada.ligada);
        lampada.desligar();
        System.out.println("Ligada: " + lampada.ligada);
    }
}
