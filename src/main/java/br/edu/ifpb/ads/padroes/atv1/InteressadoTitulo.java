package br.edu.ifpb.ads.padroes.atv1;

public class InteressadoTitulo implements Interessado {
    private String tituloDesejado;
    private CanalNotificacao canal;

    public InteressadoTitulo(String tituloDesejado, CanalNotificacao canal) {
        this.tituloDesejado = tituloDesejado;
        this.canal = canal;
    }

    @Override
    public void atualizar(Disco disco) {
        if (disco.getTitulo().toLowerCase().contains(tituloDesejado.toLowerCase())) {
            canal.enviar("Novo disco com título '" + disco.getTitulo() + "' adicionado!");
        }
    }
}