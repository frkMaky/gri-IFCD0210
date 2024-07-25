<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicios 27-06</title>
    <link rel="stylesheet" href="/gri/apuntes/css/estilos.css">
    <style>
        /** Clases auxiliares */
.negrita {
    font-weight: bold;
}
.azul {
    color:blue;
}
.solucion {
    margin: 0 auto;
    max-width: 90%;
    border: 1px solid gray;
    border-radius: 1rem;
    font-size: 2rem;
    padding: .5rem;
}
.pregunta {
    font-size: 2.2rem;
    padding: 1rem;
    margin: 0 auto;
    max-width: 90%;
    margin-bottom:1rem;
}

.respuesta {
    margin: 0 auto;
    max-width: 90%;
    border-bottom: 1px solid gray;
    background-color: rgba(255,255,255,.7);
    padding: 1rem 2rem;
    border-radius: 1rem;
    margin-bottom: 1rem;
    font-size: 1.8rem;
}
.correcta {
    font-weight: bold;
    color: blue;
}
        </style>
</head>
<body>

<div class="seccion">

    <h1 class="seccion-titulo">Ejercicio redes 6 > 20240626_165428.jpg </h1>

    <p class="seccion-parrafo">Determinar los valores de la máscara en los otros dos formatos</p>
    
    <table class="tabla">
        <tr>    <th>Prefijo </th>                <th>Máscara Binaria</th>                                         <th>Decimal</th>                              </tr>
        <tr>    <td> /18 </td>                   <td class="negrita"> 11111111 11111111 11000000 00000000 </td>   <td> 255.255.96.0     </td>                   </tr>
        <tr>    <td> /30 </td>                   <td> 11111111 11111111 11111111 11111100 </td>                   <td class="negrita"> 255.255.255.252  </td>   </tr>
        <tr>    <td class="negrita"> /25 </td>   <td> 11111111 11111111 11111111 10000000 </td>                   <td> 255.255.128.0     </td>                  </tr>
        <tr>    <td class="negrita"> /16 </td>   <td> 11111111 11111111 00000000 00000000 </td>                   <td> 255.255.0.0      </td>                   </tr>
        <tr>    <td> /8  </td>                   <td> 11111111 00000000 00000000 00000000 </td>                   <td class="negrita"> 255.0.0.0        </td>   </tr>
        <tr>    <td> /22 </td>                   <td class="negrita"> 11111111 11111111 11111100 00000000 </td>   <td> 255.255.252.0        </td>               </tr>
        <tr>    <td> /15 </td>                   <td> 11111111 11111110 00000000 00000000 </td>                   <td class="negrita"> 255.254.0.0      </td>   </tr>
        <tr>    <td class="negrita"> /27 </td>   <td> 11111111 11111111 11111111 11100000 </td>                   <td> 255.255.255.224  </td>                   </tr>
    </table>
        
</div>

<div class="seccion">

    <h1 class="seccion-titulo">Ejercicio Calculo de subredes redes 6 > 20240626_165525.jpg </h1>

    <p class="seccion-parrafo">IP 8.1.4.5 MASCARA 255.255.0.0 </p>
    
    <p class="solucion">
        Paso 1: Convertir la mascara a formato prefijo

        <pre>MASCARA 255.255.0.0 => /16</pre>
    </p>
    <p class="solucion">
        Paso 2: Determinar N según clase ( A 8 / B 16 / c 24)

        <pre>IP 8.1.4.5 => A => 8</pre>
    </p>
    <p class="solucion">
        Paso 3: P = N + S => S = P - N

        <pre>S = P - N = 16 - 8 = 8</pre>
    </p>
    <p class="solucion">
        Paso 4: 32 = P + H => H = 32 - p

        <pre>H = 32 - P = 32 - 16 = 16</pre>
    </p>
    <p class="solucion">
        Paso 5: Numero de hosts por subred = 2^H - 2

        <pre>2^16 - 2 =  65534  hosts por subred</pre>
    </p>
    <p class="solucion">
        Paso 6: Numero de subredes = 2^S

        <pre>2^8 =  256 subredes</pre>
    </p>

