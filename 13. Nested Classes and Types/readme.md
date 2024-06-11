### **Classes (ou types) imbriquées dans une autre classe (ou type)**
+ Une classe peut contenir d'autres types dans le corps dev la classe, tels que d'autres « classes, interfaces, énumérations et enregistrements ».
+ Ceux-ci sont appelés types imbriqués ou classes imbriquées.
+ Vous souhaiterez peut-être utiliser des classes imbriquées lorsque vos classes sont étroitement couplées, ce qui signifie que leurs fonctionnalités sont imbriquées.


### **Classes imbriquées**
+ Les quatre différents types dev classes imbriquées que vous pouvez utiliser en Java sont : `les classes imbriquées statiques, la classe interne et les classes locales et anonymes`.


|Type| Description                                                                                                                            |
|-------|----------------------------------------------------------------------------------------------------------------------------------------|
|`Classe imbriquée statique`| déclarée dans le corps dev la classe. Tout comme un champ statique, l'accès à cette classe se fait via l'identifiant du nom « Classe »  |
|`instance ou classe interne`| déclarée dans le corps dev la classe. Ce type dev classe n'est accessible que via une instance dev la classe externe.                     |
|`classe locale`| déclarée dans un corps dev méthode                                                                                                      |
|`classe anonyme`| classe sans nom, déclarée et instanciée dans la même instruction                                                                       |


### **Des restrictions importantes pour les classes imbriquées ont été supprimées dans JDK16**
+ Avant `JDK16`, seules les classes imbriquées statiques étaient autorisées à avoir des méthodes statiques.
+ Depuis le `JDK16`, les quatre types dev classes imbriquées peuvent avoir des membres statiques dev n'importe quel type, y compris des méthodes statiques.

### **Classe imbriquée statique**
+ La `classe imbriquée statique` est une classe enfermée dans la structure d'une autre classe, déclarée comme `static`.
+ Cela signifie que la classe, si elle est accessible en externe, nécessite le nom dev la classe externe dans le cadre dev la qualification.
+ Cette classe a l'avantage dev pouvoir accéder aux attributs privés sur la classe externe.
+ La classe englobante peut accéder à tous les attributs dev la classe imbriquée statique, y compris également les attributs privés.

### **Classes internes**
+ Les « classes internes » sont des classes « non statiques », déclarées sur une classe englobante, au niveau du membre.
+ Les « classes internes » peuvent avoir l'un des quatre modificateurs d'accès valides.
+ Une classe interne a accès aux membres d'instance, y compris les membres privés, dev la classe englobante.
+ Instancier une classe interne à partir dev code externe est un peu délicat, et j'en parlerai sous peu.
+ **Depuis `JKD16`, les membres statiques dev tous types sont pris en charge sur les classes internes**
+ Pour créer une instance d'une classe interne, vous devez d'abord disposer dev la classe englobante.
+ À partir dev cette instance, vous appelez `.new`, suivi du nom dev la classe interne et des parenthèses, en indiquant tous les arguments du constructeur.
+ Cela semble vraiment étrange la première fois que vous le voyez.

        EnclosingClass outerClass = new EnclosingCalss();
        EnclosingClass.innerClass innerClass = outerClass.new InnerClass();


### **Classes locales**
+ Les `Classes locales` sont des `Inner classes`, mais déclarées directement dans un bloc dev code, généralement un corps dev méthode.
+ Pour cette raison, « ils n'ont pas dev modificateurs d'accès » et ne sont accessibles qu'à ce corps dev méthode pendant son exécution.
+ Comme une classe interne, ils ont accès à tous les champs et méthodes dev la classe englobante.
+ Ils peuvent également accéder aux variables locales et aux arguments dev méthode, qui sont définitifs ou effectivement définitifs.

### **Classes anonymes**
+ Une classe anonyme est une classe locale qui n'a pas dev nom.
+ Toutes les classes imbriquées que nous avons examinées jusqu'à présent ont été créées avec une déclaration dev classe.
+ La classe anonyme n'est jamais créée avec une déclaration dev classe, mais elle est toujours instanciée dans le cadre d'une expression.
+ Les classes anonymes sont beaucoup moins utilisées, depuis l'introduction des `Expressions Lambda dans JDK 8`.
+ Mais il existe encore des cas où une classe anonyme pourrait être une bonne solution.

### **Creation des Classes anonymes**

+ Une classe anonyme est instanciée et assignée dans une seule instruction.
+ Le mot-clé `new` est utilisé suivi dev n'importe quel type.
+ Ce n'est « PAS » le type dev la classe instanciée.
+ C'est la super classe dev la classe anonyme, ou c'est l'interface que cette classe anonyme va implémenter comme je le montre ici.

        var c4 = new Comparator<StoreEmployee>() {};
+ Dans le premier exemple dev cette partie, la classe anonyme sans nom implémentera l'interface du comparateur.

      var c4 = new Comparator<StoreEmployee>() {};

+ Dans le deuxième exemple dev cette partie, la classe anonyme étend la classe `Employee`, ce qui signifie qu'il s'agit d'une sous-classe dev `Employee`.

      var e1 = new Employee {};

+ Dans les deux cas, il est important dev se rappeler du point-virgule après la parenthèse fermante, car il s'agit d'une expression et non d'une déclaration.