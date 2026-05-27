package br.edu.ifpb.ads.padroes.atv1;

public class InteressadoGenero implements Interessado {
    private String generoDesejado;
    private CanalNotificacao canal;

    public InteressadoGenero(String generoDesejado, CanalNotificacao canal) {
        this.generoDesejado = generoDesejado;
        this.canal = canal;
    }

    @Override
    public void atualizar(Disco disco) {
        if (disco.getGenero().toLowerCase().contains(generoDesejado.toLowerCase())) {
            canal.enviar("Novo disco do gênero '" + disco.getGenero() + "' adicionado!");
        }
    }
}