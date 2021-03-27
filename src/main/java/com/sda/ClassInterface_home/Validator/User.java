package com.sda.ClassInterface_home.Validator;

public class User implements Validator {
    private String name;
    private String surname;
    private int age;
    private String login;
    private String password;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name, Validator validator) {
        if (validator.validate(name)) {
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname, Validator validator) {
        if (validator.validate(surname)) {
            this.surname = surname;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age, Validator validator) {
        if (validator.validate(age)) {
            this.age = age;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login, Validator validator) {
        if (validator.validate(login)) {
            this.login = login;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, Validator validator) {
        if (validator.validate(password)) {
            this.password = password;
        }
    }

    @Override
    public <T> boolean validate(T input) {
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
