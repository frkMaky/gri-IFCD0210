<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Apuntes Redes</title>
    <link rel="stylesheet" href="/gri/apuntes/css/estilos.css">
    
</head>
<body>

    <section class="seccion">
        <h1 class="seccion-titulo">Modelo RED TCP /IP</h1>
    
        <p class="seccion-parrafo">Un modelo de red, también denominado en ocasiones arquitectura de red o plano de red, hace referencia a un conjunto bastante exhaustivo de documentos.
            Individualmente, cada documento describe una pequeña función requerida para una red; en conjunto, estos documentos definen todo.
            </p>
        
        <p class="seccion-parrafo">Lo que tiene que suceder para que una red pueda funcionar. Algunos documentos definen un protocolo, que es un conjunto de reglas lógicas que los 
            dispositivos deben cumplir para poder comunicarse.</p>
    
        <p class="seccion-parrafo">De forma similar, podemos construir nuestra propia red (escribir nuestro propio software, construir nuestras propias tarjeta de red, etc.) para crear una red
        </p>
    </section>


    <section class="seccion">
        <h1 class="seccion-titulo">Panorámica del modelo de red TCP/IP</h1>

        <p class="seccion-parrafo">El modelo TCP/IP define y referencia una amplia colección de protocolos que permite a las computadoras comunicarse. Para definir un protocolo, TCP/IP utiliza una
            serie de documentos denominados RFC (Request For Comments, Solicitudes de Comentarios). (Puede encontrar esas RFC utilizando cualquier motor de búsqueda en línea).
            El modelo TCP/IP  también evita repetir el trabajo ya realizado por algún otro organismo  de normalización o por algún otro consorcio de fabricantes, haciendo 
            simplemente  referencia  a los estándares o protocólos creados por esos grupos. Por ejemplo, el IEEE (Institute of Electrical and Electronic Engineers, Instituto
            de Ingenieros Eléctricos y Electrónicos) define las LAN Ethernet; por ello, el modelo TCP/IP no define Ethernet en sus RFC, sino que hace referencia  a la 
            Ethernet IEE como opción </p>

        <p class="seccion-parrafo">Cada modelo descompone las funciones en una pequeña serie de categorías denominadas capas. Cada capa incluye  protocolos  y estándares relacionados con dicha 
            categoría de funciones. TCP/IP tiene, en realidad, dos modelos alternativos	
            </p>

        <table>
            <tr>
                <th>TCP/IP ORIGINAL </th>
                <th>TCP/IP ACTUALIZADO </th>
            </tr>
            <tr>
                <td>
                    APLICACION <br>
                    TRANSPORTE <br>
                    INTERRED   <br>
                    ENLACE
                </td>

                <td>
                    APLICACION  <br>
                    TRANSPORTE  <br>
                    RED         <br>
                    ENLACE DE DATOS <br>
                    FISICO      
                </td>
            </tr>
        </table>

        <table>
            <tr>
                <th>CAPA DE LA ARQUITECTURA TCP/IP </th>
                <th>PROTOCOLOS DEL EJEMPLO</th>
            </tr>
            <tr>
                <td>APLICACION</td> <td>HTTP, POP3, SMTP</td>
            </tr>

            <tr>
                <td>TRANSPORTE</td> <td>TCP, UDP</td>
            </tr>

            <tr>
                <td>INTERRED</td> <td>IP</td>
            </tr>

            <tr>
                <td>ENLACE</td> <td>Ethernet, PPP (Protocolo Punto a Punto)</td>
            </tr>
        </table>
    </section>

    <section class="seccion">
        <h1 class="seccion-titulo">CAPA DE APLICACION</h1>
        
        <p class="seccion-parrafo">Los protocolos de la capa de aplicacion TCP/IP proporcionan servicios software de aplicacion que se ejecuta en la computadora.
        </p>

        <h2>Terminología de encapsulación de datos</h2>

        <p class="seccion-parrafo">Cada capa añade su propia cabecera a los datos suministrados por la capa de nivel superior. El termino encapsulación hace referencia al proceso de añadir cabeceras
            (y en ocasiones colas) alrededor de ciertos datos.</p>

        <p class="seccion-parrafo">El proceso por el que el host TCP/IP envía los datos puede contemplarse como un proceso de cinco pasos. Los cuatro  primeros pasos se relacionan con la encapsulación realizada
            por las cuatro capas TCP/IP, mientras que el último paso consiste en la transmisión física real de los datos por parte del host. 
            </p>

        <p class="seccion-parrafo">De hecho, si utilizamos el modelo TCP/IP de cinco capas, cada uno de los pasos se correspondería con el papel de una capa. Los pasos se resumen en la siguiente lista:
        </p>

        <ul>
            <li>Paso 1. Crear y encapsular los datos de la aplicación con las cabeceras de la capa de aplicación requeridas. Por ejemplo, se puede devolver el mensaje OK HTTP en una cabecera HTTP, seguida por parte del contenido de una página web. </li>
            <li>Paso 2. Encapsular los datos asuministrados por la capa de aplicación dentro de una cabecerade la capa de transporte. Para aplicaciones de usuario final, se utiliza tipicamente una cabecera TCP o UDP.</li>
            <li>Paso 3. Encapsular los datos suministrados por la capa de transoorte dentro de una cabecera de la capa de red (IP). IP define las direcciones IP que identifican de manera univoca a cada computadora.</li>
            <li>Paso 4. Encapsular los datos suministrados por la capa de red dentro de una cabecera y una cola de la capa de enlace de datos. Esta capa utiliza tanto una cabecera como una cola.</li>
            <li>Paso 5. Transmitir los bits. La capa física codifica una señal sobre el medio con el fin de transmitir la trama.</li>
        </ul>

        <!-- IMAGEN -->
        <PRE>
        APLICACION 		1 | DATOS |
        TRANSPORTE 		2 | TCP || DATOS |
        RED 	   		3 | IP || TCP || DATOS |
        ENLACE DATOS 	        4 | ENLACE_DATOS || IP || TCP || DATOS || ENLACE_DATOS |
        </PRE>
    
        <h2>Nombre de los mensajes TCP/IP</h2>

        <p class="seccion-parrafo"><b>SEGMENTO, PAQUETE y TRAMAS </b></p>

        <p class="seccion-parrafo">	Cada término hace referencia a las cabeceras (y posiblemente a las colas) definidads por una determinada capa y a los datos encapsulados que siguen a esa cabecera. 
        </p>

        <pre>
            SEGMENTO para la capa de transporte 		| TCP || DATOS |		 		Segmento
            PAQUETE para la capa de red 			| IP || TCP || DATOS |	 		        Paquete	
            TRAMA para la capa de ENLACE_DATOS 			| CABECERA || IP || TCP || DATOS || COLA |	Trama
        </pre>
    </section>

    <section class="seccion">
        <h1 class="seccion-titulo">Comparación de OSI y TCP/IP</h1>

        <p class="seccion-parrafo">	El modelo OSI está compuesto por 7 capas y cada capa defineun conjunto de funciones de red típicas. Al igual que en TCP/IP, las capas OSI hacen referencia a múltiplles
            protocólos y estándares que implementan las funciones especificadas por cada capa. En otros casos, al igual que en TCP/IP, los comités de OSI no crearon  nuevos protocólos o 
            estándares, sino que hicieron simplemente referencia a otros protocólos que ya estaban definidos.</p>
        
        <table>
            <tr>
                <th>CAPAS OSI </th>
                <th>TCP/IP </th>
                <th>TCP/IP</th>
            </tr>
            <tr>
                <td>7 APLICACION</td>
                <td rowspan="3">5-7 APLICACION</td>
                <td rowspan="3">5-7 APLICACION</td>
            </tr>
            <tr>
                <td>6 PRESENTACION	</td>
            </tr>
            <tr>
                <td>5 SESION</td>
            </tr>
            <tr>
                <td>4 TRANSPORTE</td>
                <td>TRANSPORTE</td>
                <td>TRANSPORTE</td>
            </tr>

            <tr>
                <td>3 RED</td>
                <td>INTERRED</td>
                <td>RED</td>
            </tr>

            <tr>
                <td>2 ENLACE DE DATOS</td>
                <td rowspan="2">1-2 ENLACE</td>
                <td>ENLACE DE DATOS</td>
            </tr>
            <tr>
                <td>1 FISICA</td>
                <td>FISICA</td>
            </tr>
        </table>

        <p class="seccion-parrafo">7. CAPA DE APLICACION: interface entre el software de comunicaciones y cualquier aplicación que necesite comunicarse fuera de la computadora en la que la aplicación reside.
            También define procesos para la autenticación del usuario. </p>
        <p class="seccion-parrafo">6. CAPA DE PRESENTACION: definir y negociar formatos de datos, tales como texto ASCII, texto EBCDIC, binario, BCD y JPEG. El cifrado es un servicio de la capa de presentación.</p>
        <p class="seccion-parrafo">5. CAPA DE SESION: cómo comenzar, controlar y terminar conversaciones denominadas sesiones, inclueye el control y gestión de múltiples mensajes bidireccionales para que pueda notificarse a la aplicación en caso de que solo algunos de los mensajes de una serie se completen.</p>   
        <p class="seccion-parrafo">4. CAPA DE TRANSPORTE: proporciona un gran número de servicios, se centra en los aspectos relacionados con la entrega de datos a otra computadora(por ejemplo, recuperaación de errores y control de flujo)</p>
        <p class="seccion-parrafo">3. CAPA DE RED: dreccionamiento lógico, enrutamiento  (reenvío) y determinación de la ruta. El enrutamiento define el modo en el que los dispositivos (normalmente routers) reenvían paquetes a su destino final. El direccionamiento lógico define como puede tener cada dispositivo una dirección que pueda ser empleada por el proceso de enrutamiento. La determinación de la ruta hace referencia al trabajo realizado por los protocolos  de enrutamiento para descubrir todas las posibles rutas y seleccionar la mejor. </p>
        <p class="seccion-parrafo">2. CAPA ENLACE DE DATOS: define las reglas que determinan cuando un dispositivo puede enviar los datos a través de un medio concreto. Los protocolos de enlace de datos también definen el formato de una cabecera y una cola que permiten a los dispositivos conectados al medio enviar y recibir datos adecuadamente.</p>  
        <p class="seccion-parrafo">1. CAPA FISICA: hace referencia a estándares de otras organizaciones. Estos estandares tratan con las caracteristicas fisicas del medio de transmisión, incluyendo conectores, pines, uso de los pines, corrientes eléctricas, codificación, modulación óptica y las reglas acerca de como activar y desactivar el uso del medio físico.</p>
    
        <table>
            <tr>
                <th>NOMBRE DE LA CAPA</th>
                <th>PROTOCOLOS Y ESPECIFICACIONES</th>
                <th>DISPOSITIVOS</th>
            </tr>
            <tr>    <td>Aplicación, presentación, sesión (5-7)</td>   <td>Telnet, HTTP, FTP, SMTP, POP3, VoIP, SNMP</td>   <td>Host, Firewalls</td>   </tr>
            <tr>    <td>Transporte (4)</td>         <td>TCP, UDP</td>   <td>Host, Firewalls</td>   </tr>
            <tr>    <td>Red (3)</td>                <td>IP 		</td>   <td>Routers</td>   </tr>
            <tr>    <td>Enlace de Datos (2)</td>    <td>Ethernet (IEEE 802.3) HDLC</td>   <td>Switch, Lan, punto inhalambrico, modems....</td>   </tr>
            <tr>    <td>Física (1)</td>             <td>RJ-45. Ethernet (IEEE 802.3)</td>   <td>hub, lan  repetidores.....</td>   </tr>
        </table>

        <h2>Teminología de encapsulacion de OSI</h2>

        <p class="seccion-parrafo">Al igual que TCP/IP, cada capa OSI solicita servicios de la capa inmediatamente inferior. Para proporcionar los servicios, cada capa130h4ce uso de cabecera, y probablemente, de una cola. </p>

        <p class="seccion-parrafo">El modelo TCP/IP utiliza términos tales como segmento, paquete y trama para hacer referencia a diversas capas y a sus respectivos datos encapsulados. OSI utiliza un término más genérico: unidad de datos de protocolo  (PDU, Protocol Data Unit).</p>

        <p class="seccion-parrafo">Una PDU representa los bits que incluyen las cabeceras y las colas correspondientes a dicha capa , así como los datos encapsulados. Por ejemplo, un paquete IP, sería una PDU si empleamos la terminología OSI. De hecho, un paquete IP es una PDU de la capa 3 (abreviado como L3PDU), porque IP es un protocólo de la capa 3. Por tanto, en lugar de emplearlos términos  segmento, paquete o trama , OSI simplemente hace referencia a la "PDU de la Capa X" (LxPDU), donde "x" hace referencia al número de la capa de la que estemos hablando. </p>

        <pre>
            L7PDU  	|L7H| |DATOS|
            L6PDU	|L6H| |DATOS|	
            L5PDU	|L5H| |DATOS|
            L4PDU	|L4H| |DATOS|
            L5PDU	|L3H| |DATOS|
            L2PDU	|L2H| |DATOS| |L2T|
        </pre>

    </section>

    <section class="seccion">
        <h1 class="seccion-titulo">Direccionamiento IPV4 </h1>

        <p class="seccion-parrafo">	El direccionamineto IPv4, es sin duda, el tema 	más importante para los exámenes CCENT y CCNA</p>

        <h2>Reglas para las direcciones IP</h2>

        <p class="seccion-parrafo">Las direcciones IP consisten en un número de 32 bits, que usualmente se escribe utilizando la notación decimal con puntos (DDN). Cada byte (8bits) de la direccion IP de 32 bits se muestra mediante su equivalente en decimal. Los cuatro numeros decimales resultantes se escriben uno detrás de otro con puntos decimales separando los distintos números</p>

        <p class="seccion-parrafo">Cada número DDN tiene cuatro octetos decimales, separados por puntos. Puesto que cada octeto representa un numero binario de 8 bits, el rango de números decimales de cada octeto va de 0 a 255, ambos inclusive.</p>

        <p class="seccion-parrafo">Cada interface  de red utiliza una dirección IP distintiva. La mayoría  de las personas tienden a pensar que su computadora tiene una dirección IP, pero en realidad es la tarjeta de red de su computadora la que tiene dirección IP. Por ejemplo, si nuestro portátil tiene tanto una tarjeta de interfaz de red (NIC) Ethernet como una NICinhalámbrica, y las dos funcionan al mismo tiempo, ambas tarjetas tendrán una dirección IP diferente. De modo similar, los routers, que normalmentetienen múltiples interfaces de red que reenvian paquete IP, disponen de una dirección IP para cada interfaz.         </p>

        <h2>Reglas para agrupar direcciones IP</h2>

        <p class="seccion-parrafo">Las especificaciones originales  de TCP/IP agrupaban las direcciones IP en conjuntos de direcciones consecutivas denominadas redes IP. Las direcciones de una única red IP tienen el mismo valor numérico en la primera parte de todas las direcciones de red.         </p>

        <pre>
            8.1.1.1 -> | R1 <----------> R2 <-----> 
            8.1.1.2 -> |	
        
        RED 8.0.0.0 	RED 199.1.1.0 	REd 130.4.0.0	
        </pre>
        <ul>
            <li>Todas las direcciones IPv4 de un mismo grupo no deben estar separadas entre si por un router</li>
            <li>Las direcciones IP separadas entre si por un router deben pertenecer a grupos diferentes. </li>
        </ul>
        <p class="seccion-parrafo">De la misma forma, el enrutamiento depende de que todas las direccionesde una red IP  o una sibred IP se encuentren en la misma ubicación, esecificamente en una única instancia de un enlace de datos LAN o WAN. En caso contrario, los routers podrían terminar  entregando los paquetes IP a las ubicaciones incorrectas. </p>
        <p class="seccion-parrafo">Para cualquier interred TCP/IP, cada enlace LAN y WAN utilizará una red IP  o una subred IP, A continuación, vamos a examinar más en detalle los conceptos que subyacen a las redes IP, después de lo cual abordaremos  lo relativo a las subredes IP.</p>
    
        <h2>Redes IP de clas A, B y C</h2>

        <p class="seccion-parrafo">El espacio de direcciones IPv4 incluye todas las posibles combinaciones de números válidos para una dirección IPv4 de 32 bits. Existes 2^32 valores distintos para un número de 32 bits. Con valores DDN, estos números incluyen todas las combinacinesde los valores 0 a 255 en los cuatro octetos</p>
    
        <p class="seccion-parrafo">La clase A obtiene aproximadamente la mitad del espacio de direcciones IPv4, con todos los números DDN que comienzan por 1-126.</p>
        <p class="seccion-parrafo">La clase B obtiene un cuarto del espacio de direcciones, con todos los numero DDN que comienzan por 128-191</p>
        <p class="seccion-parrafo">La clase C obtiene un octavo del espacio de direcciones, con todos los numero DDN que comienzan por 192-223</p>

        <p class="seccion-parrafo">Las clases A, B y C definen direccciones IP de unidifusión, lo que quiere decir que cada dirección identifica a una única interfaz de host.</p>

        <p class="seccion-parrafo">La clase D define direcciones de multidifusión que se emplean para enviar un paquete a multiples host, mientras que la clas E define direcciones experimentales.</p>
    
        <p class="seccion-parrafo">Cada una de las redes de clase A soprta un gran número de direcciones IP (más de 16 millones de direccines host por cada red IP). Sin embargo, como cada red de la clase A  es tan grande, en la clase A no caben mas de 126 redes de clase A. La clase B define redes IP que disponen de 65534 direcciones por red pero tiene espacio para albergar más de 16000 de dichas redes. La clase C define redes IPmucho más pequeñas con 254 direcciones cada una,</p>
        
        <pre>
                          0 	RESERVADO
			1-126 	CLASE A 	UNIDIFUSION  
			127     RESERVADO 
			128-191 CLASE B 	UNIDIFUSION
			192-223 CLASE C 	UNIDIFUSION
			224-239 CLASE D 	MULTIDIFUSION
			240-255 CLASE E  	EXPERIMENTAL

			* división del espacio de direcciones IPv4 completo por clases

						A 			B 		C
		NUMERO DE REDES 		126 			16384 		2097152
		HOST POR RED 			16777214 		65534		254
        </pre>
        <p class="seccion-parrafo">
            El ID de red es simplemente un valor DDN reservado para cada red que identifica a la red IP. (El ID no puede ser utilizado por un host como una dirección IP)
        </p>

        <pre>
            CONCEPTO 							CLASE 				ID DE RED
            Todas las direcciones que comienzan por 8 			A 				8.0.0.0
            Todas las direcciones que comienzan por 130.4 		B 				130.4.0.0
            Todas las direcciones que comienzan por 199.1.1 	        C                               199.1.1.0
        
        	* Muchas personas utilizan el termino  ID de red, pero otras prefieren los términos número de red y dirección de red.
        </pre>

        <pre>
            Ejemplos de redes IPv4 de clase A.
            Concepto  							CLASE  ID de RED
            Todas las direcciones que comienzan por 8 			A 	8.0.0.0
            Todas las direcciones que comienzan por 13 			A 	13.0.0.0
            Todas las direcciones que comienzan por 24			A    	24.0.0.0
            Todas las direcciones que comienzan por 125			A  	125.0.0.0
            Todas las direcciones que comienzan por 126			A  	126.0.0.0
        </pre>

        <PRE>
            Ejemplos de redes IPv4 de clase B.
            Concepto  							CLASE  ID de RED
            Todas las direcciones que comienzan por 128.1 		B 	128.1.0.0
            Todas las direcciones que comienzan por 172.20		B	172.20.0.0
            Todas las direcciones que comienzan por 191.191		B    	191.191.0.0
            Todas las direcciones que comienzan por 150.1		B  	150.1.0.0
        </PRE>

        <pre>
            Ejemplos de redes IPv4 de clase C.
            Concepto  							CLASE  ID de RED
            Todas las direcciones que comienzan por 199.1.1 	        C 	199.1.1.0
            Todas las direcciones que comienzan por 200.1.200	        C	200.1.200.0
            Todas las direcciones que comienzan por 223.1.10	        C    	223.1.10.0
            Todas las direcciones que comienzan por 209.209.1	        C  	209.209.1.0        
        </pre>

        <pre>
            TODOS LOS POSIBLE NUMEROS DE RED VALIDOS 
            CLASE 			Rango del primer octeto 		Numeros de red válidos
            A 				1 a 126 				1.0.0.0 a 126.0.0.0
            B 				128 a 191  				128.0.0.0 a 191.255.0.0
            C 				192 a 223 				192.0.0.0 a 223.255.255.0
        </pre>

        <h2>Creacion de subredes IP</h2>

        <p class="seccion-parrafo">El proceso de creación de subredesdefine métodos para subdividir aún más  el espaciode direcciones IPv4 en grupos  que tengan un tamaño menos que el de una red IP. </p>

        <p class="seccion-parrafo">El proceso de creación de subredes IP define una forma  flexiblepara que cualquiera tome una única red IP de clas A, B o C y la subdivida en grupso aún más pequeños 
            de direcciones IP consecutivas. De hecho, el nombre subred es simplemente una manera de rederirse de forma abreviada a una red subdividida. De ese modo, es cada ubicación
            en la que solíamos utilizar una red completa de clase A, B o C  podemos emplear una subred más pequeña, desperdiciando así un menor número de direcciones IP. 
        </p>
        
        <p class="seccion-parrafo">	Ejercicio: Como resultado de la utilización de subredes, el ingeniero de red ha ahorrado muchas direcciones IP Cada subred tiene 254 direcciones, lo que debería proporcionar un 
            conjunto  de direcciones suficiente para lan, y más qu esuficiente  para los enlaces WAN. 
        </p>
        
        <p class="seccion-parrafo">	Cada interfax de host o de router tendrá una dirección  IP, Sin embargo, esas direcciones IP no habrán sido elegidas de formaa aleatoria, sino que estarán agrupadas con el fin de ayudar
            al proceso de enrutamiento. Los grupos de direcciones pueden ser un número de red completo  de clase A, B o C o pueden ser subredes
        </p>
    
        <h2>Protocolos de enrutamiento IPv4</h2>

        <p class="seccion-parrafo">En primer lugar, consideremos los objetivos de un protocolo de enrutamiento independientemente del modo en que el protocolo de enrutamiento funciona:
        </p>

        <ul>
            <li>Aprender dinamicamente las rutas hacia cada subred de la interred y rellenar la tabla de enrutamiento con esa información.</li>
            <li>Si no hay disponible mñas de una ruta hacia una misma subred, insertar en la tabla de enrutamiento  la mejor ruta.</li>
            <li>Detectar cuando dejan de ser válidas las rutas de la tabla y eliminarlas de la tabla de enrutamiento.</li>
            <li>Si se elimina una ruta de la tabla de enrutamiento  y hay disponible otra ruta a través de otro router vecino, añade esa ruta a la tabla de enrutamiento.</li>
            <li>Trabajar raìdamente al añadir  nuevas rutas o sustituir rutas perdidas. (El tiempo transcurrido entra que se pierde una ruta y se localiza  una sustituta que funcionese denomina tiempo de convergencia)</li>
            <li>Impedir los bucles de enrutamiento.</li>
        </ul>

        <p class="seccion-parrafo">PASO 1: Cada router, independientemente del protocolo de enrutamiento utilizado, añade una ruta  a su tabla de enrutamiento para cada subred conectada directamente al router.</p>
        <p class="seccion-parrafo">PASO 2: El protocolo de enrutamiento de cada router informa a sus vecinos  acerca de las rutas contenidas en su tabla de enruutamiento, incluyendo las rutas tanto directamente conectadas como las rutas aprendidas de otros router</p>
        <p class="seccion-parrafo">PASO 3: Despues de aprender una nueva ruta de un vecino, el protocolo de enrutamiento del router añade esa ruta a su tabla  de enrutamiento IP, siendo normalmente el router de siguiente saltode esa ruta el vecino del que se aprendio dicha ruta. </p>
        <p class="seccion-parrafo">EJEMPLO</p>
        <p class="seccion-parrafo">PASO A: La subred 150.150.4.0 existe como subred en la parte inferior de la figura, conectada al router R3</p>
        <p class="seccion-parrafo">PASO B: R3 añade a su tabla de enrutamiento IP una ruta conectada para la subred 150.150.4.0 (paso 1); esto sucede sin la ayuda del protocolo de enrutamiento)</p>
        <p class="seccion-parrafo">PASO C: R3 envía un mensaje de protocolo de enrutamiento , denominado actualizacion de enrutamiento a R2, haciendo que R2 aprenda acerca de la subred 150.150.4.0 (paso 2)</p>
        <p class="seccion-parrafo">PASO D: R2 añade una ruta para la subred 150.150.4.0 a su tabla de enrutamiento (paso 3)</p>
        <p class="seccion-parrafo">PASO E: R2 envía  una actualizacion similar de enrutamiento a R1, haciendo que R1 aprenda acerca de la subred 150.150.4.0 (paso2) </p>

        <h2>OTRAS CARACTERISTICAS DE LA CAPA DE RED</h2>

        <p class="seccion-parrafo">La capa de red TCP/IP define muchas funciones más hallá  de la función definida por el protocolo IPv4. Pos supuesto, IPv4 desempeña un papelfundamentalen las redes actuales, definiendo el direccionamiento IP y el enrutamiento IP. Sin embargo, otros protocolos y estándares definidos en otros documentos RFCdesempeñan también un papel importante para las funcionesde la capa de red.</p>

        <p>Por ejemplo, protocolos de enrutamientocomo OSPF existen como protocolos  separados, definidos en distintos documentos RFC.</p>
        <ul>
            <li>Sistema de nombres de dominio (DNS, Domain Name System)</li>
            <li>Protocolo de 	resolucion de direcciones (ARP, Addess Resolution Protocol)</li>
            <li>ping</li>
        </ul>
    </section>

    <section class="seccion">
        <h1 class="seccion-titulo">UTILIZACION DE NOMBRES Y EL SISTEMA DE NOMBRES DE DOMINIO</h1>

        <p class="seccion-parrafo">TCP/IP defineuna forma de utilizar nombres de host para identificar a otras computadoras. El usuario o bien no piensa nunca en la otra computadora o bien hacereferencia a ella utilizandosu nombre.
            Despues, los protocolos descubren dinamicamente toda la información necesaria para permitir comunicaciones basadas en dicho nombre. </p>

        <p class="seccion-parrafo">Por ejemplo, cuando abrimos un navegadorweb y escribimos el nombre de host www.google.es envia un paquete ip a una direccion IP utilizada por el servidor web de Google. TCP/IPnecesita una forma de permitir  a las computadoras determinar cual es la dirección IP utilizada por el nombre de host indicado y ese metodo empleal Sistema de Nombres de dominio (DNS)</p>

        <p class="seccion-parrafo">Las empresas utilizan el proceso DNS para resolver nombres y obtener la direccion IP correspondiente. En este caso , PC11, situado a la izquierda, necesita conectarse a un servidor llamado Server1.
            En algun punto, el usuario escribe el nombre server1 en alguna aplicacion de PC11 hace referencia a ese servidor utilizando su nombre. En el paso1, PC11 envia un mensaje DNS (una consulta DNS) al servidor DBS. En el paso 2, el servidor DNS devuelve una respuesta DNS que indica la dirección IP del Server1 En el paso3, PC11 puede ahora enviar un paquete IP a la dirección de destino 10.1.2.3 que es la dirección utilizada por Server1.</p>

        <img src="img/solicitudDNS.png" alt="Solicitud DNS básica de resolución de nombre">

        <p class="seccion-parrafo">Muestra una nube para la red TCP/IP, porque los detalles de la red incluyen routers, los routers tratan los mensajes DNS como cualquier otro paquete IP, enrutándolos segun su dirección IP de destino        </p>
    
        <p class="seccion-parrafo">En el paso 1 de la figura, la consulta DNS indicará como dirección de destinola dirección IP del servidor DNS, y todos los routers utilizarán esa dirección para reenviar el paquete. Para terminar, DNS define mucho más que unos cuantos mensajes, DNS define protocolos, así como estándares para los nombres de texto utilizados en todo el mundo, y un conjunto mundial de servidores DNS distribuidos. Los nombres de dominio que la gente utiliza todos los dias al navegar a la web, pre pueden ser similares a "www.ejemplo.com". Hay que señallar que no hay ningun servidor DNS que conozca todos los nombres de dominio y sus correspondientes IPs, sino que esa información está distribuida entre múltiples servidores DNS. En otras palabras, los servidores DNS de todo el mundo funcionan conjuntamente, reenviandose consultas unos a otros, hasta que el servidor que conoce la respuesta suministra la información deseada acerca de la dirección IP. </p>
            
        <h2>PROTOCOLO DE RESOLUCION DE DIRECCIONES</h2>

        <p class="seccion-parrafo">La lógica de enrutamiento IP requiere que los host y los routersencapsulen los paquetes IP dentro de tramas de la capa de enlace de datos. La figura muestra como todos los routers desencapsulan cada paquete IP y encapsulan el paquete dentro de una nueva trama de enlace de datos.
        </p>
        
        <p class="seccion-parrafo">En las LAN Ethernet, cuando un host o un router necesitan encapsular un paquete IP en una nueva trama Ethernet, el host o el router conocen todos los detalles importantes necesarios para construir esa cabecera, salvo la dirección MAC de destino. El host conoce la dirección IP del siguiente dispositivo, que puede ser la dirección IP de otro host o la dirección IP del router predeterminado. Un router conoce la ruta IP utilizada para reenviar el paquete IP, que indica cual es la dirección IP del siguiente router. Sin embargo, los host y los routersno conocen de antemano las direcciones MAC de los dispositivos vecinos. 
        </p>

        <p class="seccion-parrafo">TCP/IP define el Protocolo de resolución de direcciones (ARP) como el método por el cual cualquier host o routerde una LANpuede aprender dinámicamente  las direcciones MAC de otro router o host  IP situado en la misma LAN. ARP define un protocolo que incluye la Solicitud ARP, que  es un mensaje que realiza la solicitud simple "si esta es tu direccion IP , por favor respóndeme indicando  tu dirección MAC". ARP también define el mensaje Respuesta ARP que por supuesto indica tanto la dirección IP original como la dirección MAC correspondiente.
        </p>

        <p class="seccion-parrafo">La Solicitud ARP en forma de una difusión LAN, de modo que todos los hosts reciben la trama. A la derecha, en el Paso 2, el host PC2 devuelve una  Respuesta ARP, que identifica la dirección MAC de PC2. El texto que hay junto a cada mensaje muestra el contenido del propio mensaje ARP, que permite a PC2 aprender la dirección IP de R3 y su dirección MAC correspondiente, permite a R3 aprender la dirección IP de PC2 y su dirección MAC correspondiente 
        </p>

        <img src="img/arp.png" alt="Proceso ARP de ejemplo">

        <p class="seccion-parrafo">Observe que los host recuerdan los resultados ARP, manteniendo la información en su caché ARP o tabla ARP. Cada host o router solo necesita utilizar ARP ocasionalmente, para construir la caché ARP por primera vez. Cada vez que un host o un router necesita enviar un paquete encapsulado dentro de una trama Ethernet, comprueba primero su caché ARP, para ver si dispone de la dirección IP correcta y de su dirección MAC correspondiente. Los host y los routers permitiran que las entradas de la cache ARP  vayan caducando con el fin de limpiar la tabla, así que es posible que veamos Solicitudes ARP ocasionales. </p>
    
        <p class="seccion-parrafo">NOTA: Puede ver el contenidode la cache ARP en la mayoría de los sistemas operativos para PC utilizando el comando arp -a en el indicador de comandos
        </p>
    </section>

    <section class="seccion">
        <h1 class="seccion-titulo">Eco ICMP y el comando PING</h1>

        <p class="seccion-parrafo">Después de haber implementado una interred TCP/IP, necesitamos un modo de probar la conectividad IP básica, sin depender de que esté funcionando ninguna aplicación. La herramienta principal para probar la conectividad básica de red es el comando PING. </p>
    
        <p class="seccion-parrafo">PING (Packer Internet Groper) utiliza el Protocolo de mensajes de control Internet (ICMP) enviando un mensaje denominado "solicitud de eco ICMP" a otra dirección IP. La computadora con esa dirección IP debe responder con una respuesta de eco ICMP. Si eso funciona, habremos probado adecuadamente la red IP. En otras palabras, sabremos que la red puede enviar un paquete  de un host a otro y a la inversa. ICMP no depende de ninguna aplicación, por lo que simplemente comprueba la conectividad IP básica
        </p>

        <img src="img/ping.png" alt="Comando PING en una red ejemplo">

        <p class="seccion-parrafo">	Observe que aunque el comando PING utiliza ICMP, ICMP hace muchas otras cosas, ICMP definemuchos mensajes que los dispositivos pueden utilizar para ayudar a gestionar y controlar la red IP.
        </p>

        <p class="seccion-parrafo">APLICACIONES POPULARES Y SUS NUMEROS DE PUERTO BIEN CONOCIDOS
        </p>

        <pre>
            Número de Puerto		Protocolo 			Aplicación
            ----------------------------------------------------------------------
            20 				TCP 				Datos FTP
            21 				TCP 				Control FTP
            22 				TCP 				SSH
            23 				TCP 				Telnet
            25 				TCP 				SMTP
            53 				UDP, TCP 			DNS
            67, 68 			UDP 				DHCP
            69 				UDP 				TFTP
            80 				TCP 				HTTP (WWW)
            110 			TCP 				POP3
            161				UDP 				SNMP
            443 			TCP 				SSL
        </pre>
    </section>
</body>
</html>