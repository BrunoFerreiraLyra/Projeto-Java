package ranking;

import labirinto.Dificuldade;

public class Registro {
    private String nome;
    private long tempoSegundos;
    private Dificuldade dificuldade;

    public Registro(String nome, long tempoSegundos, Dificuldade dificuldade) {
        this.nome = nome;
        this.tempoSegundos = tempoSegundos;
        this.dificuldade = dificuldade;
    }

    public String getNome() {
        return nome;
    }

    public long getTempoSegundos() {
        return tempoSegundos;
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }

    public String getTempoFormatado() {
        long minutos = tempoSegundos / 60;
        long segundos = tempoSegundos % 60;
        return String.format("%02d:%02d", minutos, segundos);
    }
}
