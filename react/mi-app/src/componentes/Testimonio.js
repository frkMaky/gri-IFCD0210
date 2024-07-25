import React from "react";
import '../hojas-de-estilo/Testimonio.css';

function Testimonio (props){

    return (
        <div className="contenedor-testimonio">
            <img
                className="imagen-testimonio" 
                src={require(`../imagenes/${props.imagen}`)}
                alt={`${props.nombre}`}
            />
            <div className="contenerdor-texto-testimonio">
                <p className="nombre-testimonio"><b>{props.nombre}</b> en {props.pais}</p>
                <p className="cargo-testimonio">{props.cargo} en <b>{props.empresa}</b></p>
                <p className='texto-testimonio' dangerouslySetInnerHTML={{ __html: `"${props.testimonio}"` }} />
            </div>
        </div>
    );
}

export default Testimonio;

