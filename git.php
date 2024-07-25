<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Git Cheat Sheet</title>
    <style>
        * {
            box-sizing: border-box;
        }
        *::after,*::before {
            box-sizing: inherit;
        }
        html {
            font-size: 62.5%; /** 1rem = 10px */
        }
        .tituloPagina{
            text-align: center;
        }
        .tabla {
            border:1px solid gray;
            margin:0 auto;
            max-width: 95%;
            padding: 1rem;
        }
        .nombreColumna {
            text-align: center;
            padding-bottom: 1rem;
            border-bottom: 1px solid gray;
        }
        .titulo{
            text-align: center;
            background-color: rgba(0,0,0,.7);
            color: white;
            padding-top: 1rem;
        }
        .leyenda {
            text-align: left;
            padding-bottom: 1rem;
            padding-left: 3rem;
            background-color: rgba(255,255,255,.7);
            color: black;
        }
        .comando {
            text-align: center;
            padding: 1rem;
            background-color: rgba(0,0,0,.7);
            color: white;    
            font-size: 2rem;
            
        }

        .descripcion {
            text-align: left;
            padding: 1rem;
            padding-left: 2rem;
            background-color: rgba(255,255,255,.7);
            color: black;   
            font-size: 2rem; 
        }
    </style>
</head>
<body>

    <h1 class="tituloPagina">Git</h1>

    <table class="tabla">
        <tr>
            <th class="nombreColumna">Comando</th>
            <th class="nombreColumna">Descripción</th>
        </tr>

        <tr>
            <td colspan="2">
                <h3 class="titulo">SET UP</p>
                <p class="leyenda">Configurar la información del usuario utilizada en todos los repositorios locales</p>
            </td>
        </tr>
        <tr>
            <td class="comando">git config --global user.name “[firstname lastname]”</td>
            <td class="descripcion">establecer un nombre que sea identificable para el crédito al revisar el historial de versiones</td>
        </tr>

        <tr>
            <td class="comando">git config --global user.email “[valid-email]”</td>
            <td class="descripcion">establecer una dirección de correo electrónico que se asociará con cada marcador del historial</td>
        </tr>

        <tr>
            <td class="comando">git config --global color.ui auto</td>
            <td class="descripcion">configure el color automático de la línea de comando para Git para facilitar la revisión</td>
        </tr>
        <tr>
            <td colspan="2">
                <h3 class="titulo">SETUP & INIT</p>
                <p class="leyenda">Configurar información de usuario, inicializar y clonar repositorios</p>
            </td>
        </tr>
        <tr>
            <td class="comando">git init</td>
            <td class="descripcion">inicializar un directorio existente como un repositorio Git</td>
        </tr>

        <tr>
            <td class="comando">git clone [url]</td>
            <td class="descripcion">recuperar un repositorio completo desde una ubicación alojada a través de URL</td>
        </tr>
        <tr>
            <td colspan="2">
                <h3 class="titulo">STAGE & SNAPSHOT</p>
                <p class="leyenda">Trabajar con instantáneas y el área de preparación de Git</p>
            </td>
        </tr>
        <tr>
            <td class="comando">git status</td>
            <td class="descripcion">mostrar archivos modificados en el directorio de trabajo, preparados para su próxima confirmación</td>
        </tr>
        <tr>
            <td class="comando">git add [file]</td>
            <td class="descripcion">agregue un archivo tal como se ve ahora para su próxima confirmación (etapa)</td>
        </tr>
        <tr>
            <td class="comando">git reset [file]</td>
            <td class="descripcion">eliminar un archivo conservando los cambios en el directorio de trabajo</td>
        </tr>
        <tr>
            <td class="comando">git diff</td>
            <td class="descripcion">diferencia de lo que se cambia pero no se pone en escena</td>
        </tr>
        <tr>
            <td class="comando">git diff --staged</td>
            <td class="descripcion">diferencia de lo que está en escena pero aún no comprometido</td>
        </tr>
        <tr>
            <td class="comando">git commit -m “[descriptive message]”</td>
            <td class="descripcion">confirme su contenido preparado como una nueva instantánea de confirmación</td>
        </tr>
        <tr>
            <td colspan="2">
                <h3 class="titulo">BRANCH & MERGE</p>
                <p class="leyenda">Aislar el trabajo en sucursales, cambiar el contexto e integrar los cambios</p>
            </td>
        </tr>
        <tr>
            <td class="comando">git branch</td>
            <td class="descripcion">enumera tus sucursales. Aparecerá un * junto a la rama actualmente activa.</td>
        </tr>
        <tr>
            <td class="comando">git branch [branch-name]</td>
            <td class="descripcion">crear una nueva rama en el compromiso actual</td>
        </tr>
        <tr>
            <td class="comando">git checkout</td>
            <td class="descripcion">cambie a otra rama y compruébelo en su directorio de trabajo</td>
        </tr>
        <tr>
            <td class="comando">git merge [branch]</td>
            <td class="descripcion">fusionar el historial de la rama especificada con el actual</td>
        </tr>
        <tr>
            <td class="comando">git log</td>
            <td class="descripcion">mostrar todas las confirmaciones en el historial de la rama actual</td>
        </tr>
        <tr>
            <td colspan="2">
                <h3 class="titulo">INSPECT & COMPARE</p>
                <p class="leyenda">Examinar registros, diferencias e información de objetos.</p>
            </td>
        </tr>
        <tr>
            <td class="comando">git log</td>
            <td class="descripcion">mostrar todas las confirmaciones en el historial de la rama actual</td>
        </tr>
        <tr>
            <td class="comando">git log branchB..branchA</td>
            <td class="descripcion">muestra las confirmaciones en la ramaA que no están en la ramaB</td>
        </tr>
        <tr>
            <td class="comando">git log --follow [file]</td>
            <td class="descripcion">muestra las confirmaciones que cambiaron el archivo, incluso entre cambios de nombre</td>
        </tr>
        <tr>
            <td class="comando">git diff branchB...branchA</td>
            <td class="descripcion">muestra la diferencia de lo que está en la ramaA que no está en la ramaB</td>
        </tr>
        <tr>
            <td class="comando">git show [SHA]</td>
            <td class="descripcion">mostrar cualquier objeto en Git en formato legible por humanos</td>
        </tr>
        <tr>
            <td colspan="2">
                <h3 class="titulo">TRACKING PATH CHANGES</p>
                <p class="leyenda">Eliminación de archivos de versiones y cambios de ruta</p>
            </td>
        </tr>
        <tr>
            <td class="comando">git rm [file]</td>
            <td class="descripcion">elimine el archivo del proyecto y prepare la eliminación para confirmar</td>
        </tr>
        <tr>
            <td class="comando">git mv [existing-path] [new-path]</td>
            <td class="descripcion">cambiar una ruta de archivo existente y organizar el movimiento</td>
        </tr>
        <tr>
            <td class="comando">git log --stat -M</td>
            <td class="descripcion">mostrar todos los registros de confirmación con indicación de las rutas que se movieron</td>
        </tr>
        <tr>
            <td colspan="2">
                <h3 class="titulo">IGNORING PATTERNS</p>
                <p class="leyenda">Evitar la puesta en escena o la confirmación involuntaria de archivos</p>
            </td>
        </tr>
        <tr>
            <td class="comando"><pre>logs/
