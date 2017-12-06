
$(document).ready(function() {

	$("textarea").css({
		"border-color": "black",
		"border-width": "1px",
		"width": "200px",
		"height": "200px"
	});

	var oldVal = "";
	//Multiple events catching (for educational purposes).
	//For change, keydown keyup, but also paste events catching.
	$("#source").on('change keydown keyup paste', function() {
		var currentVal = $(this).val();

	  if(currentVal == oldVal) {
	    return; //check to prevent multiple simultaneous triggers
	  }
	  oldVal = currentVal;
		$("#destination").val($("#source").val());

	});

});


