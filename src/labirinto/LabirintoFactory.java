package labirinto;

public class LabirintoFactory {
    public static Labirinto criarLabirinto(Dificuldade dificuldade) {
        return new Labirinto(dificuldade.getLinhas(), dificuldade.getColunas());
    }
}
