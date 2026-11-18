package com.gui.exercicio17;

public class Exercicio17 {
    public static void main(String[] args) {
        for (Prioridade prioridade : Prioridade.values()) {
            System.out.println(prioridade + " - " + prioridade.getSlaHoras() + " horas");
        }
    }
}
