package com.sda.calc.triangles;

import java.util.Arrays;

public class TriangleCalculation {
    private int x;
    private int y;
    private int z;

    public static int calculateTriangleCircuit(int x, int y, int z) throws CannotBuildTriangleException {
        int[] sides = new int[3];
        sides[0] = x;
        sides[1] = y;
        sides[2] = z;
        Arrays.sort(sides);

        if (sides[2] >= sides[1] + sides[0]) {
            throw new CannotBuildTriangleException();
        }
        return x + y + z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}