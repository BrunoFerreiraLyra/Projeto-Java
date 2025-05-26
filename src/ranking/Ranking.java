package ranking;

import java.util.*;
import labirinto.Dificuldade;

public class Ranking {

    private Map<Dificuldade, List<Registro>> rankings;

    public Ranking() {
        rankings = new HashMap<>();
        for (Dificuldade dif : Dificuldade.values()) {
            rankings.put(dif, new ArrayList<>());
        }
    }

    public void adicionarRegistro(String nome, long tempoSegundos, Dificuldade dificuldade) {
        Registro registro = new Registro(nome, tempoSegundos, dificuldade);
        rankings.get(dificuldade).add(registro);
    }

    public void mostrarRanking() {
        System.out.println("\n==== RANKINGS ====");

        for (Dificuldade dif : Dificuldade.values()) {
            List<Registro> lista = rankings.get(dif);

            System.out.println("\n-- " + dif.name() + " --");
            if (lista.isEmpty()) {
                System.out.println("Nenhuma vitória registrada ainda.");
                continue;
            }

            lista.sort(Comparator.comparingLong(Registro::getTempoSegundos));

            int posicao = 1;
            for (Registro r : lista) {
                System.out.println(posicao++ + ". " + r.getNome() + " - " + r.getTempoFormatado());
            }
        }
    }
}
