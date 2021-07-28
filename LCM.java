public class LCM {
    public static void main(String[] args) {
    int n1 = 5, n2 = 8, lcm;
    lcm = (n1 > n2) ? n1 : n2;
    while(true) {
      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
        break;
      }
      ++lcm;
    }
    }
    
}
