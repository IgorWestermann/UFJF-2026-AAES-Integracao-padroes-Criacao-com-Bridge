package org.example;

public abstract class RestauranteRegional {
    public final Refeicao prepararRefeicao() {
        FabricaIngredientesRegionais fabricaIngredientes = criarFabricaIngredientes();
        return new Refeicao(
                fabricaIngredientes.criarPratoPrincipal(),
                fabricaIngredientes.criarAcompanhamento(),
                fabricaIngredientes.criarBebida());
    }

    protected abstract FabricaIngredientesRegionais criarFabricaIngredientes();
}
