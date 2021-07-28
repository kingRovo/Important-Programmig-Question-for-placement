public class Fibonacci_Series {
    public static void main(String[] args) {
        int n = 12;
        int f=0;
        int s =1;
        int c;
        for(int i=0;i<n;i++){

            c=f+s;
            System.out.println(c);
            f=s;
            s=c;
        
        }
    }

}
