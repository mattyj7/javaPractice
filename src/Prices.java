public class Prices extends User {
    private String sessionType;
    private final int soloPrice = 125;
    private final int couplePrice = 175;
    private final int familyPrice = 250;
    private final int portraitPrice = 100;
    public Prices(User user) {
        super(user.getName(), user.getIdentifier(), user.getSessionType());
        this.sessionType = user.getSessionType();
        switch (sessionType) {
            case "Solo":
                System.out.println(soloPrice);
                break;
            case "Couple":
                System.out.println(couplePrice);
                break;
            case "Family":
                System.out.println(familyPrice);
                break;
            case "Portrait":
                System.out.println(portraitPrice);
                break;
            default:
                System.out.println("Invalid option. Please select a valid option from the menu.");
        }
    }
}
