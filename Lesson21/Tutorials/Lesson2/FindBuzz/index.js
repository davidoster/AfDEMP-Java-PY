
//Declare function. 
function fizzBuzz(numberToLoop) {


  for (var i = 1; i <= numberToLoop; i++) {
    if (i % 3 === 0 && i % 5 === 0 ) {
      console.log( i + " FizzBuzz");
    }
    else if (i % 3 === 0) {
      console.log(i + " Fizz" );
    }
    else if ( i % 5 === 0 ) {
      console.log(i + " Buzz" );
    }
    else {
      console.log(i);
    }
  }
}

//Call it.
fizzBuzz(100);