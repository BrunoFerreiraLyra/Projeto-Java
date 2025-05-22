package jogo;

import java.util.Scanner;
import labirinto.*;
import personagem.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleMovimento controle = new ControleMovimento();

        System.out.println("Bem-vindo ao Areias do Destino!");

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

        int inicioX = 1;
        int inicioY = 1;

        Aventureiro aventureiro = new Aventureiro(nome, inicioX, inicioY);
        labirinto.posicionarAventureiro(inicioX, inicioY);

        int turnos = 0;

        boolean venceu = false;

        while (true) {
            labirinto.imprimirLabirinto();
            ExibidorStatus.mostrarStatus(aventureiro, turnos);

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
                boolean encontrouTesouro = labirinto.verificarItem(aventureiro);

                labirinto.posicionarAventureiro(aventureiro.getPosX(), aventureiro.getPosY());

                turnos++;

                if (encontrouTesouro) {
                    venceu = true;
                    break;
                }

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        
        if (venceu) {
            labirinto.imprimirLabirinto();
            ExibidorStatus.mostrarStatus(aventureiro, turnos);

            System.out.println("Parabéns, " + aventureiro.getNome() + "! Você encontrou o tesouro!");

            boolean vitoriaPerfeita = false;
            switch (dificuldade) {
                case FACIL:
                    vitoriaPerfeita = turnos <= 22;
                    break;
                case MEDIO:
                    vitoriaPerfeita = turnos <= 28;
                    break;
                case DIFICIL:
                    vitoriaPerfeita = turnos <= 34;
                    break;
            }

            if (vitoriaPerfeita) {
                System.out.println("Vitória Perfeita! " + aventureiro.getNome() + " dominou as Areias do Destino!");
            }

            System.out.println("Total de turnos: " + turnos);
        }

        System.out.println("Obrigado por jogar!");
    }
}
