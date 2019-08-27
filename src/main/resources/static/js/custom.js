
function check(form) {
    var ID = form.ID.value;
    var PASSWORD = form.PASSWORD.value;
    if (ID == "" || PASSWORD == "") {
        $(".warning").text("모든 값을 입력해주세요");
        return false;
    }
    else {
        $(".warning").text("");
        return true;
    }
}