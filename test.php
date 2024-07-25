<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Test</title>
    <style>
        * {
            box-sizing:border-box;
        }
        *::after,*::before{
            box-sizing:inherit;
        }
        body{
            font-size:62.5%;
            background-color:rgba(200,200,200,.7);
        }
        .contenedor{
            margin: 3rem auto;
            padding:2rem;
            max-width:85%;
            background-color:rgba(255,255,255,.7);
            border-radius:1rem;
            padding:1rem 2rem;
        }
        h1{
            text-align:center;
            font-size:2.4rem;
            border-bottom:1px solid gray;
            padding-bottom:.5rem;
        }
        ol {
            list-style:none;
        }
        li {
            max-width:85%;
            margin:0 auto;
            border:1px solid gray;
            border-radius:1rem;
            padding:1rem;
            margin-bottom:1rem;
        }

        .pregunta {
            font-weight:bold;
            font-size:2rem;
        }
        .respuestas{
            font-size:2rem;
        }
        .respuestas li {
            font-size:1.2rem;
            border:none;
        }
        .correcta {
            font-size:1.6rem;
            font-weight: bold;
            background-color:rgba(0,255,0,.7);
        }
    </style>
</head>
<body>
    
    <div class="contenedor">

            
        <h1>TEST</h1>

        <ol>
            <li>
                <p class="pregunta">1. ¿Cuáles de los siguientes protocolos son ejemplos de protocolos de la capa de transporte TCP/IP? Seleccione dos respuestas. </p>
                <ol class="respuestas">
                    <li>a) Ethernet </li>
                    <li>b) HTTP</li>
                    <li>c) IP</li>
                    <li class="correcta">d) UDP <li>
                    <li>e) SMTP</li>
                    <li>f) TCP </li>
                </ol>
            </li>

            <li>
                <p class="pregunta">2. ¿Cuáles de los siguientes protocolos son ejemplos de protocolos de la capa de enlace de datos TCP/IP? Seleccione dos respuestas</p>
                <ol class="respuestas">
                    <li class="correcta">a) Ethernet </li>
                    <li>b) HTTP</li>
                    <li>c) IP </li>
                    <li>d) UDP</li>
                    <li>e) SMTP</li>
                    <li>f) TCP </li>
                    <li class="correcta">g) PPP </li>
                </ol>
            </li>

            <li>
                <p class="pregunta">5. ¿De qué es un ejemplo el proceso consistente en que un servidor web añada una cabecera TCP al contenido de la página web, añadiendo después una cabecera IP y luego añadiendo una cabecera y una cola de enlace de datos? </p>
                <ol class="respuestas">
                    <li class="correcta">a) Encapsulación de datos </li>
                    <li>b) Interacción entre capas equivalentes</li>
                    <li>c) Modelo OSI </li>
                    <li>d) Todas son correctas</li>
                </ol>
            </li>

            <li>
                <p class="pregunta">8¿Qué nivel OSI define los estándares de cableado y conectores? </p>
                <ol class="respuestas">
                    <li class="correcta">a) capa 1 </li>
                    <li>b) capa 2 </li>
                    <li>c) capa 3</li>
                    <li>d) capa 4</li>
                    <li>e) capas 5, 6, 7</li>
                </ol>
            </li>

            <li>
                <p class="pregunta">9. ¿Cuáles de los siguientes términos no son válidos para los nombres de las siete capas OSI? Seleccione 2 respuestas.</p>
                <ol class="respuestas">
                    <li>a) Aplicación</li>
                    <li>b) Enlace de datos</li>
                    <li  class="correcta">c) Transmisión </li>
                    <li>d) Presentación</li>
                    <li  class="correcta">e) Internet </li>
                    <li>f) Sesión</li>
                </ol>
            </li>

        </ol>

    <div>
</body>
</html>