public class Minimum_scalar_product_of_two_vector {

    public static int scalarProduct(int arr1[],int arr2[]){

        int sum=0; 
        for (int i = 0; i < arr1.length; i++) {
            sum=sum+arr1[i]*arr2[i];
             
         }

        return sum;

    }
    public static void sort(int arr1[],int arr2[]){


        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1.length; j++) {

                if (arr1[i]>arr1[j]) {
                    int tmp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=tmp;
                    
                }

                
            }
            for (int j = 0; j < arr2.length; j++) {

                if (arr2[i]<arr2[j]) {

                    int tmp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=tmp;

                    
                }
                
            }
            
        }
             
        
    }
    public static void main(String[] args) {
        int arr1[]={3,5,7,2};
        int arr2[]={1,5,2,1};
        sort(arr1, arr2);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr1[i]+" * "+arr2[i]);
        }

        System.out.println("Scalar Product : "+scalarProduct(arr1, arr2));
    }
    
}
