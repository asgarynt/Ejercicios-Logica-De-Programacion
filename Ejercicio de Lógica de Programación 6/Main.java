import java.util.Scanner;

public class Main {

    public static void stringReverse(String string){
        String reverse = "";
        for(int i = 0; i < string.length(); i++){
            reverse += string.charAt(string.length()-i-1);
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa la palabra a revertir");
        String wordOrPhrase = sc.nextLine();
        stringReverse(wordOrPhrase);
        sc.close();
    }
}
