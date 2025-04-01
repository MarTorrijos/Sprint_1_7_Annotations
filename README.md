
## Descripción

Ejercicios pensados para practicar las annotations.

### Tecnologias usadas

- Java 23

- IntelliJ


***


## Nivel 1

<br>

EJERCICIO 1:

Crea una jerarquía de objetos con tres clases: Trabajador, TrabajadorOnline y TrabajadorPresencial.

La clase Trabajador tiene los atributos nombre, apellido, precio/hora, y el método calcularSueldo() que recibe como parámetro el número de horas trabajadas y lo multiplica por el precio/hora. Las clases hijas deben sobreescribirlo, utilizando @Override.

Desde el main() de la clase Principal, realiza las invocaciones necesarias para demostrar el funcionamiento de la anotación @Override.

En los trabajadores presenciales, el método para calcular su sueldo recibirá como parámetro el número de horas trabajadas al mes. A la hora de calcular el sueldo, se multiplicará el número de horas trabajadas por el precio/hora, más el valor de un atributo estático llamado gasolina que agregaremos en esta clase.

En los trabajadores online, el método para calcular su sueldo recibirá como parámetro el número de horas trabajadas al mes. A la hora de calcular el sueldo, se multiplicará el número de horas trabajadas por el precio/hora y se le sumará el precio de la tarifa plana de Internet, que será una constante de la clase TrabajadorOnline.

<br>

EJERCICIO 2:

Agrega a las clases hijas algunos métodos obsoletos (deprecated) y utiliza la anotación correspondiente. Invoca desde una clase externa los métodos obsoletos, suprimiendo mediante la anotación correspondiente los "warnings" por ser obsoletos.

<br>

## Nivel 2

<br>

EJERCICIO 1:

Crea una anotación personalizada que permita serializar un objeto Java en un archivo JSON. La anotación debe recibir el directorio donde se colocará el archivo resultante.

<br>

***


## Cómo ejecutarlo
Clona el repositorio o descarga el archivo zip, luego ábrelo en tu entorno de desarrollo integrado (IDE) preferido.
 
 
