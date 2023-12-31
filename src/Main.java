import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("Matt", 1, "Solo");
        menu(user);

    }

    public static void menu(User user) {
        Scanner scanner = new Scanner(System.in);
        String option;

        do {
            System.out.println("Menu: ");
            System.out.println("User - Print Current User Details");
            System.out.println("Change name - Change Name of User");
            System.out.println("Change session - Change Session of User");
            System.out.println("Exit - Exit program");
            System.out.println("--------------------");

            option = scanner.nextLine();

            switch (option) {
                case "User":
                    printUserInfo(user);
                    break;
                case "Change name":
                    changeName(user);
                    break;
                case "Change session":
                    changeSession(user);
                    break;
                case "Price":
                    getPrice(user);
                    break;
                case "Exit":
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option from the menu.");
            }
        } while (!option.equals("Exit"));

        scanner.close();
    }

    public static void printUserInfo(User user) {
        System.out.println("Current User: ");
        System.out.println("User's name: " + user.getName());
        System.out.println("User's identifier: " + user.getIdentifier());
        System.out.println("User's session type: " + user.getSessionType());
        System.out.println("User's session price: " + user.getSessionType());
        System.out.println(" ");
    }

    public static void changeName(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Current name: " + user.getName());
        String newSession = scanner.nextLine();
        user.setName(newSession);
        System.out.println("User's Name: " + user.getName());
        System.out.println(" ");
    }
    public static void changeSession(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Current Session Type: " + user.getSessionType());
        String newSession = scanner.nextLine();
        user.setSessionType(newSession);
        System.out.println("User's session type: " + user.getSessionType());
        System.out.println(" ");
    }

    public static void getPrice(User user) {
        Prices price = new Prices(user);
    }
}