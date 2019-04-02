class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || x == Integer.MAX_VALUE){
            return false;
        }
        StringBuilder str = new StringBuilder();
        str.append(x);
        str = str.reverse();
        String newString = str.toString();

        if(Integer.parseInt(newString) == x){
            return true;
        }
        else
            return false;
    }
}
