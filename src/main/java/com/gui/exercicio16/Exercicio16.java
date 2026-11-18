package com.gui.exercicio16;

public class Exercicio16 {
    public static void main(String[] args) {
        Usuario primeiro = new Usuario(1);
        Usuario segundo = new Usuario(1);
        Usuario terceiro = new Usuario(2);
        System.out.println(primeiro.equals(segundo));
        System.out.println(primeiro.equals(terceiro));
        System.out.println(primeiro.hashCode() == segundo.hashCode());
    }
}
