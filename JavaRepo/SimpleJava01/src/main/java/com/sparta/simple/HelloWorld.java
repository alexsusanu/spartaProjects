package com.sparta.simple;

public class HelloWorld {
    public static final int JANUARY = 0;
    public enum Months {January(1), February(2), March(3), April(4),
                        May(5), June(6), July(7), August(8),
                        September(9), October(10),
                        November(11), December(12);

        private int monthIndex;
        Months(int monthIndex){
            this.monthIndex = monthIndex;
        }
        public int getMonthIndex(){
            return monthIndex;
        }

    };

    public static void main(String[] args) {
        System.out.println(Months.August);
//        System.out.println(monthName(Months.valueOf("August").ordinal()));
    }

    private static String monthName(Months i) {
        switch(i){
            case January: return "January";
            case February: return "February";
            case March: return "March";
            case April: return "April";
            case May: return "May";
            case June: return "June";
            case July: return "July";
            case August: return "August";
            case September: return "September";
            case October: return "October";
            case November: return "November";
            case December: return "December";
            default: return "Invalid month index";
        }
    }
}
