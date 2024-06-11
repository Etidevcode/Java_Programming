### **Mutable vs Immuable**
+ Les objets ont un état, qui correspond aux champs d'instance stockés dans les données.
+ L'état peut changer après la création d'un objet, que ce soit intentionnellement ou non.
+ Lorsque l'état reste constant tout au long dev la durée dev vie dev l'objet et que le code ne peut pas changer d'état, cet objet est appelé « objet mutable ».
+ Un « objet immuable » est un objet dont l'état interne reste constant.
+ Un `objet mutable` est un objet dont l'état interne ne reste pas constant.
+ Quel est le meilleur ?
+ Eh bien, comme toute autre chose, ça dépend.

### **Objets immuables - Avantages**
+ Travailler avec des objets présente certains avantages.
+ `Un objet immuable` n'est pas sujet à des modifications indésirables, imprévues et involontaires, appelées effets secondaires.
+ `Une classe immuable` est intrinsèquement `thread-safe`, car aucun thread ne peut la modifier une fois qu'elle a été construite.
+ Cela nous permet d'utiliser des collections et des opérations plus efficaces, qui n'ont pas à gérer la synchronisation des accès à cet objet.
+ Ce sont deux avantages les plus importants.

### **Objets immuables - Inconvénients**
+ Travailler avec des objets immuables présente certains inconvénients.
+ Un `objet immuable` ne peut pas être modifié après sa création.
+ Cela signifie que lorsqu'une nouvelle valeur est nécessaire, vous devrez probablement faire une copie dev l'objet avec la nouvelle valeur.
+ Vous vous souviendrez dev la discussion comparant  `String vs StringBuilder`.
+ Si vous avez constamment besoin dev modifier les valeurs du texte, il est plus efficace d'utiliser un objet mutable comme une instance `StringBuiler`, générant des tonnes dev `nouveaux objets String`.

### **La classe doit être conçue pour produire des objets immuables**
+ Je parlerai dev la conception dev classes immuables à venir.
+ Il est important dev comprendre que les `POJO et Java Beans`, créés par dev nombreux outils dev génération dev code, ne sont pas par conception immuables, et par conséquent, cette architecture n'est peut-être pas la conception préférée pour votre classe.
+ Tout cela semble plutôt simple, mais dev nombreux sujets y sont liés.
+ L'un des outils les plus utiles dev notre arsenal pour créer des classes immuables est le modificateur d'accès final.
+ Je reviendrai sur ce modificateur beaucoup plus en détail.

### **Mutable vs Immuable**
+ Les objets ont un état, qui correspond aux champs d'instance stockés dans les données.
+ L'état peut changer après la création d'un objet, que ce soit intentionnellement ou non.
+ Lorsque l'état reste constant tout au long dev la durée dev vie dev l'objet et que le code ne peut pas changer d'état, cet objet est appelé « objet mutable ».
+ Un « objet immuable » est un objet dont l'état interne reste constant.
+ Un `objet mutable` est un objet dont l'état interne ne reste pas constant.
+ Quel est le meilleur ?
+ Eh bien, comme toute autre chose, ça dépend.

### **Le modificateur final en Java**
+ Lorsque nous utilisons le « modificateur final », nous pouvons empêcher toute modification supplémentaire dev ce composant.
    + Une `méthode finale` signifie qu'elle ne peut pas être remplacée par une sous-classe.
    + Un « champ final » signifie que le champ d'un objet ne peut pas être réaffecté ou recevoir une valeur différente après son initialisation.
    + Un `finals static` est un champ dev classe qui ne peut pas être réaffecté, ni recevoir une valeur différente, après le processus d'initialisation dev la classe. Un champ déclaré sur une interface est toujours « public, statique et final ».
+ Une `classe finale` ne peut pas être surchargée, ce qui signifie qu'aucune classe ne peut l'utiliser, dans la clause extends.
    + Une `variable finale`, dans un bloc dev code, signifie qu'une fois qu'une valeur lui a été attribuée, tout code restant dans le bloc ne peut pas la changer.
    + `Un paramètre dev méthode final signifie que nous ne pouvons pas attribuer une valeur différente à ce paramètre dans le bloc dev code dev méthode`.

### **Utilisation du modificateur final sur les méthodes**
+ Vous pouvez utiliser le modificateur final sur les méthodes.
+ Utiliser final avec des méthodes n'a dev sens que si vous souhaitez restreindre ce que votre sous-classe peut remplacer ou masquer.
+ Utiliser final sur une méthode `instance` signifie que la sous-classe ne peut pas la `remplacer`.
+ Utiliser final sur une méthode `class(static)` signifie que les sous-classes ne peuvent pas la `masquer`.

