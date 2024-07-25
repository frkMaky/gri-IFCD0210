<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicios Redes</title>
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
            font-size:1.4rem;
        }

        .pregunta {
            font-weight:bold;
            font-size:2rem;
        }
        .respuestas{
            font-size:2rem;
        }
        .respuestas li {
            font-size:1.4rem;
            border:none;
        }
        .correcta {
            font-size:1.6rem;
            font-weight: bold;
            background-color:rgba(0,255,0,.7);
        }
        .tabla {
            margin:0 auto;
            border:1px solid gray;
            padding:2rem;
            font-size:1.6rem;
            border-collapse: collapse;

            margin-bottom:2rem;
        }
        .tabla th {
            background-color: rgba(0,0,0,.7);
            color:white;
        }
        .tabla td, .tabla th {
            text-align:center;
            padding:1rem;
            border: 1px solid gray;
        }
    </style>
</head>
<body>
    

<div class="contenedor">
   <p class="pregunta">

       2. ¿Por qué la fórmula que nos da el número de hosts por subred (2H – 2) requieren que se resten doshosts?
    </p>
    <ol class="repuestas">
       <li>a) Para reservar dos direcciones para las gateways (routers) redundantes predeterminadas</li>
       <li>b) Para reservar dos direcciones requeridas para la operación DHCP</li>
       <li>c) Para reservar direcciones para el ID de la subred y la gateway (router) predeterminadas</li>
       <li class="correcta">d) Para reservar direcciones para la dirección de difusión de esa subred y el ID de subred </li>
    </ol>
</div> 

<div class="contenedor">
   <p class="pregunta">
       3. Es necesario dividir en subredes una red de clas e B, de modo que soporte 100 subredes y 100 hosts/subred. ¿Cuál de las siguientes respuestas proporciona una combinación adecuada del número de bits de red, de subred y de host? (seleccione dos respuestas)
    </p>
    <ol class="repuestas">
        <li>a) Red = 16, subred=7, host=7 </li>
        <li class="correcta">b) Red= 16, subred=8, host=8 </li>
        <li class="correcta">c) Red =16, subred=9, host=7 </li>
        <li>d) Red = 8, subred= 7, host=17</li>
    </ol>


    <p class="pregunta"> 1. ¿Cuáles de los siguientes no son ID válidos de redes de clase A? (seleccione dos respuestas) </p>
    <ol class="repuestas">
        <li>a) 1.0.0.0</li>
        <li  class="correcta">b) 130.0.0.0</li>
        <li  class="correcta">c) 127.0.0.0</li>
        <li>d) 9.0.0.0</li>
    </ol>
    <p class="pregunta"> 2 ¿Cuál de los siguientes no es un ID válido de redes de clase B? </p>
    <ol class="repuestas">
        <li>a) 130.0.0.0</li>
        <li>b) 191.255.0.0</li>
        <li>c) 128.0.0.0</li>
        <li>d) 150.255.0.0</li>
        <li class="correcta">e) Todos son ID válidos de redes de clase B</li>
    </ol>
    <p class="pregunta"> 3) ¿Cuáles de las siguientes afirmaciones son ciertas acerca de la red correspondiente a la dirección IP 172.16.99.45?(seleccione dos respuestas </p>
    <ol class="repuestas">
        <li>a) El ID de red es 172.0.0.0</li>
        <li class="correcta">b)La red es una red de clase B</li>
        <li>c) La máscara predeterminada para la red es 255.255.255.0</li>
        <li class="correcta">d) El número de bits de host en la red no subdividida en subredes es 16</li>
    </ol>
    <p class="pregunta">4. ¿Cuáles de las siguientes afirmaciones son ciertas acerca de la red correspondiente a la dirección IP 192.168.6.7? (seleccione dos respuestas)</p>
    <ol class="repuestas">
        <li class="correcta">a) el id de red es 192.168.6.0</li>
        <li>b) La red es una red de clase B</li>
        <li class="correcta">c) La máscara predeterminada para la red es 255.255.255.0</li>
        <li>d) El número de bits de host en la red no subdividida en subredes es 16</li>
    </ol>
    <p class="pregunta">5. ¿Cuál de las siguientes es una dirección de difusión de red?</p>
    <ol class="repuestas">
        <li>a) 10.1.255.255</li>
        <li>b) 192.168.255.1</li>
        <li>c)224.1.1.255</li>
        <li class="correcta">d) 172.30.255.255</li>
    </ol>
    <p class="pregunta">6.¿Cuál de las siguientes es un ID de red de Clase A, B o C?</p>
    <ol class="repuestas">
        <li>a) 10.1.0.0</li>
        <li class="correcta">b) 192.168.1.0</li>
        <li>c) 127.0.0.0</li>
        <li>d)172.20.0.1</li>
    </ol>

</div>

