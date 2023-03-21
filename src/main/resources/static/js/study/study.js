function fncSubmit(){
    var frm = document.getElementById("mainForm");
    frm.action = "/printname";
    frm.submit();
}