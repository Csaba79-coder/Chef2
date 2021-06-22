package ingredient.vegetables;

import ingredient.Ingredient;

public class Paprika extends Ingredient {
    public Paprika(int quantity) {
        this.name = "Paprika";
        this.quantity = quantity;
        this.peppery = quantity * (-2);
    }
}
