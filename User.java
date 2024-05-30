
public class User {
    // Fields to store user information
    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String dob;

    // Constructor to initialize User objects
    public User(int id, String firstName, String lastName, String username, String dob) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.dob = dob;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getDob() {
        return dob;
    }
}
