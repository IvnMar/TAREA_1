# TAREA1
Proyecto Spring Boot
 
 Este es un proyecto básico de Spring Boot que devuelve un mensaje "Hola Spring" a través de un endpoint.

## Descripción de la Actividad

En esta actividad, seguí varios pasos para instalar y configurar las herramientas necesarias para el desarrollo de proyectos en Java. A continuación, detallo el proceso que seguí:

1. **Instalación del JDK**: Primero, descargué e instalé el **Java Development Kit (JDK)**. Una vez instalado, verifiqué la instalación ejecutando el comando:
 
   java -version
Esto me mostró la versión de Java instalada, asegurándome de que todo estuviera correcto.

Instalación de Maven: Luego, instalé Maven, que es la herramienta que me permite automatizar la construcción de proyectos y gestionar sus dependencias. Después de instalarlo, validé la instalación con el comando:


mvn -version
Esto me permitió confirmar que Maven estaba configurado correctamente en mi sistema.

Creación del proyecto con Spring Initializr: Usando Spring Initializr, creé un proyecto básico de Spring Boot con las dependencias de Spring Web. Seguí los pasos en la interfaz de Spring Initializr para generar un archivo ZIP que contiene la estructura del proyecto.

Agregando un controlador REST: Dentro de mi proyecto, añadí un controlador REST que devuelve el mensaje "¡Hola Spring!". Para esto, creé una clase en el paquete principal de mi aplicación y utilicé la anotación @RestController. Definí un método que maneja las solicitudes GET en el endpoint /hola.

Probando el endpoint: Una vez implementado el controlador, probé el endpoint accediendo a él a través de mi navegador en la siguiente dirección:

http://localhost:8080/hello