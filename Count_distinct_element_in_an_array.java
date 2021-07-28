public class Count_distinct_element_in_an_array {
    public static void main(String[] args) {
        int cnt =0;
        int arr[] = {10,20,10,9,6,2,6,6,20};
        int n = arr.length;
        int dst=1;
        for (int i = 0; i < n; i++) {
            dst=1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    dst =0;
                }
            }
            if (dst>0) {
                cnt++;
            }
        }
        System.out.println("Distinct Element : "+cnt);
    }
}
