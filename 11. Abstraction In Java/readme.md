### **Généralisation et abstraction**
+ Nous utilisons les termes **«Abstraction»** et **«Généralisation»** lorsque nous commençons à essayer dev modéliser des choses du monde réel dans un logiciel.
+ Avant dev me lancer dans les types d'interfaces et les classes abstraites, je souhaite parler dev la signification dev ces concepts.

### **Généralisation**
+ Lorsque vous commencez à modéliser des objets pour votre application, vous commencez par identifier les caractéristiques et les comportements que vos objets ont en commun.
+ On généralise quand on crée une hiérarchie dev classes.
+ Une classe dev base est la classe la plus générale, l'élément dev base le plus élémentaire, que l'on peut dire que tout a en commun.

### **Abstraction**
+ Une partie dev la généralisation consiste à utiliser l'abstraction.
+ Vous pouvez généraliser un ensemble dev caractéristiques et dev comportements dans un type abstrait.
+ Si vous considérez une pieuvre, un chien et un pingouin, vous diriez probablement que ce sont tous des animaux.
+ Un animal est vraiment un concept abstrait.
+ Un animal n'existe pas vraiment, sauf pour décrire un ensemble dev choses plus précises.
+ Si vous ne pouvez pas le dessiner sur un morceau dev papier, c'est probablement abstrait.
+ L'abstraction simplifie la vue d'un ensemble dev traits et dev comportements d'un objet, afin que nous puissions en parler en tant que groupe, ainsi que généraliser leurs fonctionnalités.

### **Prise en charge dev Java pour l'abstraction**
+ Java prend en charge l'abstraction dev plusieurs manières différentes.
    + Java nous permet dev créer une hiérarchie dev classes, où le sommet dev la hiérarchie, la classe dev base, est généralement un concept abstrait, qu'il s'agisse d'une classe abstraite ou non.
    + Java créons des classes abstraites.
    + Java nous donne un moyen dev créer des interfaces.

### **Méthode abstraite**
+ Dans les parties qui suivent, je parlerai beaucoup dev méthodes abstraites et concrètes.
+ Une méthode abstraite a une signature dev méthode et un type dev retour, mais n'a pas dev corps dev méthode.
+ Pour cette raison, nous disons qu’une méthode abstraite n’est pas implémentée.
+ Son but est dev décrire le comportement que tout objet dev ce type aura toujours.
+ Conceptuellement, nous pouvons comprendre des comportements comme bouger ou manger sur un animal, nous pourrions donc les inclure en tant que méthodes abstraites, sur un type abstrait.
+ Vous pouvez considérer une méthode abstraite comme un contrat.
+ Ce contrat promet que tous les sous-types fourniront la fonctionnalité promise, avec le nom et les arguments convenus.

### **Méthode concrète**
+ Une méthode concrète a un corps dev méthode, généralement avec au moins une instruction.
+ Cela signifie qu'il a un code opérationnel, qui est exécuté dans les bonnes conditions.
+ On dit qu'une méthode concrète implémente une méthode abstraite, si elle en écrase une.
+ Les classes et interfaces abstraites peuvent avoir un mélange dev méthodes abstraites et concrètes.

### **Modificateurs dev méthode**
+ J'ai déjà couvert les modificateurs d'accès et ce qu'ils signifient pour les types, ainsi que pour les membres des types.
+ Et nous savons que nous avons des modificateurs d'accès public, protégé, package et privé, comme options pour les membres.
+ En plus des modificateurs d'accès, les méthodes ont d'autres modificateurs, que nous énumérerons ici, à titre d'introduction dev haut niveau.

