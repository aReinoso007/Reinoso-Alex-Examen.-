# Reinoso-Alex-Examen
Examen de plataformas web

Instrucciones iniciales:

1 Crear un proyecto en Eclipse e identificarlo con sus nombres completos, en el siguiente formato: Apellidos-Nombre-Examen. Por ejemplo: LeonParedes-Gabriel-Examen.

2 Crear un proyecto público en GitHub con el mismo nombre del punto anterior. No se debe agregar el README ni la LICENCIA.

3 Sincronizar el proyecto de Eclipse con el proyecto de GitHub (commit y push)

4 Desarrollar el examen.

5 Sincronizar el proyecto de Eclipse con el proyecto de GitHub (commit y push)

6 Subir al AVAC la URL del proyecto de GitHub.

Enunciado

Se desea generar una aplicación Web usando tecnología JEE para que permita el ingreso de Tickets de un parqueadero de vehículos y a su vez permita listar todos los tickets según un parámetro de busqueda (placa del véhiculo y cedula del cliente). Para este sistema web los requisitos nos dicen que un Cliente (cédula, nombre, dirección y teléfono) tiene muchos Vehiculos (placa, marca, modelo), y muchos vehículos estan asociado a un solo cliente; también, que un Ticket (número, fecha y hora de ingreso, fecha y hora de salida) tiene un Vehiculo asociado.

Indicaciones Generales

* Desarrollar una aplicación JEE basada en Servlets como controladores, Java Server Pages como vista y JavaBeans como modelo.

* La persistencia a la base de datos debe ser implementada usando Java Persistence Java con el patrón de diseño Data Access Object.

* Las consultas a la base de datos debe ser implementada usando JPQL o Criteria.

* Las tablas de la base de datos debe ser ejecutadas desde JEE.

* Los datos de los Clientes deben estar previamente ingresados en la base para lo cuál, se debe usar un Servlet (no es necesaria la interfaz gráfica).

* Al momento de registrar un Ticket se debe insertar los datos del Ticket y Vehículo; además, se debe ingresar la cedula del cliente para asociar al vehículo.

* Al momento de listar los ticktes se debe visualizar la información del Ticket, Vehículo y Cliente. Los códigos no deben ser visualizados.

* Los códigos deben ser generados automáticamente. 


