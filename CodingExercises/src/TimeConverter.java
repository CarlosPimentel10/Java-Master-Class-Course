public class TimeConverter {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static String getDurationString(long minutes, long seconds){
        if((minutes < 0) || (seconds < 0 || seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        }
        long calculateHour = (minutes) / 60;
        long calcMin = (minutes) % 60;

        return calculateHour + "h " + calcMin + "m " + seconds + "s";
    }
    public static String getDurationString(long seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        long calcMin = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(calcMin,remainingSeconds);
    }
}
