package item;

import personagem.Aventureiro;

public class Agua extends Item {
    public Agua(int x, int y) {
        super(x, y);
    }

    @Override
    public void aplicarEfeito(Aventureiro aventureiro) {
        System.out.println("Você encontrou água! +15 de vida.");
        aventureiro.setVida(aventureiro.getVida() + 20);
    }
}
