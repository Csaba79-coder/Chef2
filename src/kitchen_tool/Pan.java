package kitchen_tool;

import ingredient.Ingredient;

public class Pan {
    public void processIngredient(Ingredient ingredient) {
        cook(ingredient);
    }

    private void cook(Ingredient ingredient) {
        ingredient.setState(Ingredient.STATE_COOKED);

        System.out.println(ingredient.getName() + " is cooked!");
    }
}