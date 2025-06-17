package jogo.util;

import jogo.modelo.Jogador;
import java.io.*;
import java.util.List;

/**
 * Utilitário para leitura e gravação do ranking em arquivo.
 */

public class RankingUtil {

    private static final String CAMINHO = "ranking.txt";

    public static void salvarRanking(List<Jogador> jogadores) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CAMINHO))) {
            for (Jogador jogador : jogadores) {
                writer.write(jogador.getNome() + ";" + jogador.getPontuacao());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar ranking: " + e.getMessage());
        }
    }

    public static void exibirRankingAnterior() {
        System.out.println("🎯 RANKING ANTERIOR:");
        try (BufferedReader reader = new BufferedReader(new FileReader(CAMINHO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 2) {
                    System.out.println(partes[0] + " → " + partes[1] + " pontos");
                }
            }
        } catch (IOException e) {
            System.out.println("Nenhum ranking salvo encontrado ainda.");
        }
        System.out.println();
    }
}
