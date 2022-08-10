import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;
    private String companyName;

    public User(String firstName,String lastName,String companyName) {
        this.firstName = firstName;
        this.lastName=lastName;
        this.companyName=companyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(companyName, user.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, companyName);
    }
}