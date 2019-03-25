import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution{
    public static int getMinimumUniqueSum(List<Integer> arr) {
        int size = arr.size();
        int total = 0;
        Integer temp[] = arr.toArray(new Integer[size]);
        HashMap<Integer,Boolean> map = new HashMap<>();

        for(int i = 0; i < temp.length; i++){

            while (map.containsKey(temp[i])) {
                temp[i] = temp[i] + 1;
            }

            map.put(temp[i],true);
            total += temp[i];

        }
        return total;
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        list.add(1); //1
        list.add(1); //2
        list.add(2); //3
        list.add(2); //4

        Result result = new Result();
        System.out.println(result.getMinimumUniqueSum(list)); //prints 10

    }
}
