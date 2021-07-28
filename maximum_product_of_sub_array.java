public class maximum_product_of_sub_array {
    public static int maxProduct(int arr[]){

        int n= arr.length;
        int max =arr[0];
        int left=0;
        int right =0;
        for (int i = 0; i < n; i++) {

            left = (left==0?1:left)*arr[i];
            right = (right==0?1:right)*arr[n-1-i];

            max= Math.max(max, Math.max(left, right));
            
        }
        return max;
    } 
    public static void main(String[] args) {
        int arr[] ={-2, -40, 0, -2, -3};
        System.out.println(maxProduct(arr)); 
    }
}
