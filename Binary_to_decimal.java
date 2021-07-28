//Integer.parseInt("1010",2) this method directly give Decimal of given bnry(String) 
public class Binary_to_decimal {

    public static void main(String[] args) {
        int  bnry =10101;
        int dcml=0;
        int n=0;
        while (bnry>0) {
            int tmp=bnry%10;
            dcml += tmp*Math.pow(2, n);
            bnry=bnry/10;
            n++;
        }
        System.out.println("Decimal - "+dcml);
    }
    
}
