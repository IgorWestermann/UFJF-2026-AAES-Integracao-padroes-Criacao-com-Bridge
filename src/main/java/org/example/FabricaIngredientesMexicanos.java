package org.example;

public final class FabricaIngredientesMexicanos implements FabricaIngredientesRegionais {
    @Override
    public PratoPrincipal criarPratoPrincipal() {
        return new Tacos();
    }

    @Override
    public Acompanhamento criarAcompanhamento() {
        return new Guacamole();
    }

    @Override
    public Bebida criarBebida() {
        return new Tequila();
    }
}
