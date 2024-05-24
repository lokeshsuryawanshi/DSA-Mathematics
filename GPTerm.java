public class GPTerm {
    public double nthTerm(double a, double b, double n){
        double r = (double) b / a;
        
        double result = a * Math.pow(r, n-1);

        return result;
    }
    public static void main(String[] args) {
        double A = 3;
        double B = 6;
        double N = 5;
        GPTerm nthGpTerm = new GPTerm();
        System.out.println( nthGpTerm.nthTerm(A, B, N));


    }
}
