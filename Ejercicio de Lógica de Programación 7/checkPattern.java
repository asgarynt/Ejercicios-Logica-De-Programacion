import java.util.Scanner;

public class checkPattern {
    static Scanner sc = new Scanner(System.in);

    public static int checkDia(String dia) {
        boolean diaCheck = dia.matches(new Regex().diaPattern);
        while (!(diaCheck)) {
            System.out.println("El formato de día no es el correcto. Ingresa el día (lunes a viernes)(Sin tildes)");
            dia = sc.next();
            diaCheck = dia.matches(new Regex().diaPattern);
        }

        switch (dia) {
            case "lunes" -> {
                return 0;
            }
            case "martes" -> {
                return 1;
            }
            case "miercoles" -> {
                return 2;
            }
            case "jueves" -> {
                return 3;
            }
            case "viernes" -> {
                return 4;
            }
        }

        return 5;
    }

    public static int checkHours(String hour) {

        boolean hourCheck = hour.matches(new Regex().hourPattern);

        while (!(hourCheck)) {
            System.out.println("El formato de hora no es el correcto. Ingresa la hora en un formato de 24 horas.");
            hour = sc.next();
            hourCheck = hour.matches(new Regex().hourPattern);

        }
        return Integer.parseInt(hour);
    }

    public static int checkMinutes(String minutes) {

        boolean minutesCheck = minutes.matches(new Regex().minutesPattern);

        while (!(minutesCheck)) {
            System.out.println("El formato de hora no es el correcto. Ingresa la hora en un formato de 24 horas.");
            minutes = sc.next();
            minutesCheck = minutes.matches(new Regex().hourPattern);

        }
        return Integer.parseInt(minutes);
    }

}
