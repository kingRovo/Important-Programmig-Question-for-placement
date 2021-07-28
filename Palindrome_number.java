public class Palindrome_number {
    public static void main(String[] args) {
        int num =121;
        int numCopy=num;
        int rvrs =0;
        while (num>0) {
            rvrs = rvrs*10+(num%10);
            num = num/10;
        }
        System.out.println((numCopy==rvrs)?"Number is Palindrome":"Number is not Palindrome");
    }
}
