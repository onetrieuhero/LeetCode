class Solution {
    public void reverseString(char[] s) {
        int length = s.length;
        char newArray[] = new char[length];
        int placeHolder = 0;
        for(int i = s.length - 1; i >= 0; i--){
            newArray[placeHolder++] = s[i];
        }
        
        for(int i = 0; i < s.length; i++){
            s[i] = newArray[i];
        }
    }
}
