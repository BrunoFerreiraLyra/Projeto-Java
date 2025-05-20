package perigo;

import personagem.Aventureiro;

public abstract class Perigo {
    protected int x;
    protected int y;

    public Perigo(int x, int y) {
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
