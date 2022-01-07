function addDefect(defect, callBack){
     $.ajax({
        async: true,
        type: "POST",
        url: "/defects",
        data: defect,
        success: function(response) {
            callBack(response);
        },
        error: function(e) {
            callBack(e);
        }
    });
}

function getAllDefects(defect, callBack){
     $.ajax({
        async: true,
        type: "GET",
        url: "/defects",
        data: defect,
        success: function(response) {
            callBack(response);
        },
        error: function(e) {
            callBack(e);
        }
    });
}

function deleteDefect(defect, callBack){
     $.ajax({
        async: true,
        type: "DELETE",
        url: "/defects",
        data: defect,
        success: function(response) {
            callBack(response);
        },
        error: function(e) {
            callBack(e);
        }
    });
}
