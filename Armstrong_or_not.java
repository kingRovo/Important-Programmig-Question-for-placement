public class Armstrong_or_not {
    public static void main(String[] args) {
        int num =407;
        int copyNum =num;
        int sum=0;
        while (num>0) {
           int dgt =num%10; 
           sum = sum+(dgt*dgt*dgt);
           num =num/10;
        }
        System.out.println(copyNum==sum?"Number is Armstrong":"Number is not armstrong");
    }
}
