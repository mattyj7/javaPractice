public class Main {
    public static void main(String[] args) {
        User user = new User("Matt", 1, "solo");

        System.out.println("User's name: " + user.getName());
        System.out.println("User's identifier: " + user.getIdentifier());
        System.out.println("User's session type: " + user.getSessionType());
    }

//    public addUser() {
//        // add User here
//    }
}