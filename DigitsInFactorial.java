
class DigitsInFactorial{
    public int digitsInFactorial(int N){
        if (N < 0){
            return 0;
        }
        if (N == 0 || N ==1){
            return 1;
        }
        // int result = 1;
        double result = 0; // Use double to handle large numbers

        for (int i = 2; i <= N; i++) {
            result += Math.log10(i);
        }
        return (int) (Math.floor(result) + 1);
    }
    public static void main(String[] args) {
        int N = 120;
        DigitsInFactorial digitsInFactorial = new DigitsInFactorial();
        int result = digitsInFactorial.digitsInFactorial(N);
        System.out.println(result);
    }
}