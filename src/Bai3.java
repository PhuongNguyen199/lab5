import java.util.Random;

public class Bai3 {
    public int RandomNumber() {
        Random random = new Random();
        int n = random.nextInt(100);
        System.out.println("So ngau nhien: " + n);
        return n;
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
