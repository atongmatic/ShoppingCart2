package day2exercise93;

public class Customer {

    private String firstName;
    private String ssn;

    public Customer(String name) {
        this.firstName = name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSsn() {
        return ssn;
    }
}
