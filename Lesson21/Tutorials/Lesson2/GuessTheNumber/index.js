// Get a random integer from 1 to 10 inclusive
 var randomNumber = Math.ceil(Math.random() * 10);
 var guess = prompt('Guess the number between 1 and 10 inclusive');
 if (guess == randomNumber) {
 	alert('Matched');
 }
 else {
 	alert('Not matched, you guessed ' + guess + ' and the number was ' + randomNumber);
 }
   