
import java.util.*;

    public class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int[] nums = new int[10];

            System.out.println("Ingrese 10 números:");

            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }

            Prime.checkPrime(nums);

            sc.close();
        }
    }