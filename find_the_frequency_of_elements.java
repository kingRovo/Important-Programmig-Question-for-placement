
public class find_the_frequency_of_elements {
    public static void main(String[] args) {
        int arr[] ={3,3,4,5,7,8,8};
        int frq[] =new int[10];
        int flg =0;
        for (int i = 0; i < arr.length; i++) {
            flg=1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    flg++;
                    frq[j]=-1; 
                }
            
            }
            if(frq[i]!=-1){
               frq[i]=flg;
            }
            
        }
        System.out.println("Element | Frequency");
        System.out.println("--------------------");
        for (int i = 0; i < frq.length; i++) {
            if(frq[i]>0)
            System.out.println("   "+arr[i]+"    |     "+frq[i]);
        }
    }
}
