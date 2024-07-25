USE ventas;

#1 Calcula la cantidad total que suman todos los pedidos que aparecen en la tabla pedido
SELECT sum(total) FROM pedido;

#2 Calcula la cantidad media de todos los pedidos que aparecen en la tabla pedido
SELECT avg(total) FROM pedido;

#3 Calcula el numero todoa de comerciales distintos que aparecen en la tabla pedido.
SELECT count( distinct(id_comercial) ) FROM pedido;

#4 Calcula el numero total de clientes que aparecen en la tabla cliente
SELECT count( distinct(id) )  FROM cliente;

#5 Calcula cual es la mayor cantidad que aparece en la tabla pedido
SELECT max(total) FROM pedido;

#6 Calcula cual es la menos cantidad que aparece en la tabla pedido
SELECT min(total) FROM pedido;

#7 Calcula cual es el valor maximo de categoria para cada una de las ciudades que aparece en la tabla cliente
SELECT ciudad, max(categoria) FROM cliente group by ciudad;

#8 Calcula cual es el maximo valor de los pedidos realizados durante el mismo dia para cada uno de los clientes
# Es decir el mismo cliente puede haber realizado varios pedidos de diferentes cantidades el mismo dia
# Se pide que se calcule cual es el pedido de maximo valor para cada uno de los dias en los que un cliente 
# ha realizado un pedido. Muestra el identificador de cliente, nombre, apellidos, fecha y valor de la cantidad
SELECT p.fecha, max(p.total), c.id, c.nombre, c.apellido1, c.apellido2 
FROM cliente as c
INNER JOIN pedido as p ON c.id = p.id_cliente
GROUP BY p.id_cliente, p.fecha;

#9 Calcula cual es el maximo valor de los pedidos realizados durante el mesmo dia para cada uno de los cliente, 
# teniendo en cuenta que solo queremos mostrar aquellos pedidos que superen la cantidad de 2000 euros
SELECT max(p.total), c.nombre, c.apellido1, c.apellido2, p.fecha FROM pedido as p, cliente as c
WHERE c.id = p.id_cliente AND p.total >= 2000
GROUP BY p.fecha, c.id;

#10 Calcula el maximo valor de los pedidos realizados para cada uno de los comerciales durante 
# la fecha 2016-08-17. Muestra el identificador del comercial, nombre, apellidos y total
SELECT c.id, c.nombre, c.apellido1, c.apellido2, p.fecha, max(p.total) FROM comercial as c, pedido as p
WHERE c.id = p.id_comercial AND p.fecha LIKE '%2016-08-17%' GROUP BY c.id, p.fecha;