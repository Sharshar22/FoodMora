package foodmora.recipe;

import java.util.Scanner;

enum DayOfWeek {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY

}
public class RecipeWeek {
    Scanner scanner = new Scanner(System.in);
    private String chosenDay;
    DayOfWeek dayOfWeek = DayOfWeek.valueOf(scanner.nextLine());
}
