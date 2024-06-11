### **Résumer**

|Surcharge de méthode| Remplacement de méthode                                                                  |
|--------------------|------------------------------------------------------------------------------------------|
|Fournit une fonctionnalité permettant de réutiliser un nom de méthode avec différents paramètres| Utilisé pour remplacer un comportement dont la classe a hérité de la classe parent.      |
|Généralement dans une seule classe, mais peut également être utilisé chez un enfant| `Toujours dans deux classes` qui ont une relation enfant-parent ou une `relation IS`.    |
|`Doit avoir` des paramètres différents| `Doit avoir` les mêmes paramètres et le même nom                                         |
|Peut avoir différents types de retour| Doit avoir le même type de retour ou le même type de retour covariant (classe enfant).   |
|Peut avoir différents modificateurs d'accès (`privé, protégé, public`).| `Ne doit PAS` avoir un modificateur inférieur mais peut avoir un modificateur plus élevé |
|Peut lancer différentes expressions| `Ne doit PAS` lancer une exception vérifiée nouvelle ou plus large.                      |


### **Méthodes statiques**
+ Les `méthodes statiques` sont déclarées à l'aide du modificateur `static`.
+ `Les méthodes statiques ne peuvent pas` accéder directement aux méthodes d'instance et aux variables d'instance.
+ Ils sont généralement utilisés pour des opérations qui ne nécessitent aucune donnée provenant d'une instance de la classe (à partir de `this`).
+ Dans les « méthodes statiques », nous ne pouvons pas utiliser le mot-clé « this ».
+ Chaque fois que vous voyez une méthode « n'utilise pas de variables d'instance », cette méthode doit être déclarée comme une « méthode statique ».
+ Par exemple, main est une méthode statique et elle est appelée par la `JVM` lorsqu'elle démarre une application.

        class Calculator {
            public static void printSum(int a, int b) {
                sout("sum = " + (a+b));
            }
        }

        public class Main {

            public static void main(String[] args) {
                Calculator.printSum(5, 10);
                printHello(); // shorter form of Main.printHello();
            }

            public static void printHello() {
                sout("Hello");
            }

### **Méthodes d'instance**
+ Les « méthodes d'instance » appartiennent à une instance d'une classe.
+ Pour utiliser une « méthode d'instance », nous devons d'abord instancier la classe, généralement en utilisant le mot-clé « new ».
+ Les « méthodes d'instance » peuvent accéder directement aux méthodes d'instance et aux variables d'instance.
+ Les « méthodes d'instance » peuvent également accéder directement aux méthodes statiques et aux variables statiques.


        Class Dog {
            public void bark() {
                sout("woof");
            }

        public class Main {
            public static void main(String[] args) {
                Dog rex = new Dog(); // create instancce
                rex.bark(); // call isntance method
            }
        }