
public class Block_swap_algorithm_for_array_rotation {
    public  static void swap(int[] arr,int a,int b,int d){
        int i,temp;
        for (i = 0; i < d; i++) {
            temp=arr[a+i];
            arr[a+i]=arr[b+i];
            arr[b+i]=temp;
        }
    }
    public static void leftRotate(int arr[],int d,int n){
        int i,j;
        if(d==0||d==n)return;

        i=d;
        j=n-d;
        while (i!=j) {
            if (i<j) {
                swap(arr, d-i, d+j-i, i);
                j=j-i;
            }
            else{
                swap(arr, d-i, d, j);
                i=i-j;
            }
            
        }
        swap(arr, d-i, d, j);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n =arr.length;
        int d=3;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        leftRotate(arr, d, n);
        System.out.println("\nArray after rotation ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
