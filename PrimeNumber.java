public class PrimeNumber {
    public static void main(String[] args) {
        int n=1987;
        Boolean flg = true;
        for (int i = 2; i<=n/2; i++) {
            if (n%i==0) {
                flg=false;
                break;
            }
        }
        System.out.println(flg?"Prime":"Not A Prime");
    }
}
