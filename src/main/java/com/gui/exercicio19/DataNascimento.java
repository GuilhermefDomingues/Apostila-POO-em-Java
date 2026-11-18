package com.gui.exercicio19;

import java.time.LocalDate;
import java.time.Period;

class DataNascimento {
    private final LocalDate nascimento;

    DataNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    int calcularIdade(LocalDate dataReferencia) {
        if (dataReferencia.isBefore(nascimento)) {
            throw new IllegalArgumentException("A data de referência é anterior ao nascimento.");
        }
        return Period.between(nascimento, dataReferencia).getYears();
    }
}
