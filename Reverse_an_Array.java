public class Reverse_an_Array {
    public static void main(String[] args) {
        int arr[]={12,34,45,56,67};
        int j=0;
        for (int i = arr.length-1; i >arr.length/2 ; i--) {
            
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" "+arr[i]);
        }
    }
}
