package br.edu.ifpb.ads.padroes.atv2;

public interface Visitor {
    void visit(ProdutoFisico produtoFisico);
    void visit(Servico servico);
}