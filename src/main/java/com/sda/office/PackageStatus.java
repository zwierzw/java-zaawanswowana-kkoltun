package com.sda.office;

public enum PackageStatus {
    SENT("Wysłana"),
    TRAVELLING("Podróżuje"),
    COURIER ("W doręczeniu"),
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

    @Override
    public String toString() {
        return "PackageStatus{" +
                "description='" + description + '\'' +
                '}';
    }
}

