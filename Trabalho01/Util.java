package Trabalho01;

public class Util {
    public static String convertLongToTime(long time) {
        long milliseconds = time / 1000000;
        long seconds = (time / 1000000000) % 60;
        long minutes = (time / 60000000000L) % 60;

        return String.format("%02d:%02d.%03d", minutes, seconds, milliseconds);
    }
}
