### **L'expression Lambda**
+ La syntaxe dev cette expression lambda est celle dev gauche ci-dessous.
+ Ceci a été passé directement comme argument dev méthode, pour un type dev paramètre qui était un `Comparator`.
+ La méthode abstraite du Comparator, compare, est présentée ici sur le côté droit. (code)

|The generated Lambda Expression| Comparator's Abstract Method |
|-------------------------------|------------------------------|
|(o1, o2) -> o1.lastName().compareTo(o2.lastName())| int compare(T o1, T o2)      |

+ Les paramètres d'expression lambda sont déterminés par la méthode dev l'interface associée, la méthode fonctionnelle.
+ Dans le cas d'un `Comparator`, et dev sa méthode compare, il y a deux arguments.
+ C'est pourquoi nous avons mis « o1 et o2 » entre parenthèses, dans l'expression lambda générée.
+ Ces arguments peuvent être utilisés dans l'expression qui se trouve à droite du jeton fléché.



### **La syntaxe d'une expression Lambda**
+ Une expression lambda consiste en une liste dev paramètres formels, généralement pas toujours déclarés entre parenthèses; le jeton flèche; et soit une expression, soit un bloc dev code après le jeton dev flèche.
+ Comme les expressions lambda sont généralement des expressions simples, il est plus courant dev les voir écrites comme indiqué sur la pièce.

        (paramter1, paramter2, ...) -> expression;

+ L'expression doit renvoyer une valeur, si la méthode dev l'interface associée renvoie une valeur.

        (o1, o2) -> o1.lastName().compareTo(o2.lastName())

### **Comparaison dev la classe anonyme et dev l'expression lambda**
+ Demandez-vous où est le lien entre la méthode dev comparaison et cette expression lambda?
+ C'est évident dans la classe anonyme, car nous remplaçons la méthode compare et renvoyons le résultat dev cette expression.
+ Nous pouvons voir les deux paramètres et leurs types, et quelle devrait être la valeur dev retour, dans la classe anonyme.
+ Mais l'expression lambda n'a aucune référence à une méthode englobante, d'après ce code.

| **Anonymous Class**                                                                                                                                           | **Lambda Expression**                             |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------|
| new Comparator<Person>() { <br/> @Override <br/> public int compare(Peron o1, Person o2) { <br/> return o1.lastName.compareTo(o2.lastName()); <br> } <br/> }; | (o1, o2) -> o1.lastName().compareTo(o2.lastName() |


### **Où se trouve la méthode dans l'expression Lambda**
+ Pour une expression lambda, `la méthode est déduite` par Java !.

### **Comment Java peut-il déduire la méthode?**
+ Java s'inspire du type référence, dans le contexte dev l'utilisation dev l'expression lambda.
+ Ici, je montre une vue simplifiée dev la méthode dev tri sur List.

      void sort(Comparator c)

+ Et voici l'appel à cette méthode passant l'expression lambda.

      people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));

+ À partir dev là, Java peut déduire que cette expression lambda se résout en un type `Comparator`, en raison dev la déclaration dev la méthode.
+ Cela signifie que l'expression lambda transmise doit représenter le code d'une méthode spécifique sur `l'interface du comparateur`.
+ Mais quelle méthode ?
+ Nous y allons, il n'y en a qu'une qui intéresse lambda, et c'est « la méthode abstraite » sur Comparator.
+ Java nécessite que les types prenant en charge les expressions lambda soient ce qu'on appelle une interface fonctionnelle.


### **Qu'est-ce qu'une interface fonctionnelle?**
+ Une `interface fonctionnelle`  est une interface qui a « une et une seule méthode abstraite ».
+ C'est ainsi que Java peut déduire la méthode, pour dériver les paramètres et le type dev retour, pour l'expression lambda.
+ Vous pouvez également voir cela appelé `SAM`, qui est l'abréviation dev `Single Abstract Method`, qui est appelée méthode fonctionnelle.
+ Une interface fonctionnelle est le `type cible pour une expression lambda`.
+ Cela signifie que l'expression lambda transmise doit représenter le code d'une méthode spécifique sur l'interface du comparateur.


