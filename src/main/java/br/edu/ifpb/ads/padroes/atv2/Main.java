package br.edu.ifpb.ads.padroes.atv2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> carrinho = Arrays.asList(
                new ProdutoFisico("Notebook Ryzen 5", 3000.00),
                new Servico("Instalação do Windows", 150.00),
                new ProdutoFisico("Mouse Sem Fio", 100.00)
        );

        Visitor relatorioImpostos = new RelatorioImpostosVisitor();
        Visitor imprimirValores = new ImprimirValoresVisitor();

        System.out.println("--- IMPRIMINDO VALORES ---");
        for (Item item : carrinho) {
            item.accept(imprimirValores);
        }

        System.out.println("\n--- GERANDO RELATÓRIO DE IMPOSTOS ---");
        for (Item item : carrinho) {
            item.accept(relatorioImpostos);
        }
    }
}