| Modificateur   |Objectif|
|----------------|---------------|
| `abstract`     | Lorsque vous déclarez un résumé dev méthode, un corps dev méthode est toujours omis. Une méthode abstraite ne peut être déclarée que sur une classe abstraite ou une interface.|
| `static`       | Parfois appelée méthode dev classe plutôt que méthode d'instance, car elle est appelée directement sur l'instance dev classe.|
| `final`        |Une méthode qui est finale ne peut pas être remplacée par des sous-classes.|
| `default`      |Ce modificateur n'est applicable qu'à une interface, et nous en parlerons dans notre interface.|
| `native`       |C'est une autre méthode sans corps, mais elle est très différente du modificateur abstrait. Le corps dev la méthode sera implémenté dans du code dépendant dev la plate-forme, généralement écrit dans un autre langage dev programmation tel que C. Il s'agit d'un sujet avancé et généralement peu utilisé, et nous ne l'aborderons pas dans ce cours.|
| `synchronized` |Ce modificateur gère la manière dont plusieurs threads accéderont au code dans cette méthode. Nous aborderons cela dans une section ultérieure sur le code multithread.|


### **La classe abstraite**
+ La classe abstraite est déclarée avec le modificateur `abstract`.
+ Ici, nous déclarons une classe abstraite appelée Animal.

        abstract class Animal {} // An abstract class is declared with the abstract modifier.

+ Une classe abstraite est une classe incomplète.
+ Vous ne pouvez pas créer une instance d'une classe abstraite.

        Animal a = new Animal(); // Invalid, an abstract class never gets instantiated

+ Une classe abstraite peut toujours avoir un constructeur, qui sera appelé par ses sous-classes, lors dev leur construction.
+ Le but d'une classe abstraite est dev définir le comportement que ses sous-classes doivent avoir, dev sorte qu'elle participe toujours à « l'héritage ».
+ Pour les exemples dev cette partie, supposons qu'Animal soit une classe abstraite.
+ Les classes étendent les classes abstraites et peuvent être concrètes.

      Class Dog extends Animal {} // Animal is abstract, Dog is not

+ Ici, le Chien prolonge l'Animal, l'Animal est abstrait, mais le Chien est concret.
+ Une classe qui étend une classe abstraite peut également être elle-même abstraite, comme je le montre avec cet exemple suivant.
+ Mammal est déclaré abstrait et il prolonge Animal, qui est également abstrait.

      abstract class Mammal extends Animal {} // Animal is abstract, Mammal is also abstract

+ Et enfin une classe abstraite peut étendre une classe concrète.

      abstract class BestOfBreed extends Dog {} // Dog is not abstract, but BestOfBreed is

+ Ici, nous avons `BestOfBreed`, une classe abstraite, étendant Dog, qui est concrète.

### **Qu'est-ce qu'une méthode abstraite**
+ Une méthode abstraite est déclarée avec le modificateur `abstract`.
+ Vous pouvez voir sur cette partie que nous déclarons une méthode abstraite appelée move, avec un type dev retour `void`.
+ Il se termine simplement par un point-virgule. Il n’a pas dev corps, pas même d’accolades.
+ Les méthodes abstraites ne peuvent être déclarées que sur une classe ou une interface abstraite.

        abstract class Animal {
              public abstract void move()
        }

### **À quoi sert une méthode abstraite si elle ne contient aucun code?**
+ Une méthode abstraite indique au monde extérieur que tous les animaux vont bouger, dans l'exemple présenté ici.

        abstract class Animal {
              public abstract void move()
        }

+ Tout code qui utilise un sous-type d'Animal sait qu'il peut appeler la méthode move, et le sous-type implémentera cette méthode avec cette signature.
+ Cela est également vrai pour une classe concrète et une méthode concrète remplacée.
+ Vous vous demandez peut-être quelle est la différence et quand utiliseriez-vous une classe abstraite.


### **Une classe abstraite n'a pas besoin d'implémenter dev méthodes abstraites**
+ Une classe abstraite qui étend une autre classe abstraite a une certaine flexibilité.
  + Il peut implémenter toutes les méthodes abstraites du parent.
  + Il peut en implémenter certains.
  + Ou bien il ne peut en mettre en œuvre aucun.
  + Il peut également inclure des méthodes abstraites supplémentaires, qui forceront les sous-classes à implémenter à la fois les méthodes abstraites d'Animal et celles dev Mammal.