### **L'expression Lambda?**
+ L'interface fonctionnelle est le framework qui permet d'utiliser une expression lambda.
+ Les expressions lambda sont également appelées lambdas en abrégé.
+ De nombreuses classes Java utilisent des interfaces fonctionnelles dans leurs signatures dev méthodes, ce qui nous permet dev leur passer des lambdas comme arguments.
+ Vous découvrirez bientôt que les lambdas réduiront la quantité dev code que vous écrivez.
+ Dans une prochaine partie, je vais aborder dev nombreuses interfaces fonctionnelles intégrées à Java.

### **L'interface consommateur**
+ `L'interface consommateur` se trouve dans le package `java.util.function`.
+ Il a une méthode abstraite, qui prend un seul argument et ne renvoie rien.

      void accept(T t)

+ Cela ne semble pas être une interface très intéressante au premier abord, mais voyons ce que cela signifie en pratique, en ce qui concerne les expressions lambda que nous pouvons utiliser avec.


### **L'expression Lambda?**
+ `L'interface fonctionnelle` est le framework qui permet d'utiliser une expression lambda.
+ Les expressions lambda sont également appelées lambdas en abrégé.
+ De nombreuses classes Java utilisent des interfaces fonctionnelles dans leurs signatures dev méthodes, ce qui nous permet dev leur passer des lambdas comme arguments.
+ Vous découvrirez bientôt que les lambdas réduiront la quantité dev code que vous écrivez.
+ Dans une prochaine partie, je vais aborder dev nombreuses interfaces fonctionnelles intégrées à Java.

### **Variations d'expression Lambda, pour un seul paramètre**
+ Cette partie montre les différentes manières dev déclarer un seul paramètre dans une expression lambda.
  
|Expression Lambda| Description                                                       |
|-----------------|-------------------------------------------------------------------|
|**`element -> System.out.println(element);`**| Un seul paramètre sans type ne peut pas omettre les parenthèses.  |
|**`(element) -> System.out.println(element);`**| Les parenthèses sont facultatives                                 |
|**`(String element) -> System.out.println(element);`**| Parenthèses requises si un type référence est spécifié            |
|**`(var element) -> System.out.println(element);`**| Un type dev référence peut être `var`                              |


### **Variations dev l'expression Lambda, le corps lambda**
+ Le corps lambda peut être une expression unique ou peut contenir un corps lambda entre accolades ouvrantes et fermantes.

| Lambda Expression                                                                                                  | Description |
|--------------------------------------------------------------------------------------------------------------------|-------------|
| **`element -> System.out.println(element);`**                                                                      |Une expression peut être une seule instruction <br/> Comme une expression `switch`, qui ne nécessite pas dev rendement pour un seul résultat d'instruction, l'utilisation dev `return` n'est pas nécessaire et entraînerait une erreur du compilateur.|
| **(var element) -> <br/> chart first = element.charAt(0); <br/> System.out.println(element + " means " + first);** |Une expression peut être un bloc dev code <br/> Comme une expression `switch`, qui renvoie une valeur, nécessiterait une instruction return finale. <br/> Toutes les instructions du bloc doivent se terminer par un point-virgule.|


### **Programmation fonctionnelle**
+ Les Lambdas sont la première étape dev Java vers la programmation fonctionnelle.
+ Il s'agit d'un paradigme dev programmation axé sur le calcul et le renvoi des résultats.
+ Et juste plus d'informations sur la programmation fonctionnelle, il y a un bon article wikipedia ici.
  + https://en.wikipedia.org/wiki/Functional_prgramming
+ Vérifiez cela pour en savoir un peu plus sur la programmation fonctionnelle.


### **Streams**
+ Une autre fonctionnalité dev Java utilise largement les expressions lambda, à savoir les flux.
+ Les Streams sont passionnants, car ils créent un pipeline dev travail qui peut être transformé en chaîne.
+ De nombreuses opérations `Streams` prennent des interfaces fonctionnelles comme paramètres, ce qui signifie que nous pouvons les coder avec des expressions lambda.

### **Expressions Lambda avec plusieurs paramètres**
+ Les règles pour plusieurs paramètres utilisés dans une expression lambda sont affichées ici.

| Expression Lambda                  | Description                                                                                                             |
|------------------------------------|-------------------------------------------------------------------------------------------------------------------------|
| `(a, b) -> a + b;`                 | Les parenthèses sont toujours obligatoires. Les types explicites ne le sont pas.                                        |
| `(Integer a, Integer b) -> a + b;` | Si vous utilisez un type explicite pour un paramètre, vous devez utiliser des types explicites pour tous les paramètres |
| `(var a, var b) -> a + b;`         | Si vous utilisez `var` pour un paramètre, vous devez utiliser `var` pour tous les paramètres                            |


