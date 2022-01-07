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
