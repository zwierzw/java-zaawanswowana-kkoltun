package com.sda.enum_home.postOffice;

public enum PackageStatus {
    SENT("Wysłana", 1),
    TRAVELLING("Podróżuje", 2),
    COURIER("U kuriera", 3),
    DELIVERED("Dostarczona", 4),
    LOST("Zgubiona", 5),
    RETURNED("Zwrócona", 6);

    private String description;
    private int statusCode;

    PackageStatus(String description, int statusCode) {
        this.description = description;
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return description;
    }


    public int getStatusCode() {
        return statusCode;
    }


}
