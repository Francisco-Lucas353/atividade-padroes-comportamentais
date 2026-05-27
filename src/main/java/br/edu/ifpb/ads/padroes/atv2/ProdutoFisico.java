package br.edu.ifpb.ads.padroes.atv2;

public class ProdutoFisico implements Item {
    private String nome;
    private double valor;

    public ProdutoFisico(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}