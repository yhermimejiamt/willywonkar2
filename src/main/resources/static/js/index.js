function validate() {

    let loginEmail = document.getElementById("loginEmail");
    let loginPassword = document.getElementById("loginPassword");

    if (loginEmail.value === "") {
        alert("Es necesario un email");
    } else if (loginPassword.value === "") {
        alert("Es necesaria una contraseña");
    }




}