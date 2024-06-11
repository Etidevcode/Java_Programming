### **<font color = "red">Qu'est-ce que la programmation orientée objet</font>**

+ Qu'est-ce que la `programmation orientée objet` ?
  + La `programmation orientée objet` est un moyen dev modéliser des objets du monde réel, qui contiennent à la fois des données et du code.
  + `OOP` est un acronyme courant pour `Programmation Orientée Objet`

### **<font color = "red">Programmation basée sur les classes</font>**
+ La `programmation basée sur les classes` commence par des classes, qui deviennent les plans
  pour les objets. Mais qu’est-ce que cela signifie réellement ?
+ Alors commençons, nous devons comprendre ce que sont les objets. Ils sont vraiment la clé
  à comprendre cette `programmation orientée objet`.

### **<font color = "red">Exercice sur les objets du monde réel</font>**

+ Alors, ce que j'aimerais que vous fassiez, c'est simplement jeter un coup d'œil autour dev vous, dans la zone dans laquelle vous vous trouvez en ce moment. Et si vous faites cela, vous constaterez qu’il existe dev nombreux exemples d’objets du monde réel.
+ Par exemple, je suis assis ici et je peux voir :
  + Un ordinateur
  + Je peux voir un clavier
  + Je peux voir un microphone
  + Je vois des étagères sur le mur
  + Je vois une porte.
+ Tous ces éléments sont des exemples d'objets du monde réel.

### **<font color = "red">État et comportement</font>**
+ Désormais, les objets du monde réel comportent deux composants principaux :
  + Etat
  + et comportement

### **<font color = "red">État (ordinateur)</font>**
+ Ainsi, l'état, en termes d'objet informatique, pourrait être:
  + La quantité dev RAM dont il dispose.
  + Le système d'exploitation qu'il exécute.
  + La taille du disque dur.
  + La taille du moniteur.
+ Ce sont des caractéristiques dev l'article, qui peuvent le décrire.

### **<font color = "red">État (fourmi)</font>**
+ On pourrait aussi décrire des objets animés, comme des personnes ou des animaux, ou encore des insectes, comme une fourmi. Pour une fourmi, l’état pourrait être :
  + L'âge
  + Le nombre dev logs
  + L'état dev conscience
  + Que la fourmi dorme ou soit éveillée.

### **<font color = "red">Comportement (ordinateur)</font>**
+ En plus dev l'état, les objets peuvent également avoir un comportement ou des actions qui peuvent être effectuées par l'objet ou sur l'objet.
+ Le comportement, pour un ordinateur, peut être des éléments tels que :
  + Démarrage
  + Arrêt
  + Bip ou émission d'un son
  + Dessiner quelque chose sur l'écran, et ainsi dev suite.
+ Tous ces éléments pourraient être décrits comme des comportements pour un ordinateur.

### **<font color = "red">Comportement (fourmi)</font>**
+ Pour une fourmi, le comportement pourrait être:
  + Manger
  + Boire
  + Combats
  + Transporter dev la nourriture, ce genre dev choses.

### **<font color = "red">État et comportement</font>**
+ Ainsi, la modélisation d'objets du monde réel en tant qu'objets logiciels est une partie fondamentale dev la programmation orientée objet.
+ Désormais, un objet logiciel stocke son état dans des champs, qui peuvent également être appelés des variables ou des attributs.
+ Et les objets exposent leur comportement avec des méthodes, dont nous avons déjà parlé. Alors, où est la place d’un cours ?
+ Jetons un autre regard sur la classe.

### **<font color = "red">La classe comme modèle</font>**
+ La classe décrit les données (fichiers) et le comportement (méthodes) pertinents pour l'objet du monde réel que nous voulons décrire.
+ Ceux-ci sont appelés membres dev la classe.
+ Un membre dev classe peut être un champ, une méthode ou un autre type d'élément dépendant.
+ Si un champ est statique, il n'y a qu'une seule copie en mémoire, et cette valeur est associée à la classe ou au modèle lui-même.
+ Si un champ n'est pas statique, on l'appelle un champ d'instance, et chaque objet peut avoir une valeur différente stockée pour ce champ.
+ Une méthode statique ne peut pas dépendre dev l'état d'un objet, elle ne peut donc référencer aucun membre d'instance.
+ En d’autres termes, toute méthode qui opère sur des champs d’instance doit être non statique.

### **<font color = "red">Modificateurs d'accès pour la classe</font>**
+ Une classe est dite dev niveau supérieur si elle est définie dans le fichier dev code source et non incluse dans le bloc dev code d'une autre classe, type ou méthode.
+ Une classe dev niveau supérieur n'a que deux options dev modificateur d'accès valides : public ou aucun

