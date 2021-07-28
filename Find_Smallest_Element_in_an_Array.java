public class Find_Smallest_Element_in_an_Array {
    
    public static int ArrSmallest(int arr[]){
        int sml=arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (sml>arr[i]) {

                int tmp=sml;
                sml=arr[i];
                arr[i]=tmp;
                
            }
            
        }
        return sml;
    }
    public static void main(String[] args) {
        int arr[]={12,34,6,34,7,50};
        System.out.println("Smallest_Element : "+ArrSmallest(arr));
    }
}