</div>

<div class="seccion">

    <h1 class="seccion-titulo">Ejercicio Calculo de subredes redes 6 > 20240626_165525.jpg </h1>

    <p class="seccion-parrafo">IP 200.1.1.1 MASCARA 255.255.255.252 </p>
    
    <p class="solucion">
        Paso 1: Convertir la mascara a formato prefijo

        <pre>MASCARA 255.255.255.252 => /30</pre>
    </p>
    <p class="solucion">
        Paso 2: Determinar N según clase ( A 8 / B 16 / c 24)

        <pre>IP 200.1.1.1 => C => 24</pre>
    </p>
    <p class="solucion">
        Paso 3: P = N + S => S = P - N

        <pre>S = P - N = 30 - 24 = 6</pre>
    </p>
    <p class="solucion">
        Paso 4: 32 = P + H => H = 32 - p

        <pre>H = 32 - P = 32 - 30 = 2</pre>
    </p>
    <p class="solucion">
        Paso 5: Numero de hosts por subred = 2^H - 2

        <pre>2^2 - 2 =  2  hosts por subred</pre>
    </p>
    <p class="solucion">
        Paso 6: Numero de subredes = 2^S

        <pre>2^6 =  64 subredes</pre>
    </p>

</div>

<div class="ejercicio">

<p class="pregunta">1. ¿Cuál de las siguientes respuestas indica el formato prefijo (CIDR) equivalente a 255.255.254.0?</p>
<ol class="respuesta">
    <li>a) /19</li>
    <li>b)/20</li>
    <li class="correcta">c)/23</li>
    <li>d)/24</li>
    <li>e)/25</li>
</ol>

<p class="pregunta">2. ¿Cuál de las siguientes respuestas indica el formato prefijo (CIDR) equivalente a 255.255.255.240?</p>
<ol class="respuesta">
    <li>a) /26</li>
    <li class="correcta">b) /28</li>
    <li>c) /27</li>
    <li>d) /30</li>
    <li>e) /29</li>
</ol>

<p class="pregunta">3. ¿Cuál de las siguientes respuestas indica el equivalente en notación decimal con puntos (DDN) de /24?</p>
<ol class="respuesta">
    <li>a) 255.255.240.0</li>
    <li>b) 255.255.252.0</li>
    <li class="correcta">c) 255.255.255.0</li>
    <li>d)255.255.255.192</li>
    <li>e) 255.255.255.240</li>
</ol>

<p class="pregunta">4.¿Cuál de las siguientes respuestas indica el equivalente en notación decimal con puntos (DDN) de /30?</p>
<ol class="respuesta">
    <li>a) 255.255.255.192</li>
    <li class="correcta">b) 255.255.255.252</li>
    <li>c) 255.255.255.240</li>
    <li>d) 255.255.254.0</li>
    <li>e) 255.255.255.0</li>
</ol>

<p class="pregunta">5. Mientras trabajamos en el departamento de soporte recibimos una llamada y averiguamos la dirección
IP y la máscara del PC de un usuario (10.55.66.77, máscara 255.255.255.0). Al pensar en esto utilizando
la lógica de redes con clase, determinamos el número de bits de red (N), de subred (S) y de host (H).
¿Cuál de las siguientes respuestas es cierta en este caso?</p>
<p class="respuesta">
    Paso 1: Convertir la mascara a formato prefijo  <span class="azul"> /24 </span> <br>
    Paso 2: Determinar N según clase ( A 8 / B 16 / c 24) <span class="azul"> A </span> <br>
    Paso 3: P = N + S => S = P - N <span class="azul"> S = 24 - 8 = 12 </span> <br>
    Paso 4: 32 = P + H => H = 32 - p <span class="azul"> H = 32 - 24 = 8  </span> <br>
</p>
<ol class="respuesta">
    <li>a) N = 12</li>
    <li>b) S = 12</li>
    <li class="correcta">c) H = 8</li>
    <li>d) S = 8</li>
    <li>e) N = 24</li>
