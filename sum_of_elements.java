public class sum_of_elements {
    
    public static void main(String[] args) {
        int arr[]={12,31,43,69,11,2};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Sum of Element : "+sum);
    }
}
