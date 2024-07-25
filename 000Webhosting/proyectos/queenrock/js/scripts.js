   function mostrarMenu() {
            // Muestra y oculta las opciones del nav al pulsar en el boton burger
            let menuLista = document.getElementById('menuLista');

            let resolucion = window.innerWidth; // Resolucion actual de la pantalla


            if (resolucion >=900) {
                menuLista.style.visibility = 'visible';
                menuLista.style.display = "flex";
                    
            } else {

                if (menuLista.style.visibility == 'visible') {
                    menuLista.style.visibility = "hidden";
                    menuLista.style.display = "none";
                } else {
                    menuLista.style.visibility = 'visible';
                    menuLista.style.display = "flex";
                }
            }
        }
        

        window.addEventListener('resize', function() {
            // Al redimensionar la ventana acomoda el menú
            let menuLista = document.getElementById('menuLista');
            let anchoV1 = window.innerWidth;
            if(anchoV1 >= 900) {
                menuLista.style.visibility = 'visible';
                menuLista.style.display = "flex";
                menuLista.style.flexDirection = "row";
            } else {
                menuLista.style.flexDirection = "column";
                if (menuLista.style.visibility == 'visible') {
                    menuLista.style.visibility = "hidden";
                    menuLista.style.display = "none";
                }
            }
        });
       