<div class="contenedor">
        <table class="tabla">
            <tr>
                <th></th>
                <th>Dirección IP</th>
                <th>Clase</th>
                <th>Nº Octetos de Red</th>
                <th>Nº Octetos de HOST</th>
                <th>ID de RED</th>
                <th>Dirección de difusión de red</th>
            </tr>
            <tr> 
                <td>1</td>
                <td>1.1.1.1</td>
                <td>A</td> <!-- Clase -->
                <td>1</td> <!-- Octeros RED-->
                <td>3</td> <!-- Octetos HOST-->
                <td>1.0.0.0</td> <!-- ID RED -->
                <td>1.255.255.255</td> <!-- DIFUSION -->
            </tr>
            <tr>
                <td>2</td>
                <td>128.1.6.5</td>
                <td>B</td> <!-- Clase -->
                <td>2</td> <!-- Octeros RED-->
                <td>2</td> <!-- Octetos HOST-->
                <td>128.1.0.0</td> <!-- ID RED -->
                <td>128.255.255</td> <!-- DIFUSION -->
            </tr>
            <tr>
                <td>3</td>
                <td>200.1.2.3</td>
                <td>C</td> <!-- Clase -->
                <td>3</td> <!-- Octeros RED-->
                <td>1</td> <!-- Octetos HOST-->
                <td>200.1.2.0</td> <!-- ID RED -->
                <td>200.1.2.255</td> <!-- DIFUSION -->
            </tr>
            <tr>
                <td>4</td>
                <td>192.192.1.1</td>
                <td>C</td> <!-- Clase -->
                <td>3</td> <!-- Octeros RED-->
                <td>1</td> <!-- Octetos HOST-->
                <td>192.192.1.0</td> <!-- ID RED -->
                <td>192.192.1.255</td> <!-- DIFUSION -->
            </tr>
            <tr>
                <td>5</td>
                <td>126.5.4.3</td>
                <td>A</td> <!-- Clase -->
                <td>1</td> <!-- Octeros RED-->
                <td>3</td> <!-- Octetos HOST-->
                <td>126.0.0.0</td> <!-- ID RED -->
                <td>126.255.255.255</td> <!-- DIFUSION -->
            </tr>
            <tr>
                <td>6</td>
                <td>200.1.9.8</td>
                <td>C</td> <!-- Clase -->
                <td>3</td> <!-- Octeros RED-->
                <td>1</td> <!-- Octetos HOST-->
                <td>200.1.0.0</td> <!-- ID RED -->
                <td>200.1.9.255</td> <!-- DIFUSION -->
            </tr>
            <tr>
                <td>7</td>
                <td>192.0.0.1</td>
                <td>C</td> <!-- Clase -->
                <td>3</td> <!-- Octeros RED-->
                <td>1</td> <!-- Octetos HOST-->
                <td>192.0.0.0</td> <!-- ID RED -->
                <td>192.0.0.255</td> <!-- DIFUSION -->
            </tr>
            <tr>
                <td>8</td>
                <td>191.255.1.47</td>
                <td>B</td> <!-- Clase -->
                <td>2</td> <!-- Octeros RED-->
                <td>2</td> <!-- Octetos HOST-->
                <td>192.255.0.0</td> <!-- ID RED -->
                <td>192.255.255.255</td> <!-- DIFUSION -->
            </tr>
            <tr>
                <td>9</td>
                <td>223.223.0.1</td>
                <td>C</td> <!-- Clase -->
                <td>3</td> <!-- Octeros RED-->
                <td>1</td> <!-- Octetos HOST-->
                <td>223.223.0.0</td> <!-- ID RED -->
                <td>223.223.0.255</td> <!-- DIFUSION -->
            </tr>
        </table>

        <table class="tabla">
            <tr>
                <th>CLASE</th>
                <th>Valores del primer octeto</th>
                <th>Propósito</th>
            </tr>
            <tr> <td>A</td> <td>  1-126</td>   <td>UNIDIFUSION</td> </tr>
            <tr> <td>B</td> <td>128-191</td>   <td>UNIDIFUSION</td> </tr>
            <tr> <td>C</td> <td>192-223</td>   <td>UNIDIFUSION</td> </tr>
            <tr> <td>D</td> <td>224-239</td>   <td>MULTIDIFUSION</td> </tr>
            <tr> <td>E</td> <td>240-255</td>   <td>EXPERIMENTAL</td> </tr>
        </table>

        <table class="tabla">
            <tr><th></th> <th>Clase A</th>  <th>Clase B</th>    <th>Clase C</th> </tr>
            <tr> <td>Rango del primer octeto</td>               <td>1-126</td> <td>128-191</td> <td>192-223</td> </tr>
            <tr> <td>Números de red válidos</td>                <td>1.0.0.0 - 126.0.0.0</td> <td>128.0.0.0-191.255.0.0</td> <td>192.0.0.0 - 223.255.255.0</td> </tr>
            <tr> <td>Número total de redes</td>                 <td>126</td> <td>16384</td> <td>2097152</td> </tr>
            <tr> <td>Host por red</td>                          <td>16777214</td> <td>65534</td> <td>254</td> </tr>
            <tr> <td>Octetos (bits) en la parte de red</td>     <td>1</td> <td>2</td> <td>3</td> </tr>
            <tr> <td>Octetos (bits) en la parte de host</td>    <td>3</td> <td>2</td> <td>1</td> </tr>
            <tr> <td>Máscara predeterminada</td>                <td>255.0.0.0</td> <td>255.255.0.0</td> <td>255.255.255.0</td> </tr>
        </table>

</div>

</body>
</html>