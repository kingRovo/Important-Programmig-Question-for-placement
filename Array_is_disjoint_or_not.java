public class Array_is_disjoint_or_not {
    
    public static Boolean isDisjoint(int arr1[],int arr2[]){

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]) {
                    return false;
                    
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr1[]={12,3,4,5,15};
        int arr2[]={65,45,56,3,67};
        if (isDisjoint(arr1, arr2))  System.out.println("----Arrays are Disjoint---");

        else System.out.println("----Arrays are not Disjoint----");
    }
}
