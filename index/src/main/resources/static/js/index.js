$( document ).ready(function() {
	addNavigationButtons();
	showCharMenu();
	addDefectMenu();
})

function addNavigationButtons(){
	var body = $('body');
	body.append('<div id="navigationContent"></div>');
    body.append('<div id="content"></div>')

	var navigationContent = $('#navigationContent');
    navigationContent.append('<button id="showChartButton">Show Variance</button>')
    navigationContent.append('<button id="addDefectButton">Add Defect</button>');
}

function addDefectMenu(){
	var content = $("#content");
	var addDefectButton = $("#addDefectButton")

	addDefectButton.click(
        function(){
            var addDefectContent = content.find("#addDefectContent");
            if(addDefectContent.length == 0 ){
                content.empty();
                content.append('<div id="addDefectContent"></div>')
                addDefectContent = content.find("#addDefectContent");
                addDefectContent.load("addDefect");
            }
        })
}

function showCharMenu(){
	var content = $("#content");
	var showChartButton = $("#showChartButton")

	showChartButton.click(
        function(){
            var showChartContent = content.find("#showChartContent");
            if(showChartContent.length == 0 ){
                content.empty();
                content.append('<div id="showChartContent"></div>')
                showChartContent = content.find("#showChartContent")[0];
                showChartContent.innerHTML= "show variance chart";
            }
        })
}

