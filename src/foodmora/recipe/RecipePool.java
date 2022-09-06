package foodmora.recipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RecipePool extends HashMap<String, Recipe> {

    static HashMap<String, Recipe> recipies = new HashMap<>();

    public static RecipePool getInstance() {
        if (recipies == null) {
            recipies = new RecipePool();
        }
        return (RecipePool) recipies;
    }

    public void addRecipe(Recipe recipe) {
        this.recipies.put(recipe.getName(), recipe);
    }

    public List<Recipe> getRecipies() {
        return new ArrayList<Recipe>(recipies.values());
    }

    public Recipe getRandomRecipe() {
        Random random = new Random();
        int number = random.nextInt((this.getRecipies().size() - 1) - 0) + 0;
        return new ArrayList<Recipe>(recipies.values()).get(number);
    }


    public void editRecipe(String name, List<Ingredient> ingredients, String steps) {
        this.recipies.get(name).setIngredients(ingredients);
        this.recipies.get(name).setSteps(steps);
    }

    public void deleteRecipeByName (HashMap<String,Recipe> list,String name){
        for (String nameOfRecipe: list.keySet() ) {
            if(nameOfRecipe == name )
                list.remove(nameOfRecipe);
        }

    }
}