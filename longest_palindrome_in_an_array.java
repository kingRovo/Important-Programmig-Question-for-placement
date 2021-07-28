public class longest_palindrome_in_an_array {
    public static int findPalindrome(int k){
        int rvrs=0;
        int numCopy=k;
        int cnt =0;
        while (k>0) {
            cnt++;
            rvrs=rvrs*10+(k%10);
            k = k/10;
            
        }
        return numCopy==rvrs?cnt:0;
    }
    public static void main(String[] args) {
        int arr[]={11,232,3343,54545,6111113};
        int max=arr[0];
        int rtrn=findPalindrome(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            
            if (findPalindrome(arr[i])>rtrn) {
                rtrn=findPalindrome(arr[i]);
                max=arr[i];
            }
        }
        if (rtrn>0) {
            System.out.println(max);
        }
        
    }
}
