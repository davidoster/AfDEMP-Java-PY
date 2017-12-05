function multiplyBy() {
  var num1 = document.getElementById("firstNumber").value;
  var num2 = document.getElementById("secondNumber").value;
  document.getElementById("result").innerHTML = num1 * num2;
}

function divideBy() { 
  var num1 = document.getElementById("firstNumber").value;
  var num2 = document.getElementById("secondNumber").value;
  var result;
  if(num2 == 0) {
  	result = "You can not divide by zero.";
  }
  else {
  	result = num1 / num2;
  }
  document.getElementById("result").innerHTML = result;
	
}