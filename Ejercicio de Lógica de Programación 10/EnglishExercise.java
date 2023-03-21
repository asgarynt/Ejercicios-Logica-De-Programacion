import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EnglishExercise {


    public static String writeTranslate(HashMap<String, String> listOfWords) {

        // Variables, hashmap y ArrayList que utiliza la función
        Scanner scanner = new Scanner(System.in); // Permite el input en la terminal
        int hits = 0;
        String quest;
        String answer;

        ArrayList<String> dictionaryKeys = new ArrayList<>(listOfWords.keySet());

        System.out.println("\nA continuación se te mostrarán 5 palabras en español, tendrás que escribir la traducción al inglés.");

        // Funcionamiento
        for (int i = 0; i < 5; i++) {
            quest = dictionaryKeys.get((int) (Math.random() * dictionaryKeys.size()));
            System.out.println("\n" + quest);
            answer = scanner.next();
            if (listOfWords.get(quest).equalsIgnoreCase(answer)) {
                hits += 1;
            } else {
                System.out.println("La respuesta correcta es: " + listOfWords.get(quest));
            }
        }
        return "Obtuviste " + hits + " de 5 respuestas correctas";
    }
}

