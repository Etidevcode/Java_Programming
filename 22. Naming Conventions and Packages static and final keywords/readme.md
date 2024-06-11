### **Convention de dénomination Java**
+ L'adoption des conventions acceptées pour nommer les variables, les méthodes et les objets en Java rend votre code plus facile à lire pour les autres.
+ `"Autres"` ici vous inclut également lorsque vous regardez votre code des semaines ou des mois après l'avoir écrit.

### **Paquets**
+ Les choses que vous nommerez en java sont :
    + Packages
    + Classes
    + Interfaces
    + Methods
    + Constants
    + Variables
    + Type Parameters
  
+ Toujours en minuscules.
+ Les noms des packages doivent être uniques.
+ Utilisez votre nom de domaine Internet, inversé, comme préfixe pour le nom du package.
+ Oracle spécifie une convention pour les noms de packages à
  + http://docs.oracle.com/javase/specs/jls/se6/htlm/packages.html#7.

### **Composants de nom de domaine invalides**
+ Remplacez le nom de domaine à caractère invalide (c'est-à-dire-) par un trait de soulignement.
+ Les composants de nom de domaine commençant par un chiffre doivent plutôt commencer par un trait de soulignement_.
+ Les composants de nom de domaine qui sont des mots-clés Java doivent commencer par un trait de soulignement.
+ Exemples avec remplacements:
    + Switch.supplier.com `--------->` com.supplier._switch
    + 1world.com `--------->` com._1world
    + Experts-exchange.com `---------->` com.experts_exchange

### **Examples de noms de packages**
+ java.lang
+ java.io
+ org.xml.sax.helpers
+ com.etienne.autoboxing

### **Noms des classes**
+ CamelCase
+ Les noms de classe doivent être des noms (ils représentent des choses).
+ Doit commencer par une majuscule
+ Chaque mot du nom doit également commencer par une majuscule (par exemple LinkeldList).
    + `ArrayList`
    + `LinkedlIst`
    + `String`
    + `TopSong`
    + `GearBox`
    + `Main`

### **Noms des interfaces**
+ En majuscules comme les noms de classe (CamelCase)
+ Considérez quels objets implémentant l'interface deviendront en fonction de ce qu'ils seront capables de faire.
+ Exemples:
    + **List**
    + **Comparable**
    + **Serializable**

### **Noms des méthodes**
+ Cas mixte
+ Souvent des verbes.
+ Refléter la fonction exécutée ou le résultat renvoyé.
+ Exemples:
    + **size()**
    + **getName()**
    + **addPlayer()**

### **Constantes**
+ TOUS LES UPPER_CASE.
+ Séparez les mots par un trait de soulignement_.
+ Déclaré à l'aide du mot-clé `final`.
+ Examples:
    + **Static final int MAX_INT**
    + **Static final short SEVERITY_ERROR**
    + **Static final double P1 =3.141592653**


### **Noms des variables**
+ MixedCase.
+ Significatif et indicatif.
+ Commencez par une lettre minuscule.
+ N'utilisez pas de trait de soulignement `_`.
+ Exemples:
    + i
    + league
    + SydneyStatus
    + BoxLength

### **Paramètres de types**
+ Caractère unique, lettres majuscules.
+ Lignes directrices données à
    + https://docs.oracle.com/javase/tutorial/generics/types.html
    + `E` - Élément (largement utilisé par Java Collections Framework)
    + `K` - Clé
    + `T` - Type
    + `V` - Valeur
    + `S, U, V, etc. - 2ème, 3ème, 4ème types`


  
