package jogo;

import personagem.Aventureiro;

public class ExibidorStatus {

    public static void mostrarStatus(Aventureiro aventureiro, Temporizador temporizador) {
        System.out.println("---------------------------------");
        System.out.println("Nome: " + aventureiro.getNome());
        System.out.println("Vida: " + aventureiro.getVida());
        System.out.println("Posição: (" + aventureiro.getPosX() + ", " + aventureiro.getPosY() + ")");
        System.out.println("Tempo: " + temporizador.formatarTempo());
        System.out.println("---------------------------------");
    }
}
