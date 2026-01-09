## Práctica: Fundamentos de Clases y Objetos en Java
Esta práctica tiene como objetivo comprender la estructura fundamental de la Programación Orientada a Objetos (POO) en Java, utilizando como ejemplo un sistema de gestión de Cuenta Bancaria.

- Contenido de la Práctica
El código implementa los cuatro pilares básicos para construir una clase funcional:

1. Definición de Clase y Atributos (Estado)
Se define la clase CuentaBancaria como el molde principal. Se aplica el Encapsulamiento declarando los atributos como private, asegurando que el estado del objeto solo sea modificado mediante métodos autorizados.

2. Constructor (Inicialización)
Se implementa un constructor para inicializar los atributos al momento de la creación del objeto. Se utiliza la palabra reservada this para resolver la ambigüedad entre los nombres de los parámetros y los atributos de la clase.

3. Métodos (Comportamiento)
Se definen las capacidades del objeto:
- Consultar Saldo: Un método con tipo de retorno (double) que expone información de forma segura.
- Depositar: Un método de tipo void que incluye lógica de validación para modificar el estado del objeto.

4. Instanciación y Ejecución
En la clase Principal, se utiliza el operador new para reservar memoria en el Heap y transformar el molde en un objeto real capaz de ejecutar las instrucciones definidas.
