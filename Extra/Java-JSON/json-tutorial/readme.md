# **JSON.simple - Lire et écrire JSON en Java**




+ **`JSON.simple` est une bibliothèque Java simple pour `le traitement JSON, lire et écrire des données JSON` et la conformité complète avec la spécification `JSON (RFC4627)`.**

+ **Dans ce `JSON.simple` tutoriel, nous allons voir des exemples rapides pour écrire un fichier JSON avec `JSON.simple`, puis nous allons lire le fichier `JSON` en arrière.**

+ **Lisez et écrivez JSON en Java en utilisant [JSON-P](https://www.javaguides.net/2019/07/read-and-write-json-in-java.html).**

# **JSON.simple dépendance maven**

+ Vous pouvez télécharger la dernière version de la bibliothèque [JSON.simple](https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple).

+ + Voici la dernière dépendance de maven:

            <!-- https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple -->
            <dependency>
	            <groupId>com.googlecode.json-simple</groupId>
	            <artifactId>json-simple</artifactId>
	            <version>1.1.1</version>
            </dependency>

+ Dans les exemples ci-dessous, nous utilisons deux classes importantes de bibliothèque `JSON.simple` pour lire et écrire un fichier JSON en Java.

  + `JSONArray` : Pour écrire des données dans des tableaux JSON. Utilisez la méthode `add()` pour ajouter des objets de type JSONObject.
  + `JSONObjet` : Pour écrire des objets JSON. Utilisez la méthode `put` pour remplir les champs.