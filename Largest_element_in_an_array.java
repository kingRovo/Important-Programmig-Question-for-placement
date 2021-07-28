public class Largest_element_in_an_array {
    public static int ArrLargest(int arr[]){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (max<arr[i]) {

                int tmp=max;
                max=arr[i];
                arr[i]=tmp;
                
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={12,34,6,34,7,50};
        System.out.println("Largest Element : "+ArrLargest(arr));
    }
    
}
