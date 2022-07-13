public class NextDayCalculator {

    public static final String Gachcheo = "/";

    public static String getNextDay(int day, int month, int year) {
        if (day == 31) {
            day = 0;
            month += 1;
        }
        return day+1 + Gachcheo + month + Gachcheo + year;
    }
}
