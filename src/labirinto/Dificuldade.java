package labirinto;

public enum Dificuldade {
    FACIL(12, 17),
    MEDIO(14, 20),
    DIFICIL(16, 24);

    private final int linhas;
    private final int colunas;

    Dificuldade(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }
}
