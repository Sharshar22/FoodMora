package foodmora.person;
import foodmora.app.*;
import java.util.Scanner;


public abstract class Person {
    private String name;
    Scanner scanner = new Scanner(System.in);
    FoodMoraMainMenu foodMoraMainMenu = new FoodMoraMainMenu();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printForChosenUser () {
        System.out.println("Please choose an user type: ");
        System.out.println("[1] User\n" +
                "[2] Dietician");
    }
    public void viewRecipe(){

    };
}