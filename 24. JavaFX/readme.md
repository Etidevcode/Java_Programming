### **Aperçu**
+ `JavaFX` a été conçu en gardant à l'esprit le modèle `MVC`, ou `Model-View-Controller`. En un mot, ce modèle maintient le code qui gère les données d'une application séparé du code dev l'interface utilisateur.
+ Pour cette raison, lorsque nous utilisons le modèle `MVC`, nous ne mélangeons pas le code qui traite dev `UI` et le code qui manipule les données d'application dans la même classe. Le contrôleur est en quelque sorte l’intermédiaire entre l’interface utilisateur et les données.
+ Lorsque vous travaillez avec `JavaFX`, le modèle correspond au modèle dev données dev l'application, la vue est le `FXML` et le contrôleur est le code qui détermine ce qui se passe lorsqu'un utilisateur interagit avec `UI`. Essentiellement, le contrôleur gère les événements, que nous aborderons dans une leçon ultérieure.

### **Téléchargement**

| Telechargement                                    |
|---------------------------------------------------|
| [JavaFX-11](https://gluonhq.com/products/javafx/) |
| [SceneBuilder](https://gluonhq.com/products/scene-builder/thanks/?dl=/download/scene-builder-windows-x64/)                                  |


### **Class FX Collections**

| Modificateur et type                     | 	Méthode et description                                                                                                                                                   |
|------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| static <E> ObservableList<E>             | 	`checkedObservableList(ObservableList<E> list, Class<E> type)` <br/>Crée et renvoie un wrapper typesafe en haut dev la liste observable fournie.                         |
| static <K,V> ObservableMap<K,V>          | 	`checkedObservableMap(ObservableMap<K,V> map, Class<K> keyType, Class<V> valueType)` <br/>Crée et renvoie un wrapper typesafe au-dessus dev la carte observable fournie. |
| static <E> ObservableSet<E>              | 	`checkedObservableSet(ObservableSet<E> set, Class<E> type)`Crée et renvoie un wrapper typesafe au-dessus dev l'ensemble observable fourni.                               |
| static <E> ObservableList<E>             | 	`concat(ObservableList<E>... lists)` <br/>Concatène des listes plus observables en une seule.                                                                            |
| static <T> void                          | 	`copy(ObservableList<? super T> dest, List<? extends T> src)` <br/>Copie les éléments dev src vers dest.                                                                 |
| static <E> ObservableList<E>             | 	`emptyObservableList()` <br/>Crée et vide une liste observable non modifiable.                                                                                           |
| static <K,V> ObservableMap<K,V>          | 	`emptyObservableMap()` <br/>Crée et vide une carte observable non modifiable.                                                                                            |
| static <E> ObservableSet<E>              | 	`emptyObservableSet()` <br/>Crée et vide un ensemble observable non modifiable.                                                                                          |
| static <T> void                          | 	`fill(ObservableList<? super T> list, T obj)` <br/>Remplit la liste fournie avec obj.                                                                                    |
| static <E> ObservableList<E>             | 	`observableArrayList()` <br/>Crée une nouvelle liste observable vide soutenue par une liste dev tableaux.                                                                |
| static <E> ObservableList<E>             | 	`observableArrayList(Callback<E,Observable[]> extractor)` <br/>Crée une nouvelle liste observable vide soutenue par une liste dev tableaux.                              |
| static <E> ObservableList<E>             | 	`observableArrayList(Collection<? extends E> col)` <br/>Crée une nouvelle liste dev tableaux observables et col y ajoute un contenu dev collection.                      |
| static <E> ObservableList<E>             | 	`observableArrayList(E... items)`<br/> Crée une nouvelle liste dev tableaux observables avec itemsdes ajouts.                                                            |                                       
| static ObservableFloatArray              | 	`observableFloatArray()` <br/>Crée un nouveau tableau float observable vide.                                                                                             |
| static ObservableFloatArray              | 	`observableFloatArray(float... values)` <br/>Crée un nouveau tableau float observable avec values set dessus.                                                            |
| static ObservableFloatArray              | 	`observableFloatArray(ObservableFloatArray array)` <br/>Crée un nouveau tableau float observable avec une copie des éléments dans le fichier array.                      |
| static <K,V> ObservableMap<K,V>          | 	`observableHashMap()` <br/>Crée une nouvelle carte observable vide soutenue par un HashMap.                                                                              |
| static ObservableIntegerArray            | 	`observableIntegerArray()` <br/>Crée un nouveau tableau d'entiers observables vide.                                                                                      |
| static ObservableIntegerArray            | 	`observableIntegerArray(int... values)` <br/>Crée un nouveau tableau d'entiers observables avec values set.                                                              |
| static ObservableIntegerArray            | 	`observableIntegerArray(ObservableIntegerArray array)` <br/>Crée un nouveau tableau d'entiers observables avec une copie des éléments dans le fichier array.             |
| static <E> ObservableList<E>             | 	`observableList(List<E> list)` <br/>Construit une ObservableList qui est soutenue par la liste spécifiée.                                                                |
| static <E> ObservableList<E>             | 	`observableList(List<E> list, Callback<E,Observable[]> extractor)` <br/>Construit une ObservableList qui est soutenue par la liste spécifiée.                            |
| static <K,V> ObservableMap<K,V>          | 	`observableMap(Map<K,V> map)` <br/>Construit un ObservableMap qui est soutenu par la carte spécifiée.                                                                    |
| static <E> ObservableSet<E>              | 	`observableSet(E... elements)` <br/>Construit un ObservableSet soutenu par un HashSet qui contient tous les éléments spécifiés.                                          |
| static <E> ObservableSet<E>              | 	`observableSet(Set<E> set)` <br/>Construit un ObservableSet qui est soutenu par l'ensemble spécifié.                                                                     |
| static <T> boolean                       | 	`replaceAll(ObservableList<T> list, T oldVal, T newVal)` <br/>Remplacez tous les éléments oldVal dev la liste par l'élément newVal.                                      |
| static void                              | 	`reverse(ObservableList list)` <br/>Inverser l'ordre dans la liste. Déclenche une seule notification dev modification sur la liste.                                      |
| static void                              | 	`rotate(ObservableList list, int distance)` <br/>Fait pivoter la liste par distance.                                                                                     |
| static void                              | 	`shuffle(ObservableList<?> list)` <br/>Mélange tous les éléments dev la liste observable.                                                                                |
| static void                              | 	`shuffle(ObservableList list, Random rnd)` <br/>Mélange tous les éléments dev la liste observable.                                                                       |
| static <E> ObservableList<E>             | 	`singletonObservableList(E e)` <br/>Crée une liste observable non modifiable avec un seul élément.                                                                       |
| static <T extends Comparable<? super T>> | `void	sort(ObservableList<T> list)` <br/>Trie la liste observable fournie.                                                                                                |
| static <T> void                          | 	`sort(ObservableList<T> list, Comparator<? super T> c)` <br/>Trie la liste observable fournie à l'aide du comparateur c.                                                 |
| static <E> ObservableList<E>             | 	`synchronizedObservableList(ObservableList<E> list)` <br/>Crée et renvoie un wrapper synchronisé en haut dev la liste observable fournie.                                |
| static <K,V> ObservableMap<K,V>          | 	`synchronizedObservableMap(ObservableMap<K,V> map)`<br/>Crée et renvoie un wrapper synchronisé au-dessus dev la carte observable fournie.                                |
| static <E> ObservableSet<E>              | 	`synchronizedObservableSet(ObservableSet<E> set)` <br/>Crée et renvoie un wrapper synchronisé au-dessus dev l'ensemble observable fourni.                                |
| static <E> ObservableList<E>             | 	`unmodifiableObservableList(ObservableList<E> list)` <br/>Crée et renvoie une liste dev wrappers non modifiable en haut dev la liste observable fournie.                 |
| static <K,V> ObservableMap<K,V>          | 	`unmodifiableObservableMap(ObservableMap<K,V> map)` <br/>Construit une interface en lecture seule pour l'ObservableMap spécifié.                                         |
| static <E> ObservableSet<E>              | 	`unmodifiableObservableSet(ObservableSet<E> set)` <br/>Crée et renvoie un wrapper non modifiable au-dessus dev l'ensemble observable fourni.                             |
