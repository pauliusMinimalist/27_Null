package com.company;

public class Main {

    public static void main(String[] args) {
        Adresas adresas = new Adresas(new Miestas("Vilnius"));

        System.out.println(gautiMiestoPavadinima(adresas));
        System.out.println(new Adresas(new Miestas("Klaipėda")));
    }


    public static String gautiMiestoPavadinima(Adresas adresas) {
        String miestoPavadinimas = String.valueOf(adresas);
        try {
            return miestoPavadinimas;
        } catch (NullPointerException e) {
            e.getMessage();
            return null;
        }
    }
}
