$( document ).ready(function() {
	addNavigationButtons();
	addDefectMenu();
	showCharMenu();
})

function addNavigationButtons(){
	var body = $('body');
	body.append('<div id="navigationContent" class="nav-bar"></div>');
    body.append('<div id="content"></div>')

	var navigationContent = $('#navigationContent');
	navigationContent.append('<ul id="navigationList" class="nav-bar"></ul>')
	var navigationList = $('#navigationList')
	navigationList.append('<li id="addDefectButton" class="nav-bar"><a class="nav-bar" href="#addDefectButton">Add Defect</a></li>')
	navigationList.append('<li id="showChartButton" class="nav-bar"><a class="nav-bar" href="#showChartButton">Show Variance</a></li>')
}

function addDefectMenu(){
	var content = $("#content");
	var addDefectButton = document.getElementById("addDefectButton");

	addDefectButton.addEventListener("click",function(e) {
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
	var showChartButton = document.getElementById("showChartButton");

	showChartButton.addEventListener("click",function(e) {
            var showChartContent = content.find("#showChartContent");
            if(showChartContent.length == 0 ){
                content.empty();
                content.append('<div id="showChartContent"></div>')
                showChartContent = content.find("#showChartContent")[0];
                showChartContent.innerHTML= "show variance chart";
            }
        })
}

