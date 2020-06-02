# Reinoso-Alex-Examen
Examen de plataformas web

Enunciado

Se desea generar una aplicación Web usando tecnología JEE para que permita el ingreso de Tickets de un parqueadero de vehículos y a su vez permita listar todos los tickets según un parámetro de busqueda (placa del véhiculo y cedula del cliente). Para este sistema web los requisitos nos dicen que un Cliente (cédula, nombre, dirección y teléfono) tiene muchos Vehiculos (placa, marca, modelo), y muchos vehículos estan asociado a un solo cliente; también, que un Ticket (número, fecha y hora de ingreso, fecha y hora de salida) tiene un Vehiculo asociado.

Indicaciones Generales

* Desarrollar una aplicación JEE basada en Servlets como controladores, Java Server Pages como vista y JavaBeans como modelo.

* La persistencia a la base de datos debe ser implementada usando Java Persistence Java con el patrón de diseño Data Access Object.

* Las consultas a la base de datos debe ser implementada usando JPQL o Criteria.

* Las tablas de la base de datos debe ser ejecutadas desde JEE.
Estructura de la base de datos:
![Estructura](https://github.com/aReinoso007/Reinoso-Alex-Examen.-/blob/master/imagenes/estructurabase.png)

* Los datos de los Clientes deben estar previamente ingresados en la base para lo cuál, se debe usar un Servlet.
Aqui tenemos la pagina para crear los Clientes
![Estructura](https://github.com/aReinoso007/Reinoso-Alex-Examen.-/blob/master/imagenes/crearCliente.png)

* Al momento de registrar un Ticket se debe insertar los datos del Ticket y Vehículo; además, se debe ingresar la cedula del cliente para asociar al vehículo.

Aqui podemos ver que se crea un usuario, en la parte de agregar vehiculos le pasamos el objeto Cliente y se crea el vehiculo en la base de datos, para ingresar el ticket le enviamos un objeto Vehiculo. 
![Estructura](https://github.com/aReinoso007/Reinoso-Alex-Examen.-/blob/master/imagenes/tickers.png)

* Al momento de listar los ticktes se debe visualizar la información del Ticket, Vehículo y Cliente. Los códigos no deben ser visualizados.

* Los códigos deben ser generados automáticamente. 

# Cosas que no me salieron
* Listar Clientes, Vehiculos y Tickets
* Ingresar Vehiculos y tickets


