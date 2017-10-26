
function firstNotRepeatingCharacter(s) {
    var myMap = new Map();
    var count = 1;
    for(var idx in s) {
      if(myMap.has(s[idx])) {
        var num = myMap.get(s[idx]) + 1;
        myMap.set(s[idx], num);
      }
      else {
        myMap.set(s[idx], count);
      }
    }
    for(var [key, value] of myMap) {
      if(value == 1) {
        return key;
      }
    }
    return '_';
}
var s ='abcdeff';
firstNotRepeatingCharacter(s);

