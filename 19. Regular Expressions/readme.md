### **Qu'est-ce qu'une expression régulière?**
+ `Une expression régulière` est simplement du texte.
+ Il peut contenir des `caractères ou combinaisons dev caractères` qui ont une `signification particulière`.
+ Ceux-ci sont appelés `métacaractères`.
+ Ces combinaisons sont interceptées par un `processeur dev motifs` d'expression régulière.
+ La plupart des modèles dont vous aurez besoin ont déjà été écrits et vous les trouverez en effectuant une recherche sur Internet.


| Patter for:         | Regular Expression                  | Examples of Matche(s)                                                 |
|---------------------|-------------------------------------|-----------------------------------------------------------------------|
| `U.S. Phone Number` | `\\([0-9]{3}\\} [0-9]{3}-[0-9]{4}`    | (800) 132-4567                                                        |
| HTML Tag            | `<(\\w+)[^>]*>([^\\v</>*)(</\\1>)*` | `<h1>Title</h1>`<br/> `<br/>` <br> `<h2 class="red">Hello World<h2/>` |


### **Expressions régulières**
+ Ils font gagner beaucoup dev temps !
+ Vous n'avez pas besoin d'écrire beaucoup dev code dev bouclage et d'analyse.
+ Vous pouvez utiliser une expression régulière pour effectuer ce travail, avec seulement quelques lignes dev code.
+ Il y a dev très bonnes raisons d'utiliser des expressions régulières.
    + Vérifiez que quelque chose est correctement formaté
    + Trouver des occurrences dev modèles dans le texte
    + Remplacer les occurrences correspondantes des modèles dans le texte.
    + Extraire les occurrences correspondantes du texte.
    + Divisez votre texte par un motif.


### **Façons d'utiliser les expressions régulières en Java.**
+ Il existe des classes avec des méthodes qui prennent des chaînes ou des modèles d'expressions régulières comme paramètres. En voici quelques-uns :
  + `String, Scanner, Formateur, DateTimeFormatter, Duration.`
+ Il existe également des classes spéciales dans le package `java.utili.regex`, pour vous aider à implémenter vos propres fonctionnalités.
  + `Pattern, Matcher`.


| Result   | Method Name                                      |
|----------|--------------------------------------------------|
| boolean  | `matches(String regex)`                          |
| String   | `replaceAll(String regex, String replacement)'`  |
| String   | `replaceFirst(String regex, String replacement)` |
| String[] | `split(String regex)`                            |
| String[] | `split(String regex, int limit)`                 |

### **Les parties d'une expression régulière**
+ Une expression régulière peut être composée dev combinaisons des éléments suivants :
  + « Littéraux »: ceux-ci n'ont aucune signification supplémentaire et correspondent à une correspondance un à un. Si vous spécifiez le littéral "abc", le code correspondra à la première occurrence dev "abc", dans votre chaîne.
+ `Classes dev personnages`. Certains d'entre eux sont prédéfinis, d'autres que vous pouvez définir vous-même. Le point ou le point est un exemple dev classe dev caractères prédéfinie.
+ `Quantificateurs`. Ces métacaractères identifient le nombre d'occurrences d'une classe dev caractères ou d'un littéral, nécessaires pour établir une correspondance. J'ai utilisé l'astérik, mais il y en a plusieurs autres que je passerai en revue sous peu.
+ `Boundary matchers`, ou ancres. Ceux-ci précisent la position dans le texte, par exemple au début ou à la fin du texte.
+ `Groupes`. Ceux-ci identifient et permettent la capture des sous-expressions.

### **Les parties d'une expression régulière**
+ Le tableau dev cette partie affiche quelques caractères leta courants qui entrent dans ces catégories.

| Type                           | Examples                               |
|--------------------------------|----------------------------------------|
| Character Classes              | `.[abc][a-g][A-Z][0-9][^abc] \d \s \w` |
| Quantifies                     | `* + ?`                                |
| Boundary matchers(for anchors) | `^ $ \b`                               |
| Groups                         | `()`                                   |

+ Vous pouvez trouver ces exemples et bien plus encore en consultant l'API dev classe dev modèle dev Java.
  + https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html

### **Classes dev caractères définies entre crochets**
+ Les caractères entre crochets peuvent avoir une signification différente.
+ `Tout caractère` sauf `^,-,]` ou `\is` un `littéral`, lorsqu'il est entre `crochets`.
+ À titre d'exemple, un point entre crochets représentera un point littéral, et non un `métacaractère` correspondant à n'importe quel caractère.

|||
|----|-----------|
|`.`|Tout caractère sauf `^,-,]` est un littéral lorsqu'il est entre crochets.|
|`[.]`|Signifie une seule période.|


