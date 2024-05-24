public class Absolutevalue {
    public int absolute(int I) {
        return Math.abs(I);
}
    public static void main(String[] args) {
        int I = -455;
        Absolutevalue absolutevalue = new Absolutevalue();
        int result = absolutevalue.absolute(I);
        System.out.print(result);
    }
}
