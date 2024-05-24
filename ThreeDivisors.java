// take n, run a loop till n, and check if i is prime and then check i*i < n if yes count +=1; 
public class ThreeDivisors {
    static boolean isPrime(int i) {
        if (i <= 1) {
            return false;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i % 2 == 0 || i % 3 == 0) {
            return false;
        }
        for (int m = 5; m * m <= i; m = m + 6) {
            if (i % m == 0 || i % (m + 2) == 0)
                return false;
        }
        return true;
    }

    public int divisors(int n) {
        int count = 0;
        for (int i = 2; i<= n; i++) {
            int squareRoot = (int) Math.sqrt(i);
            if (squareRoot * squareRoot == i) {

                if (isPrime(squareRoot)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 999999;
        ThreeDivisors threeDivisors = new ThreeDivisors();
        System.out.println(threeDivisors.divisors(n));

    }
}
