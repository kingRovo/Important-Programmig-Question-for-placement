public class rotation_of_elements_of_array_right {
    public static int[] rightRotate(int arr[], int k) {

        for (int i = 0; i < k; i++) {

            int j, last;
            last = arr[arr.length-1];
            for (j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = last;

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {23,45,11,23,45,56};
        int k = 2;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        } 
        System.out.println("\nArray after "+k+" right -> rotations");
        rightRotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        } 
    }
}
