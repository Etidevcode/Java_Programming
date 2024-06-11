
# **Java XML**

---

+ **`JAVA` fournit un excellent support et un riche ensemble de bibliothèques pour analyser, modifier ou rechercher des documents `XML`.**
+ **Cette partie expliquera différents types d'analyseurs basés sur Java avec des exemples d'une manière simple et intuitive.**
+ **Nous allons également apprendre à convertir un objet vers/depuis `XML` en utilisant `l'API JAXB en Java`.**

+ En Java `JDK`, deux analyseurs XML intégrés sont disponibles 

  + `DOM` et `SAX`, les deux ont leurs avantages et leurs inconvénients. 
  + Voici quelques exemples pour montrer comment créer, modifier et lire un fichier `XML avec Java DOM, SAX et JDOM`.

### **DOM XML Parser**

---

+ **`DOM Parser` est l'analyseur `XML` Java le plus facile à apprendre.**
+ **`L'analyseur DOM` charge le fichier XML en mémoire et nous pouvons le parcourir nœud par nœud pour analyser le `XML`.** 
+ **`DOM Parser` est bon pour les petits fichiers, mais lorsque la taille du fichier augmente, il fonctionne lentement et consomme plus de mémoire.**

  + **Comment lire un fichier `XML en Java - DOM Parser`.**
  + **Comment Modifier ou Mettre à jour un fichier `XML en Java`.**
  + **Comment créer un fichier `XML en Java`.**


### **SAX Parser**

+ **`L'analyseur SAX` fonctionne différemment de `l'analyseur DOM`, il ne charge aucun document `XML` en mémoire et crée une représentation d'objet du document `XML`.** 
+ **Au lieu de cela, `l'analyseur SAX` utilise la fonction de rappel `(org.xml.sax.helpers.DefaultHandler)` pour informer les clients de la structure du document `XML`.**

    + **Comment lire un fichier `XML` dans `Java-SAX Parser`.**


### **JDOM Parser**

+ **`JDOM` fournit une excellente `API` d'analyse `Java XML` pour lire, éditer et écrire facilement des documents `XML`.** 
+ **`JDOM` fournit des classes de wrapper pour choisir votre implémentation sous-jacente à partir de `SAX Parser, DOM Parser, STAX Event Parser et STAX Stream Parser`.**

  + **Comment lire un fichier `XML` dans `Java-JDOM Parser`**
  + **Comment mettre à jour ou modifier un fichier `XML` dans` Java – JDOM Parser`**
  + **Comment créer un fichier `XML` dans `Java – JDOM Parser`**


### **JAXB**

+ **L'architecture Java pour la liaison `XML (JAXB)` est une norme Java qui définit la façon dont les objets Java sont convertis à partir et en `XML`.**
+ **Il utilise un ensemble standard de mappages. `JAXB` définit une `API` pour la lecture et l'écriture d'objets Java vers et depuis des documents `XML`.**

+ **Comment convertir un objet `Java` en `XML - JAXB Marshalling`**
+ **Comment convertir un objet `XML` en `Java` - Démarrage `JAXB`**
+ **Tutoriel `JAXB` et Tutoriel `JAXB (Site Oracle)`**

### **Derniers exemples JAXB utilisant Java 11**

+ **`JAXB - Comment convertir un objet Java vers/depuis XML`** 
  - **Dans ce tutoriel, nous allons vous montrer comment utiliser `l'API JAXB` pour convertir `Java Object vers/depuis XML`.** 
  - **Dans cet exemple, nous utilisons JDK 11 et Maven pour créer nos applications.**
  
+ **`Java JAXB Exemple Tutoriel (Java 11)`** 
  - **Dans ce tutoriel, nous allons vous montrer comment utiliser `l'API JAXB` pour convertir `Java Object vers/depuis XML`.** 
  - **Dans cet exemple, nous utilisons JDK 11 et Maven pour créer nos applications.**