### **Pourquoi utiliser une classe abstraite?**
+ En vérité, vous n'aurez peut-être jamais besoin d'utiliser une classe abstraite dans votre conception, mais il existe dev bons arguments pour les utiliser.
+ Une classe abstraite dans votre hiérarchie oblige les concepteurs dev sous-classes à réfléchir et à créer des implémentations uniques et ciblées pour les méthodes abstraites.
+ Il n'est pas toujours logique dev fournir une implémentation par défaut ou héritée d'une méthode particulière.
+ Une classe abstraite ne peut pas être instanciée, donc si vous utilisez des classes abstraites pour concevoir un cadre d'implémentation, c'est certainement un avantage.
+ Dans notre exemple, nous ne voulons pas vraiment que les gens créent des instances d'animaux ou dev mammifères.
+ Nous avons utilisé ces classes pour abstraire le comportement, à différents niveaux dev classification.
+ Tous les animaux doivent implémenter les méthodes `move` et `makeNoise`, mais seuls les mammifères devaient implémenter `shedHair`, comme nous l'avons démontré.


### **Interface vs classe abstraite**
+ Nous avons vu qu'une classe abstraite a besoin dev ses sous-classes pour implémenter ses méthodes abstraites.
+ Une « interface » est similaire à une classe abstraite, même si ce n'est « pas du tout une classe ».
+ C'est un type « spécial », qui ressemble plus à un « contrat » entre la classe et le code client, que le compilateur applique.
+ En déclarant qu'elle utilise une interface, votre classe doit implémenter toutes les méthodes abstraites, sur l'interface.
+ Une classe accepte cela, car elle veut être « connue par ce type », par le monde extérieur ou par le code client.
+ Une `interface` permet aux `classes qui pourraient avoir peu d'autres choses en commun` d'être reconnues comme un type dev référence spécial.

### **Déclarer une interface**
+ Déclarer une interface est similaire à déclarer une classe, en utilisant le mot-clé `interface`, où vous utiliseriez `class`.
+ Sur cette partie, je déclare un nom d'interface publique `FlightEnabled`.

      public interface FlightEnabled() {}

+ Une interface est généralement nommée, en fonction dev l'ensemble des comportements qu'elle décrit.
+ De nombreuses interfaces se termineront par «able», comme «Comparable» et «Iterable», ce qui signifie encore une fois que quelque chose est capable, ou peut faire, un ensemble donné dev comportements.


### **Utiliser une interface**
+ Une classe est associée à une interface, en utilisant la clause `implements` dans la déclaration dev classe.
+ Dans cet exemple, la classe `Bird` implémente l'interface `FlightEnabled`.

      pubilc class Bird implements FilgthEnabled() {
      }

+ Grâce à cette déclaration, nous pouvons utiliser `FlightEnabled` comme type dev référence et lui attribuer une instance d'oiseau.
+ Dans cet exemple dev code, nous créons un objet `new Bird`, mais nous l'attribuons au dépliant dev nom dev variable `FlightEnabled`.

      FligthEnabled flier = new Bird();

### **Une utilisation dev classe s'étend et s'implémente dans la même déclaration**
+ Une classe ne peut « étendre » qu'une « classe unique », c'est pourquoi Java est appelé « héritage unique ».
+ Mais une classe peut « implémenter dev nombreuses interfaces ». Cela nous donne des «prises et fonctionnalités», ce qui les rend si puissants.
+ Une classe peut « à la fois étendre » une autre classe et « implémenter » une ou plusieurs interfaces.

          package dev.lpa
          public class Bird extends Animal implements FilghtEnabled, Trackabe {
          }

+ Dans cet exemple, la classe `Bird` s'étend ou hérite dev `Animal`, mais elle implémente à la fois une interface `FlightEnabled` et `Trackable`.