### **Expressions Lambda qui renvoient des valeurs**
+ Cette partie montre les deux règles pour renvoyer les valeurs d'une expression lambda.

| Expression Lambda                                                 | Description                                                                                                              |
|-------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------|
| `(a, b) -> a + b;`                                                | Lorsque vous n'utilisez pas d'accolades, le mot-clé `return` n'est pas nécessaire et générera une erreur du compilateur. |
| `(a, b) -> {` <br/> `var c  = a + b;` <br/> `return c;` <br/> `}` | Si vous utilisez un bloc d'instructions, c'est-à-dire que vous utilisez des accolades, un retour est requis              |


### **Java.util.function**
+ Java fournit une bibliothèque d'interfaces fonctionnelles dans le `java.util.function.package`.
+ Nous en avons déjà examiné une, `l'Interface consommateur`.
+ Je vais maintenant regarder une autre dev ces interfaces, le `BinaryOperator`, dans le code.

### **Les quatre catégories dev base des interfaces fonctionnelles dans java.util.function.package**
+ C'est une bonne idée dev connaître les quatre types dev base d'interfaces fonctionnelles dans le `java.util.function.package`.
+ Il y a plus dev quarante interfaces dans ces packages.
+ Ceux-ci peuvent tous être classés dans l’un des types suivants.
+ Cette partie montre les quatre catégories, avec la méthode la plus simple indiquée.

|Catégorie d'interface|Signature dev méthode dev base| Objectif                                               |
|---------------------|----------------------------|--------------------------------------------------------|
|**Consumer**|`void accept(T t)`| exécuter du code sans renvoyer dev données              |
|**Function**|`R apply(T t)`| renvoie le résultat d'une opération ou d'une fonction  |
|**Predicate**|`boolean test(T t)`| tester si une condition est vraie ou fausse            |
|**Supplier**|`T get()`| retourner une instance dev quelque chose                |


### **L'interface consommateur**
+ Dans cette partie, je montre les deux interfaces « Consommateur » les plus courantes, et la méthode « fonctionnelle » sur chacune.
+ L'interface consommateur prend un argument dev n'importe quel type.
+ L'interface BiConsumer prend deux arguments, dev types différents.

| Nom d'Interface | Signature dev méthode    |
|-----------------|-------------------------|
| Consumer        | `void accept(T t)`      |
| BiConsumer      | `void accept(T t, U u)` |

### **Un exemple d'expression Lambda dev consommateur**
+ Cette partie montre un exemple d'expression lambda dev consommateur. Il prend un argument et exécute une seule instruction.
+ Aucun résultat n'est renvoyé.

|Example Lambda Expression for Consumer| Consumer Method    |
|-------------------------------------|--------------------|
|`s -> System.out.println(s)`| `void accept(T t)` |

### **L'interface du prédicat**
+ L'interface dev prédicat prend un ou deux arguments et renvoie toujours une valeur booléenne.
+ Ils sont utilisés pour tester une condition, et si la condition est vraie, une opération sera effectuée.

|Interface Name| Method Signature         |
|--------------|--------------------------|
|Predicate| `boolean Test(T t)`      |
|BiPredicate| `boolean test(T t, U u)` |

### **Un exemple d'expression Lambda dev prédicat**
+ Dans cet exemple, l'expression prend une `String` et teste si elle est égale au littéral suivant, `"Hello"` ici, en ignorant la casse, donc elle renvoie vrai ou faux.

| Example Lambda Expression for Consumer |
|----------------------------------------|
| `s -> s.equalsIgnoreCase("Hello")`     |


### **Interface fonctionnelle**

+ Dans cette partie, je présente quatre des interfaces les plus courantes dans cette catégorie.
+ Chacun a un type dev retour, affiché ici sous la forme `T  ou R`, qui signifie résultat, c'est-à-dire un résultat attendu pour chacun d'entre eux.
+ En plus dev `Function et BiFunction`, il existe également `UnaryOperator et BinaryOperator`.
+ Vous pouvez considérer `UnaryOperator` comme une `interface dev fonction`, mais où le type d'argument est le même que le type dev résultat.
+ `L'opérateur binaire est une interface BiFunction`, où les deux arguments ont le même type, tout comme le résultat, c'est pourquoi comme `T, et non R`.
+ Le rappelle que le résultat sera du même type que les arguments des méthodes.
+ J'ai également inclus les paramètres dev type avec chaque nom d'interface, dans cette partie, car je voulais que vous voyiez que le résultat, pour une `Fonction ou BiFunction`, est déclaré comme dernier argument dev type.
+ Pour `UnaryOperator et BinaryOperator`, il n'y a qu'un seul argument dev type déclaré, car les types des arguments et des résultats seront les mêmes.



