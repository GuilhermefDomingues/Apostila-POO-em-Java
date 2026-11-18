package com.gui.exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {
        Produto teclado = new Produto("Teclado", 120);
        Produto mouse = new Produto("Mouse", 80);
        Produto monitor = new Produto("Monitor", 750);

        Produto maisCaro = teclado;
        if (mouse.preco > maisCaro.preco) {
            maisCaro = mouse;
        }
        if (monitor.preco > maisCaro.preco) {
            maisCaro = monitor;
        }
        System.out.printf("Mais caro: %s - R$ %.2f%n", maisCaro.nome, maisCaro.preco);
    }
}
