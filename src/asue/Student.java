package asue;

public class Student {
    private String firstName;
    private String lastName;

    public Student(String fName, String lName) {
        firstName = fName;
        lastName = lName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
