/**
 * @param {number[]} T
 * @return {number[]}
 */
var dailyTemperatures = function(T) {
    let returnArray = [];
    for(let i = 0 ; i < T.length ; i++){
	    for(let j = i + 1; j < T.length; j++){
		    if(T[i] < T[j]){
			    returnArray.push(j - i);
			    break;
		    }
		    if(j === T.length - 1 && T[i] >= T[j]){
			    returnArray.push(0);
		    }
	    }
    }

returnArray.push(0);
return returnArray;
};
