package com.github.typesystem.enumtype;

import java.util.Arrays;

public class EnumTest {

    Day day;

    public EnumTest(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY -> System.out.println("Mondays are bad.");
            case FRIDAY -> System.out.println("Fridays are better.");
            case SATURDAY, SUNDAY -> System.out.println("Weekends are best.");
            default -> System.out.println("Midweek days are so-so.");
        }
    }

    public static void main(String[] args) {
        System.out.println(Day.MONDAY.name());
        for (Day d : Day.values()) {
            System.out.println(d.name());
        }
        System.out.println(Arrays.toString(Day.values()));

        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
    }
}
