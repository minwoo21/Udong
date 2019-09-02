
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

function pswCheck(form){
    var PASSWORD = form.PASSWORD;
    var C_PASSWORD = form.C_PASSWORD;
    if (PASSWORD.value != C_PASSWORD.value) {
        return false;
    }
    else return true;
}

function fieldCheck(form){
    var NAME = form.NAME;
    var ID = form.ID;
    var TEL = form.TEL;
    var PASSWORD = form.PASSWORD;
    if (NAME.value == "" || TEL.value == "" || PASSWORD == "" || ID.value == "") {
        return false;
    }
    else {
        return true ;
    }
}
function check(form) {
    var checkPSW = $("#checkPSW");
    var checkField = $("#checkField");
    var interestField = $("#interestField");
    var CheckList = $("input:checkbox[name='INTEREST']:checked");
    var pswWarning = "<p>비밀번호가 일치하지 않습니다.</p>";
    var fieldWarning = "<p>모든 값을 입력해주세요.</p>";
    var CheckWarning = "<p>관심분야를 한개 이상 선택해주세요.</p>";
    checkPSW.css("color", "red");
    checkField.css("color", "red");
    interestField.css("color", "red");
    checkField.text("");
    checkPSW.text("");
    interestField.text("");
    var flag = false;

    //비밀번호와 확인이 같은지 체크
    if (!pswCheck(form)) {
        checkPSW.append(pswWarning);
        flag = false;
    }
    else {
        checkPSW.text("");
        flag = true;
    }

    //빈 값이 있는지 체크
    if (!fieldCheck(form)) {
        checkField.append(fieldWarning);
        flag = false;
    }
    else {
        checkField.text("");
        flag = flag ? true : false;
    }

    //체크박스 체크
    if (CheckList.length == 0) {
        interestField.append(CheckWarning);
        flag = false;
    }
    else {
        interestField.text("");
        flag = flag ? true : false;
    }
    return flag;
}
