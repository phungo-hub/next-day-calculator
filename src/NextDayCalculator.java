public class NextDayCalculator {
    public static String addDay(int day, int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30){
                    return setDayTo1(day, month, year);
                } else {
                    return add1ToDay(day, month, year);
                }

            case 2:
                if (isLeapYear(year) && day == 29) {
                    return setDayTo1(day, month, year);
                }

                else if(!isLeapYear(year) && day == 28){
                    return setDayTo1(day, month, year);
                }
                else {
                    return add1ToDay(day, month, year);
                }
            case 12:
                if (day == 31)
                    return add1ToYear(day, month, year);
            default:
                if (day == 31) {
                    return setDayTo1(day, month, year);
                } else {
                    return add1ToDay(day, month, year);
                }
        }

//        throw new UnsupportedOperationException();
    }

    private static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeapYear = true;
            } else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }

    private static String setDayTo1(int day, int month, int year){
        day = 1;
        month += 1;
        return "Day: " +
                day +
                " Month: " +
                month +
                " Year: " +
                year;
    }

    private static String add1ToDay(int day, int month, int year){
        day += 1;
        return "Day: " +
                day +
                " Month: " +
                month +
                " Year: " +
                year;
    }
    private static String add1ToYear(int day, int month, int year){
        day = 1;
        month = 1;
        year += 1;
        return "Day: " +
                day +
                " Month: " +
                month +
                " Year: " +
                year;
    }
}
