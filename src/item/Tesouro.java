package item;

import personagem.Aventureiro;

public class Tesouro extends Item {
    public Tesouro(int x, int y) {
        super(x, y);
    }

    @Override
    public void aplicarEfeito(Aventureiro aventureiro) {
        System.out.println("Você encontrou o tesouro!");
        System.out.println("Parabéns, " + aventureiro.getNome() + "! Você venceu o jogo!");
        System.exit(0); 
    }
}
