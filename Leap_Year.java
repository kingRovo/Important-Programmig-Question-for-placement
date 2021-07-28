public class Leap_Year {
    public static void main(String[] args) {
        int n =2000;
        if (n%4==0&&n%100!=0||n%400==0) System.out.println("Leap Year");
        else System.out.println("Not a Leap Year");
            
        
    }
}
