package foodmora.app;

import foodmora.person.dietician.Dietician;
import foodmora.person.normaluser.NormalUser;

import java.util.InputMismatchException;
import java.util.Scanner;

public class  FoodMoreModel {
   // FoodMoraMainMenu foodMoraMainMenu = new FoodMoraMainMenu();



    public static String choiceInput() {
        Scanner scanner = new Scanner(System.in);
        String userChoice;
        try {
            do {
                FoodMoraMainMenu.printProgramStart();
                userChoice = scanner.nextLine();
            } while (userChoice.equalsIgnoreCase("User") ||
                    userChoice.equalsIgnoreCase("Dietician"));
            selectionOfUser(userChoice);
        }catch(InputMismatchException exception){
            throw exception;
        }
        return userChoice;
    }


    public static void selectionOfUser (String c) {
        NormalUser normalUser = new NormalUser();
        Dietician dietician = new Dietician();
        switch (c){
            case "user":
                normalUser.choiceOfNormalUserMenu();
                break;
            case "dietician":
                dietician.choiceOfDieticianMenu();
                break;
            default:
                System.out.println("Enter valid choice");
        }

    }
}