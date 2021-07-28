public class Factor_of_a_number {
    public static void main(String[] args) {
        int num=12;
        System.out.println("All the factor of "+num);
        for (int i = 1; i <= num; i++) {
            if (num%i==0) {
                System.out.println(i);
                
            }
        }
    }
}