| Accès Mot-clé | Description                                                                                                                                                                    |
|---------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `public`      | `public` signifie que toute autre classe dev n'importe quel package peut accéder à cette classe.                                                                                |
| `protected`   | `protected` permet aux classes du même package et à toutes les sous-classes d'autres packages d'avoir accès au membre.                                                         |
| --            | Lorsque le modificateur est omis, cela a une signification particulière, appelée accès au package, ce qui signifie que le cals n'est accessible qu'aux classes du même package |
| `private`     | `private` signifie qu'aucune autre classe ne peut accéder à ce membre                                                                                                          |

 ### <font color="red">Encapsulation</font>

+ `Encapsulation ` dans la programmation orientée objet a généralement deux significations.
+ L'un est le regroupement dev comportements et d'attributs sur un seul objet.
+ L'autre est la pratique consistant à cacher des fichiers, et certaines méthodes, à l'accès public.

### **<font color = "red">Qu'est-ce qui est null?</font>**
+ `null` est un mot-clé spécial en Java, ce qui signifie que la variable ou l'attribut a un type, mais aucune référence à un objet.
+ Cela signifie qu'aucune instance ou objet n'est affecté à la variable ou au champ.
+ Les champs avec des types dev données primitifs ne sont jamais nuls

### **<font color = "red">Valeurs par défaut pour les champs sur les classes</font>**
+ Les champs des classes se voient attribuer des valeurs par défaut, intrinsèquement par Java, s'ils ne sont pas attribués explicitement.

| Type dev données             | Valeur par défaut attribuée |
|-----------------------------|-----------------------------|
| boolean                     | false                       |
| byte, short,int, long, char | 0                           |
| double, float               | 0.0                         |

### <font color = "red"> Que sont les getters et les setters? Pourquoi devrions-nous les utiliser ?</font>
+ Alors, que sont `les getters et les setters?`
+ Un `getter` est une méthode sur une classe, qui récupère les valeurs du champ privé et les renvoie.
+ Un `setter` est une méthode sur une classe qui permet dev contrôler et dev protéger l'accès aux champs privés.

### **<font color = "red">this</font>**
+ `this` un mot-clé spécial en Java.
+ Ce à quoi il fait réellement référence, c'est l'instance qui a été créée lorsque l'objet a été instancié..
+ Donc `this` est un nom dev référence spécial pour l'objet ou l'instance, qu'il peut utiliser pour se décrire.
+ Et nous pouvons utiliser `this` pour accéder aux champs dev la classe.

### **<font color = "red">Le constructeur par défaut</font>**
+ Si une classe ne contient aucune déclaration dev constructeur, alors un constructeur par défaut est implicitement déclaré.
+ Ce constructeur n'a pas dev paramètres et est souvent appelé constructeur sans arguments (sans arguments).
+ si une classe contient d'autres déclarations dev constructeur, alors un constructeur par défaut n'est PAS implicitement déclaré.

### **<font color = "red">Surcharge du constructeur</font>**

+ La `surcharge dev constructeur`  consiste à déclarer plusieurs constructeurs, avec différents paramètres formels.
+ Le nombre dev paramètres peut être différent selon les constructeurs.
+ Ou si le nombre dev paramètres est le même entre deux constructeurs, leurs types ou ordre des types doivent différer.

### **<font color = "red">Chaînage du constructeur avec this</font>**
+ Le `chaînage dev constructeurs` se produit lorsqu'un constructeur appelle explicitement un autre constructeur surchargé.
+ Vous ne pouvez appeler un constructeur qu'à partir d'un autre constructeur.
+ Vous devez utiliser l'instruction spéciale `this()` pour exécuter un autre constructeur, en lui passant des arguments si nécessaire.
+ Et `this()` doit être la première instruction exécutable, si elle est utilisée depuis un autre constructeur.

### **<font color = "red">Référence vs objet vs instance vs classe</font>**
+ Nous utilisons beaucoup les mots « référence », « objet », « instance » et « classe » lorsque nous parlons dev code Java.
+ Ces nouveaux concepts peuvent prêter à confusion au début.
+ On peut copier cette référence autant dev fois que l'on veut, mais il n'y a toujours qu'une seule maison à laquelle on fait référence.
+ En d'autres termes, nous copions le papier sur lequel figure l'adresse, pas la maison elle-même.
+ Nous pouvons passer des références en tant que paramètres au constructeur et aux méthodes.

