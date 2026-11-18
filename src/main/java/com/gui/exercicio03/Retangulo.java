package com.gui.exercicio03;

class Retangulo {
    double largura;
    double altura;

    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    double area() {
        return largura * altura;
    }
}
