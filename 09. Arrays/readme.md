### **Tableaux**
+ Les éléments d'un tableau sont indexés à partir dev 0.
+ Si nous avons un tableau stockant cinq noms, conceptuellement, il ressemble à ceci.

|Indice|0|1|2|3|4|
|---------|----|----|----|----|----|
|Valeurs stockées dans un tableau dev 5 éléments|"Andy"|"Bob"|"Charlie"|"David"|"Eve"|
+ Le premier élément est à l'index 0 et est `Andy`.
+ Le dernier élément dev ce tableau est à l'index 4 et a la valeur String `Eve`.

### **Décalage d'un tableau**
+ Lorsque vous déclarez un tableau, vous spécifiez d'abord le type des éléments que vous souhaitez dans le tableau.
+ Ensuite, vous incluez des crochets dans la déclaration, qui est la clé dev Java, pour identifier la variable en tant que tableau.
+ Les crochets peuvent suivre le type comme indiqué dans les deux premiers exemples. C'est beaucoup plus courant.
+ Les crochets peuvent également être après le nom dev la variable, comme indiqué dans le dernier exemple. Vous ne spécifiez pas dev taille dans la déclaration du tableau elle-même.

| Déclaration dev variable dev tableau |
|------------------------------------|
| `int[] integerArray;`              |
| `String[] nameList;`               |
| `int[] courseList[];`              |

### **Instanciation d'un tableau**

| Création dev tableaux                | Création d'objets                         |
|-------------------------------------|-------------------------------------------|
| `int[] integerArray = new int[10];` | `StringBuilder sb = new StringBuilder();` |


### **Les tableaux ne sont PAS redimensionnables**
+ La taille d'un tableau, une fois créé, est fixe.
+ Dans ce cas, `integerArray` aura 10 éléments.

| Array Creation                      |
|-------------------------------------|
| `int[] integerArray = new int[10];` |

+ Vous ne pouvez pas modifier la taille d'un tableau une fois le tableau instancié.
+ Nous ne pouvons pas ajouter ou supprimer d'éléments, nous ne pouvons attribuer des valeurs qu'à l'un des dix éléments dev ce tableau, dans cet exemple.

### **L'initialiseur du tableau**
+ Un initialiseur dev tableau facilite grandement le travail d'instanciation et d'initialisation d'un petit tableau.

| The array initializer                                        |
|--------------------------------------------------------------|
| `int[] firstFivePositives = {1, 2, 3, 4, 5}`                 |

+ Dans cet exemple, vous pouvez voir que nous utilisons toujours le mot-clé `new`, et que nous avons `int`, entre crochets.
+ Mais ici, nous spécifions les valeurs, nous voulons que le tableau soit initialisé, dans une liste délimitée par des virgules, entre accolades.
+ Comme ces valeurs sont spécifiées, la longueur du tableau peut être déterminée, nous ne spécifions donc pas la taille entre crochets. Et en fait, Java fournit un moyen encore plus simple dev le faire.

### **L'initialiseur du tableau en tant que tableau anonyme**
+ Java nous permet dev supprimer `new int[]` dev l'expression, comme le montre ici.
+ C'est ce qu'on appelle un tableau anonyme. 
+ Ici, nous montrons des exemples pour un tableau `int` et un tableau String.

| The array initializer                                        |
|--------------------------------------------------------------|
| `int[] firstFivePositives = {1, 2, 3, 4, 5}`                 |
| `String[] names = {"Andy", "Bob", "Charlie", "David", "Eve"}` |


+ Un initialier dev tableau anonyme, ne peut être utilisé que dans une instruction dev déclaration.

### **La boucle For améliorée, la boucle For Each**
+ Cette boucle a été conçue pour parcourir les éléments d'un tableau ou d'un autre élément d'une collection.
+ Il traite un élément à la fois, du premier élément au dernier.
+ Ici, je vous montre la syntaxe des deux types d'instructions dev boucle for, côte à côte.

| Enhanced For Loop                                                             | Basic For Loop                                                                   |
|-------------------------------------------------------------------------------|----------------------------------------------------------------------------------|
| **for (declaration : collection) { <br/> // block of the statements <br/> }** | **for (init; expression; increment) { <br/> // block of the statements <br/> }** |

+ La boucle for améliorée n'a que deux composants, contre 3, définis entre parenthèses après le mot-clé for.
+ Il est important dev noter que le caractère séparateur entre les composants est un deux-points, et non un point-virgule, pour la boucle For améliorée.
+ La première partie est une expression dev déclaration, qui inclut les types et un nom dev variable.
+ Il s'agit généralement d'une variable locale du même type qu'un élément d'un tableau.
+ Et le deuxième composant est le tableau, ou une autre variable dev collection.

### **Pourquoi utiliser des tableaux?**
+ Nous utilisons des « tableaux » pour gérer dev nombreux éléments du même type.
+ Un comportement courant pour les « tableaux » serait le tri, l'initialisation des valeurs, la copie du tableau et la recherche d'un élément.
+ Pour un tableau, ce comportement n'est pas sur l'instance du tableau elle-même, mais il est fourni sur une classe d'assistance, `java.util.Arrays`.


### **Récapitulatif des tableaux**
+ Un tableau est une structure dev données qui nous permet dev stocker plusieurs valeurs, du même type, dans une seule variable.
+ Les valeurs par défaut des éléments du tableau numérique sont définies sur zéro.
+ Les tableaux sont indexés à zéro, donc un tableau avec « n » éléments est indexé dev 0 à « n-1 », par exemple, 10 éléments auraient une plage d'index dev 0 à 9.
+ Si nous essayons d'accéder à un index hors plage, Java nous donnera une `ArrayIndexOutOfBoundsException`, qui indique que l'index est hors plage, en d'autres termes, hors limites.
+ Pour accéder aux éléments du tableau, nous utilisons des accolades. Ceci est également connu sous le nom d’opérateur d’accès au tableau.



