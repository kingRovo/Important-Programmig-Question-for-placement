public class ReverseNumber {
    public static void main(String[] args) {
        int n=9876;
        int reverseN=0;
        while (n>0) {
            reverseN = reverseN*10+(n%10);
            n=n/10;
        }
        System.out.println("Reverse of a number : "+reverseN);
    }
}
