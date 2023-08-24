import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User Matt = new User("Matt", 1, "solo");

        System.out.println("User's name: " + Matt.getName());
        System.out.println("User's identifier: " + Matt.getIdentifier());
        System.out.println("User's session type: " + Matt.getSessionType());

        changeSession(Matt);
    }

    public static void changeSession(User user) {
        Scanner scanner = new Scanner(System.in);
        String newSession = scanner.nextLine();
        user.setSessionType(newSession);
        System.out.println("User's session type: " + user.getSessionType());
    }
}