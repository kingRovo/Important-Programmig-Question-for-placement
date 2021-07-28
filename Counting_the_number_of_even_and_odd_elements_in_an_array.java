public class Counting_the_number_of_even_and_odd_elements_in_an_array {
    public static void main(String[] args) {
        int arr[]={12,34,2,3,7,8,9,12,23,45,56};
        int evenCnt=0;
        int oddCnt=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0)  evenCnt++;
            
            else oddCnt++;
        }

        System.out.println("Odd element : "+oddCnt+"\nEven Elemnet : "+evenCnt);
    }
}
