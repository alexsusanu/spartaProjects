package enums;

public enum EWeekDays {
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7);

    private int dayNumber;
    public int getDayNumber() {
        return dayNumber;
    }

    EWeekDays(int dayNumber){
        this.dayNumber = dayNumber;
    }
}
