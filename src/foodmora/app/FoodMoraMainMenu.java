package foodmora.app;


public class FoodMoraMainMenu {

    FoodMoreModel foodMoreModel = new FoodMoreModel();

    public static void printProgramStart () {
        String bannerPrint = "    Welcome to the Foodmora !!      " +
                "Please choose an user type: \n" +
                "[1] User \n" +
                "[2] Dietician";
        System.out.println(bannerPrint);
    }
}



