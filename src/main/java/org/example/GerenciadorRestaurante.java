package org.example;

public final class GerenciadorRestaurante {
    private static final GerenciadorRestaurante INSTANCIA = new GerenciadorRestaurante();

    private GerenciadorRestaurante() {
    }

    public static GerenciadorRestaurante obterInstancia() {
        return INSTANCIA;
    }

    public Refeicao servirRefeicao(RestauranteRegional restaurante) {
        return restaurante.prepararRefeicao();
    }
}
