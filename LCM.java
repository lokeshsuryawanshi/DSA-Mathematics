public class LCM {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int number1 = 4, number2 = 6;
        System.out.println(lcm(number1, number2));
    }
}
