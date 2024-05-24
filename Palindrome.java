public class Palindrome {
    public boolean isPal(int i){
        int rev = 0;
        int temp = i;
        while(temp !=0){
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp/10;
        }
        return(rev == i);
    }
    public static void main(String[] args) {
        int i = 1010;
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPal(i));
    }
}
