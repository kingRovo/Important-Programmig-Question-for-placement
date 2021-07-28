public class HCF {
    public static void main(String[] args) {
     int a=15;
     int b=35;
     int hcf=1;
     for(int i=1;i<=a||i<=b;i++)
         if(a%i==0&&b%i==0)hcf=i;
     System.out.println("HCF of Given Number is : "+hcf);
        
    }
}
