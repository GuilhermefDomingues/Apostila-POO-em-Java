package com.gui.exercicio17;

enum Prioridade {
    BAIXA(72), MEDIA(24), ALTA(4);

    private final int slaHoras;

    Prioridade(int slaHoras) {
        this.slaHoras = slaHoras;
    }

    int getSlaHoras() {
        return slaHoras;
    }
}
