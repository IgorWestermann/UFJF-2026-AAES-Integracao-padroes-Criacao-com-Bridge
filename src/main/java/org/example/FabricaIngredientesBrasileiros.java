package org.example;

public final class FabricaIngredientesBrasileiros implements FabricaIngredientesRegionais {
    @Override
    public PratoPrincipal criarPratoPrincipal() {
        return new Feijoada();
    }

    @Override
    public Acompanhamento criarAcompanhamento() {
        return new Farofa();
    }

    @Override
    public Bebida criarBebida() {
        return new Guarana();
    }
}
