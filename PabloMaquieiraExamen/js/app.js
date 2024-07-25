// Colores de fonde
const colores =["blue","yellow","red","green","purple","brown","gray","beige","pink","black"]; 
// Contenido contenedores
const contenido = [11111,22222,33333, 44444,55555, 66666, 77777,88888,99999];


// Rellenar contenedores con color de fondo y texto
let contenedores = document.querySelectorAll('div');
for (let i=0; i < contenedores.length - 1 ;i++) {
    contenedores[i].style.backgroundColor = colores[i];
    contenedores[i].innerHTML = contenido[i];
}


function sumar(){ // Suma el valor del contenido del array "contenido" y lo muestra en el p.resultado
    let suma = 0;
    
    for (let i=0;i<contenido.length;i++) {
        suma += Number(contenido[i]);
    }
    document.querySelector('.resultado').innerHTML = "";
    document.querySelector('.resultado').innerHTML += `Contenido del array:<br> ${mostraVertical(contenido)} `;
    document.querySelector('.resultado').innerHTML += `<br>Resultado de la suma: ${suma}`;
}
function mostraVertical(matriz){
    // Muestra verticalmente los elementos de la matriz para hacer un innerHTML
    let cadena ='';
    for (let i=0;i<matriz.length;i+=2){
        if (matriz[i+1] != undefined) {
            cadena += `${matriz[i]}, ${matriz[i+1]} <br>`;
        } else {
            cadena += `${matriz[i]} <br>`;
        }
    }
    return cadena;
}