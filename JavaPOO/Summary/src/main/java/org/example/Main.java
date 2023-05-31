package org.example;
//errors left exists cause of all classes in same archive
public class Main {
    //
    /*
    * 1.Upcasting: Es el proceso de convertir un objeto de una clase hija a una clase padre.
    *  En otras palabras, se puede asignar un objeto de una clase hija a una variable de tipo
    *  de la clase padre. Por ejemplo:
    * */
    class Animal {
        void hacerSonido() {
            System.out.println("El animal hace un sonido");
        }
    }

    class Perro extends Animal {
        void hacerSonido() {
            System.out.println("El perro hace un ladrido");
        }
    }

    public class MainUno {
        public static void main(String[] args) {
            Animal animal = new Perro(); // Upcasting
            animal.hacerSonido(); // El perro hace un ladrido
        }
    }

   //--------------------------------------------------------------------
   /* 2.Downcasting: Es el proceso de convertir un objeto de una clase padre a una clase
   *  hija. Sin embargo, esto solo se puede hacer si el objeto originalmente era de la clase hija.
   *  Por ejemplo:
    */


    class AnimalDos {
        void hacerSonido() {
            System.out.println("El animal hace un sonido");
        }
    }

    class PerroDos extends Animal {
        void hacerSonido() {
            System.out.println("El perro hace un ladrido");
        }
    }

    public class MainDos {
        public static void main(String[] args) {
            AnimalDos animal = new PerroDos();
            PerroDos perro = (PerroDos) animal; // Downcasting
            perro.hacerSonido(); // El perro hace un ladrido
        }
    }

//-----------------------------------------------------------------------
    //En los dos casos anteriores, el metodo hacerSonido termina ejecutando el hacerSonido de la clase Perro.
//-----------------------------------------------------------------------
    /*
        3.Composición: Es un principio de diseño en POO que permite crear clases complejas mediante la
        combinación de objetos de otras clases como componentes. Por ejemplo:
     */

    class Motor {
        void encender() {
            System.out.println("El motor se ha encendido");
        }
    }

    class Auto {
        private Motor motor = new Motor(); // Composición

        void encenderAuto() {
            motor.encender();
            System.out.println("El auto se ha encendido");
        }
    }

    public class MainSeis {
        public static void main(String[] args) {
            Auto auto = new Auto();
            auto.encenderAuto(); // El motor se ha encendido, El auto se ha encendido
        }
    }

    /*
    Se trata de instanciar una clase hija DENTRO de la clase padre, para asi poder usar EN LA
    CLASE PADRE los metodos de la clase hija, en por ejemplo, metodos de la clase padre.
     */

//-----------------------------------------------------------------------
    /*
    4.Agregación: Es una forma especializada de composición en la que un objeto puede tener una
    relación todoparte con otro objeto, pero los objetos pueden existir de manera independiente.
    Por ejemplo:
     */



    class MotorDos {
        void encender() {
            System.out.println("El motor se ha encendido");
        }
    }

    class AutoDos {
        private MotorDos motor; // Agregación

        AutoDos(MotorDos motor) {
            this.motor = motor;
        }

        void encenderAuto() {
            motor.encender();
            System.out.println("El auto se ha encendido");
        }
    }

