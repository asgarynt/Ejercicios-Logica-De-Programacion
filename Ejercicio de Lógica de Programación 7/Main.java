import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el día (lunes a viernes)(Sin tildes)");
        String diaSemana = input.nextLine();
        int diaCheck = checkPattern.checkDia(diaSemana);

        System.out.println("Ingresa la hora en un formato de 24 horas");
        String hour = input.nextLine();
        int hourCheck =  checkPattern.checkHours(hour);

        System.out.println("Ingresa los minutos");
        String minutes = input.nextLine();
        int minutesCheck = checkPattern.checkMinutes(minutes);

        int result = Weekend.minutesToWeekend(diaCheck, hourCheck, minutesCheck);

        System.out.println("Faltan " + result + " minutos para el fin de semana");

        input.close();
    }

}
