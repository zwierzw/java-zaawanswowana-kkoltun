package com.sda.enum_home.Weekday;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    boolean isWeekDay () {
        return this != SATURDAY && this != SUNDAY;
    }

    boolean isHoliday () {
        return this == SATURDAY || this == SUNDAY;
    }

    public void whichIsGreater (Weekday weekday) {
        if (weekday.ordinal() < this.ordinal()) {
            System.out.println(this + " jest następnikiem " + weekday);
        } else if (weekday.ordinal() > this.ordinal()) {
            System.out.println(this + " jest poprzednikiem " + weekday);
        }

    }

}
