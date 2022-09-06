package foodmora.person.dietician;

import foodmora.recipe.Ingredient;
import foodmora.recipe.Recipe;

import java.util.HashMap;
import java.util.List;

public interface IDietician {
     void createRecipe(String name, List<Ingredient> ingredients, String steps);
     void editRecipe(String name, List<Ingredient> ingredients, String steps);
     public void deleteRecipe(String name);
}
