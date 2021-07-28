import java.util.*;
public class PosNag{

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = sc.nextInt();
        System.out.print(n>=0?(n==0?"Zero":"Positive"):"Nagative");
    }
}