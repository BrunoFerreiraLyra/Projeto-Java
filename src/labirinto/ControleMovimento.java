package labirinto;

import personagem.Aventureiro;
import java.util.Scanner;

public class ControleMovimento {
    private final Scanner scanner = new Scanner(System.in);

    public char lerComando() {
        System.out.print("Digite o movimento (W = cima, A = esquerda, S = baixo, D = direita): ");
        String entrada = scanner.nextLine().toUpperCase();
        while (!entrada.matches("[WASD]")) {
            System.out.print("Comando inválido. Digite W, A, S ou D: ");
            entrada = scanner.nextLine().toUpperCase();
        }
        return entrada.charAt(0);
    }

    public int[] calcularNovaPosicao(char direcao, Aventureiro aventureiro, Labirinto labirinto) throws Exception {
        int novaX = aventureiro.getPosX();
        int novaY = aventureiro.getPosY();

        switch (direcao) {
            case 'W': novaX--; break;
            case 'S': novaX++; break;
            case 'A': novaY--; break;
            case 'D': novaY++; break;
        }

        if (novaX < 0 || novaX >= labirinto.getLinhas() || novaY < 0 || novaY >= labirinto.getColunas()) {
            throw new Exception("Movimento fora dos limites do labirinto!");
        }

        if (labirinto.getElemento(novaX, novaY) == '#') {
            throw new Exception("Você bateu em uma parede!");
        }

        return new int[] { novaX, novaY };
    }
}
