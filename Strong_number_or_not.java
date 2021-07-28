// Strong Number is the number whose sum of factorial of the digits in any number is equal to the given number.

public class Strong_number_or_not {
    public static int fact(int n){
        int fact=1;
        for (int i = 1; i <=n; i++) {
            fact=fact*i;
            
        }
        return fact;
    }
    public static void main(String[] args) {

        int num=145;
        int copyNum=num;
        int rslt=0;

        while (num>0) {
            rslt=rslt+fact(num%10);
            num=num/10;
        }
        System.out.println(rslt==copyNum?"Strong Number":"Not Strong Number");
        
    }
}
