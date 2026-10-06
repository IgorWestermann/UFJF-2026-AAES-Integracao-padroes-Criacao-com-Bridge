package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class RestauranteRegionalTest {
    @Test
    void restauranteBrasileiroDevePrepararRefeicaoUsandoSeuFactoryMethod() {
        Refeicao refeicao = new RestauranteBrasileiro().prepararRefeicao();

        assertAll(
                () -> assertInstanceOf(Feijoada.class, refeicao.pratoPrincipal()),
                () -> assertInstanceOf(Farofa.class, refeicao.acompanhamento()),
                () -> assertInstanceOf(Guarana.class, refeicao.bebida()));
    }

    @Test
    void restauranteMexicanoDevePrepararRefeicaoUsandoSeuFactoryMethod() {
        Refeicao refeicao = new RestauranteMexicano().prepararRefeicao();

        assertAll(
                () -> assertInstanceOf(Tacos.class, refeicao.pratoPrincipal()),
                () -> assertInstanceOf(Guacamole.class, refeicao.acompanhamento()),
                () -> assertInstanceOf(Tequila.class, refeicao.bebida()));
    }

    @Test
    void trocarRestauranteDeveTrocarTodaFamiliaDeProdutos() {
        RestauranteRegional restaurante = new RestauranteBrasileiro();
        Refeicao refeicaoBrasileira = restaurante.prepararRefeicao();

        restaurante = new RestauranteMexicano();
        Refeicao refeicaoMexicana = restaurante.prepararRefeicao();

        assertAll(
                () -> assertInstanceOf(Feijoada.class, refeicaoBrasileira.pratoPrincipal()),
                () -> assertInstanceOf(Tacos.class, refeicaoMexicana.pratoPrincipal()),
                () -> assertInstanceOf(Guacamole.class, refeicaoMexicana.acompanhamento()),
                () -> assertInstanceOf(Tequila.class, refeicaoMexicana.bebida()));
    }
}
