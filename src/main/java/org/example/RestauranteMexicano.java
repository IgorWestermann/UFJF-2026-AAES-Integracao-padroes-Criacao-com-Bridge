package org.example;

public final class RestauranteMexicano extends RestauranteRegional {
    @Override
    protected FabricaIngredientesRegionais criarFabricaIngredientes() {
        return new FabricaIngredientesMexicanos();
    }
}
