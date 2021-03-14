package com.sda.office;

import java.util.UUID;

public class Package {
    private PackageStatus status;
    private String content;
    private String packageNumber;

    public Package(PackageStatus status, String content) {
        this.status = status;
        this.content = content;
        this.packageNumber = UUID.randomUUID().toString();
    }

    public void setStatus(PackageStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Package{" +
                "status=" + status +
                ", content='" + content + '\'' +
                ", packageNumber='" + packageNumber + '\'' +
                '}';
    }
}
