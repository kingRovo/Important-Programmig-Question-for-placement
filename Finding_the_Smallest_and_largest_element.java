public class Finding_the_Smallest_and_largest_element {
    
    public static void main(String[] args) {
        int arr[]={12,45,56,67,3,45,89};
        int sml = arr[0];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)max=arr[i];
            else if (arr[i]<sml)sml=arr[i];      
        }
        System.out.println("Smallest : "+sml+"\nLargest : "+max);
        
    }
    
}
