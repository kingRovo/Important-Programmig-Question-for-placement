public class Power_of_a_number {
    public static void main(String[] args) {
        int num =5;
        int pwr=2;
        int rslt=1;
        for (int i = 0; i < pwr; i++) {
            rslt=rslt*num;
        }
        System.out.printf("%d Power of %d is : %d"+pwr,num,rslt);
    
    }
}
