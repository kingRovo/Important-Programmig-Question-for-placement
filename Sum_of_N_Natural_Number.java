public class Sum_of_N_Natural_Number {
    public static void main(String[] args) {
        int n=100;
        long sum=0;
        for (int i = 1; i <= n; i++) {
            sum=sum+i;
        }
        System.out.println("Sum is = "+sum);
    }
}