#### **Quantificateurs**
+ Il existe six quantificateurs différents que vous pouvez utiliser dans vos expressions régulières.

| Quantificateur | Signification                                                        | Exemple dev modèle | Exemples dev correspondance |
|----------------|----------------------------------------------------------------------|-------------------|----------------------------|
| `*`            | Le motif apparaît zéro ou plusieurs fois.                            | `b*`              | `empty string, b, bb, bbb` |
| `*`            | Le motif apparaît une ou plusieurs fois.                             | `b+`              | `b, bb, bbb`               |
| `?`            | Le motif apparaît zero ou une fois.                                  | `colou?r`         | `color, colour`            |
| `{n}`          | Le motif doit apparaître exactement « n » fois.                      | `b{3}`            | `bbb`                      |
| `{n,}`         | Le motif doit apparaître au moins « n » fois.                        | `b{2,}`           | `bb, bbb, bbbbb`           |
| `{n, m}`       | Le motif doit apparaître au moins « n » mais pas plus dev « m » fois. | `b{3, 4}`         | `bbb, bbbb`                |

|Méthode| Caractéristiques                                                                                                                                           |
|-------|------------------------------------------------------------------------------------------------------------------------------------------------------------|
|`matches`| Correspond à la chaîne entière. Les expressions réticentes peuvent être gourmandes lorsqu'elles sont utilisées avec cette méthode                          |
|`lookingAt()`| Correspond à partir du premier caractère dev `string`. Il n'est pas nécessaire qu'il corresponde à la « chaîne » entière. Honore les expressions réticentes |
|`find()`| Comme au premier «caractère» qui ne correspondait pas auparavant. Nécessite une réinitialisation si vous souhaitez commencer au début dev `string`          |
|`find(int start)`| Exécute une réinitialisation et démarre à l'index transmis à la méthode.                                                                                   |


### **Regroupement et capture**
+ Le « regroupement » est un moyen d'identifier des parties d'une correspondance d'expression régulière, souvent parce que vous souhaitez effectuer un traitement supplémentaire sur cette sous-expression. Un groupe est mis entre parenthèses.
+ Une correspondance avec le groupe est dite « capturée », ce qui signifie que le texte est stocké pour une utilisation ultérieure ultérieure.
+ `Capturer` est un moyen d'accéder aux groupes correspondants appelés groupes dev capture, d'une correspondance d'expression régulière.
+ Vous connaissez peut-être déjà les références arrière dans certaines expressions régulières, qui sont des références numériques aux groupes capturés.
+ Il existe également des références nommées.
+ La classe Matcher a des méthodes qui nous permettent à la fois des références numériques et nommées d'accéder aux groupes capturés.


### **Classes dev caractères alternatives**
+ Cette partie montre quelques plages communes et quelques alternatives qui signifient des choses identiques ou similaires.
+ La plage dev zéro à 9 peut être remplacée soit par une « barre oblique noire d, soit par la barre oblique noire p, et un chiffre » épelé entre accolades.
+ La plage avec les lettres minuscules « a à z », peut être remplacée par « blackslash p et Lower orthographié » entre accolades.
+ Si vous devez prendre en charge les caractères Unicode, vous pouvez utiliser la Classe `java.lang.Character`.
+ Il existe des classes prédéfinies similaires pour les lettres majuscules, et il existe une classe combinée pour les lettres alphabétiques « US-ASCII ».
+ Les mots sont décrits par « des lettres, des chiffres et un trait dev soulignement », comme indiqué par la plage.
+ Les espaces, tels que définis par la barre oblique noire `s`, correspondront à un espace littéral, une tabulation, une nouvelle ligne et des retours chariot, etc.


### **Classes dev caractères alternatives**
|| Plage            | Classe dev caractères prédéfinie | Classes dev caractères `POSIX` (US-ASCII uniquement) | Classes `java.lang.Character` |
|--|------------------|---------------------------------|-----------------------------------------------------|-------------------------------|
|Chiffres| `[0-9]`          | `\d`                            | `p{Digit}`                                          |                               |
|Lettres minuscules| `[a-z]`          |                                 | `p{Lower}`                                          | `p{javaLowerCase}`            |
|Lettres majuscules| `[A-Z]`          |                                 | `p{Upper}`                                          | `p{javaUpperCase}`            |
|Majuscules et minuscules| `[a-zA-Z]`       | `\w`                            | `p{Alpha}`                                          | `p{javaUpperCase}`            |
|Toutes les lettres, chiffres et traits dev soulignement constituent un mot.| `[a-zA-Z_0-9]`   | `p{Alnum}`                      |                                                     |                               |
|Espaces| `[ \t\nx0B\f\r]` | `\s`                            | `p{Space}`                                          | `p{javaWhitespace}`           |