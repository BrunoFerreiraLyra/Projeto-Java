package jogo;

import java.util.Scanner;
import labirinto.*;
import personagem.*;
import ranking.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Ranking ranking = new Ranking();

        while (true) {
            int escolhaMenu = menu.exibirMenuInicial();

            if (escolhaMenu == 0) {
                System.out.println("Encerrando o jogo. Até a próxima!");
                break;
            }

            if (escolhaMenu == 2) {
                ranking.mostrarRanking();
                continue;
            }

            iniciarJogo(scanner, menu, ranking);
        }
    }

    public static void iniciarJogo(Scanner scanner, Menu menu, Ranking ranking) {
        ControleMovimento controle = new ControleMovimento();
        Temporizador temporizador = new Temporizador();

        System.out.print("Digite o nome do aventureiro: ");
        String nome = scanner.nextLine();

        System.out.println("\nEscolha a dificuldade:");
        System.out.println("1 - Fácil\n2 - Médio\n3 - Difícil");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        Dificuldade dificuldade;
        switch (escolha) {
            case 1: dificuldade = Dificuldade.FACIL; break;
            case 2: dificuldade = Dificuldade.MEDIO; break;
            default: dificuldade = Dificuldade.DIFICIL; break;
        }

        Labirinto labirinto = LabirintoFactory.criarLabirinto(dificuldade);
        Aventureiro aventureiro = new Aventureiro(nome, 1, 1);
        labirinto.posicionarAventureiro(1, 1);

        temporizador.iniciar();

        while (true) {
            labirinto.imprimirLabirinto();
            ExibidorStatus.mostrarStatus(aventureiro, temporizador);

            aventureiro.reduzirVida(5);
            if (aventureiro.getVida() <= -5) {
                System.out.println("Você perdeu todas as vidas! Fim de jogo.");
                break;
            }

            char comando = controle.lerComando();

            try {
                int[] novaPos = controle.calcularNovaPosicao(comando, aventureiro, labirinto);

                labirinto.atualizarPosicaoAventureiro(
                    aventureiro.getPosX(), aventureiro.getPosY(), novaPos[0], novaPos[1]);
                aventureiro.mover(novaPos[0], novaPos[1]);

                labirinto.verificarPerigo(aventureiro);
                boolean venceu = labirinto.verificarItem(aventureiro);

                labirinto.posicionarAventureiro(aventureiro.getPosX(), aventureiro.getPosY());

                if (venceu) {
                    temporizador.finalizar();
                    long tempoFinal = temporizador.getDuracaoEmSegundos();
                    System.out.println("\nParabéns, " + aventureiro.getNome() + "! Você encontrou o tesouro!");
                    System.out.println("Tempo total: " + temporizador.formatarTempo());

                    ranking.adicionarRegistro(aventureiro.getNome(), tempoFinal, dificuldade);

                    boolean vitoriaPerfeita = false;
                    switch (dificuldade) {
                        case FACIL: vitoriaPerfeita = tempoFinal <= 10; break;
                        case MEDIO: vitoriaPerfeita = tempoFinal <= 15; break;
                        case DIFICIL: vitoriaPerfeita = tempoFinal <= 20; break;
                    }

                    if (vitoriaPerfeita) {
                        System.out.println(" Vitória Perfeita! " + aventureiro.getNome() + " dominou as Areias do Destino!");
                    }

                    break;
                }

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        if (!menu.desejaJogarNovamente()) {
            System.out.println("Encerrando o jogo. Até a próxima!");
            System.exit(0);
        }
    }
}
