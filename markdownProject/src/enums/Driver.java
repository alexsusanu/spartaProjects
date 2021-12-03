package enums;

public class Driver {
    public static void main(String[] args) {
        System.out.println(EWeekDays.Monday);
        System.out.println(EWeekDays.valueOf("Monday"));
        for(EWeekDays e : EWeekDays.values()){
            System.out.println(e.getDayNumber());
        }
    }
}
