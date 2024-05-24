public class ComputingPower {
    public int Power(int x, int y){
        if(y==0){
            return 1;
        }
        int temp = Power(x, (y/2));
        temp = temp * temp;
        if(y%2==0){
            return temp;
        }
        else{
            return x*temp;
        }
    }
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        ComputingPower cPower = new ComputingPower();
        int result = cPower.Power(x, y);
        System.out.println(result);
    }
}
