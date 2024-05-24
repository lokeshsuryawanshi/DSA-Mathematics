public class BitwiseXOR {
    public static void main(String[] args) {
        int arr [] = {9, 12, 2, 11, 2, 2, 10, 9, 12, 10, 9, 11, 2};
        int x = 9;     
        int n =arr.length;  
        for(int i = 1; i < n; i++){
            x = x^ arr[i];
            System.out.println(x);
        }
        System.out.println(x);
    }
}