| Nom dev l'interface | Signature dev la méthode | Nom dev l'interface | Signature dev la méthode |
|--------------------|-------------------------|--------------------|-------------------------|
| Function<T,R>      | R apply(T t)            | UnaryOperator<T>   | T apply(T t)            |
| BiFunction<T,U, R> | R apply(T t, U u)       | BinaryOperator<T>  | T apply(T t1, T t2)     |


### **Un exemple d'expression Lambda d'interface dev fonction**

+ Dans cette partie, je montre un exemple d'expression lambda qui cible une `Interface dev fonction`.
+ Ces expressions lambda prennent une chaîne, s, et divisent cette chaîne par des virgules, renvoyant un tableau dev chaînes.
+ Dans ce cas, le type d'argument, `T` est une chaîne, et le résultat, `R`, est un tableau dev String.
+ Pour montrer comment déclarer une variable dev ce type, je montre également une déclaration dev variable, pour cet exemple spécifique.

| Example Lambda Expression for Function | Function Method | Variable Declaration for this example |
|----------------------------------------|-----------------|---------------------------------------|
| s -> s.split(",");                     | R apply(T t)    | Function<String, String[]> f1;        |


### **L'interface Supplier**
+ L'interface fournisseur ne prend aucun argument mais renvoie une instance d'un certain type, T.
+ Vous pouvez considérer cela comme un code dev méthode d'usine.
+ Cela produira une instance d'un objet.
+ Cependant, il n'est pas nécessaire qu'il s'agisse d'un résultat nouveau ou distinct renvoyé.

| Interface Name | Method Signature |
|----------------|------------------|
| Supplier       | `T get()`        |

### **Un exemple d'expression Lambda dev Supplier**
+ Dans l'exemple que je vous montre dans cette partie, j'utilise la `Classe Random` pour générer un Entier aléatoire.
+ Cette méthode ne prend aucun argument, mais les expressions lambda peuvent utiliser des variables finales ou effectivement finales dans leurs expressions, ce que je démontre ici.
+ La variable random est un exemple dev variable, issue du code englobant.

| Example Lambda Expression for Consumer |
|----------------------------------------|
| () -> random.nextInt(1, 100)           |


### **L'interface Supplier**
+ `L'interface Supplier` ne prend aucun argument mais renvoie une instance d'un certain type, T.
+ Vous pouvez considérer cela comme un code dev méthode d'usine.
+ Cela produira une instance d'un objet.
+ Cependant, il n'est pas nécessaire qu'il s'agisse d'un résultat nouveau ou distinct renvoyé.

### **Déclarations Lambda valides pour différents nombres d'arguments**
+ Cette partie montre les nombreuses possibilités dev déclaration d'un type dev paramètre dans une expression lambda.
+ Les parenthèses sont requises dans tous les cas sauf dans un cas, où les méthodes fonctionnelles ont un seul argument et où vous ne spécifiez pas dev type, ni n'utilisez `var`.

| Arguments dans la méthode fonctionnelle                                                                                                                                                                              | Syntaxe lambda valide                                                                                                  |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|
| **Aucun**                                                                                                                                                                                                            | **`() -> statement`**                                                                                                  |
| **Un**                                                                                                                                                                                                               | **`s -> statement`** <br/> **`(s) -> statement`** <br/> **`(var s) -> statement`** <br/> **`(String s) -> statement`** |
| **Deux** <br/> ***Lors dev l'utilisation dev `var`, tous les arguments doivent utiliser `var`.*** <br/> ***Lors dev la spécification dev types explicites, tous les arguments doivent spécifier des types explicites.*** | **`(s, t) -> statement`** <br/> **`(var s, var t) -> statement`** <br/> **`(String s, List t) -> statement`**          |


### **Pourquoi ces déclarations sont-elles égales?**
+ À première vue, il n'est pas vraiment évident pourquoi une référence dev méthode a cette syntaxe.

|Lambda Expression| Method Reference      |
|-----------------|-----------------------|
|`s -> Sytem.out.println(s)`| `System.out::println` |

