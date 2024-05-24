public class GCD {
    public int greatestDivisor(int a, int b){
        if (a == 0)
		return b;
		if (b == 0)
		return a;
        while (a!=b) {
            if (a>b)
                a=a-b;
            else
                b = b-a;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        GCD greatestGcd = new GCD();
        int result = greatestGcd.greatestDivisor(a, b);
        System.out.println(result);

    }
}
