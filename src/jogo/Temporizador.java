package jogo;

public class Temporizador {

    private long inicio;
    private long fim;

    public void iniciar() {
        inicio = System.currentTimeMillis();
        fim = 0; 
    }

    public void finalizar() {
        fim = System.currentTimeMillis();
    }

    public long getDuracaoEmSegundos() {
        long tempoFinal = (fim > 0) ? fim : System.currentTimeMillis();
        return (tempoFinal - inicio) / 1000;
    }

    public String formatarTempo() {
        long segundos = getDuracaoEmSegundos();
        long minutos = segundos / 60;
        long restoSegundos = segundos % 60;
        return String.format("%02d:%02d", minutos, restoSegundos);
    }
}