### **Formatting Date Time**

+ There are many ways to format date and time.
+ A couple of standardized ones are shown here.
+ These apply to the formatted method on String, as well as the printf method.

||                                                                                                                        |
|-----|------------------------------------------------------------------------------------------------------------------------|
|`'R'`| Time formatted for the 24-hour clock as `"%tH:%tM"`                                                                    |
|`'T'`| Time formatted for the 24-hour clock as `"%tH:%tM:%tS"`                                                                |
|`'r'`| Time formatted for the 24-hour clock as `"%tI:%tM:%tS:%Tp"`. The location of the morning or afternoon marker `('%Tp')` |
|`'D'`| Date formatted as `"%tm/%td/%ty"`                                                                                      |
|`'F'`| ISO 8601 complete date formatted as `"%tY-%tm-%td"`                                                                    |
|`'c'`| Date and time formatted as `"%ta %tb %td %tT %tZ %tY"`, e.g. "Sun Jul 20 16:17:00 EDT 1969".                           |

+ This information was retrieved from the link I show here.
+ https://docs.orcale.com/en/java/javase/17/docs/api/java.base/util/Formatter.html#dt

### **Collections non modifiables et vues de collection non modifiables**
+ Les trois principales `interfaces de collection, List, Set ou Map` ont des méthodes pour obtenir une copie non modifiable sur l'interface spécifique, liée au type de collection, comme indiqué, en plus la classe `java.util.Collections` propose des méthodes, pour obtenez des vues non modifiables comme indiqué.
+ Ces méthodes permettent de se rapprocher de l'idéal d'immuabilité, si besoin est.

| -        | Copie non modifiable des collections                                          | Vue non modifiable de la collection                                                                                          |
|----------|-------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------|
| **List** | `List.copyOf` <br/> `List.of`                                                 | **Collections.unmodifiableList**                                                                                             |
| **Set**  | `Set.copyOf` <br/> `Set.of`                                                   | **Collections.unmodifiableSet** <br/> **Collections.unmodifiableNavigableSet** <br/> **Collections.unmodifiableSortedSet**   |
| **Map**  | `Map.copyOf` <br/> `Map.entry(K k, V v)` <br/> `Map.of` <br/> `Map.ofEntries` | **Collections.unmodifiableMap** <br/> **Collections.unmodifiableNavigableMap** <br/> **Collections.unmodifiableSortableMap** |

### **Les cours finaux**

| Opérations | classe final | classe abstraite | constructeurs privés uniquement | constructeurs protégés uniquement |
|---------------------------------------------|--------------|----------------|--------------------------------|-----------------------------------------------------|
| Instancier une nouvelle instance | Oui          | Non | Non | Oui, mais uniquement les sous-classes et les classes du même package |
| Une sous-classe peut être déclarée avec succès | Non          | Oui | Non | Oui |

+ Les modificateurs `final et abstract` sont incompatibles et ne seraient pas utilisés dans la même déclaration.
+ Vous pouvez voir que si vous ne souhaitez pas que votre classe soit instanciée, vous pouvez soit la rendre abstraite, soit utiliser un modificateur d'accès plus restrictif sur la classe.


### **Classes scellées**
+ `JDK17` a introduit un nouveau modificateur, `sealed`, pour nos classes et interfaces.
+ Ce modificateur peut être utilisé à la fois pour les types externes et les types imbriqués.
+ Lorsqu'elle est utilisée, une clause « permits » est également requise dans la plupart des cas, qui répertorie les sous-classes autorisées.
+ Les sous-classes peuvent être des classes imbriquées, des classes déclarées dans le même fichier, des classes dans le même package ou, si vous utilisez des modules Java, dans le même module.
+ Ce que cela signifie cependant, pour cette conversation spécifique, c'est que tout notre code jusqu'à présent, depuis `JDK9`, fait partie de ce qu'on appelle le module par défaut sans nom.
+ Pour cette raison, je ne peux pas utiliser de sous-classes dans la clause permits qui se trouvent dans d'autres packages.
+ Une classe `sealed` et ses sous-classes directes créent une référence circulaire.
+ L'utilisation du mot-clé seal nécessite que la classe parent « déclare ses sous-classes », en utilisant une clause permits.
+ Cela signifie que la classe parent doit connaître chaque sous-classe directe, et celles-ci doivent exister, dans le même package dans ce cas.
+ De plus, le mot-clé scellé impose une exigence à toutes les sous-classes déclarées dans la clause permits.
+ Cela nécessite que chaque sous-classe déclare l'un des trois modificateurs valides pour une classe étendant une classe scellée.
+ Ceux-ci sont `final, sealed, et non-sealed`.