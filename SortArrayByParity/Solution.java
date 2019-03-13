class Solution {
    public int[] sortArrayByParity(int[] A) {
    int count = 0;
        
        for(int i = 0 ; i < A.length; i++){
            if(A[i] % 2 == 0){
                int target = i - count;
                int temp = A[i];
                A[i] = A[target];
                A[target] = temp;
            }
            else count++;
        }
        
        return A;
    }
}
