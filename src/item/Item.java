package item;

import personagem.Aventureiro;

public abstract class Item {
    protected int x;
    protected int y;

    public Item(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void aplicarEfeito(Aventureiro aventureiro);
}
