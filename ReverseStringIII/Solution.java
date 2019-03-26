class Solution {
        public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder strBuilder = new StringBuilder();

        for(String tempString: str){
            StringBuilder tempBuilder = new StringBuilder(tempString);
            tempBuilder.reverse();
            strBuilder.append(tempBuilder + " ");
        }
        return strBuilder.toString().trim();
    }
}
