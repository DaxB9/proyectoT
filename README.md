# Sistema de inventario y ventas de ropa
## Problema 
Una tienda de ropa lleva el registra su registro de sus ventas y su inventario en cuaderno. Esto conduce a problemas con el inventario y la contabilidad del establecimiento.

---

## Propuesta general de solucion 

Se propone una aplicacion web donde los usuarios pueden ver la ropa que se encuentra en stock. La aplicacion tambien proporcionaria la opcion de poder realizar conpras dentro de la misma pagina, estos podran ser recogidos en la misma tienda o ser enviados a una direccion proporcionada por el cliente. 


Para la administracion se podran añadir nuevos usuaros con sus respectivos acceso con la cual podran realizar las siguientes acciones: realizar modificaciones al inventario y gestionar los pedidos realizados por la pagina.  

---

## Valor para el negocio 
 
 Implementar un sistema de informacion que permita llevar un control de inventario mas eficaz y que facilite el registro de ventas. 

 ### Tangible 
 - Automatizar los procesos de registro de ventas 
 - Controlar el inventario evitando perdidas de productos

### Intangible 
- Mayor conformidad para los clientes y empleados 
- Mayor confianza en las transacciones

---

## Factibilidad (Análisis de riesgos)

### Economica 

- El sistema tendra un costo 15500 Bs.

### Técnica 

- Se realaizara el diseño de interfaces de usuarios intuitivas 
- Se implementara el backend en el 
framework de Java, Spring Boot 
- Se diseñara la base de datos en Postgresql 
- Se implementara el frontend en el framework Angular en su version 13.0

---

## Listado de requerimientos con historias de usuario 

### Historias de Usuario

---

#### [001 - Inicio de Sesion]
**Fecha**: 13/09/2022   
**Prioridad**: ALTA
 

#### Narrativa 

Como *usuario* debo tener acceso sistema mediante un formulario en la pagina web, proporcionando mis datos como usuario y password de forma que ya pueda empezar a usar el sistema y pueda utilizar las herramientas que ofrece.

 #### Dependencia

 Depende de  Registro de Usuario #4


---

#### [002 -  Registro de nuevos productos]

**Fecha**: 13/09/2022  
**Prioridad**: ALTA

#### Narrativa 

Como *administrador* quiero agregar nuevos productos mediante la página, conociendo datos como precio, cantidad y codigo. 

---

### [003 - Venta de productos]

**Fecha**: 13/09/2022  
**Prioridad**: ALTA

#### Narrativa 

Como *Empleado* quiero realizar ventas mediante la página web que se entragaran directamente en la tienda de forma que  el *cliente* pueda recibir los productos. 

---

### [004 - Registro de empleados]

**Fecha**: 13/09/2022  
**Prioridad**: ALTA

#### Narrativa 

Como *Administrador* quiero poder agregar empleados con sus datos como nombre, ci, usuario, password de forma que ellos puedan acceder al sistema para administrar ciertos aspectos. 

---

### [005 - Registro de cliente]

**Fecha**: 13/09/2022 
**Prioridad**: ALTA

#### Narrativa 

Como *cliente* debo tener acceso sistema mediante un formulario en la pagina web, proporcionando mis datos como nombre, ci, direccion, email,telefono, usuario y password de forma que ya pueda empezar a usar el sistema.

---

### [006 - Administracion de Inventario]

**Fecha**: 13/09/2022 
**Prioridad**: ALTA

#### Narrativa 

Como *Administrador* quiero agregar, editar o eliminar los productos que se muestren dentro de la tienda de forma que se muestren siempre un catalogo acorde con lo que tenemos en la tienda. 

---

### [007 - Reportes de Ventas]

**Fecha**: 13/09/2022
**Prioridad**: Media 

#### Narrativa 

Como *Administrador* quiero ver reportes de los productos más vendidos, productos sin stock de forma que pueda tomar las decisiones pertinentes al respecto. 

#### Dependencia 

Esta historia depende de Venta de productos
Administracion de Inventario

---

### [008 - Ofertas]

**Fecha**: 13/09/2022
**Prioridad**: ALTA 
 
 #### Narrativa 

 Como *Administrador* quiero poner ofertas a los productos que no se venden. 
 
 #### Dependencia 

Reporte de Ventas
Administracion de Inventario

---

### [009 - Reportes sobre Empleados]

**Fecha**: 13/09/2022
**Prioridad**: Media

#### Narrativa 

Como *Administrador* quiero ver reportes sobre los empleados en base a las ventas realizadas que hicieron de forma que pueda tomar desiciones al respecto. 

#### Dependencia 

Dependene de Reporte de Ventas, 
Registro de empleados
 
---

### [010 - Cancelacion de producto]

**Fecha**: 13/09/2022
**Prioridad**: Media

#### Narrativa 

Como *Cliente* quiero cancelar productos realizados en la pagina web dando un justificativo de forma que no perjudique a la tienda. 

#### Dependencia 

Registro de ventas

---

### [011 - Pedido de productos]

**Fecha**: 13/09/2022
**Prioridad**: Media

### Narrativa

Como *Empleado* quiero realizar el pedido de productos que no esten en stock en la tienda y se encuentre disponible en el almacen.

###  Dependencias
 Administracion de Inventario

--

### [013 - Lista de productos]

**Fecha**: 13/09/2022
**Prioridad**: Media

### Narrativa

Como *Cliente* quiero realizar una lista de los productos que deseo realizar su pedido. 


### Dependencias

Administracion de Inventario
Registro de Cliente

--

### [013 - Gestion de pedidos]

**Fecha**: 13/09/2022
**Prioridad**: Media

### Narrativa

Como *Empleado* quiero ver la lista de productos de cada pedido y asi preparar dichos productos para su envio 


### Dependencias

Registro de clientes
Registro de empleado
Lista de productos