### **<font color = "red">Objet vs instance vs classe</font>**
+ Vous créez un objet en « instanciant une classe ».
+ Objet et instance sont des termes interchangeables.
+ Vous pouvez créer dev nombreux objets en utilisant une seule classe. Chacun peut avoir des attributs ou des valeurs uniques.
+ Utilisons l'analogie dev la construction d'une maison pour comprendre les cours.
+ Une classe est essentiellement un plan pour la maison.
+ En utilisant le plan, nous pouvons construire autant dev maisons que nous le souhaitons, sur la base dev ces plans.
+ Cet objet peut également être appelé instance dev la classe. Nous aurions donc une instance dev house dans cet exemple.
+ Chaque maison que nous construisons a une adresse (un emplacement physique).
+ En d'autres termes, si nous voulons dire à quelqu'un où nous vivons, nous lui donnons notre adresse (peut-être écrite sur un morceau dev papier). C’est ce qu’on appelle une référence.


### **<font color = "red">Variables statiques</font>**
+ Déclaré en utilisant le mot-clé static.
+ Les variables statiques sont également appelées variables membres statiques.
+ Chaque instance dev la classe partage la même variable statique.
+ Ainsi, si des modifications sont apportées à cette variable, toutes les autres instances dev cette classe verront l'effet dev cette modification.
+ Il est recommandé d'utiliser le nom dev la classe, et non la variable dev référence, pour accéder à une variable statique.
+ Il n'est pas nécessaire qu'une instance existe pour accéder à la valeur d'une variable statique.
+ Les variables statiques ne sont pas très souvent utilisées, mais peuvent parfois être très utiles. Ils peuvent être utilisés pour :
  + Stockage des compteurs
  + Générer des identifiants uniques
  + Stocker une valeur constante qui ne change pas, comme `PI` par exemple.
  + Créer et contrôler l'accès à une ressource partagée.

### **<font color = "red">Variables instantanées</font>**
+ Chaque instance possède sa propre copie d'une variable d'instance.
+ Chaque instance peut avoir une valeur différente.
+ Les variables d'instance représentent l'état d'une instance spécifique d'une classe.

### **<font color = "red">Méthodes statiques et d'instance</font>**
+ Méthodes statiques ou d'instance.

### **<font color = "red">Méthodes statiques</font>**
+ Les méthodes statiques sont déclarées à l'aide d'un modificateur static.
+ Les méthodes statiques ne peuvent pas accéder directement aux méthodes d'instance et aux variables instantanées.
+ Ils sont généralement utilisés pour des opérations qui ne nécessitent aucune donnée provenant d'une instance dev la classe (à partir dev « this »).
+ Si vous vous en souvenez, le mot-clé `this` est l'instance actuelle d'une classe.
+ Donc, dans une méthode statique, nous ne pouvons pas utiliser le mot-clé `this`.
+ Chaque fois que vous voyez une méthode qui n'utilise pas dev variables d'instance, cette méthode devrait probablement être déclarée comme méthode statique.
+ Par exemple, main est une méthode statique, et ut est appelée par la machine virtuelle Java lorsqu'elle démarre l'application Java.

### **<font color = "red">Méthodes d'instance</font>**
+ Les méthodes d'instance peuvent accéder directement aux méthodes d'instance et aux variables d'instance.
+ Les méthodes d'instance peuvent également accéder directement aux méthodes statiques et aux variables statiques.


