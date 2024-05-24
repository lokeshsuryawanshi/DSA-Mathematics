// import java.time.chrono.Era;
import java.util.Arrays;

public class SeivePrime {
    static boolean [] EratoSthenes (int n){
        boolean isPrime[] = new boolean[n +1];
        Arrays.fill(isPrime, true);
        isPrime[0]=false;
        isPrime[1]=false;

        for (int i = 2; i <=n; i++){
            for (int j = i*2; j<=n; j+=i){
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        boolean isPrime[] = EratoSthenes(17);
        for(int i = 2; i<=17; i++){
            System.out.println(i + " "+ isPrime[i]);
        }
    }
    
}
