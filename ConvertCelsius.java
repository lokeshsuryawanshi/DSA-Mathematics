public class ConvertCelsius {
    public double cToF(int C)
    {
        return (C * 9/5)+32;
    }
    public static void main(String[] args) {
        int C = 2;
        ConvertCelsius convertCelsius = new ConvertCelsius();
        double result = convertCelsius.cToF(C);
        System.out.println(result);
    }
}
