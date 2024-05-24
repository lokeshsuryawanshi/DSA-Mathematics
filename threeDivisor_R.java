// Given a positive integer value N. The task is to find how many numbers less than or 
// equal to N have numbers of divisors exactly equal to 3.
// Example 1:

// Input:
// N = 6
// Output: 1
// Explanation: The only number less than 6 with 
// 3 divisors is 4 which has 1, 2 and 4 as divisors.

public class threeDivisor_R {
    public static void main(String[] args) {
        int n=6;
        
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=1;j<=n;j++){
                
                if(i%j==0);
                {
                count++;
                }
                
                
            }
            System.out.println(count);

        }
    }
}
