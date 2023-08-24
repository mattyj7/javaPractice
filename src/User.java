public class User {
    private String name;
    private int identifier;
    private String sessionType;

    public User(String name, int identifier, String sessionType) {
        this.name = name;
        this.identifier = identifier;
        this.sessionType = sessionType;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public String getSessionType() {
        return sessionType;
    }

    public void setNameType(String name) {
        this.name = name;
    }

    public void setSessionType(String sessionType) {
        switch (sessionType) {
            case "Solo", "Couple", "Family", "Portrait" -> this.sessionType = sessionType;
            default -> System.out.println("Invalid session type provided.");
        }
    }
}