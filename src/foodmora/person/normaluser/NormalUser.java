package foodmora.person.normaluser;

import foodmora.person.Person;
import foodmora.recipe.Recipe;
import foodmora.recipe.RecipePool;

import java.util.List;
import java.util.Scanner;

public class NormalUser extends Person implements INormalUser {
    private Scanner scanner;

    @Override
    public List<Recipe> viewRecipePool() {
        return RecipePool.getInstance().getRecipies();
    }

    @Override
    public Recipe generateRecipe() {
        return RecipePool.getInstance().getRandomRecipe();
    }
}
