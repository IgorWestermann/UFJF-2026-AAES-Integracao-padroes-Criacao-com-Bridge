package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class FabricaIngredientesRegionaisTest {
    @Test
    void fabricaBrasileiraDeveCriarFamiliaCompativelDeProdutosBrasileiros() {
        FabricaIngredientesRegionais fabrica = new FabricaIngredientesBrasileiros();

        assertInstanceOf(Feijoada.class, fabrica.criarPratoPrincipal());
        assertInstanceOf(Farofa.class, fabrica.criarAcompanhamento());
        assertInstanceOf(Guarana.class, fabrica.criarBebida());
    }

    @Test
    void fabricaMexicanaDeveCriarFamiliaCompativelDeProdutosMexicanos() {
        FabricaIngredientesRegionais fabrica = new FabricaIngredientesMexicanos();

        assertInstanceOf(Tacos.class, fabrica.criarPratoPrincipal());
        assertInstanceOf(Guacamole.class, fabrica.criarAcompanhamento());
        assertInstanceOf(Tequila.class, fabrica.criarBebida());
    }
}
