package personagem;

public class Aventureiro {
    private String nome;
    private int vida;
    private int posX;
    private int posY;

    public Aventureiro(String nome, int posX, int posY) {
        this.nome = nome;
        this.vida = 120;
        this.posX = posX;
        this.posY = posY;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = Math.min(vida, 120);
    }

    public void reduzirVida(int quantidade) {
        this.vida -= quantidade;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void mover(int novoX, int novoY) {
        this.posX = novoX;
        this.posY = novoY;
    }
}