    public class MainCinco {
        public static void main(String[] args) {
            Motor motor = new MotorDos);
            Auto auto = new AutoDos(motor);
            auto.encenderAuto(); // El motor se ha encendido, El auto se ha encendido
        }
    }
    /*
    La diferencia en ell codigo, con respecto a la composicion, es que en la composicion se
    instancia la variable de tipo clase hija, dentro de la clase padre. En la agregacion, solo
    se declara la variable de tipo clase hija dentro de la clase padre. Se crea la variable,
    pero no se instancia (con el new <constructor>).
     */


    //-----------------------------------------------------------------------
    /* 5.Interfaces en Java:

    Una interfaz en Java es una colección de métodos abstractos (métodos sin implementación) que
    pueden ser implementados por cualquier clase que la implemente. Una interfaz define un contrato
    que las clases que la implementan deben seguir. En Java, se utiliza la palabra clave interface
    para declarar una interfaz.

    Aquí hay un ejemplo de una interfaz en Java llamada Drawable que define un método draw():
     */




    public interface Drawable {
        void draw();
    }

    //Luego, cualquier clase que implemente la interfaz Drawable debe proporcionar una implementación para el método draw().

    public class Circle implements Drawable {
        @Override
        public void draw() {
            System.out.println("Drawing a circle");
        }
    }

    public class Square implements Drawable {
        @Override
        public void draw() {
            System.out.println("Drawing a square");
        }
    }

    //En este ejemplo, tanto la clase Circle como la clase Square implementan la interfaz Drawable y proporcionan su propia implementación del método draw().

    //-----------------------------------------------------------------------
    /*
    6.Polimorfismo en Java y uso de las interfaces en el main:
    El polimorfismo es la capacidad de un objeto para comportarse como varios tipos diferentes.
    En Java, el polimorfismo se puede lograr a través del uso de interfaces y clases abstractas.
    Por ejemplo, considera el siguiente código:

    */

    public class MainCuatro {
        public static void main(String[] args) {
            Drawable drawable1 = new Circle();
            Drawable drawable2 = new Square();

            drawable1.draw(); // Output: Drawing a circle
            drawable2.draw(); // Output: Drawing a square
        }
    }
/*
    En este ejemplo, las variables drawable1 y drawable2 son declaradas como tipo Drawable,
    que es una interfaz. Sin embargo, en tiempo de ejecución, se les asignan instancias de
    las clases Circle y Square respectivamente, ambas de las cuales implementan la interfaz
    Drawable. Luego, se llama al método draw() en ambas variables, y se ejecutan las
    implementaciones específicas de cada clase, lo que muestra el polimorfismo en acción.

-----------------------------------------------------------------------

    En el constructor de una clase heredada, se puede poner el SUPER() (y si el constructor recibe algo por
    paramtros tambien habria que ponerselo en el parentesis del super), para que haga lo mismo que el
    constructor de la clase padre. Y despues dentro de un metodo de la clase hija, se puede usar el
    super.<variable> para recuperar variables de la clase padre



    En las interfaces los metodos no se desarrollan, solo se declaran. Se desarrollan en las clases que
    la implementan.
    Composicion es cuando INSTANCIAS una clase hija dentro de una clase padre. Agregacion es cuando solo
    la declaras dentro de la clase padre
    Un metodo abstracto en una clase abstracta hace el trabajo de una interfaz, pero solamente en esa
    clase. Se declara la funcion en la clase padre, sin implementacion, dado que esta se escribira en
    la clase hija, con el decorator OVERRIDE encima

-----------------------------------------------------------------------

    en Java se puede modificar la implementación de un método de una clase abstracta dentro de una clase
    concreta que hereda de la clase abstracta.


    Cuando una clase hereda de una clase abstracta, puede proporcionar una implementación para cualquier
    método abstracto definido en la clase abstracta. Para hacer esto, la clase concreta debe proporcionar
    una definición completa del método, incluyendo su cuerpo. La definición del método en la clase
    concreta debe coincidir en nombre, tipo de parámetros y tipo de retorno con la definición del método
    en la clase abstracta.

    Por ejemplo, considera la siguiente clase abstracta:
*/
    public abstract class ClaseAbstracta {
        public abstract void metodoAbstracto();
        public void metodoNoAbstracto() {
            System.out.println("Este es un método no abstracto en la clase abstracta.");
        }
    }

    //Esta clase define un método abstracto llamado metodoAbstracto() y un método no abstracto llamado metodoNoAbstracto().

    //Ahora, supongamos que tenemos una clase concreta que hereda de la clase abstracta anterior:

    public class ClaseConcreta extends ClaseAbstracta {
        @Override
        public void metodoAbstracto() {
            System.out.println("Este es el método concreto para el método abstracto definido en la clase abstracta.");
        }
    }
/*
    En esta clase, se proporciona una implementación para el método abstracto metodoAbstracto(),
    anotando el método con la anotación @Override para indicar que se está proporcionando una
    implementación de un método abstracto en la clase abstracta.


    En resumen, en Java se puede modificar la implementación de un método de una clase abstracta
    dentro de una clase concreta que hereda de la clase abstracta, siempre y cuando se proporcione
    una definición completa del método en la clase concreta.
 */

}