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

    public boolean hasGuanyat(){
        for (int i = 0; i < palabraEndevinada.length; i++) {
            if (palabraEndevinada[i].charAt(0) != paraulaSecreta[i]) {
                return false;
            }
        }
        return true;
    }

}
