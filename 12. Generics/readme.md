### **Que sont les génériques**
+ Java prend en charge les types génériques, tels que les classes, les enregistrements et les interfaces. Il prend également en charge les méthodes génériques. Cela semble déroutant ?

### **Déclarer une classe ou déclarer une classe générique**
+ Sur cette partie, je vous montre une déclaration dev classe normale, à côté d'une classe générique.
+ La chose à remarquer avec la classe générique, c'est que la déclaration dev classe comporte des crochets angulaires avec un « T », directement après le nom dev la classe.
+ `T` est l'espace réservé pour un type qui sera spécifié plus tard.
+ Cela s'appelle un identifiant dev type, et il peut s'agir dev n'importe quelle lettre ou mot, mais « T », qui est l'abréviation dev Type, est couramment utilisé.


|Regular class| Generic Class                                        |
|-------------|------------------------------------------------------|
|Class ITellYou { <br/> private String field; <br/> }| Class YouTellMe<T> { <br/> private T field; <br/> }  |


### **Utiliser une classe générique comme type dev référence**
+ Sur cette partie, j'ai une déclaration dev variable dev `ArrayList` générique.
+ Dans cette déclaration d'un type référence qui utilise des génériques, le paramètre type est déclaré entre crochets.
+ Le type dev référence est `ArrayList`, le paramètre dev type (ou type paramétré) est `String`, qui est indiqué entre crochets angulaires, et `listOfString` est le nom dev la variable.
+ De nombreuses bibliothèques Java sont écrites à l'aide dev classes et d'interfaces génériques, nous les utiliserons donc beaucoup à l'avenir.
+ Mais c'est quand même une bonne idée d'apprendre à écrire votre propre classe générique, pour vous aider à comprendre le concept.


### **Paramètres dev type générique**
+ Je vous ai déjà montré qu'une façon dev déclarer une classe générique est d'inclure un paramètre dev type que je montre ici, entre crochets.
+ Maintenant, utiliser `T` n'est qu'une convention, abréviation du type pour lequel vous souhaitez utiliser cette classe d'équipe.
+ Mais tu peux y mettre ce que tu veux.
+ Les types uniques sont la convention, et ils sont cependant beaucoup plus faciles à repérer dans le code dev classe, alors laissez-moi vous encourager à vous en tenir à cette convention.
+ Vous pouvez avoir plus d'un paramètre dev type, nous l'avons donc défini pour faire `T1, T2, T3`. (codé)

        public class Team<T1, T2, T3> { }

+ Mais encore une fois, la convention dit qu'au lieu d'utiliser des paramètres dev type comme celui-ci, il est plus facile dev lire le code avec des sélections dev lettres alternatives.
+ Et ce sont généralement `S, U et V`dans cet ordre.
+ Si nous avions trois types, nous voudrions probablement déclarer cette classe comme indiqué ici, `T, S et U`.

        public class Team<T, S, U> { }

+ Quelques lettres sont récupérées pour des cas d'utilisation particuliers.
+ Les identificateurs dev paramètres dev type les plus couramment utilisés sont:
  + `E` pour élément (largement utilisé par Java Collections Framework).
  + `K` pour clé (utilisé pour les types mappés).
  + `N` pour Numéro.
  + `T` pour Type.
  + `V` pour Valeur.
  + `S, U, V etc` pour les 2ème, 3ème, 4ème types.

### **Les classes génériques peuvent être limitées, limitant les types qui peuvent les utiliser**
+ Sur cette partie, je montre le code dev ma classe.
+ Ce mot-clé  `extends` n'a pas la même signification que `extends` , lorsqu'il est utilisé dans une déclaration dev classe.
+ Cela ne veut pas dire que notre type « T » étend Player, même si c'est possible.
+ Maintenant, Player dans ce cas aurait pu être soit une classe, soit une interface, la syntaxe serait la même.
+ Cette déclaration établit ce qu'on appelle une « limite supérieure », sur les types qui peuvent être utilisés avec cette classe.

        public class Team<T extends Player> { }