*.notes
pattern*/</pre></td>
            <td class="descripcion">Guarde un archivo con los patrones deseados como .gitignore con cualquiera de las cadenas directas
            coincidencias o globos comodín.</td>
        </tr>
        <tr>
            <td class="comando">git config --global core.excludesfile [file]</td>
            <td class="descripcion">Todo el sistema ignora el patrón para todos los repositorios locales.</td>
        </tr>
        <tr>
            <td colspan="2">
                <h3 class="titulo">SHARE & UPDATE</p>
                <p class="leyenda">Recuperar actualizaciones de otro repositorio y actualizar repositorios locales</p>
            </td>
        </tr>
        <tr>
            <td class="comando">git remote add [alias] [url]</td>
            <td class="descripcion">agregar una URL de git como alias</td>
        </tr>
        <tr>
            <td class="comando">git fetch [alias]</td>
            <td class="descripcion">busca todas las ramas de ese control remoto de Git</td>
        </tr>
        <tr>
            <td class="comando">git merge [alias]/[branch]</td>
            <td class="descripcion">fusionar una sucursal remota con su sucursal actual para actualizarla</td>
        </tr>
        <tr>
            <td class="comando">git push [alias] [branch]</td>
            <td class="descripcion">Transmitir confirmaciones de la sucursal local a la sucursal del repositorio remoto</td>
        </tr>
        <tr>
            <td class="comando">git pull</td>
            <td class="descripcion">buscar y fusionar cualquier confirmación de la rama remota de seguimiento</td>
        </tr>
        <tr>
            <td colspan="2">
                <h3 class="titulo">REWRITE HISTORY</p>
                <p class="leyenda">Reescribir ramas, actualizar confirmaciones y borrar historial</p>
            </td>
        </tr>
        <tr>
            <td class="comando">git rebase [branch]</td>
            <td class="descripcion">aplicar cualquier confirmación de la rama actual antes de la especificada</td>
        </tr>
        <tr>
            <td class="comando">git reset --hard [commit]</td>
            <td class="descripcion">borrar el área de preparación, reescribir el árbol de trabajo desde el compromiso especificado</td>
        </tr>
        <tr>
            <td colspan="2">
                <h3 class="titulo">TEMPORARY COMMITS</p>
                <p class="leyenda">Almacenar temporalmente archivos modificados y rastreados para cambiar de rama</p>
            </td>
        </tr>
        <tr>
            <td class="comando">git stash</td>
            <td class="descripcion">Guardar cambios modificados y preparados</td>
        </tr>
        <tr>
            <td class="comando">git stash list</td>
            <td class="descripcion">enumerar el orden de pila de los cambios de archivos escondidos</td>
        </tr>
        <tr>
            <td class="comando">git stash pop</td>
            <td class="descripcion">escribir trabajando desde la parte superior de la pila de alijo</td>
        </tr>
        <tr>
            <td class="comando">git stash drop</td>
            <td class="descripcion">descartar los cambios desde la parte superior de la pila de alijo</td>
        </tr>

    </table>
    
</body>
</html>