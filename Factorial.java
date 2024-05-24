public class Factorial {
    static int fact(int n){
        int i;
        int f = 1;
        for (i = 1; i<=n; i++){
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        int n = 5;
        // Factorial factorial = new Factorial();
        // System.out.println(factorial.fact(n));
        System.out.println(fact(n));
    }
}
