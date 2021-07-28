//Automorphic number is a number whose square ends in the same digits as the number itself.

public class Automorphic_number_or_not {

    public static void main(String[] args) {
        int num=76;
        int sqr=num*num;
        String s1 = Integer.toString(num);
        String s2 = Integer.toString(sqr);
        int l1 = s1.length();
        int l2 = s2.length();
        String s3 = s2.substring(l2-l1);
        System.out.println(s1.equals(s3)?"Automorphic Number":"Not an Automorphic Number");
            
}
}