package com.sda.office;

public enum PackageStatus {
    SENT("Wysłana"),
    TRAVELLING("Podróżuje"),
    COURIER("W doręczeniu"),
    DELIVERED("Dostarczona"),
    LOST("Zagubiona"),
    RETURNED("Zwrócona"),
    ;

    private String description;

    PackageStatus(String d) {
        this.description = d;
    }

    public String getDescription() {
        return description;
    }

    //statyczna metoda w klasie enum
    public static PackageStatus[] getErrorStatuses() {
        return new PackageStatus[]{LOST, RETURNED};
    }

    // niestatyczna metoda w klasie enum
    public boolean isError() {
        if (this == LOST || this == RETURNED) {
            return true;
        } else {
            return false;
        }
        //return this == LOST || this == RETURNED; --> najprostsza wersja
    }


    @Override
    public String toString() {
        return "PackageStatus{" +
                "description='" + description + '\'' +
                '}';
    }
}