### **Le modificateur abstrait est implicite sur une interface**
+ Nous n'avons pas besoin dev déclarer le type d'interface abstrait, car ce modificateur est implicitement déclaré, pour toutes les interfaces.
+ De même, nous n'avons pas besoin dev déclarer dev méthode abstraite.
+ En fait, toute méthode sans corps est en réalité une « implicite déclarée à la fois publique et abstraite ».
+ Les trois déclarations présentées sur cette slide aboutissent à la même chose, sous couverture :

          public abstract void fly() ;  // les modificateurs publics et abstraits sont redondants,
                                        // ce qui signifie qu'il n'est pas nécessaire dev déclarer
          abstract void fly();          // le modificateur abstrait est redondant, ce qui signifie
                                        // inutile dev déclarer
                                        // Il s’agit d’une déclaration PRÉFÉRÉE, publique et
          void fly();                    // le résumé est implicite


### **Tous les membres d'une interface sont implicitement publics**
+ Si nous omettons un modificateur d'accès sur un `modificateur dev classe`, il s'agit d'un `package d'implicite privé`.
+ Si nous omettons un modificateur d'accès sur un « membre dev l'interface », c'est « implicite public ».
+ Changer le modificateur d'accès d'une méthode en `protected`, sur une interface, est `une erreur du compilateur`, que la méthode soit concrète ou abstraite.
+ Seule une méthode concrète peut avoir un accès privé.

### **Le modificateur final en Java**
+ une variable « finale », dans un bloc dev code, signifie qu'une fois qu'on lui a attribué une valeur, tout code restant dans le bloc ne peut pas la changer.
+ un paramètre dev méthode « final » signifie que nous ne pouvons pas attribuer une valeur différente à ce paramètre dans le bloc dev code dev méthode.
+ Le fichier `final static` est ce que vous créez réellement lorsque vous déclarez un champ sur une interface.

### **Constantes en Java**
+ Une constante en Java est une variable qui ne peut pas être modifiée.
+ Une `variable constante` est une variable finale dev type primitif, ou dev type `String`, qui est initialisée avec une expression constante.
+ Les constantes en Java sont généralement nommées avec des lettres majuscules et avec des traits dev soulignement entre les mots.
+ Une constante statique signifie que nous y accédons via le nom du type.
+ Nous avons vu cela avec les champs `INTEGER.MAX_VALUE` et `INTEGER.MIN_VALUE`.

### **Un champ déclaré sur une interface est toujours `public, statique et final`**
+ Java, spécifions-les comme un champ ordinaire, ce qui pourrait prêter à confusion et induire en erreur un nouveau programmeur Java.
+ Mais nous pouvons les déclarer avec n'importe quelle combinaison dev ces modificateurs, ou aucun, avec le même résultat.
+ Tout cela signifie la même chose sur une interface.


        double MILES_TO_KM = 1.60934;
        final double MILES_TO_KM = 1.60934;
        public final double MILES_TO_KM = 1.60934;
        public static final MILES_TO_KM = 1.60934;

### **Extension des interfaces**
+ Les interfaces peuvent être étendues, comme les classes, en utilisant le mot-clé extends.
+ Sur cette diapositive, je montre une interface, `OrbitEarth`, qui étend l'interface `FlightEnabled`.
+ Cette interface nécessite que toutes les classes implémentent à la fois les interfaces « OrbitEarth » et « FlightEnabled ».

        interface OrbitEarth extends FlightEnabled {}

+ Contrairement à une classe, une interface peut utiliser l'expression extends avec plusieurs interfaces:

        interface OrbitEarth extends FlightEnabled, Trackable {}

### **Les outils ne sont pas valides sur une interface**
+ Une interface n'implémente pas une autre interface, donc le code dev cette partie ne sera pas compilé.
+ En d'autres termes,`implements` est une clause invalide dans une déclaration d'interface.


        interface OrbitEach implements FlightEnable() {} // INVALIDE, implémente une clause invalide pour les interfaces


### **Types abstraits - Codage vers une interface**
+ Les interfaces et les classes abstraites sont des « types dev références abstraites ».
+ Les types dev références peuvent être utilisés dans le code, en tant que types dev variables, paramètres dev méthode et types dev retour, types dev liste, etc.
+ Lorsque vous utilisez un type dev référence abstrait, cela est appelé « codage vers une interface ».
+ Cela signifie que votre code n'utilise pas dev types spécifiques, mais des types plus généralisés, généralement du type interface.
+ Cette technique est préférable, car elle permet à dev nombreuses instances d'exécution dev différentes classes d'être traitées uniformément par le même code.
+ Il permet également des substitutions d'une autre classe ou d'un autre objet, qui implémente toujours la même interface, sans forcer une refactorisation majeure dev votre code.
+ L'utilisation dev types d'interface comme type dev référence est considérée comme une bonne pratique.

### **Qu'est-il arrivé à l'interface depuis JDK 8**
+ Avant JDK 8, le type d'interface ne pouvait avoir que des méthodes abstraites publiques.
+ `JDK 8` a introduit la méthode `par défaut` et les méthodes `static` publiques, et `JDK 9` a introduit les méthodes `privées`, à la fois `static` et `non-static`.
+ Tous ces nouveaux types dev méthodes (sur l'interface) sont des méthodes concrètes.


### **La méthode d'extension des interfaces - La méthode par défaut (à partir du JDK 8)
+ Une méthode d'extension est identifiée par le modificateur `default`, elle est donc plus communément appelée méthode par défaut.
+ Cette méthode est une méthode « concrète », ce qui signifie qu'elle possède un bloc dev code et que nous pouvons y ajouter des instructions.
+ En fait, il doit avoir un corps dev méthode, même juste un ensemble vide d'accolades.
+ Cela ressemble beaucoup à une méthode sur une superclasse, car on peut la remplacer.
+ L'ajout d'une méthode par défaut ne rompt aucune classe implémentant actuellement l'interface.


### **Classe abstraite**
+ Les « classes abstraites » sont très similaires aux interfaces. Vous ne pouvez pas en instancier un seul. Les deux types peuvent contenir un mélange dev méthodes déclarées avec ou sans bloc dev méthode.
+ Avec les classes abstraites, vous pouvez déclarer des champs qui ne sont pas « statiques » et « finaux », des champs d'instance en d'autres termes.
+ Également avec les classes abstraites, vous pouvez utiliser l'un des quatre modificateurs d'accès pour ses méthodes concrètes.
+ Vous pouvez également utiliser tout sauf ce modificateur d'accès privé, pour ses méthodes abstraites.
+ Une classe abstraite cab n'étend qu'une seule classe parent, mais elle peut implémenter plusieurs interfaces.
+ Lorsqu'une classe abstraite est sous-classée, la sous-classe fournit généralement des implémentations pour toutes les méthodes abstraites dev sa classe parent.
+ Cependant, si ce n'est pas le cas, alors la sous-classe doit également être déclarée abstraite.


### **Utilisez une classe abstraite lorsque ...**
+ Vous souhaitez partager du code, parmi plusieurs classes étroitement liées (Animal par exemple, avec champs, nom, âge...)
+ Vous vous attendez à ce que les classes qui étendent votre classe abstraite aient dev nombreuses méthodes communes ou nécessitent des modificateurs d'accès autres que public.
+ Vous souhaitez déclarer des champs non statiques ou non finaux (par exemple, anme, age), cela vous permet donc dev définir des méthodes qui peuvent accéder et modifier l'état d'un objet (`getName, setName`).
+ Vous avez l'obligation pour votre classe dev base dev fournir une implémentation par défaut dev certaines méthodes, mais d'autres méthodes doivent pouvoir être remplacées par des classes enfants.
+ **`Résumé:` Une classe abstraite fournit une définition commune, en tant que classe dev base, que plusieurs classes dérivées peuvent partager.**


### **Interface**
+ Une interface n'est que la déclaration des méthodes que vous souhaitez que certaines classes aient, ce n'est pas l'implémentation.
+ Dans une interface, nous définissons quel type d'opération un objet peut effectuer. Ces opérations sont définies par les classes qui implémentent l'interface.
+ Vous ne pouvez pas instancier d'interfaces, mais elles peuvent contenir un mélange dev méthodes déclarées avec ou sans implémentation.
+ Toutes les méthodes sur les interfaces, déclarées sans corps dev méthode, sont automatiquement publiques et abstraites.
+ Les interfaces sont plus flexibles et peuvent supporter beaucoup plus dev stress sur la conception dev votre programme, car elles ne font pas partie dev la hiérarchie des classes.
+ Une méthode dev codage basée sur les meilleures pratiques est communément appelée codage sur une interface.
+ En introduisant des interfaces dans votre programme, vous introduisez réellement des points dev variation, auxquels vous pouvez connecter différentes implémentations pour cette interface.
+ `Résumé:` l'interface découple le `quoi` du `comment`, et est utilisée pour que différents types se comportent dev manière similaire.
+ Depuis Java 8, les interfaces peuvent désormais contenir des méthodes par défaut, donc autrement dit des méthodes avec implémentation. Le mot-clé «default » est principalement utilisé pour la compatibilité ascendante. Des méthodes statiques publiques ont également été introduites dans Java 8.
+ Depuis Java 9, une interface peut également contenir des méthodes privées, couramment utilisées lorsque les méthodes par défaut partagent du code commun.


### **Utiliser une interface lorsque...**
+ Vous vous attendez à ce que des classes indépendantes implémentent votre interface. Par exemple, deux des interfaces Java, « Comparable et Cloneable », peuvent être implémentées par dev nombreuses classes non liées.
+ Vous souhaitez spécifier le comportement d'un type dev données particulier, mais vous ne vous souciez pas dev savoir qui implémente son comportement.
+ Vous souhaitez séparer les différents comportements.

### **Les interfaces sont utilisées dans dev nombreuses fonctionnalités propres à Java**
+ J'ai brièvement discuté dev certaines interfaces, comme `List et Queue`, et dev leurs implémentations, `ArrayList` et `LinkedList`. Ceux-ci font partie dev ce que Java appelle « Collection Framework ».
+ Les interfaces sont également à la base dev nombreuses fonctionnalités à venir, par exemple les « expressions lambda », qui ont été introduites dans « JDK8 ».
+ Un autre exemple est le « support dev connectivité dev base dev données dev Java, ou JDBC », construit presque entièrement avec des interfaces. L'implémentation concrète des méthodes est différente pour chaque fournisseur dev bases dev données et se présente sous la forme dev pilotes « JDBC ». Cela vous permet d'écrire tout le code dev la base dev données, sans vous soucier des détails dev la base dev données à laquelle vous êtes connecté.


### **Interface vs classe abstraite**
+ J'ai dit que les interfaces et les classes abstraites sont toutes deux des « types » abstraits et que les types abstraits sont utilisés comme types dev référence dans le code.
+ Le tableau dev cette partie est un résumé des similitudes et des différences.

|                                                                              | Classe abstraite              | Interface                            |
|------------------------------------------------------------------------------|-------------------------------|--------------------------------------|
| Une instance peut être créée à partir dev celui-ci                            | Non                           | Non                                  |
| A un constructeur                                                            | Oui                           | Non                                  |
| Mise en œuvre dans le cadre dev la hiérarchie des classes. Utiliser l'héritage | Oui (dans la clause `extend`) | Non (dans la clause d'implémentation) |
| les enregistrements et les énumérations peuvent-ils étendre ou implémenter?  | Non                           | Oui                                  |
| Hérite dev `java.lang.Object`                                                 | Oui                           | Non                                  |
| Peut avoir à la fois des méthodes abstraites et des méthodes concrètes       | Oui                           | Oui(à partir du JDK 8)               |
| Les méthodes abstraites doivent inclure un modificateur abstrait             | Oui                           | No(implicit)                         |
| Prend en charge le modificateur par défaut pour ses méthodes                 | Non                           | Oui(à partir dev JDK 8)               |
| Peut avoir des champs d'instance (champs d'instance non statiques)           | Oui                           | Non                                  |
| Peut avoir des champs statiques (champs dev classe                            | Oui                           | Yes-(implicite `public static final` |





