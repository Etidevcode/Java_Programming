### **Aperçu**
+ Il existe d'autres méthodes d'« assertion Junit » :
    + 1. `assertNotEquals` - nous pouvons utiliser ceci à la place dev `assertEquals()` lorsque nous ne voulons pas que la valeur réelle soit égale à une valeur spécifique.

    + 2. `assertArrayEquals` - lorsque nous voulons vérifier la valeur d'un tableau, nous devons utiliser la méthode `assertArrayEquals()`. La méthode `assertEquals()`. La méthode `assertEquals()` ne fonctionnera pas, car elle ne considérera que deux tableaux égaux s'ils sont la même instance. La méthode `assertArrayEquals()` considère deux tableaux égaux lorsque leurs longueurs sont les mêmes et que chaque élément des deux tableaux est le même (et dans le même ordre).

    + 3. `assertNull() et assertNotNull()` - nous pouvons utiliser cette méthode pour vérifier les valeurs nulles (et non nulles). Nous pouvons utiliser `assertEquals()` pour vérifier les valeurs nulles (et non nulles). Nous pouvons utiliser `assertEquals()` pour vérifier null, mais comme avec les méthodes `assertTrue()` et `assertFalse()`, l'utilisation dev `assertNull()` rend l'intention plus claire et nous n'avons qu'à transmettre la valeur réelle à la méthode. .

    + 4. `assertSame() et assertNotSame()` - nous l'utilisons lorsque nous voulons vérifier si deux instances sont exactement la même instance. N'oubliez pas que la méthode `assertEquals` utilise la méthode `equals()` pour tester l'égalité. `assertSame()` compare les références d'objet.

    + 5. `assertThat()` - cette méthode compare la valeur réelle à un matcher (pas le `Matcher` dans le `JDK`, mais une classe dev matcher `JUNIT`). Cette méthode est plus puissante que les autres méthodes d'assertion, car nous pouvons comparer la valeur réelle à une plage dev valeurs. Notez que cette méthode n'est devenue disponible que dans « JUNIT 4.4 ».