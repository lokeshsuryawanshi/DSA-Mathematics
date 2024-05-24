// naive solution : run a for loop from i=2, 
// till i<n and then check if i is prime if it, assign another variable to x to i, 
// then run a while loop and and check if n%x ==0 if it is print i and also increment x = x*i; 

public class PrimeFactor {
    static boolean isPrime(int i){
            if (i<=1){
                return false;
            }
            if (i==2 || i==3){
                return true;
            }
            if (i%2==0 || i%3==0){
                return false;
            }
            for(int m = 5; m*m<=i; m= m+6){
                if (i%m==0 || i% (m+2) == 0)
                    return false;
            }
            return true;
        }
    static int factor(int a){
        for (int i = 2; i<=a; i++){
            if(isPrime(i)){
                int x = i;
                while(a%x==0){
                    System.out.println(i);
                    x = x*i;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 25;
        int result = factor(a);
        System.out.println(result);

    }
}
