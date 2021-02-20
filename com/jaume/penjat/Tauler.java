package com.jaume.penjat;

public class Tauler {
    private int intents;
    private char[] paraulaSecreta;
    private String[] palabraEndevinada;

    public void inicialitzarPartida(String par, int intents) {
        this.intents = intents;
        paraulaSecreta = par.toCharArray();
        palabraEndevinada = new String[par.length()];
    }

    public char[] getParaulaSecreta() {
        return paraulaSecreta;
    }

    public int getIntents() {

        return intents;
    }

    public String[] getPalabraEndevinada() {
        return palabraEndevinada;
    }



    public String verificar(String intent) {
        boolean encontrado = false;
        if (intent.length() > 1) {
            return "Lletra incorrecte";
        } else {
            for (int i=0; i<paraulaSecreta.length; i++) {
                if (intent.charAt(0) == paraulaSecreta[i]) {
                    encontrado = true;
                    palabraEndevinada[i] = intent;
                }
            }
            if (!encontrado) {
                this.intents--;
            }
        }
        return "";
    }
}
