$(document).ready(function() {
	$("#addDefectForm").submit(function(event) {
	    event.preventDefault(); // avoid to execute the actual submit of the form.
	    var form = $(this);
	    var result = addDefect(form.serialize(), showAddDefectResponse);
	});
});

$(document).ready(function() {
	$("#hideAddDefectForm").click(
		function(){
			$("#content").empty();
		});
});

function showAddDefectResponse(result){
	document.getElementById("addDefectResult").textContent = "added new defect (" + result.x + "," + result.y + "," + result.z + ")-> " + result.value;
}