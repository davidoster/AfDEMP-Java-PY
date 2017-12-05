
var num1 = window.prompt("Input the First integer", "0");
var num2 = window.prompt("Input the second integer", "0");

num1 = parseInt(num1, 10);
num2 = parseInt(num2, 10);

if(isNaN(num1)) {
  alert("First input value is NaN.");
} else if (isNaN(num2)) {
  alert("Second input value is NaN.");
} else {
  if (num1 > num2) { 
    alert("The larger of " + num1 + " and " + num2 + " is " + num1 + ".");
  }   
  else if (num1 < num2) {
    alert("The larger of " + num1 + " and " + num2 + " is " + num2 + ".");
  }                  
  else {
    alert("The values " + num1 + " and " + num2 + " are equal.");
  }
}                                               
