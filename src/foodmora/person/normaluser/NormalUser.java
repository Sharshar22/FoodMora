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

    public void choiceOfNormalUserMenu(){
        System.out.println("User type selected: user \n" +
                "Please choose one of the following operations:\n" +
                "[1] List my weeks\n" +
                "[2] List recipes \n" +
                "[3] View recipe\n" +
                "[4] Generate a new week");
    }
}
