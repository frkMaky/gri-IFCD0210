/**
Función: calcular_precio_total_pedido
Descripción: Dado un código de pedido la función debe calcular la suma
total del pedido. Tenga en cuenta que un pedido puede contener varios
productos diferentes y varias cantidades de cada producto.
Parámetros de entrada: codigo_pedido (INT)
Parámetros de salida: El precio total del pedido (FLOAT)*/
USE jardineria;

DELIMITER $$
CREATE FUNCTION calcular_precio_total_pedido (codPedido int) RETURNS decimal(10,2) READS SQL DATA
BEGIN 
	DECLARE resultado decimal (10,2);
    
    SET resultado  = (SELECT sum(precio_unidad * cantidad) FROM detalle_pedido WHERE codigo_pedido = codPedido);
    
    return resultado;
END $$
DELIMITER ;

SELECT calcular_precio_total_pedido(1);
SELECT calcular_precio_total_pedido(2);
SELECT calcular_precio_total_pedido(3);

/** 
Función: calcular_suma_pedidos_cliente
Descripción: Dado un código de cliente la función debe calcular la suma
total de todos los pedidos realizados por el cliente. Deberá hacer uso de
la función calcular_precio_total_pedido que ha desarrollado en el
apartado anterior.
Parámetros de entrada: codigo_cliente (INT)
Parámetros de salida: La suma total de todos los pedidos del cliente (FLOAT)
*/
DELIMITER $$
CREATE FUNCTION calcular_suma_pedidos_cliente(codCliente int) RETURNS decimal(10,2) READS SQL DATA
BEGIN 
	declare resultado decimal(10,2);

	set resultado = (
		SELECT  SUM( calcular_precio_total_pedido(pedido.codigo_pedido) )
		FROM pedido WHERE codigo_cliente = codCliente
    );
	
    return resultado;
END $$      
DELIMITER ;

SELECT calcular_suma_pedidos_cliente(1);

