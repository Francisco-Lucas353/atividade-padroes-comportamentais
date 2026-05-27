package br.edu.ifpb.ads.padroes.atv1;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe responsável por gerenciar o repositório de discos.
 * Ela permite buscar discos por título, artista, gênero e ano de lançamento.
 * Além disso, permite adicionar e remover discos do repositório.
 */
public class RepositorioDiscos {

    private List<Disco> discos = new LinkedList<>();
    // Lista de observadores
    private List<Interessado> interessados = new LinkedList<>();

    // Métodos de gerenciamento de Observers (Interessados)
    public void inscrever(Interessado interessado) {
        interessados.add(interessado);
    }

    public void desinscrever(Interessado interessado) {
        interessados.remove(interessado);
    }

    public void addDisco(Disco disco) {
        discos.add(disco);
        notificar(disco);
    }

    private void notificar(Disco disco) {
        for (Interessado interessado : interessados) {
            interessado.atualizar(disco);
        }
    }

    public void removeDisco(Disco disco) {
        discos.remove(disco);
    }

    public List<Disco> buscarDiscos(String titulo) {
        return discos.stream().filter(d -> d.getTitulo().toLowerCase()
                .contains(titulo.toLowerCase())).toList();
    }

    public List<Disco> buscarDiscosPorArtista(String artista) {
        return discos.stream().filter(d -> d.getArtista().toLowerCase()
                .contains(artista.toLowerCase())).toList();
    }

    public List<Disco> buscarDiscosPorGenero(String genero) {
        return discos.stream().filter(d -> d.getGenero().toLowerCase()
                .contains(genero.toLowerCase())).toList();
    }

    public List<Disco> buscarDiscosPorAno(int ano) {
        return discos.stream().filter(d -> d.getAnoLancamento() == ano).toList();
    }
}