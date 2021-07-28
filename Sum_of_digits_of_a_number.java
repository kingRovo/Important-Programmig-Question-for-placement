public class Sum_of_digits_of_a_number {
    public static void main(String[] args) {
        int n=1234;
        int sum=0;
        while (n>0) {
            sum=sum+(n%10);
            n=n/10;
        }
        System.out.println("Sum = "+sum);
    }
}
