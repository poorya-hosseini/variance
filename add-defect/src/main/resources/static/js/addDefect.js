$(document).ready(function() {
	setSubmit();
	setRefreshDefectButton();
	getAllDefects("",  refreshDefectList);
});

function setSubmit(){
	var addDefectForm = $("#addDefectForm");
	addDefectForm.submit(function(event) {
	    event.preventDefault(); // avoid to execute the actual submit of the form.
	    var form = $(this);
	    addDefect(form.serialize(), addDefectRow);
	});
}

function setRefreshDefectButton(){
	var refreshDefectsButton = $("#refreshDefects");
	refreshDefectsButton.click(function() {
		getAllDefects("",  refreshDefectList);
    });
}

function refreshDefectList(defectItems){
	removeDefects();
	defectItems.forEach(defectItem => addDefectRow(defectItem));
}

function addDefectRow(defectItem){
	var defectsList = $("#defectsList");
	defectsList.append('<tr id="defect-row-' + defectItem.id + '"></tr>');

	var defectRow = $("#defect-row-" + defectItem.id);
	defectRow.append('<td>'+ defectItem.x +'</td>');
	defectRow.append('<td>'+ defectItem.y +'</td>');
	defectRow.append('<td>'+ defectItem.z +'</td>');
	defectRow.append('<td>'+ defectItem.value +'</td>');
}

function removeDefects(){
	var defectRows = $("[id^=defect-row-]");
	defectRows.remove();
}