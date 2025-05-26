package jogo;

import java.util.Scanner;

public class Menu {

    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public int exibirMenuInicial() {
        System.out.println("\n==== MENU PRINCIPAL ====");
        System.out.println("1 - Jogar");
        System.out.println("2 - Ver Ranking");
        System.out.println("0 - Encerrar");
        System.out.print("Escolha uma opção: ");

        while (true) {
            String entrada = scanner.nextLine();
            switch (entrada) {
                case "1": return 1;
                case "2": return 2;
                case "0": return 0;
                default:
                    System.out.print("Opção inválida. Digite 1, 2 ou 0: ");
            }
        }
    }

    public boolean desejaJogarNovamente() {
        System.out.print("\nVoltar ao Menu? (S/N): ");
        while (true) {
            String entrada = scanner.nextLine().trim().toUpperCase();
            if (entrada.equals("S")) return true;
            if (entrada.equals("N")) return false;
            System.out.print("Digite apenas S ou N: ");
        }
    }
}
