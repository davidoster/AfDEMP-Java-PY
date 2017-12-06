
$(document).ready(function() {
	$("#firstButton").click(function(){
		$("#firstParagraph").show("slow");
		$("#secondParagraph").hide("slow");
	});

	$("#secondButton").click(function(){
		$("#firstParagraph").hide("slow");
		$("#secondParagraph").show("slow");
	});

	$("#bothButton").click(function(){
			$(".paragraph").show("slow");
	});

});