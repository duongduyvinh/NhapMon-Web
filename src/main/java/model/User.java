package model;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;    private String foudation;
    private String answer1;
    private String answer2;
    private String contact;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        foudation = "";
        answer1 = "";
        answer2 = "";
        contact = "";
    }

    public User(String firstName, String lastName, String email, String foudation, String answer1, String answer2, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.foudation = foudation;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.contact = contact;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoudation() { return foudation; }
    public void setFoudation(String foudation) { this.foudation = foudation; }

    public String getAnswer1() { return answer1; }
    public void setAnswer1(String answer1) { this.answer1 = answer1; }

    public String getAnswer2() { return answer2; }
    public void setAnswer2(String answer2) { this.answer2 = answer2; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }
}