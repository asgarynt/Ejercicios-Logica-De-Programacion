import java.util.Arrays;

class Prime {

    public static void checkPrime(int[] nums) {

        int[] orderArray = new int[10];
        int conter = 0;
        int numPrime = 0;
        int numNonPrime = nums.length - 1;

        for (int num : nums) {

            for (int j = 2; j <= num; j++) {
                if (num % j == 0) {
                    conter++;
                }
            }
            if (conter == 1) {

                orderArray[numPrime] = num;
                numPrime++;
            } else {
                orderArray[numNonPrime] = num;
                numNonPrime--;
            }
            conter = 0;
        }
        System.out.println("Los números primos se han colocado al principio del array:");
        System.out.println(Arrays.toString(orderArray));
    }
}
