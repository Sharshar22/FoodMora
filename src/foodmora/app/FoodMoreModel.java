package foodmora.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FoodMoreModel {
    FoodMoraMainMenu foodMoraMainMenu = new FoodMoraMainMenu();
    Scanner scanner = new Scanner(System.in);
    String userChoice;

    public String  chooseUser () {
        foodMoraMainMenu.printProgramStart();
        try {
            do {
                userChoice = scanner.nextLine();
            } while (userChoice.equalsIgnoreCase("1") ||
                    userChoice.equalsIgnoreCase("2"));
        }catch(InputMismatchException exception){
            throw exception;
        }
        return userChoice;
    }

}
