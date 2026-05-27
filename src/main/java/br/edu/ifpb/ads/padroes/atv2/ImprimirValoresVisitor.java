package br.edu.ifpb.ads.padroes.atv2;

public class ImprimirValoresVisitor implements Visitor {

    @Override
    public void visit(ProdutoFisico produtoFisico) {
        System.out.println("Detalhe do Produto Físico: " + produtoFisico.getNome() + " | Valor original: R$ " + produtoFisico.getValor());
    }

    @Override
    public void visit(Servico servico) {
        System.out.println("Detalhe do Serviço: " + servico.getNome() + " | Valor original: R$ " + servico.getValor());
    }
}