</ol>

<p class="pregunta">6. Trabajando en el departamento de soporte recibimos una llamada y averiguamos la dirección IP y la
máscara del PC de un usuario (192.168.9.1/27). Al pensar en esto utilizando la lógica de redes con clase,
determinamos el número de bits de red (N), de subred (S) y de host (H). ¿Cuál de las siguientes respuestas
es cierta en este caso?</p>
<p class="respuesta">
    Paso 1: Convertir la mascara a formato prefijo           <span class="azul"> /27 </span> <br>
    Paso 2: Determinar N según clase ( A 8 / B 16 / c 24)    <span class="azul"> C </span> <br>
    Paso 3: P = N + S => S = P - N                           <span class="azul"> S = 27 - 24 = 3 </span> <br>
    Paso 4: 32 = P + H => H = 32 - p                         <span class="azul"> H = 32 - 27 = 5  </span> <br>
    Paso 5: Numero de hosts por subred = 2^H - 2             <span class="azul"> 2^5 - 2 = 30</span> <br>
    Paso 6: Numero de subredes = 2^S                         <span class="azul"> 2^3 = 8  </span> <br>
</p>
<ol class="respuesta">
    <li class="correcta" >a) N = 24</li>
    <li>b) S = 24</li>
    <li>c) H = 8</li>
    <li>d) H = 7</li>
</ol>

<p class="pregunta">7. Un ingeniero está pensando en las siguientes direcciones IP y máscara utilizando lógica de
direccionamiento IP sin clase: 10.55.66.77, 255.255.255.0. ¿Cuáles de las siguientes afirmaciones son
ciertas cuando se utiliza lógica de direccionamiento son clase? (Seleccione dos respuestas).</p>
<p class="respuesta">
    Paso 1: Convertir la mascara a formato prefijo           <span class="azul"> /24 </span> <br>
    Paso 2: Determinar N según clase ( A 8 / B 16 / c 24)    <span class="azul"> A </span> <br>
    Paso 3: P = N + S => S = P - N                           <span class="azul"> S = 24 - 8 = 16 </span> <br>
    Paso 4: 32 = P + H => H = 32 - p                         <span class="azul"> H = 32 - 8 = 5  </span> <br>
    Paso 5: Numero de hosts por subred = 2^H - 2             <span class="azul"> 2^5 - 2 = 30</span> <br>
    Paso 6: Numero de subredes = 2^S                         <span class="azul"> 2^3 = 8  </span> <br>
</p>
<ol class="respuesta">
    <li>a) El tamaño de la parte de red es de 8 bits.</li>
    <li class="correcta">b) La longitud del prefijo es de 24 bits</li>
    <li>c) La longitud del prefijo es de 16 bits</li>
    <li class="correcta">d) El tamaño de la parte de host es de 8 bits</li>
</ol>

<p class="pregunta">8. ¿Cuál de las siguientes afirmaciones es cierta acerca de los conceptos de direccionamiento IP sin clase?</p>
<ol class="respuesta">
    <li>a) Utiliza una dirección IP de 128 bits.</li>
    <li>b) Solo se aplica a las redes de clase A y B</li>
    <li>c) Descompone las direcciones IP en sus partes de red, subred y host.</li>
    <li class="correcta">d) Ignora las reglas de las redes de clase A, B y C</li>
</ol>

<p class="pregunta">9. ¿Cuáles de las siguientes máscaras, al ser utilizadas como la única máscara de una red de clase B,
proporcionarían suficientes bits de subred como para dar soporte a 100 subredes? (seleccione 2 respuestas)</p>
<p class="respuesta">
    2^S > 100 => 2⁷ 
</p>
<ol class="respuesta">
    <li class="correcta">a) /24  => 2^8 </li>
    <li class="correcta">b) 255.255.255.252 => /30 </li>
    <li>c) /20 => 2^4 </li>
    <li>d)255.255.252.0 => /22 => 2^6 </li>
</ol>

</div>
</body>
</html> 