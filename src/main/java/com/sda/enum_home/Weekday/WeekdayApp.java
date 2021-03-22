package com.sda.enum_home.Weekday;

public class WeekdayApp {

    public static void main(String[] args) {
        Weekday day1 = Weekday.FRIDAY;
        System.out.println(day1.isWeekDay());
        System.out.println(day1.isHoliday());

        Weekday day2 = Weekday.WEDNESDAY;

        day2.whichIsGreater(day1);
        Weekday.SUNDAY.whichIsGreater(Weekday.MONDAY);
    }
}
