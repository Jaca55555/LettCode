package org.example.student;

public class Student {
    private String firstName;
    private String lastName;
    private String login;
    private String password;

    public Student(String firstName, String lastName, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
