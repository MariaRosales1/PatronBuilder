## Patron de diseño Builder

Es un tipo de patrón que pertenece a la categoría de creación de objetos. Este patron se usa para crear diferentes tipos de objetos complejos sin tener que cambiar la clase del objeto. De manera que se pueda separar la construcción de un objeto complejo de su representación.
La construcción de los objetos se realiza paso a paso. Donde se tiene un control de cada paso a seguir para su creación.

Para implementar el patrón se necesita crear por lo menos cinco clases: 

ClaseBuilder: una clase abstracta que se encargara de tener el proceso de construcción de un objeto, en esta estarán todos los métodos necesarios para su construcción.

TipoConstructorBuilder: Una clase que hereda de ClaseBuilder, la cual implementara los métodos del objeto según su tipo.

Director: Una clase que coordina los pasos que se deben llevar a cabo para la construcción de los objetos. Es decir, en esta se indicara el orden de los métodos de la ClaseBuilder. Por ejemplo el primer método será el de crear el objeto complejo.

Producto: La clase del objeto complejo a construir.

Main o Cliente: La clase donde el usuario, al que se refiere como cliente, podra crear Director y TipoConstructorBuilder. También podra obtener y manipular cada uno de los objetos complejos creados por las clases Director y TipoConstructorBuilder.

Veamos un diagrama de clase UML, ejemplificando lo mencionado:
<p align="center"><img src="https://informaticapc.com/patrones-de-diseno/images/builder.jpg"></p>



