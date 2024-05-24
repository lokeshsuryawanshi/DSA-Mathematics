class countDigits{
    static int countDigit(long n ){
        if (n/10==0)
            return 1;
        return 1 + countDigit(n/10);
    }
    public static void main(String[]args){
        long n = 543293;
        System.out.print("countDIgits "+ countDigit(n));
    }
}