### **<font color = "red">POJO (objet Java ancien)</font>**
+ Un vieil objet Java (dont l'acronyme est POJO) est une classe qui n'a généralement que des fichiers d'instance.
+ Il est utilisé pour héberger des données et les transmettre entre les classes fonctionnelles.
+ Il a généralement peu dev méthodes, voire aucune, autres que les « getters et setters ».
+ De nombreux frameworks dev bases dev données utilisent des POJO pour lire des données ou non pour écrire des données dans des bases dev données, des fichiers ou des flux.

### **<font color = "red">Exemples dev POJOS</font>**
+ Un POJO peut également être appelé un bean ou un JavaBean.
+ Un JavaBean n'est qu'un POJO, auquel sont appliquées quelques règles supplémentaires.
+ Un POJO est parfois appelé une Entité, car il reflète les entités dev la base dev données.
+ Un autre acronyme est « DTO », pour Data Transfer Object.
+ C'est une description d'un objet, qui peut être modélisé comme dev simples données.

### **<font color = "red">Prise en charge dev la création dev POJO</font>**
+ Il existe dev nombreux outils dev génération qui transformeront un modèle dev données en POJO ou JavaBeans générés.
+ Vous avez vu un exemple dev génération dev code similaire dans Intellij, qui nous a permis dev générer des « getters, setters et constructeurs » dev manière uniforme.

### **<font color = "red">Annotations</font>**
+ Les annotations sont un type dev métadonnées.
+ Metadata est un moyen dev décrire formellement des informations supplémentaires sur notre code.
+ Les annotations sont plus structurées et ont plus dev sens que les commentaires.
+ En effet, ils peuvent être utilisés par le compilateur, ou par d'autres types dev fonctions dev prétraitement, pour obtenir des informations sur le code.

### **<font color = "red">Annotation remplacée</font>**
+ Une méthode surchargée n’est pas la même chose qu’une méthode surchargée.
+ Une méthode remplacée est une méthode Java spéciale en Java, que d'autres classes peuvent implémenter, si elles utilisent une signature dev méthode spécifiée.


### **<font color = "red">Le POJO contre le Record</font>**
+ Dans la dernière partie, nous avons parlé du Plain Old Java Object, et nous vous avons expliqué comment il est livré avec une grande partie dev ce que nous appelons du code passe-partout.
+ C'est du code répétitif et qui suit certaines règles.
+ Une fois créé, ce code est rarement consulté ou modifié.
+ En fait, il existe des outils qui régénéreront simplement tout ce code si vos données sous-jacentes ou votre modèle dev domaine changent.

### **<font color = "red">Le type d'enregistrement</font>**
+ L'enregistrement est une classe spéciale qui contient des données qui ne sont pas destinées à être modifiées.
+ En d'autres termes, il cherche à atteindre l'immuabilité des données dev ses membres.
+ Il ne contient que les méthodes les plus fondamentales, telles que les constructeurs et les accesseurs.
+ Mieux encore, vous, le développeur, n'avez pas besoin d'écrire ou dev générer ce code.


### **<font color = "red">Code implicite ou généré fourni par Java</font>**
+ Que nous dit Java sur ce qui est implicitement créé, lorsque nous déclarons un enregistrement comme nous l'avons fait dans ce code ?
            
      public record LPAStudent(String id, String name, String dateOfBirth, String classList) {
      }
+ Tout d'abord, il est important dev comprendre que la partie qui est entre parenthèses s'appelle l'en-tête dev l'enregistrement.
+ L'en-tête d'enregistrement se compose dev composants d'enregistrement, une liste dev composants délimités par des virgules.

      public record LPAStudent(String id, String name, String dateOfBirth, String classList) {
      }


+ Java génère une méthode `toString` qui imprime chaque attribut dans une chaîne formatée.
+ En plus dev créer un champ final privé pour chaque composant, Java génère une méthode d'accesseur publique pour chaque composant.
+ Cette méthode a le même nom et le même type que le composant, mais elle n'a aucun type dev préfixe spécial, pas get, ou l'est, par exemple.
+ La méthode d'accès, pour id dans cet exemple, est simplement `id()`.

### **<font color = "red">Pourquoi avoir un enregistrement immuable</font>**
+ Pourquoi le dossier est-il construit pour être immuable?
+ Il existe davantage dev cas d'utilisation pour les objets dev transfert dev données immuables et pour les conserver bien encapsulés.
+ Vous souhaitez protéger les données des mutations involontaires.

### **<font color = "red">POJO contre Record</font>**
+ Si vous souhaitez modifier les données dev votre classe, vous n'utiliserez pas l'enregistrement.
+ Vous pouvez utiliser les options dev génération dev code pour le POJO, comme nous l'avons montré dans la vidéo précédente.
+ Mais si vous lisez un grand nombre d'enregistrements, à partir d'une base dev données ou d'une source dev fichier, et que vous transmettez simplement ces données, alors l'enregistrement constitue une grande amélioration.

### **<font color = "red">Le nouveau type dev Java, l'enregistrement</font>**
+ Nous n'avons abordé que quelques caractéristiques du disque, à titre d'introduction.
+ Lorsque nous parlerons davantage du mot-clé `final`  et dev l'immuabilité des données, d'autant plus qu'elles peuvent être affectées par des threads simultanés, nous reviendrons sur ce type.
+ Nous vous le montrerons également en action, lorsque vous accéderez aux sections Base dev données et E/S dev ce cours.


### **<font color = "red">Héritage</font>**
+ Qu’est-ce que l’héritage et pourquoi est-il si puissant ?
+ Nous pouvons considérer l'héritage comme une forme dev réutilisation du code.
+ C'est un moyen d'organiser les classes dans une hiérarchie parent-enfant, qui permet à l'enfant d'hériter (réutiliser) des fichiers et des méthodes dev son parent.
+ Chaque case dev ce diagramme représente une classe.
+ Le plus générique, commence au sommet dev la hiérarchie.
+ Chaque classe en dessous est une sous-classe.
+ Donc Animal est la classe dev base. Toutes les autres classes peuvent être considérées comme des sous-classes d’Animal.
+ Un parent peut avoir plusieurs enfants, comme on le voit Mammifère, qui est le parent du Chien et du Chat.
+ Un enfant ne peut avoir qu'un seul parent direct, en Java. Mais il héritera du parent dev sa classe parent, et ainsi dev suite.

<img src = "C:\Java-Programming-Masterclass-updated-to-java17\Section7-OOP-Part1-Inheritance\images\inheritance.png"/>

### **<font color = "red">Classe d'animaux</font>**
+ Un diagramme dev classes, nous permet dev concevoir nos classes avant dev les construire.
+ Ce diagramme montre la classe Animal, avec les attributs que nous pensons que chaque type d'animal possède.
+ En dessous des champs, nous avons le comportement que les animaux ont en commun, bouger et faire du bruit.

<img src = "C:\Java-Programming-Masterclass-updated-to-java17\Section7-OOP-Part1-Inheritance\images\dog.png"/>

### **<font color = "red">Modèle dev classe pour animal et chien</font>**
+ Le chien hérite dev l'animal.
+ En d’autres termes, le chien « EST UN » type d’animal.
+ Lorsque nous créons un objet Chien, il héritera des attributs dev l'animal (type, taille et poids).
+ Cela est également vrai pour les méthodes Animal. Le chien en héritera également.
+ Nous pouvons spécialiser la classe Chien avec ses propres champs et comportements.

<img src = "C:\Java-Programming-Masterclass-updated-to-java17\Section7-OOP-Part1-Inheritance\images\animal_dog.png"/>

### **<font color = "red">extends</font>**

+ L'utilisation dev `extends` spécifie la superclasse (ou la classe parent) dev la classe que nous déclarons.
+ On peut dire que Dog est une sous-classe, ou classe enfant, d'Animal.
+ On peut dire qu'Animal est un parent, ou une super classe, dev Chien.
+ Une classe peut spécifier une classe, et en ajouter une seule, dans sa clause extends.

### **<font color = "red">super()</font>**
+ `super()` ressemble beaucoup à `this()`.
+ C'est une manière d'appeler un constructeur sur la super classe, directement depuis le constructeur dev la sous classe.
+ Comme `this()`, ce doit être la première instruction du constructeur.
+ En raison dev cette règle, `this() et super()` ne peuvent jamais être appelés depuis le même constructeur.
+ Si vous n'appelez pas `super()`, alors Java le fait pour vous, en utilisant le constructeur par défaut dev super.
+ Si votre super classe n'a pas dev constructeur par défaut, vous devez appeler explicitement `super()` dans tous vos constructeurs, en passant les bons arguments à ces constructeurs.


### **<font color = "red">Héritage en Java</font>**
+ Nous vous avons présenté le concept et vous avons montré comment l'implémenter en Java, en utilisant le mot-clé `extends`.
+ Nous avons parlé dev l'utilisation dev l'instruction `super()` pour appeler le constructeur sur la super classe.

### **<font color = "red">Méthode remplacée</font>**
+ La méthode `overidden` peut faire l'une des trois choses suivantes:
  + Il peut implémenter un comportement complètement différent, remplaçant le parent.
  + Il peut simplement appeler la méthode dev la classe actuelle, ce qui est quelque peu redondant
  + Ou la méthode peut appeler la méthode dev la classe parent et inclure d'autres codes à exécuter, afin dev pouvoir étendre les fonctionnalités du chien, pour ce comportement.

### **<font color = "red">Polymorphisme</font>**
+ « Polymorphisme » signifie simplement « plusieurs formes ».
+ Et comme vous l'avez vu, certains des avantages du «Polymorphisme» sont:
  + cela simplifie le code.
  + cela encourage l'extensibilité du code.

### **<font color = "blue">Héritage</font>**
+ L'héritage semble plutôt intéressant, mais quand l'utiliserions-nous vraiment?

### **<font color = "blue">Java.lang.Object</font>**
+ En effet, chaque classe que vous créez en Java étend intrinsèquement une classe Java spéciale.
+ Cette classe s'appelle `Object` et elle se trouve dans le `package java.lang`.
+ Ok, c'est déroutant, une classe appelée `Object` ?
+ Voyons ce que Java a à dire sur cette classe.
+ Nous utiliserons le lien vers l'interface dev programmation d'application (API) dev Java pour cette classe, que vous pouvez trouver dans la section ressources dev cette vidéo.

### **<font color = "blue">Chaque classe hérite dev l'objet</font>**
+ Cette diapositive montre que notre « Classe principale » hérite dev, ou est une sous-classe dev « Objet », et est également une chaîne. Cette classe String possède plus dev 60 méthodes.

### **Héritage**
+ L'héritage semble plutôt intéressant, mais quand l'utiliserions-nous vraiment ?

### **Ceci contre Super**
+ Discutons dev la différence entre les mots-clés « this » et « super ».
+ Nous découvrirons également les différences entre les appels aux méthodes `this()` et `super()`.
+ Commençons par les mots-clés `super` et `this`.
+ Le mot-clé `super` est utilisé pour accéder ou appeler les membres dev la classe parent (variables et méthodes).
+ `this` est obligatoire, lorsque nous avons un paramètre du même nom, en tant que variable d'instance ou champ.
+ `REMARQUE :` Nous pouvons utiliser l'un ou l'autre n'importe où dans une classe, à l'exception des éléments statiques, comme une méthode statique. Toute tentative dev le faire à cet endroit entraînera des erreurs dev compilation.

### **Mot clé ceci**
+ Le mot-clé `this` est couramment utilisé avec les constructeurs et les setters, et éventuellement utilisé dans les getters.
+ Dans cet exemple, nous utilisons le mot-clé dans le constructeur et le setter, car il existe un paramètre portant le même nom que l'instance ou le champ.
+ Dans le getter, nous n'avons aucun paramètre, donc il n'y a pas dev conflit, donc le mot-clé `this` y est facultatif.

### **Mot clé super**
+ Le mot-clé `super`, est couramment utilisé avec `method overriding`, lorsque nous appelons une méthode du même nom, à partir dev la classe parent.
+ Dans cet exemple, nous avons une méthode appelée `printMethod` qui appelle `super.printMethod`.

### **Appel this() vs super()**
+ En Java, nous avons les appels `this()` et `super()`. Notez les parenthèses. Il s'agit d'appels, car cela ressemble à un appel dev méthode normal, même si nous appelons certains constructeurs.
+ Utilisez `this()` pour appeler un constructeur, à partir d'un autre constructeur surchargé dev la même classe.
+ L'appel à `this()` ne peut être utilisé que dans un constructeur, et il doit s'agir du premier constructeur d'instruction.
+ Il est utilisé avec le chaînage dev constructeurs, en d'autres termes lorsqu'un constructeur appelle un autre constructeur, et il permet dev réduire le code dupliqué.
+ La seule façon d'appeler un constructeur parent est d'appeler `super()`, qui appelle le constructeur parent.
+ Le compilateur Java appelle par défaut `super()`, si nous ne l'ajoutons pas, et c'est toujours un appel au constructeur sans argument, qui est inséré par le compilateur.
+ L'appel à `super()` doit être la première instruction dev chaque constructeur.
+ Un constructeur peut appeler `super()` ou `this()`, mais jamais les deux.


### **Méthode dev remplacement ou surcharge**
+ Passons en revue les principales différences entre le « remplacement dev méthode et la surcharge dev méthode ».

### **Surcharge dev méthode**
+ `La surcharge dev méthodes` signifie fournir deux ou plusieurs méthodes distinctes, dans une classe, avec le même nom, mais des paramètres différents.
+ Le type dev retour dev la méthode peut être différent ou non, ce qui nous permet dev réutiliser le même nom dev méthode.
+ La surcharge est très pratique, elle réduit le code dupliqué et nous n'avons pas besoin dev mémoriser plusieurs noms dev méthodes.
+ Nous pouvons surcharger les méthodes statiques ou d'instance.
+ Pour le code appelant une méthode surchargée, il semble qu'une seule méthode puisse être appelée, avec différents ensembles d'arguments.
+ En réalité, chaque appel effectué avec un ensemble d'arguments différent appelle une méthode distincte.
+ Les développeurs Java appellent souvent la surcharge dev méthodes le polymorphisme au moment dev la compilation.
+ Cela signifie que le compilateur détermine la bonne méthode à appeler, en fonction du nom dev la méthode et dev la liste d'arguments.
+ Habituellement, la surcharge se produit au sein d'une seule classe. Mais les méthodes peuvent aussi être surchargées par les sous-classes.
+ En effet, une sous-classe hérite d'une version dev la méthode dev la classe parent, et la sous-classe peut alors avoir une autre version surchargée dev cette méthode.

### ***Règles dev surcharge des méthodes**
+ Les méthodes seront considérées comme surchargées si les deux méthodes suivent les règles suivantes :
  + Les méthodes doivent avoir le même nom dev méthode.
  + Les méthodes doivent avoir des paramètres différents.
+ Si les méthodes suivent les règles ci-dessus:
  + Ils peuvent ou non avoir des types dev retour différents.
  + Ils peuvent ou non avoir des modificateurs d'accès différents.
  + Ils peuvent ou non lancer différentes exceptions cochées ou non cochées.

### **Méthode remplacée**

+ Le remplacement dev méthode signifie définir une méthode dans une classe enfant, qui existe déjà dans la classe parent, avec la même signature (le même nom, les mêmes arguments).
+ En étendant la classe parent, la classe enfant obtient toutes les méthodes définies dans la classe parent (ces méthodes sont également appelées méthodes dérivées).
+ Le remplacement dev méthode est également connu sous le nom dev polymorphisme d'exécution, ou répartition dynamique dev méthode, car la méthode qui va être appelée est décidée au moment dev l'exécution, par la machine virtuelle Java.
+ Lorsque l'on surcharge une méthode, il est recommandé dev mettre @Override, immédiatement au-dessus dev la définition dev la méthode.
+ L'instruction `@Override` n'est pas obligatoire, mais c'est un moyen pour que le compilateur signale une erreur, si vous ne remplacez pas correctement cette méthode.
+ Nous obtiendrons une erreur si nous ne suivons pas correctement les règles dérogatoires.
+ Nous ne pouvons pas remplacer les méthodes statiques, seules les méthodes d'instance peuvent être remplacées.

### **Règles dev remplacement des méthodes**

+ Une méthode sera considérée comme remplacée si nous suivons ces règles.
  + Il doit avoir le même nom et les mêmes arguments.
  + Le type dev retour peut être une sous-classe du type dev retour dans la classe parent.
  + Il ne peut pas avoir dev modificateur d'accès inférieur. En d’autres termes, il ne peut pas avoir dev privilèges d’accès plus restrictifs.
  + Par exemple, si la méthode du parent est protégée, l'utilisation dev private dans la méthode remplacée dev l'enfant n'est pas autorisée. Cependant, l'utilisation dev public pour la méthode dev l'enfant serait autorisée, dans cet exemple.
  + Il y a aussi quelques points importants à garder à l'esprit concernant le remplacement dev méthode.
  + Seules les méthodes héritées peuvent être remplacées, en d'autres termes, les méthodes ne peuvent être remplacées que dans les classes enfants.
  + Les constructeurs et les méthodes privées ne peuvent pas être remplacés.
  + Les méthodes définitives ne peuvent pas être remplacées.
  + Une sous-classe peut utiliser `super.methodName()` pour appeler la version superclasse d'une méthode remplacée.


### **Méthode dev remplacement ou surcharge**

|Surcharge dev méthode|Remplacement dev méthode|
|--------------------------------|------------------------------|
|Fournit une fonctionnalité permettant dev réutiliser un nom dev méthode avec différents paramètres.|Utilisé pour remplacer un comportement dont la classe a hérité dev la classe parent.|
|Généralement dans une seule classe, mais peut également être utilisé dans une classe enfant.|Toujours dans deux classes ayant une relation enfant-parent ou IS-A.|
|Doit avoir des paramètres différents.|Doit avoir les mêmes paramètres et le même nom.|
|Peut avoir différents types dev retour.|Doit avoir le même type dev retour ou le même type dev retour covariant (classe enfant).|
|Peut avoir différents modificateurs d'accès (privé, protégé, public).|Ne doit PAS avoir un modificateur inférieur mais peut avoir un modificateur supérieur.|
|Peut lever différentes exceptions.|Ne doit PAS lancer une exception vérifiée nouvelle ou plus large.|

### **Qu'est-ce qu'un bloc dev texte**
+ Un `bloc dev texte` n'est qu'un format spécial pour les littéraux dev chaîne multilignes.
+ C'est simplement un `String`, avec une nouvelle représentation dans le code source.
+ Il est devenu une partie dev la langue officielle du `JDK 15`.

### **Quelques séquences d'échappement courantes**
+ Une séquence d'échappement commence par une barre oblique noire. Java en propose plusieurs, mais les plus courantes sont présentées sur cette diapositive.

|Séquence d'échappement|Description|
|-------------------|------------------------|
|`\t`|Insérer un caractère dev tabulation|
|`\n`|Insérer un nouveau caractère dev ligne|
|`\"`|Insérer un guillemet double|
|`\\`|Insérer une barre oblique noire|

<img src="https://miro.medium.com/v2/resize:fit:1400/1*nKpH32tX9hLOdBs9ppP3JA.png"/>

### **La chaîne**
+ The String propose plus dev 60 méthodes.
+ La chaîne est une séquence dev caractères, c'est-à-dire son caractère, c'est-à-dire son ordre et son index.
+ L'index commence à 0, et non à 1.

| Indice    |0| 1| 2| 3 | 4| 5| 6 | 7 | 8 | 9 | 10  |
|-----------|---|-----|----|---|--|---|--|---|---|---|-----|
| character |H|e|l| l |o|  | W | o | r | l   | d |

### **Le but des méthodes String**
+ Nous pouvons diviser les méthodes dev chaîne en trois catégories dev base :
  + Méthodes d'inspection `String`.
  + Méthode dev comparaison des valeurs `String`.
  + Méthodes dev manipulation `String`.
+ Commençons par examiner certaines des méthodes d'inspection `String`.

### **Méthodes d'inspection des chaînes**

| méthode               | description                                                                                                                                                                                                                                 |
|-----------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `length`              | Renvoie le nombre dev caractères dans le`String`                                                                                                                                                                                             |
| `charAt`              | Renvoie le caractère à l'index passé                                                                                                                                                                                                        |
| `indexOf lastIndexOf` | Renvoie un entier, représentant l'index dans la séquence où le `String` ou le caractère passé peut être situé dans la `String`                                                                                                              |
| `isEmpty`             | Renvoie vrai si la longueur est nulle                                                                                                                                                                                                       |
| `isBalnk`             | Renvoie vrai si la longueur est nulle OU si la chaîne ne contient que des caractères d'espacement, ajoutés dans `JDK 11`.                                                                                                                   |
| `contentEquals`       | Renvoie un booléen si la valeur dev la chaîne est égale à la valeur dev l'argument passé. Cette méthode autorise des arguments autres que `String`, pour tout type qui est une séquence dev caractères.                                        |
| `equals`              | Renvoie un booléen si la valeur dev la chaîne est égale à la valeur dev l'argument passé.                                                                                                                                                     |
| `equalsIgnoreCase`    | Renvoie un booléen si la valeur `String` est égale (cas d'enregistrement) à la valeur dev l'argument passé.                                                                                                                                  |
| `contains`            | Renvoie un booléen si le `String` contient l'argument passé                                                                                                                                                                                 |
| `endsWith startsWith`      | Celles-ci renvoient un booléen et ressemblent beaucoup à la méthode contain, mais sont plus spécifiques au placement dev l'argument dans le `String`                                                                                         |
| `regionMatches`       | Renvoie un booléen, si les sous-régions définies correspondent                                                                                                                                                                              |
|`indent`| Cette méthode a été ajoutée dans `JDK 15` et ajoute ou supprime dev ce début dev ligne dans un texte multiligne.                                                                                                                              |
|`strip stripLeading stripTrailing trim`| La différence entre la méthode `strip` et `trim` est que `strip()` prend en charge un plus grand ensemble dev caractères d'espacement. Elle et les méthodes `stripLeading` ou `stripTrailing` correspondantes ont été ajoutées dans `JDK 11` |
|`toLowerCase toUpperCase`| Renvoie un nouveau `String`, soit en minuscules, soit en majuscules                                                                                                                                                                         |
|`concat`| Semblable à l'opérateur plus pour les chaînes, il concatène le texte du `String` et renvoie une nouvelle `String` comme résultat                                                                                                            |
|`join`| Permet dev concaténer plusieurs chaînes dans une seule méthode, en spécifiant un délimiteur                                                                                                                                                  |
|`repeat`| Renvoie le `String` répété le nombre dev fois spécifié dans l'argument                                                                                                                                                                       |
|`replace replaceAll replaceFirst`| Ces méthodes remplacent des caractères ou des chaînes dans la chaîne, renvoyant une nouvelle `String` avec les remplacements effectués.                                                                                                     |
|`substring subSequence`| Ceux-ci renvoient une partie du `String`, sa plage définie par l'index dev début et dev fin spécifié.                                                                                                                                         |




