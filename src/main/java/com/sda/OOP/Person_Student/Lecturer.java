package com.sda.OOP.Person_Student;

import java.math.BigDecimal;

public class Lecturer extends Person{
    private String specialisation;
    private float salary;

    public Lecturer(String name, String address, String specialisation, float salary) {
        super(name, address);
        this.specialisation = specialisation;
        this.salary = salary;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name="+ getName() + '\'' +
                ", address=" + getAddress() +'\'' +
                ", specialisation='" + specialisation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
