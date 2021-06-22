package kitchen_tool;

import ingredient.Ingredient;

public class Sink extends KitchenTool{
    public void processIngredient(Ingredient ingredient) {
        clean(ingredient);
    }

    private void clean(Ingredient ingredient) {
        if (ingredient.isClean())
            ingredient.setClean(true);

        System.out.println(ingredient.getName() + " is clean!");
    }
}
