import java.util.*;
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int difference = 0;
        for (int i = 0 ; i < A.length; i++){
            map.put(A[i],i);
            difference += A[i];
        }
        for (int i = 0 ; i < B.length; i++){

            difference -= B[i];
        }

        difference = difference / 2;

        for(int i : B){
            if(map.containsKey(difference + i)){
                return new int[] {difference+i, i};
            }

        }
        return new int[0];
    }
}
