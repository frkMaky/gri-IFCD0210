
function enviarCorreo() {
    // Crea el mensaje para enviar por correo

    const nombre = document.querySelector('#nombre').value;
    const email = document.querySelector('#email').value;
    const mensaje = document.querySelector('#mensaje').value;

    console.log(mensaje);

    // link del correo 
    const link = "mailto:" + email + "?subject=" + nombre + "&body=" + mensaje;

    // se ejecuta el correo 
   window.location.href = link;
}