+ Une référence dev méthode supprime encore plus l'expression lambda, éliminant le besoin dev déclarer des paramètres formels.
+ Nous n'avons pas non plus besoin dev passer d'arguments à la méthode en question, dans ce cas `println`.
+ Une référence dev méthode comporte des doubles deux-points entre le type qualificatif, ou l'objet, et le nom dev la méthode.
+ Dans cet exemple d'interface consommateur, non seulement la méthode est déduite, mais les paramètres le sont également.

### **Quelles méthodes peuvent être utilisées dans la référence des méthodes?**
+ Les méthodes qui peuvent être utilisées sont basées sur le contexte dev l'expression lambda.
+ Cela signifie que la référence dev la méthode dépend à nouveau dev la méthode dev l'interface ciblée.
+ Vous pouvez référencer une méthode statique sur une classe.
+ Vous pouvez référencer une méthode d'instance à partir soit d'une instance externe à l'expression, soit d'une instance passée comme l'un des arguments.
+ Ou vous pouvez référencer un constructeur, en utilisant `new` comme méthode.


### **L'interface dev collecte**
+ Nous avons couvert la plupart dev ces méthodes, mais je voulais que vous voyiez ici que la plupart d'entre elles traitent d'un index.
+ Une liste peut être soit indexée, comme une `ArrayList`, soit non, comme une `LinkedList`, mais une `LinkedList` est également implémentée pour prendre en charge toutes ces méthodes.
+ Les interfaces dérivées peuvent avoir des moyens spécifiques pour « ajouter, supprimer, obtenir et trier des éléments pour leur type spécifique dev collection, en plus dev ceux définis sur l'interface « Collection » elle-même.
+ Examinons maintenant la situation générale des interfaces et quelques implémentations spécifiques.

### **Collections – Vue d'ensemble**
+ Cette diapositive montre la hiérarchie dev l'interface. Il s'agit également d'afficher les implémentations ou classes concrètes qui implémentent ces interfaces, en police jaune.
+ Notez que Map n'étend pas la collection, bien qu'il fasse toujours partie dev ce framework.
+ Les `Map` sont particulièrement différentes et je vais m'exprimer lorsque j'aborderai les cartes dans cette section.
+ Vous pouvez voir que `LinkedList` implémente à la fois `List et Deque`, et j'en ai discuté en détail lorsque j'ai couvert `LinkedLists`.

### **La liste**
+ `A List` est une collection ordonnée (également connue sous le nom dev séquence).
+ Celles-ci peuvent être séquencées en mémoire comme une `ArrayList`, ou maintenir des liens vers les valeurs suivantes et précédentes, comme une `LinkedList`.

### **La queue**
+ `Queue` est une collection conçue pour contenir des éléments avant le traitement, dans l'ordre, en d'autres termes, l'ordre dev traitement compte, dev sorte que les première et dernière positions, ou la tête et la queue, sont priorisées.
+ Le plus souvent, ceux-ci peuvent être implémentés comme « First In, First Out (FIFO) », mais peuvent être implémentés comme une « Stack, comme Last In First OUT (LIFO) » dont nous avons discuté.
+ N'oubliez pas qu'un `Dequeue` prend en charge les deux.

### **A Set**
+ `Set` est une collection conceptuellement basée sur un ensemble mathématique.
+ Surtout, il ne contient « aucun élément en double » et n'est pas naturellement séquencé ou ordonné.
+ Vous pouvez considérer un ensemble comme une sorte dev regroupement chaotique d'objets.
+ Java a trois implémentations, que j'examinerai en détail dans cette section du cours, le `HashSet`, le `TreeSet et le LinkedHashSet.`
  +Ceux-ci se distinguent par la manière sous-jacente avec laquelle ils stockent les éléments dans l'ensemble.
+ Un ensemble trié est un ensemble qui fournit un ordre total des éléments.

### **A Map**
+ `A Map` est une collection qui stocke les paires clé et valeur.
+ Les clés sont un ensemble et les valeurs sont une collection distincte, où la clé conserve une référence à une valeur.
+ Les clés doivent être uniques, mais pas les valeurs.
+ Les éléments d'une arborescence sont stockés dans un nœud dev valeur clé, également appelé « entrée 
+ ».

