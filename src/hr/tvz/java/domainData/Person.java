package hr.tvz.java.domainData;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate datumRod;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public LocalDate getDatumRod() {
        return datumRod;
    }

    public void setDatumRod(LocalDate datumRod) {
        this.datumRod = datumRod;
    }

    public Person(String firstName, String lastName, LocalDate datumRod) {
        this(firstName, lastName);
        this.datumRod = datumRod;
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
}
