### **Aperçu**
+ Dans cette section du cours, nous allons nous intéresser aux bases dev données.
+ Nous allons commencer par un aperçu dev `Bases dev données et installer SQLite`, une source gratuite et open source dev `SQL` (qui est un langage dev base dev données utilisé pour communiquer avec les bases dev données).
+ Nous utiliserons la ligne dev commande lorsque nous commencerons à utiliser `SQL`, mais ensuite dans les vidéos ultérieures dev cette section, nous passerons à Java et commencerons à utiliser les bases dev données à partir dev Java.
+ Mais nous devons comprendre `SQL` avant dev faire cela.
+ Vous vous demandez peut-être pourquoi `SQLite` et pas `MySQL`, une autre base dev données ?
+ D'une manière générale, les compétences que vous apprendrez avec `SQLite` s'appliquent à n'importe quelle base dev données, y compris `MySQL`. Ainsi, le « SQL » que vous apprendrez et le code Java que vous créerez nécessitent très peu dev modifications pour fonctionner sur n'importe quelle base dev données.
+ `SQLite` est idéal pour commencer, et j'ai des vidéos dans cette section montrant comment le faire fonctionner sous Windows. Mac et Linus aussi.
+ Mais vers la fin dev cette section, nous allons également rendre MySQL opérationnel à titre d'exercice afin que vous puissiez voir à quel point il est facile d'accéder à une autre base dev données.

### **Terminologie des bases dev données**
+ `Database` : le conteneur dev toutes les données que vous stockez.
+ Dans SQLite, l'intégralité dev la base dev données est stockée dans un seul fichier.
+ `Database Dictionary :` fournit une liste complète dev la structure et des types dev données dans la base dev données.
+ `Table :` une collection dev données associées contenues dans la base dev données.
+ `Field :` l'unité dev base des données dans un tableau.
+ Le tableau Factures comporte les champs Facture, Date, Description et Montant.
+ `Colonne :` est un autre nom pour le champ.
+ Cela peut prêter à confusion, mais les bases dev données relationnelles existaient avant les feuilles dev calcul.
+ `Row :` un seul ensemble dev données contenant toutes les colonnes du tableau.
+ Le tableau Factures comporte 4 lignes - les lignes sont également appelées enregistrements.
+ Cela entraîne beaucoup dev duplications...
+ et rend les mises à jour difficiles.
+ `A View` est une sélection dev lignes et dev colonnes, possible à partir dev plus d'une table.

### **Telechargement SQLite**
+ [SQLite](www.sqlite.org/download.html)
            
                OU
            choco install sqlite