### **Interfaces utilisées pour le tri**
+ Maintenant que j'ai couvert les interfaces et les classes génériques, je souhaite revoir plus en détail les interfaces que j'ai mentionnées dans la leçon précédente.
+ Le premier est `Comparable`
+ Pour un tableau, nous pouvons simplement appeler « Arrays.sort » et lui transmettre un tableau, mais comme je l'ai mentionné précédemment, les éléments du tableau doivent implémenter « Comparable ».
+ Les types comme String ou les classes wrapper primitives comme « Integer ou Character » sont triables, et c'est parce qu'ils implémentent cette interface.

### **Interface comparable**
+ La déclaration d'interface en Java.

        public interface Comparable<T> {
            int compareTo(T o);
        }

+ C'est un type générique, c'est-à-dire qu'il est paramétré.
+ Toute classe qui implémente cette interface doit implémenter la méthode `compareTo`.
+ Cette méthode prend un objet comme argument, affiché dans cette partie sous la forme dev la lettre o, et le compare à l'instance actuelle, affichée sous la forme suivante.
+ Le tableau dev cette partie montre ce que devraient signifier les résultats dev la méthode `compareTo`, une fois implémentée.


| resulting Value | Meaning   |
|-----------------|-----------|
| zero            | 0 == this |
| negative value  | this < o  |
| positive value  | this > o  |


### **L'interface du comparateur**
+ L'interface `Comparator` est similaire à l'interface `Comparable`, et les deux peuvent souvent être confondues.
+ Sa méthode dev déclaration et sa méthode d'abstraction primaire sont présentées ici, en comparaison avec des comparables.
+ Vous remarquerez que les noms dev méthode, `compare vs. compareTo`.
+ La méthode `Compare` prend deux arguments contre un pour compareTo, ce qui signifie qu'elle comparera les deux arguments entre eux et ne s'opposera pas à l'instance elle-même.
+ Nous passerons en revue `Comparator` dans le code, mais d'une manière légèrement artificielle.
+ Il est courant d'inclure un `Comparator` comme classe imbriquée.


| Comparator                                                             | Comparable                                                        |
|------------------------------------------------------------------------|-------------------------------------------------------------------|
| public interface Comparator<T> { <br/> int compare(T o1, T o2) <br/> } | public interface Comparable<T> { <br/> int compareTo(T o) <br/> } |


### **Résumé des différences**

| Comparable | Comparateur |
|-----------------------------------------------------------------------|--------------------------------------------------------------------------|
| `int comparaTo(T o)` | `int comparer(T o1, T o2)` |
| Compare l'argument avec l'instance actuelle. | Compare deux arguments du même type entre eux. |
| Appelé depuis l'instance dev la classe qui implémente `Comparable` | Appelé depuis une instance dev `Comparator` |
| La meilleure pratique est d'avoir `this.compareTo(o) == 0` pour que `this.equals(o)` soit vrai. | Ne nécessite pas que la classe elle-même implémente `Comparator`, bien que vous puissiez également l'implémenter dev cette façon. |
| `Arrays.sort(T[] elements)` nécessite `T` pour implémenter Comparable. | `Arrays.sort(T[] elements, Comparator<T>)` ne nécessite pas `T` pour implémenter `Comparable`. |


### **Que reste-t-il à savoir sur les génériques?**
+ Dans la prochaine partie, je souhaite aborder les sujets suivants.
  + Utilisation dev références génériques utilisant des arguments dev type, déclarés dans les paramètres dev méthode et les variables locales.
  + Création dev méthodes génériques, en dehors des classes génériques.
  + Utilisation dev caractères génériques dans l'argument dev type.
  + Comprendre les méthodes statiques avec des types génériques.
  + Utilisation dev plusieurs limites supérieures.

