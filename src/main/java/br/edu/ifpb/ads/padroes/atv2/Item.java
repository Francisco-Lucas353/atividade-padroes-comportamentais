package br.edu.ifpb.ads.padroes.atv2;

public interface Item {
    void accept(Visitor visitor);
    double getValor();
    String getNome();
}