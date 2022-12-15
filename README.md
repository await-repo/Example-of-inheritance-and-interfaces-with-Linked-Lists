## **Ejemplo de herencia e interfaces con Listas Ligadas**

Las siguientes clases **son las unicas que pueden crear instancias**, implemente cualquiera de las siguientes clases para ejecutar la clase **test** 

* **Lista simple ligada `linkedList`**
* **Lista simple doblemente ligada `doublyLinkedList`**
* **Lista circular simple ligada `circularLinkedList`**
* **Lista circular doblemente ligada `circularDoublyLinkedList`**

### **Herencia**

Es importante mencionar que las clases descritas en la lista de arriba heredan sus comportamientos de las siguientes dos clases (Dependiendo del tipo de lista será una sola clase la que heredan) 

* Para listas circulares **`circularList`**
* Para listas simples  **`simpleList`**

> #### **Nota**
> Las clases `circularList` y `simpleList` **no pueden ser instanciadas**, pero si pueden declararse variables de su tipo.

### **Implementación de interfaces**
Además de heredar de las clases descritas anteriormente, estas deben de implementar el metodo **`delete`** según sea el caso, para esto deberán implementar solo una de las siguientes dos interfaces (Dependiendo del tipo de Nodo de la lista)

* Para listas ligadas (única dirección **`interfaceSimpleList`**
* Para listas doblemente ligadas (doble dirección) **`interfaceDoublyList`**

> #### **Aclaración**
> Las clases `interfaceSimpleList` y `interfaceDoublyList` tienen un único método **`delete`**, aquí la duda ¿Por qué no utilizar una sola clase interface para implementar el metodo **delete**?, esto se debe a que las interfaces tienen una palabra reservada **`default`** para indicarle un cuerpo al método, de esta forma aunque las dos interfaces tienen el mismo método internamente funcionan diferente.

### **Lógica en la Jerarquía de clases**

Si queremos comprender las clases e interfaces que construyen un tipo especifico de lista podemos observar la siguiente tabla.

Lista general **(Clase abstracta)** | Tipo de lista **(Clase abstracta)** | Tipo de Nodo **(Interface)** | Lista resultante **(Clase concreta)**
--- | --- | --- | ---
`list` | `simpleList` (Simple) | `interfaceSimpleList` (Único) | `linkedList`
`list` | `simpleList` (Simple) | `interfaceDoublyList` (Doble) | `doublyLinkedList`
`list` | `circularList` (Circular) | `interfaceSimpleList` (Único) | `circularLinkedList`
`list` | `circularList` (Circular) | `interfaceDoublyList` (Doble) | `circularDoublyLinkedList`

Con el tipo de lista nos referimos a la conexion del primer Nodo con el ultimo Nodo.
> * **Simple:** Tiene un inicio y final
> * **Circular:** El final se conecta con el inicio

Con el tipo de nodo nos referimos a los apuntadores del Nodo

> * **Único:** El nodo solo apunta al siguiente Nodo
> * **Doble:** El nodo apunta a su Nodo anterior y al proximo Nodo

### **Tipos de Listas**

Para entender mejor las clasificaciones en los tipos de listas podemos decir que una lista simple tiene un inicio y un final mientras que en las listas circulares el primer Nodo esta ligado con el ultimo Nodo.

**Lista Simple** En la siguiente imagen podemos ver cómo se enlazan los nodos con el Nodo siguiente (Pueden tener un enlace o dos enlaces dependiendo del tipo de Nodo)

![Simple](https://user-images.githubusercontent.com/115047831/207787125-de59c66c-3e98-4ad2-a570-4f4c5ceb69ba.png)

**Lista Circular** En la siguiente imagen vemos que en la lista circular se conecta el inicio con el final (Pueden tener un enlace o dos enlaces dependiendo del tipo de Nodo)

![Circular](https://user-images.githubusercontent.com/115047831/207787409-543bef3c-5d1d-477f-94ac-026f9b020b35.png)

### **Tipos de Nodos**

Para comprender la clasificacion en los tipos de Nodos podemos decir que un Nodo único o simple es un Nodo que esta ligado hacía una dirección, cada Nodo tiene un unico Nodo que apunta hacia el próximo Nodo, mientras que un Nodo doble tiene dos apuntadores el primero apunta al Nodo anterior y el segundo apunta el proximo Nodo. 

**Nodo Simple** Un Nodo simple solo apuntará al siguiente Nodo

![Unique](https://user-images.githubusercontent.com/115047831/207787501-3af9c726-4cce-4120-8b49-2bac880bd026.png)

**Nodo Doble** Un Nodo doble conecta con sus nodos vecinos, el primer enlace conecta al Nodo previo y el segundo Nodo conecta al Nodo siguiente.

![Doble](https://user-images.githubusercontent.com/115047831/207787603-10792991-6d67-4c03-953a-11ed90acd389.png)

## Diagrama de clases con UML

> **Nota:** El siguiente diagrama de clases representa la lógica de programación utilizada para construir las listas ligadas, aquí podremos ver cómo heredan clases abstractas y cómo implementan interfaces.

![UML](https://user-images.githubusercontent.com/115047831/207787685-b96c4831-0b51-4731-81ec-af9edf0bcccb.png)

## Ejemplo de Uso

Existe una clase llamada **test** la cual tiene el objetivo de demostrar las funciones de las Listas Ligadas, esta clase contiene un metodo `main` donde dentro estarán las instancias de cualquier lista ligada, algo que debemos recordar es que las unicas clases que podemos utilizar para crear instancias son las clases que no son abstractas, recapitulando, las clases para crear instancias son las siguientes.

* **Lista simple ligada `linkedList`**
* **Lista simple doblemente ligada `doublyLinkedList`**
* **Lista circular simple ligada `circularLinkedList`**
* **Lista circular doblemente ligada `circularDoublyLinkedList`**

Si queremos tomar una lista simple podremos instanciar una variable de la siguiente forma:

```java
linkedList list = new linkedList();
```

Con la instancia `list` ahora podemos ejecutar los métodos que tiene una lista ligada, cabe destacar que todas las Listas Ligadas tienen las mismas funciones, solo que el proceso interno que utilizan es diferente dependiendo del tipo de ligadura al Nodo y forma de la Lista. A continuación se explicará el funcionamiento de los métodos más utilizados.

#### **Agregar Nodo**

Cuando agregamos un Nodo realmente primero recibimos el número que representa al Nodo, posteriormente creamos una instancia del Nodo para ser agregado a la lista. Si es el primer Nodo se añadirá al principio de la lista, si ya existen Nodos en la lista entonces el nuevo Nodo se agregará al final de la lista.

```java
public void add(int number)
```

#### **Eliminar el primer Nodo**

Este método elimina únicamente al Nodo inicial de la lista si coincide con el número de Nodo que queremos eliminar, lo seguira eliminando mientras el Nodo coincida con el Nodo que queremos eliminar y se encuentre al inicio.

```java
public void deleteFirst ()
```

#### **Eliminar el último Nodo**

Este método elimina únicamente al Nodo final de la lista si coincide con el número de Nodo que queremos eliminar, lo seguira eliminando mientras el Nodo coincida con el Nodo que queremos eliminar y se encuentre al final.

```java
public void deleteLast ()
```

#### **Eliminar Nodo**

Este método elimina un Nodo de cualquier posición, si el Nodo a eliminar coincide con un Nodo que está al inicio entonces se manda a llamar el metodo deleteFirst y si el Nodo esta al final de la lista entonces se llama al método deleteLast. Este método eliminará a todos los Nodos que concidan con el número que se desea eliminar.

```java
public default void delete(int number, list list) 
```

#### **Mostrar Lista**

El metodo show recorre la lista ligada de principio a fin y muestra su contenido.

```java
public void show();
```
