import java.util.*;
import java.util.Comparator;
class Pair{
    int val;
    int count;
    public Pair(int val, int count){
        this.val = val;
        this.count = count;
    }
}

public class Sorting_elements_of_an_array_by_frequency {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;        
        HashMap<Integer, Integer> map = new HashMap<>();
        
		// counting the freq of every value using hashMap 
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1); 
        }
        
		// adding value and their corresponding count in list because we can sort list later 
		
        List<Pair> li = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            li.add(new Pair(entry.getKey(), entry.getValue()));
        }
       
		
        Collections.sort(li, new Comparator<Pair>(){
           public int compare(Pair a, Pair b){
               if(a.count == b.count){
                   return b.val - a.val;
               }
               return a.count - b.count;
           } 
        });
        
        int[] ans = new int[n];		
        int i =0;
        int j =0;

        while(j < li.size()){
            Pair temp = li.get(j);
            int count  = temp.count;
            int val = temp.val;
            for(int k = 0; k < count; k++){
                ans[i] = val;
                i++;
            }
            j++;
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Sorting_elements_of_an_array_by_frequency ob = new Sorting_elements_of_an_array_by_frequency();
        int arr[] = {2,2,2,1,4,4,4,4,56};
        System.out.println();
        for (int i = ob.frequencySort(arr).length-1; i >=0; i--) {
            System.out.print(" "+ob.frequencySort(arr)[i]);
            
        }
        
        
    }
}