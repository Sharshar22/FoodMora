package foodmora.person.dietician;

import foodmora.person.Person;
import foodmora.recipe.Ingredient;
import foodmora.recipe.Recipe;
import foodmora.recipe.RecipePool;

import java.util.List;

public class Dietician extends Person implements IDietician {
    @Override
    public void createRecipe(String name, List<Ingredient> ingredients, String steps) {
        Recipe recipe=new Recipe(name, ingredients, steps);
        RecipePool.getInstance().addRecipe(recipe);
    }

    @Override
    public void editRecipe(String name, List<Ingredient> ingredients, String steps) {
        RecipePool.getInstance().editRecipe(name,ingredients,steps);
    }

    @Override
    public void deleteRecipe(String name) {
        RecipePool.getInstance().deleteRecipeByName(RecipePool.getInstance(),name);
    }


    public  void printDieticianMenu (){
        System.out.println("Please choose one of the following operations \n" +
                "[1] Create recipe\n" +
                "[2] Edit recipe\n" +
                "[3] view recipe");
    }
}