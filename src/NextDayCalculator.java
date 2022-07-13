public class NextDayCalculator {

    public static final String Gachcheo = "/";

    public static String getNextDay(int day, int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if(day == 31) {
                    return 1 + Gachcheo + (month+1) + Gachcheo + year;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    return 1 + Gachcheo + (month+1) + Gachcheo + year;
                }
                break;
            case 2:
                if (day == 28) {
                    return 1 + Gachcheo + (month+1) + Gachcheo + year;
                }
            default:
                return 1 + Gachcheo + (month+1) + Gachcheo + year;
        }
        return (day + 1) + Gachcheo + month + Gachcheo + year;
    }
}
