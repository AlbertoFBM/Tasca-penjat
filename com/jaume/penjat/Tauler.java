package com.jaume.penjat;

public class Tauler {
    private int intents;
    private char[] paraulaSecreta;
    private char[] paraulaEndevinada;

    public void inicialitzarPartida(String par, int intents) {
        this.intents = intents;
        paraulaSecreta = par.toCharArray();
        paraulaEndevinada = new char[par.length()];
    }

    public char[] getParaulaSecreta() {
        return paraulaSecreta;
    }
}
