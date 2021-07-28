public class Sort_the_array {

    public static int[] sort(int arr[]){

        int temp,n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n-1; j++) {
                if (arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;

    } 
    public static void main(String[] args) {
        int arr[]={23,6,67,23,11,90};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" "+arr[i]);
        }
    }
}
