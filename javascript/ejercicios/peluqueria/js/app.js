let indexValue = 1; // indice de array, empiezan en 1 (ids de las <span class="btn" id="btn1"></span> )
showImg(indexValue);

const izq = document.querySelector(".left");
const dcha = document.querySelector(".right");


izq.addEventListener("click",()=>{
    showImg(indexValue -= 1) // se reduce el indice

})
dcha.addEventListener("click", ()=>{
    showImg(indexValue += 1); // se aumenta el indice
})

let btnsCirculares = document.querySelectorAll(".btn");

btnsCirculares.forEach((item, index)=>{
    item.addEventListener("click",(e)=>{
        showImg(indexValue = e.target.id.substr(-1));
        // radiobutton click con el valor del indice que estamos (-1 porque array indice empieza en 0 y no en 1 )
    })
})

function showImg(foto){ // foto es el indice 
    let i;
    const img = document.querySelectorAll(".img");                      // Todas las imagenes
    const slider = document.querySelectorAll(".botonslider .btn");      // y todos los radiobuttons del slider

    if(foto > img.length){ // si el indice es mayor que el array vuelve a empezar
        indexValue = 1;
    }
    if(foto < 1){ // si el indice menor que 1 se vuelve al indice mayor del array
        indexValue = img.length;
    }
    for (i=0; i < img.length; i++){
        img[i].style.display = "none";
    }
    for (i=0; i < slider.length; i++){
        slider[i].style.background = "rgba(225,225,225,0.3)";
    }
    img[indexValue-1].style.display = "block"; 
    slider[indexValue-1].style.background = "#586c6b";
}