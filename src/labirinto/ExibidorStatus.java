package labirinto;

import personagem.Aventureiro;

public class ExibidorStatus {
    public static void mostrarStatus(Aventureiro aventureiro, int turnos) {
        System.out.println("\n---------------------------------");
        System.out.println("Nome do Aventureiro: " + aventureiro.getNome());
        System.out.println("Vida: " + aventureiro.getVida());
        System.out.println("Posição: (" + aventureiro.getPosX() + ", " + aventureiro.getPosY() + ")");
        System.out.println("Turnos: " + turnos);
        System.out.println("---------------------------------");
    }
}
