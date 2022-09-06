package foodmora.person.normaluser;

import foodmora.recipe.Recipe;

import java.util.List;

public interface INormalUser {
     List<Recipe> viewRecipePool();
     Recipe generateRecipe();
}
