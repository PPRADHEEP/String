package Enumration;

import java.util.EnumSet;

public class TestEnumSet {
    public enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {
        EnumSet<Day> w = EnumSet.of(Day.SUNDAY, Day.SATURDAY);

        for(Day d:w){
            System.out.println(d);
        }
    }
}
