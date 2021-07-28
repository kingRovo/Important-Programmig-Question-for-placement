public class finding_the_second_smallest_element {

    public static int[] sortArr(int arr[]){

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {

                if(arr[i]>=arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
            
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={45,56,23,54,63,14,45};
        sortArr(arr);
        System.out.println("Second smallest element : "+arr[0]);
    }
}
