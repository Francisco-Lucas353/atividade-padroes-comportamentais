package br.edu.ifpb.ads.padroes.atv2;

public class RelatorioImpostosVisitor implements Visitor {

    @Override
    public void visit(ProdutoFisico produtoFisico) {
        // Regra: 10% de imposto sobre o valor
        double imposto = produtoFisico.getValor() * 0.10;
        System.out.println("Relatório de Imposto - Produto Físico (" + produtoFisico.getNome() + "): R$ " + imposto);
    }

    @Override
    public void visit(Servico servico) {
        // Regra: 15% de imposto sobre o valor
        double imposto = servico.getValor() * 0.15;
        System.out.println("Relatório de Imposto - Serviço (" + servico.getNome() + "): R$ " + imposto);
    }
}