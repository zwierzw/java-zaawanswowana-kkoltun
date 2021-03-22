package com.sda.enum_home.PackageSize;

public enum PackageSize {
    SMALL(1, 10),
    MEDIUM(11, 100),
    LARGE(101, 1000),
    UNKNOWN(0, 0);

    private int minimalSize;
    private int maximalSize;

    PackageSize(int minimalSize, int maximalSize) {
        this.minimalSize = minimalSize;
        this.maximalSize = maximalSize;
    }

    public static PackageSize getPackageSize(int min, int max) {
        for (PackageSize size : PackageSize.values()) {
            if (min >= size.minimalSize && max < size.maximalSize) {
                return size;
            }
        }
        return UNKNOWN;
    }

}
