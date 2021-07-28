public class Determine_Array_is_a_subset_of_another_array_or_not {
    
    public static Boolean isSubset( int f,int[] arr,int[] subArr){
        int cnt=0;
        for ( int i =f; i < arr.length; i++) {
            cnt=0;
            for (int j = 0; j < subArr.length; j++) {
                if (arr[i]!=arr[j]) {
                    isSubset(i+1, arr, subArr);
                }
                else cnt++;
                if(cnt==subArr.length-1){
                    return true;
                }
                  
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6};
        int subArr[]= {4,5};
        int f=0;

        System.out.println(isSubset(f, arr, subArr)?"Yes, Subarray matched":"Subarray not matched");
    }
}
