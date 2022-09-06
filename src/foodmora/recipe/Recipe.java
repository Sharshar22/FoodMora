package foodmora.recipe;


import java.util.*;

public class Recipe {
    private String name;
    private List<Ingredient> ingredients;
    private String steps;

    public Recipe (String name,  List<Ingredient> ingredients , String steps ){
        this.name=name;
        this.ingredients = ingredients;
        this.steps = steps;

    }

    public String getName(){
        return this.name;

    }

    public void setIngredients( List<Ingredient> ingredients){
        this.ingredients=ingredients;

    }

    public void setSteps(String steps){
        this.steps=steps;

    }
    public String toString(){
        return this.name+" "+this.ingredients+" "+this.steps;

    }
}
