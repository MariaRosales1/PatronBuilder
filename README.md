# Patron de diseño Builder

Es un tipo de patrón que pertenece a la categoría de creación de objetos. Consiste en separar la construcción de un objeto complejo de su representación, permitiendo que un mismo proceso de construcción pueda crear diferentes objetos complejos. Es decir, el encargado de crear el objeto ya no será el constructor de la clase sino que intervendran otras clases para hacer su función; de esta manera estas clases permitiran crear diferentes tipos de objetos e inicializar sus propiedades; c ada una de estas clases sera un "Builder" [1]. Esta separación de construcción y representación, sera posible porque estas clases encapsularan el proceso de como se crearan estos objetos internamente y como se almacenaran los valores de sus atributos; por ejemplo si una persona quiere crear un carro con unas características básicas, solo se necesitara crear un constructor builder de carros básicos, mandarlo a fabricar y finalmente recibirlo ya creado completamente; es transparente para la persona el proceso que se llevó a cabo para crear un objeto carro, como se almacenaron los valores de sus atributos y que operaciones se implementaron para obtener cada una de las funciones básicas del carro básico.

Cuando se menciona objeto complejo, se hace referencia a un objeto con una cantidad de atributos considerable, donde cada atributo es un objeto de otra clase, y sus configuraciones (métodos) varian según el tipo.

Antes de ver la implementación del patrón, se explicara detalladamente como son esas "clases" mencionadas y quien las manipula.
<p align="center"><img src="https://informaticapc.com/patrones-de-diseno/images/builder.jpg"></p>
La imagen se obtuvo de [2].

Las clases participantes para llevar a cabo el patrón Builder son:

**Builder**: una clase abstracta que se encargara de tener el proceso de construcción de un objeto, en esta estarán todos los métodos necesarios para su construcción.

**ConcreteBuilder**: Una clase que hereda de ClaseBuilder, la cual implementara los métodos del objeto según su tipo. Pueden haber mas clases que hereden de ClaseBuilder, esto dependerá de la cantidad de tipos de objetos complejos se requieran.

**Director**: Una clase que coordina los pasos que se deben llevar a cabo para la construcción de los objetos. Es decir, en esta se indicara el orden de los métodos de la ClaseBuilder. Por ejemplo el primer método será el de crear el objeto complejo.

**Producto**: La clase del objeto complejo a construir.

La persona donde podra obtener los objetos complejos creados será en la clase Main o Cliente:

**Main o Cliente**: La clase donde el usuario, al que generalmente se refiere cliente, podra crear Director y TipoConstructorBuilder. Una vez creados, con la ayuda de ellos, podra obtener y manipular cada uno de los objetos complejos construidos por dichas clases (Director y ConcreteBuilder).

## ¿Cuando se puede usar?

1. Creación constante de diferentes tipos de objetos complejos. Evitar que recordar los atributos de estos objetos para inicializarlos, la creación de objetos para estos atributos si es necesario. Se puede dejar a una clase coordinadora (director) y constructor(builder) esta tarea. 

2. Simplificar el código para la construcción de los objetos complejos. Dejar que las clases encargadas de creación hagan su función y el código sea mas entendible.

3. Cuando se quiere tener un control explícito en la creación de los objetos: que parte del objeto va primero, que función va primero para su construcción.

4. Encapusular el proceso de construcción de su representación.

## Desventajas

 1. Cada vez que se necesite un nuevo tipo de producto (objeto complejo), se necesita crear un nueva clase ConcreteBuilder. Si hay muchos tipos diferentes, se tendrián una cantidad considerable de estas clases.
 
 2. Podria no ser posible inicializar los atributos de un producto si se crea directamente, ya que el encargado de ello es la clase ConcreteBuilder cuando es llamado desde el director.
 
  [1]: https://albertcapdevila.net/patron-builder-csharp-net/
  [2]: https://danielggarcia.wordpress.com/2014/02/19/patrones-de-creacion-ii-patron-builder-constructor/
  [3]: https://informaticapc.com/patrones-de-diseno/
