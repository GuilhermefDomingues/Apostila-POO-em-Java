package com.gui.exercicio16;

final class Usuario {
    private final int id;

    Usuario(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object objeto) {
        if (!(objeto instanceof Usuario)) {
            return false;
        }

        Usuario outro = (Usuario) objeto;
        return id == outro.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
