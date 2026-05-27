package br.edu.ifpb.ads.padroes.atv1;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO O SISTEMA DE DISCOS ---\n");

        RepositorioDiscos repositorio = new RepositorioDiscos();

        CanalNotificacao email = new EmailNotificacao();
        CanalNotificacao sms = new SmsNotificacao();
        CanalNotificacao push = new PushNotificacao();

        Interessado fãDeRock = new InteressadoGenero("Rock", email);
        Interessado fãDePinkFloyd = new InteressadoArtista("Pink Floyd", sms);
        Interessado caçadorDeReliquias = new InteressadoTitulo("Thriller", push);

        repositorio.inscrever(fãDeRock);
        repositorio.inscrever(fãDePinkFloyd);
        repositorio.inscrever(caçadorDeReliquias);

        System.out.println("Adicionando: The Dark Side of the Moon (Pink Floyd - Rock)");

        repositorio.addDisco(new Disco("Pink Floyd", "The Dark Side of the Moon", "Rock", 1973));

        System.out.println("\n--------------------------------------------------\n");

        System.out.println("Adicionando: Thriller (Michael Jackson - Pop)");

        repositorio.addDisco(new Disco("Michael Jackson", "Thriller", "Pop", 1982));

        System.out.println("\n--------------------------------------------------\n");

        System.out.println("Adicionando: Led Zeppelin IV (Led Zeppelin - Rock)");

        repositorio.addDisco(new Disco("Led Zeppelin", "Led Zeppelin IV", "Rock", 1971));
    }
}