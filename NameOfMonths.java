package assingment1;

public enum NameOfMonths {
    January("It has 31 days"),
    February("Leap_Month"),
    March("It has 31 days"),
    April("It has 30 days"),
    May("It has 31 days"),
    June("It has 30 days"),
    July("It has 31 days"),
    August("It has 31 days"),
    September("It has 30 days"),
    October("It has 31 days"),
    November("It has 30 days"),
    December("It has 31 days");

    String name;
    NameOfMonths(String s) {
        this.name=s;
    }
    public static NameOfMonths[] months= values();
    NameOfMonths nextMonth()
    {
        return months[(this.ordinal()+1)% months.length];
    }

}
