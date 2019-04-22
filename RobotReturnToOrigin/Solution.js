/**
 * @param {string} moves
 * @return {boolean}
 */
var judgeCircle = function(moves) {
    let Xcount = 0;
    let Ycount = 0;
    for(let i = 0 ; i < moves.length; i++){
        if(moves.charAt(i) == 'R')
            Xcount++;
        if(moves.charAt(i) == 'L')
            Xcount--;
        if(moves.charAt(i) == 'U')
            Ycount++;
        if(moves.charAt(i) == 'D')
            Ycount--;
    }
    return Xcount === 0 && Ycount === 0;
};
