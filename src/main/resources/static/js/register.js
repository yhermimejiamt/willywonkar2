function prueba() {
    let em = $("#registerEmail").val();
    let ps = $("#registerPassword").val();
    let rps = $("#repeatPassword").val;
    let nam = $("#registerName").val();

    console.log(em, ps, rps, nam);
}

function postUser() {

    if (
        $("#registerEmail").val().length == 0 ||
        $("#registerPassword").val().length == 0 ||
        $("#repeatPassword").val().length == 0 ||
        $("#registerName").val().length == 0
    ) {
        alert("Todos los campos son obligatorios");
    } else {
        let varUser = {
            email: $("#registerEmail").val(),
            password: $("#registerPassword").val(),
            name: $("#registerName").val()
        };
        console.log(varUser);
        console.log("vamos aqui");
        $.ajax({
            type: "POST",
            contentType: "application/json; charset=utf-8",
            dataType: "JSON",
            data: JSON.stringify(varUser),
            url: "http://localhost:8080/api/user/new",
            //url: "http://144.22.238.193:8080/api/user/new",
            success: function(response) {
                console.log(response);
                alert("Usuario creado correctamente");
                window.location.reload();
            },
            error: function(jqXHR, textStatus, errorThrown) {
                window.location.reload();
                alert("No se creo el Usuario");
            },
        });
    }
}