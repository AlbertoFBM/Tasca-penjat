package com.jaume.penjat;

public class Tauler {
    private int intents;
    private int intentsTotal;
    private char[] paraulaSecreta;
    private String[] palabraEndevinada;

    public void inicialitzarPartida(String par, int intents) {
        this.intents = intents;
        this.intentsTotal = intents;
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

    public String imprimir() {
        String salida = "";
        for (int i=0; i<palabraEndevinada.length; i++) {
            if (palabraEndevinada[i] == null) {
                salida = salida + "_";
            }
        }
        return salida;
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
