$(document).ready(function() {
	debugger;
	setSubmit();
	setRefreshDefectButton();
	getAllDefects("",  refreshDefectList);
});

function setSubmit(){
	var addDefectForm = $("#addDefectForm");
	addDefectForm.submit(function(event) {
	    event.preventDefault(); // avoid to execute the actual submit of the form.
	    var form = $(this);
	    addDefect(form.serialize(), refreshDefectList);
	});
}

function setRefreshDefectButton(){
	var refreshDefectsButton = $("#refreshDefects");
	refreshDefectsButton.click(function() {
		refreshDefectList();
    });
}

function refreshDefectList(){
	removeDefects();
	getAllDefects("",  addDefectRows);

}

function addDefectRows(defectItems){
	defectItems.forEach(defectItem => addDefectRow(defectItem));
}

function addDefectRow(defectItem){
	var defectsList = $("#defectsList");
	defectsList.append('<tr id="defect-row-' + defectItem.id + '"></tr>');

	var defectRow = $("#defect-row-" + defectItem.id);
	defectRow.append('<td>'+ defectItem.id +'</td>');
	defectRow.append('<td>'+ defectItem.x +'</td>');
	defectRow.append('<td>'+ defectItem.y +'</td>');
	defectRow.append('<td>'+ defectItem.z +'</td>');
	defectRow.append('<td>'+ defectItem.value +'</td>');
	defectRow.append('<td><button id="defect-row-"' + defectItem.id +'>delete</button></td>');

	var deleteButton = $("#defect-row-" + defectItem.id);
	deleteButton.click(function () {
		deleteDefect(defectItem.id, refreshDefectList);
	});
}

function removeDefects(){
	var defectRows = $("[id^=defect-row-]");
	defectRows.remove();
}