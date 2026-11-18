package com.gui.exercicio06;

class Aluno {
    double nota1;
    double nota2;

    Aluno(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
}
