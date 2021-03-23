package com.sda.enum_home.postOffice;

import java.util.UUID;

public class Package {
    private String content;
    private String id;
    private PackageStatus ps;

    public Package(String content) {
        this.content = content;
        this.id = UUID.randomUUID().toString();
        this.ps = PackageStatus.SENT;
    }

    public PackageStatus changeStatus(PackageStatus ps){
        this.ps = ps;
        return ps;
    }

    public PackageStatus getPs() {
        return ps;
    }

    @Override
    public String
    toString() {
        return "Package{" +
                "content='" + content + '\'' +
                ", id='" + id + '\'' +
                ", ps=" + ps.getDescription() +
                '}';
    }
}