### **Qu'est-ce qu'un algorithme polymorphe?**
+ La documentation d'Oracle décrit un algorithme polymorphe comme une fonctionnalité réutilisable.
+ À une époque, la plupart dev ces méthodes nous étaient fournies, en tant que méthodes statiques, sur une classe appelée `java.util.Collections.`
+ Depuis `JDK-8` et l'avènement dev multiples améliorations d'interface, certaines dev ces méthodes sont désormais sur les interfaces elles-mêmes, en tant que méthodes par défaut ou statiques.
+ Mais pas dev tous, je vais donc discuter dev cette classe et dev ce qu'elle a à offrir, par rapport à ce qui est disponible dans chaque classe dev collection.
+ Il est également important dev comprendre que le code existant utilisera cette classe pour certaines opérations, qui peuvent être effectuées à partir dev la classe elle-même.

### **Comprendre l'importance du code dev hachage**
+ `HashSet et HashMap`, sont basés sur les codes dev hachage des objets.
+ Cela peut être un sujet déroutant pour les nouveaux programmeurs, je souhaite donc passer un peu plus dev temps à l'expliquer.
+ Étant donné que les ensembles sont uniques car ils ne prennent pas en charge les doublons, l'ajout d'un élément entraîne toujours le coût dev la première vérification d'une correspondance.
+ Si votre ensemble est grand ou très grand, cela devient une opération coûteuse, O(n) ou un temps linéaire, si vous vous souvenez des notations Big O que j'ai abordées précédemment.
+ Un mécanisme pour réduire ce coût est introduit par quelque chose appelé hachage.
+ Si nous créions deux compartiments d'éléments et que l'élément pouvait identifier consciencieusement dans quel compartiment il était stocké, alors la recherche pourrait être réduite dev moitié.
+ Si nous créions quatre buckets, nous pourrions réduire le coût d'un quart.
+ Une collection hachée créera dev manière optimale un ensemble limité dev buckets, pour fournir une répartition uniforme des objets dans les buckets dans un ensemble complet.
+ Un code dev hachage peut être n'importe quel entier valide, il peut donc s'agir dev l'un des 4,2 milliards dev nombres valides.
+ Si votre collection ne contient que 100 0000 éléments, vous ne voulez pas la sauvegarder avec un mécanisme dev stockage dev 4 milliards d'espaces réservés possibles.
+ Et vous ne voulez pas avoir à parcourir 100 000 éléments un par un pour trouver une correspondance ou un doublon.
+ Un mécanisme dev hachage prendra un code dev hachage `integer` et une déclaration dev capacité qui spécifie le nombre dev buckets sur lesquels répartir les objets.
+ Il traduit ensuite la plage dev codes dev hachage en une plage d'identifiants dev compartiment.
+ Les implémentations hachées utilisent une combinaison du code dev hachage et d'autres moyens, pour fournir le système dev regroupement le plus efficace, afin d'obtenir cette distribution uniforme souhaitée des objets.

### **Le hachage commence par comprendre l'égalité**
+ Pour comprendre le hachage en Java, je pense qu'il est utile dev d'abord comprendre l'égalité des objets.
+ J'en ai parlé dans des vidéos précédentes, mais je veux maintenant être sûr que vous comprenez parfaitement ce sujet, car il est important lorsqu'il s'agit dev collections hachées.
+ Il existe deux méthodes sur `java.util.Object`, dont tous les objets héritent.
+ Ce sont `equals et hashCode`, et je montre ici les signatures dev méthode dev `Object`.

| Testing for equality                  | The hashcode method       |
|---------------------------------------|---------------------------|
| **public boolean equals(Object obj)** | **public int hashCode()** |

### **La méthode égale sur l'objet**
+ L'implémentation d'égal à égal sur Object est présentée ici.
+ Il renvoie simplement `this == obj`.(code)
  
          public boolean equals(Object obj) {
              return (this == obj)
          }

### **Vous souvenez-vous dev ce que == signifie pour les objets**
+ Vous souvenez-vous dev « ce que == signifie » pour les objets ?
+ Cela signifie que deux variables ont la « même référence à un seul objet en mémoire ».
+ Étant donné que les deux références pointent vers le même objet, il s'agit évidemment d'un bon test d'égalité.
### **Égalité des objets**
+ Les « objets » peuvent également être considérés comme égaux dans d'autres cas, si leurs valeurs d'attribut sont égales, par exemple.
+ La classe `String` remplace cette méthode, dev sorte qu'elle compare tous les caractères dev chaque `String`, pour confirmer que deux `Strings` sont égales.


