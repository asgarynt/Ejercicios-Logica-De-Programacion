import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> dictionaryAnimals = new HashMap<>();

        dictionaryAnimals.put("Rata", "Rat");
        dictionaryAnimals.put("Rana", "Frog");
        dictionaryAnimals.put("Pavo", "Turkey");
        dictionaryAnimals.put("Perro", "Dog");
        dictionaryAnimals.put("Pato", "Duck");
        dictionaryAnimals.put("Oveja", "Sheep");
        dictionaryAnimals.put("Oso", "Bear");
        dictionaryAnimals.put("Murciélago", "Bat");
        dictionaryAnimals.put("Búho", "Owl");
        dictionaryAnimals.put("Abeja", "Bee");
        dictionaryAnimals.put("Araña", "Spider");
        dictionaryAnimals.put("Ardilla", "Squirrel");
        dictionaryAnimals.put("Jaguar", "Jaguar");
        dictionaryAnimals.put("León", "Lion");
        dictionaryAnimals.put("Avispa", "Wasp");
        dictionaryAnimals.put("Gallina", "Hen");
        dictionaryAnimals.put("Serpiente", "Snake");
        dictionaryAnimals.put("Tiburón", "Shark");
        dictionaryAnimals.put("Gato", "Cat");
        dictionaryAnimals.put("Tortuga", "turtle");

        System.out.println(EnglishExercise.writeTranslate(dictionaryAnimals));

    }
}
