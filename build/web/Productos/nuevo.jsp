
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Almacen</title>
    </head>
    <body>
        <h2>Nuevo Registro</h2>
        <br/>
        <form action="ProductosController?accion=insertar" method="POST" autocomplete="off">
            <p>
                Codigo:
                <input id="codigo" type="type" name="codigo">
            </p>
            <p>
                Nombre:
                <input id="nombre" type="type" name="nombre">
            </p>
            <p>
                Precio:
                <input id="precio" type="type" name="precio">
            </p>
           
            <p>
                Existencia:
                <input id="existencia" type="type" name="existencia">
            </p>
            <button type="submit"name="guardar" id="guardar">Guardar</button>
        </form>
    </body>
</html>
