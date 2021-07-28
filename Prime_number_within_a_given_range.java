public class Prime_number_within_a_given_range {

    public Boolean isPrime(int n){
        for (int i = 2; i<=n/2; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;   
    }
    public static void main(String[] args) {
        Prime_number_within_a_given_range ob =new Prime_number_within_a_given_range ();
        
        int a=23;
        int b=123;
        System.out.println("------List of Prime Numbers------");
        for (int i = a; i <=b; i++) {
            if(ob.isPrime(i))System.out.println("Prime : "+i);
        }
    }
}
