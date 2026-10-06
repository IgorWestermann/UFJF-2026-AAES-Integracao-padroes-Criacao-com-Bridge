package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertSame;

class GerenciadorRestauranteTest {
    @Test
    void obterInstanciaDeveSempreRetornarMesmoGerenciador() {
        GerenciadorRestaurante primeiraReferencia = GerenciadorRestaurante.obterInstancia();
        GerenciadorRestaurante segundaReferencia = GerenciadorRestaurante.obterInstancia();

        assertSame(primeiraReferencia, segundaReferencia);
    }

    @Test
    void gerenciadorSingletonDeveColaborarComDiferentesRestaurantes() {
        GerenciadorRestaurante gerenciador = GerenciadorRestaurante.obterInstancia();

        Refeicao refeicaoBrasileira = gerenciador.servirRefeicao(new RestauranteBrasileiro());
        Refeicao refeicaoMexicana = gerenciador.servirRefeicao(new RestauranteMexicano());

        assertAll(
                () -> assertInstanceOf(Feijoada.class, refeicaoBrasileira.pratoPrincipal()),
                () -> assertInstanceOf(Farofa.class, refeicaoBrasileira.acompanhamento()),
                () -> assertInstanceOf(Guarana.class, refeicaoBrasileira.bebida()),
                () -> assertInstanceOf(Tacos.class, refeicaoMexicana.pratoPrincipal()),
                () -> assertInstanceOf(Guacamole.class, refeicaoMexicana.acompanhamento()),
                () -> assertInstanceOf(Tequila.class, refeicaoMexicana.bebida()));
    }
}
