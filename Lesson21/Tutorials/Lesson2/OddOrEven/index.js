
//Declare function. 
function oddOrEven(limit) {

	if(limit <= 0) {
		return;
	}
	
  for (var i = 1; i <= limit; i++) {
    if(i % 2 == 0) {
      console.log(i + ": Even");
    } else {
      console.log(i + ": Odd");
    }
  }
}

//Call it.
oddOrEven(100);