package com.gui.exercicio19;

import java.time.LocalDate;

public class Exercicio19 {
    public static void main(String[] args) {
        DataNascimento data = new DataNascimento(LocalDate.of(2003, 5, 23));
        System.out.println("Idade: " + data.calcularIdade(LocalDate.of(2026, 5, 22)));
        System.out.println("Idade: " + data.calcularIdade(LocalDate.of(2026, 5, 23)));
    }
}
