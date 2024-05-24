public class AllDivisiors {
    public void divisors(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                
            }
        }
        for (int i = (int)Math.sqrt(n); i*i >= 1; i--){
            if (n % i == 0) {
                System.out.println(n/i);
            }
        }  
    }
    public static void main(String[] args) {
        int n = 20;
        AllDivisiors allDivisiors = new AllDivisiors();
        allDivisiors.divisors(n);
    }
}
