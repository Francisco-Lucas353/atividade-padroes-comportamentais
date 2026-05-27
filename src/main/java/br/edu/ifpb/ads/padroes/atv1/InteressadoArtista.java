package br.edu.ifpb.ads.padroes.atv1;

public class InteressadoArtista implements Interessado {
    private String artistaDesejado;
    private CanalNotificacao canal;

    public InteressadoArtista(String artistaDesejado, CanalNotificacao canal) {
        this.artistaDesejado = artistaDesejado;
        this.canal = canal;
    }

    @Override
    public void atualizar(Disco disco) {
        if (disco.getArtista().toLowerCase().contains(artistaDesejado.toLowerCase())) {
            canal.enviar("Novo disco do artista '" + disco.getArtista() + "' adicionado!");
        }
    }
}