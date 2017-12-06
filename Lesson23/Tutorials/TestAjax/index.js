
$(document).ready(function() {

	$("#resultButton").click(function() {

		$.ajax({
			//url: "test.txt",
			url: "http://www.google.gr",
			success: function(result) {
      	$("#result").html(result);
    	},
    	error: function(xhr, status, error) {
    		$("#result").html("An AJAX error occured: " + status);

    	}
    });

	});

});


