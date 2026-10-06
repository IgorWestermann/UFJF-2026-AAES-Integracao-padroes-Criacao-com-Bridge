package org.example;

public final class RestauranteBrasileiro extends RestauranteRegional {
    @Override
    protected FabricaIngredientesRegionais criarFabricaIngredientes() {
        return new FabricaIngredientesBrasileiros();
    }
}
