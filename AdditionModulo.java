public class AdditionModulo {
    static final long MOD = 1000000007;
    public static long sumUnderModulo(long a, long b){
        return (a% MOD + b%MOD)%MOD;
    }
    public static void main(String[] args) {
        long a = 18; 
        long b = 611;  // Replace with your value for 'b'

        long result = sumUnderModulo(a, b);
        System.out.println(result);
    }
}
