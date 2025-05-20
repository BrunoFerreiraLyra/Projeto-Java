package labirinto;

import item.*;
import java.util.ArrayList;
import java.util.Random;
import perigo.*;
import personagem.Aventureiro;

public class Labirinto {
    private char[][] mapa;
    private int linhas;
    private int colunas;
    private Random random = new Random();

    private ArrayList<Item> itens;
    private ArrayList<Perigo> perigos;

    private final char PAREDE = '#';
    private final char CAMINHO = ' ';
    private final char CACTO = '*';
    private final char AGUA = 'Á';
    private final char TESOURO = 'T';
    private final char AVENTUREIRO = 'O';

    public Labirinto(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.mapa = new char[linhas][colunas];
        this.itens = new ArrayList<>();
        this.perigos = new ArrayList<>();
        gerarLabirinto();
    }

    private void gerarLabirinto() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == 0 || i == linhas - 1 || j == 0 || j == colunas - 1) {
                    mapa[i][j] = PAREDE;
                } else {
                    mapa[i][j] = CAMINHO;
                }
            }
        }

        // Adiciona cactos aleatórios
        int qtdCactos = linhas * colunas / 10;
        for (int i = 0; i < qtdCactos; i++) {
            int x, y;
            do {
                x = randomCoord(linhas);
                y = randomCoord(colunas);
            } while (mapa[x][y] != CAMINHO);

            perigos.add(new Cacto(x, y));
            mapa[x][y] = CACTO;
        }

        // Calcula distância mínima entre aventureiro e tesouro
        int distanciaMinima = linhas + colunas - 4;
        int qtdAgua = Math.max(5, distanciaMinima / 5); // ajuste proporcional

        // Gera águas
        for (int i = 0; i < qtdAgua; i++) {
            int x, y;
            do {
                x = randomCoord(linhas);
                y = randomCoord(colunas);
            } while (mapa[x][y] != CAMINHO);

            itens.add(new Agua(x, y));
            mapa[x][y] = AGUA;
        }

        // Tesouro fixo no canto inferior direito
        int tx = linhas - 2;
        int ty = colunas - 2;
        itens.add(new Tesouro(tx, ty));
        mapa[tx][ty] = TESOURO;
    }

    private int randomCoord(int limite) {
        return random.nextInt(limite - 2) + 1;
    }

    public void posicionarAventureiro(int x, int y) {
        mapa[x][y] = AVENTUREIRO;
    }

    public void limparCelula(int x, int y) {
        mapa[x][y] = CAMINHO;
    }

    public char getElemento(int x, int y) {
        return mapa[x][y];
    }

    public void atualizarPosicaoAventureiro(int xAntigo, int yAntigo, int xNovo, int yNovo) {
        limparCelula(xAntigo, yAntigo);
        posicionarAventureiro(xNovo, yNovo);
    }

    public void imprimirLabirinto() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(mapa[i][j]);
            }
            System.out.println();
        }
    }

    public void verificarItem(Aventureiro aventureiro) {
        Item encontrado = null;
        for (Item item : itens) {
            if (item.getX() == aventureiro.getPosX() && item.getY() == aventureiro.getPosY()) {
                item.aplicarEfeito(aventureiro);
                encontrado = item;
                break;
            }
        }
        if (encontrado != null) {
            itens.remove(encontrado);
            limparCelula(encontrado.getX(), encontrado.getY());
        }
    }

    public void verificarPerigo(Aventureiro aventureiro) {
        Perigo encontrado = null;
        for (Perigo perigo : perigos) {
            if (perigo.getX() == aventureiro.getPosX() && perigo.getY() == aventureiro.getPosY()) {
                perigo.aplicarEfeito(aventureiro);
                encontrado = perigo;
                break;
            }
        }
        if (encontrado != null) {
            perigos.remove(encontrado);
            limparCelula(encontrado.getX(), encontrado.getY());
        }
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }
}
