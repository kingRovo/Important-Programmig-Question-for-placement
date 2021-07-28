//Perfect number is a number whose sum of factors is equal to the given number.
//28's factors 1+2+4+7+14=28

public class Perfect_number {
    public static void main(String[] args) {
        int num=28;
        int sum=0;
        for (int i = 1; i < num; i++) {
            if (num%i==0) {
                sum=sum+i;
            }
        }
        System.out.println(sum==num?"Perfect Number":"Not a Perfect Number");
    }
}
