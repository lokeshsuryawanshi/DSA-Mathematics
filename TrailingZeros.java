public class TrailingZeros {
    public int Factorial(int x){
        int fact = 1;
        for(int i = 2; i<=x; i++ ){
            fact = fact * i;
        }
        int count = 0;
    while (fact%10==0) {
            count +=1;
            fact = fact/10;
        }return count;
    }
    public static void main(String[] args) {
        int x = 5;
        TrailingZeros trailingZeros = new TrailingZeros();
        int result = trailingZeros.Factorial(x);
        System.out.println(result);
    }
}
