public class Palindrome_String {

    public static void main(String[] args) {
        String str = "abmbA";
        String rvr="";
        for (int i = 0; i <str.length(); i++) {

            char ch=str.charAt(i);
            rvr = ch+rvr;
            
        }
        System.out.println(str.equalsIgnoreCase(rvr)?"Palindrome":"Not Palindrome");
    }


    
}