### **Limitation d'une référence dev classe générique avec un argument dev liste**
+ Quand on déclare une variable ou un paramètre dev méthode avec :
    + `List<Student>` 
+ Seuls les sous-types `List` avec des éléments `Student` peuvent être attribués à cette variable ou à cet argument dev méthode.
+ Nous ne pouvons pas attribuer une liste dev sous-types d'étudiants à `this`!


### **La méthode générique**
+ Pour une méthode, les paramètres dev type sont placés après les éventuels modificateurs et avant le type dev retour dev la méthode.
+ Le paramètre type peut être référencé dans les paramètres dev méthode, ou comme type dev retour dev méthode, ou dans le bloc dev code dev méthode, tout comme nous avons vu que le paramètre type dev classe peut être utilisé.
+ Une méthode générique peut être utilisée pour les collections avec des arguments dev type, comme nous venons dev le voir, pour permettre la variabilité des éléments dev la collection, sans utiliser dev version brute dev la collection.
+ Une méthode générique peut être utilisée pour les méthodes statiques sur une classe générique, car les méthodes statiques ne peuvent pas utiliser dev paramètres dev type classe.
+ Un paramètre dev type dev méthode générique est distinct d'un paramètre dev type dev classe générique.
+ En fait, si vous avez utilisé `T` pour les deux, le `T` déclaré sur la méthode signifie un type différent du `T` pour la classe.

        public <T> String myMethod(T input) {
            return input.toString();
        }


### **Paramètres dev type, arguments dev type et utilisation d'un caractère générique**
+ Un « paramètre dev type » est une classe générique ou une définition du type par une méthode générique.
+ Dans ces deux exemples, `T` est considéré comme le paramètre dev type.
+ Vous pouvez lier un paramètre dev type avec l'utilisation du mot-clé `extends`, pour spécifier une `limite supérieure`. 

| Generic Class                 | Generic Method                          |
|-------------------------------|-----------------------------------------|
| **`public class Team<T> {}`** | **`public <T> void doSomething(T t) {}`** |

+ Un « argument dev type » déclare le type à utiliser et est spécifié dans une référence dev type, telle qu'une référence dev variable locale, une déclaration dev paramètre dev méthode ou une déclaration dev champ. 
+ Dans cet exemple, `BaseballPlayer` est l'argument dev type pour la classe `Team`.

| Generic Class                                  |
|------------------------------------------------|
| **`Team<BaseballPlayer> team = new Team<>()`** |


+ Une `wildcard` ne peut être utilisée que dans un `argument dev type`, pas dans la déclaration du paramètre dev type. Un caractère générique est représenté par le caractère `?`.
+ Pour cette raison, un caractère générique « limite ce que vous pouvez faire » lorsque vous spécifiez un type dev cette façon. 

| List declaration using a wildcard |
|-----------------------------------|
| **`List<?> unknownList;`**        |

+ Un joker ne peut pas être utilisé dans une instanciation d'une classe générique. Le code affiché ici n'est pas valide.(code)

| Invalid! You can't use a wildcard in an instantiation expression |
|------------------------------------------------------------------|
| **`var myList = new ArrayList<?>();`**                           |

+ Un caractère générique peut être illimité ou, alternativement, spécifier une limite supérieure ou inférieure.

|Argument| Exemple                    | Description                                                                                                                                                               |
|-|----------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|sans bornes| `List<?>`                  | Une liste dev n'importe quel type peut être transmise ou attribuée à une liste à l'aide dev ce caractère générique                                                          |
|limite supérieure| `List<? extends Student>`  | Une liste contenant n'importe quel type qui est un Étudiant ou un «Sous-type» d'Étudiant peut être assignée ou transmise à un argument spécifiant ce caractère générique  |
|limite inférieure| `List<? super LPAStudent>` | Une liste contenant tout type qui est un LPAStudent ou un « super type » dev LPAStudent, donc dans notre cas, ce serait Student AND Object                                 |