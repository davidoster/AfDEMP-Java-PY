
$(document).ready(function() {
		$(".box").css("width", "40px");
		$("input").css("text-align", "center");

		$("#resultButton").click(function(){
			var number1 = $("#number1").val();
			var symbol = $("#symbol").val();
			var number2 = $("#number2").val();
			
			var result = "";
			switch(symbol) {
				case "+":
					result = number1 + number2;
					break;
				case "-":
					result = number1 - number2;
					break;
				case "*":
					result = number1 * number2;
					break;
				case "/":
					result = number1 / number2;
					break;
				default:
					result = "Not a valid operation."
			}

			// Alternative solution.
			// var result = eval(number1 + symbol + number2);


			$("#result").val(result);
		});


});


