public class Maximum_scalar_product_of_two_vectors_in_an_array {
    public static int scalarProduct(int arr1[],int arr2[]){

        int sum=0; 
        for (int i = 0; i < arr1.length; i++) {
            sum=sum+arr1[i]*arr2[i];
             
         }

        return sum;

    }
    public static void sort(int arr[]){


        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if (arr[i]>arr[j]) {
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                    
                }

                
            }
            
        }
             
        
    }
    public static void main(String[] args) {
        int arr1[]={3,5,7,2};
        int arr2[]={1,5,2,1};
        sort(arr1);sort(arr2);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr1[i]+" * "+arr2[i]);
        }

        System.out.println("Scalar Product : "+scalarProduct(arr1, arr2));
    }
}
