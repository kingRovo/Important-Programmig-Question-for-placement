public class rotation_of_elements_of_array_left {

    public static int[] LeftRotat(int arr[],int k){

        for (int i = 0; i < k; i++) {
            int j,frst;
            frst =arr[0];
            for (j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[j]=frst;
        }
        return arr;

    }
    public static void main(String[] args) {
        int arr[] = {12,23,45,56,67,67,77};
        int k=2;
        LeftRotat(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
    
}
