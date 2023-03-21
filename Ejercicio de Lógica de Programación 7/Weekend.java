public class Weekend {

    public static int minutesToWeekend(int dia, int hour, int minutes) {

        final int minutesFinDeSemana = (4 * 1440) + 780;
        int totalMinutes = (hour * 60) + (dia * 1440) + minutes;

        return minutesFinDeSemana - totalMinutes;

    }
}