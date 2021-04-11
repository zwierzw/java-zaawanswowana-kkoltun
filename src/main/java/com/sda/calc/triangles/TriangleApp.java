package com.sda.calc.triangles;

public class TriangleApp {
    public static void main(String[] args) {
        try {
            int x = NumberLoader.loadFromUser();
            int y = NumberLoader.loadFromUser();
            int z = NumberLoader.loadFromUser();
            int circumference1 = TriangleCalculation.calculateTriangleCircuit(x,y,z);

            System.out.println(circumference1);
        } catch (InvalidInputException e){
            System.out.println("Invalid input");
        } catch (CannotBuildTriangleException e){
            System.out.println("Invalid sides length");
        }
    }
}
