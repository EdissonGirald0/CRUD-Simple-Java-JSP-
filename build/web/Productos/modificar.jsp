
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Almacen</title>
    </head>
    <body>
        <h2>Modificar Registro</h2>
        <br/>
        <form action="ProductosController?accion=actualizar" method="POST" autocomplete="off">
            <input id="id" type="hidden" name="id" value='<c:out value="${producto.id}"/>'/>
            <p>
                Codigo:
                <input id="codigo" type="type" name="codigo" value='<c:out value="${producto.codigo}"/>'>
            </p>
            <p>
                Nombre:
                <input id="nombre" type="type" name="nombre" value='<c:out value="${producto.nombre}"/>'/>
            </p>
            <p>
                Precio:
                <input id="precio" type="type" name="precio" value='<c:out value="${producto.precio}"/>'/>
            </p>
           
            <p>
                Existencia:
                <input id="existencia" type="type" name="existencia" value='<c:out value="${producto.existencia}"/>'/>
            </p>
            <button type="submit"name="guardar" id="guardar">Guardar</button>
        </form>
    </body>
</html>
