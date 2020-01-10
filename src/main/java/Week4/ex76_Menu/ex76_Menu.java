package Week4.ex76_Menu;

public class ex76_Menu {
    public static void main(String[] args) {
        Menu newMenu = new Menu();

        newMenu.addMeal("French fries");
        newMenu.addMeal("Salmon");
        newMenu.addMeal("Mashed potatoes");
        newMenu.addMeal("Grilled chicken breast");

        newMenu.printMeals();

        newMenu.clearMenu();
        newMenu.printMeals();

        newMenu.addMeal("Marlin");
        newMenu.printMeals();
    }
}
