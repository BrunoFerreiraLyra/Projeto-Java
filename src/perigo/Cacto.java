package perigo;

import personagem.Aventureiro;

public class Cacto extends Perigo {
    private final int dano = 30;

    public Cacto(int x, int y) {
        super(x, y);
    }

    @Override
    public void aplicarEfeito(Aventureiro aventureiro) {
        System.out.println("Você encostou em um cacto! -30 de vida.");
        aventureiro.reduzirVida(dano);
    }
}
