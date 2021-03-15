package com.sda.vehicles;

public class ConvertibleCar extends Car {
    private boolean isTheRoofOpen = true;

    public void openRoof(boolean isTheRoofOpen) {
        if (isTheRoofOpen == true) {
            System.out.println("The roof is open!");
        } else {
            isTheRoofOpen = false;
        }
    }

    public void closeRoof(boolean isTheRoofOpen) {
        if (isTheRoofOpen == false) {
            System.out.println("The roof is closed!");
        } else {
            isTheRoofOpen = true;
        }
    }
}
