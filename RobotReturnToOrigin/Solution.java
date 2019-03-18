class Solution {
    public boolean judgeCircle(String moves) {
        char move[] = moves.toCharArray();
        int countsOfLeft = 0;
        int countsOfUp = 0;
        
        for(char C :move){
            if(C == 'U')
                countsOfUp++;
            if(C == 'D')
                countsOfUp--;
            if(C == 'L')
                countsOfLeft++;
            if(C == 'R')
                countsOfLeft--;
        }
        return countsOfLeft == 0 && countsOfUp == 0;
    
    }
}
