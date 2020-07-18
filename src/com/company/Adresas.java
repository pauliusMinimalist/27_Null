package com.company;

public class Adresas {
    private Miestas miestas;

    public Adresas(Miestas miestas) {
        this.miestas = miestas;
    }

    public Miestas getMiestas() {
        return miestas;
    }

    public void setMiestas(Miestas miestas) {
        this.miestas = miestas;
    }

    @Override
    public String toString() {
        return "Adresas{" +
                "miestas=" + miestas +
                '}';
    }
}
