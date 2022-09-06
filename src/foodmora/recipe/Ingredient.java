package foodmora.recipe;



public class Ingredient {
   private String ingredient;
   private TypeOfMeasure measure;
   private String amount;
   public Ingredient(String ingredient, TypeOfMeasure typeOfMeasure, String amount){
       this.amount=amount;
       this.ingredient=ingredient;
       this.measure=typeOfMeasure;
   }

   public String toString(){
       return this.ingredient+" "+this.measure+" "+this.amount;

   }
}
