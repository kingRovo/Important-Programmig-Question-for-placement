import java.util.HashMap;
class Find_symmetric_pairs
{
    static void getSymmetricPair(int arr[][])
    {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        System.out.println("-------Symmetric Pairs-------");
        for (int i = 0; i < arr.length; i++)
        {
            int firstValue = arr[i][0];
            int secondValue = arr[i][1];
            Integer val = hashmap.get(secondValue);
            if (val != null && val == firstValue)
            {
                System.out.print("{" + secondValue + ", " + firstValue + "}" + " \n");
            }
            else
            {
                hashmap.put(firstValue, secondValue);
            }
        }
    }
    public static void main(String arg[])
    {
        int arr[][]= {{11,20},{30,40},{4,5},{5,4},{40,30}};
        getSymmetricPair(arr);
    }
}