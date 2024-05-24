public class GCD2 {
    static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b , a% b);
    }
    public static void main(String[] args) {
        int number1 = 98, number2 = 56;
        System.out.println(gcd(number1, number2));
    }
}
