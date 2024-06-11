# **Java JSON Traitement | JSON-P**


+ **`JSR 353 adresse l'API Java` standard pour le traitement JSON et est expédié dans le cadre de `JavaEE 7`.**
+ **API Java pour Traitement JSON ( JSON-P ) fournit des API portables pour analyser, générer, transformer et interroger JSON à l'aide du modèle d'objet et des API de streaming.**
+ **Il y a deux façons de travailler avec JSON dans JSON-P:**

  + **API de streaming** 
  + **API de modèle d'objet.**

| Table des matières                  |
|-------------------------------------|
| API de streaming `JSON-P`            |
| API de modèle d'objet `JSON-P`        |
| Ajouter des dépendances             |
| Exemple de lecture Java `JSON`        |
| Exemple d'écriture Java `JSON`        |
| Java Create JSON Example            |
| Java Parse JSON Exemple             |
| Java JSON-P Exemple `JsonObjectBuilder` |
| Exemple Java `JSON-P JsonArrayBuilder` |
| JSON Pretty Printing Exemple        |


# **1. API Streaming JSON-P**

+ L'API de streaming transmet le contrôle d'analyse et de génération au programmeur. 
+ L'API de streaming fournit un analyseur basé sur les événements et permet à un développeur d'applications de demander le prochain événement plutôt que de gérer l'événement dans un rappel. C'est ce qu'on appelle une méthode de traction.
   
| Nom| 	Description                                                                                      |
|----|---------------------------------------------------------------------------------------------------|
|`Json`| 	Contient des méthodes statiques pour créer des analyseurs JSON, des générateurs et leurs usines. |
|`JsonParser`| 	Représente un analyseur basé sur des événements qui lit des données JSON d'un flux.              |
|`JsonGénérateur`| 	Écrit des données JSON dans un flux une valeur à la fois.                                        |


# **2. API modèle objet JSON-P**


+ L'API du modèle d'objet crée une structure arborescente qui représente les données JSON en mémoire. 
+ L'arbre peut être navigué et interrogé de manière flexible. 
+ D'autre part, l'API du modèle objet est souvent moins efficace que le modèle de streaming et nécessite plus de mémoire.
   
|Nom	| Description                                                                                      |
|-------|--------------------------------------------------------------------------------------------------|
|`Json`	| Contient des méthodes statiques pour créer des analyseurs JSON, des générateurs et leurs usines. 
|`JsonObjectBuilder`	| Crée un modèle d'objet en mémoire en ajoutant des valeurs à partir du code d'application.        
|`JsonArrayBuilder`	| Crée un modèle de tableau en mémoire en ajoutant des valeurs à partir du code d'application.     
|`JsonReader`	| Lit un JsonObject ou un JsonArray à partir d'une source d'entrée.                                
|`JsonWriter`	| Écrit un JsonObject ou un JsonArray sur une source de sortie.                                    
   

+ Les types de données `JSON` sont: 
  + **`JsonValue`**, 
  + **`JsonObject`**, 
  + **`JsonArray`**, 
  + **`JsonString`**  
  + **`JsonNumber`**.

# **3. Ajoutez Dépendances**

+ `JSON-P` est l'implémentation de référence pour Java JSON Processing API. 
+ Nous pouvons l'utiliser dans le projet Maven en ajoutant les dépendances suivantes :


            <dependency>
                <groupId>javax.json</groupId>
                <artifactId>javax.json-api</artifactId>
                <version>1.1</version>
            </dependency>

            <dependency>
                <groupId>org.glassfish</groupId>
                <artifactId>javax.json</artifactId>
                <version>1.1</version>
            </dependency>