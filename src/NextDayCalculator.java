public class NextDayCalculator {

    public static final String Gachcheo = "/";

    public static String getNextDay(int day, int month, int year) {
        return day+1 + Gachcheo + month + Gachcheo + year;
    }
}
