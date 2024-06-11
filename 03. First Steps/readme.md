### **Hello world (JShell)**

| Commands                           | Description         |
|------------------------------------|---------------------|
| jshell                             | see the version     |
| System.out.println("Hello world")  | print: Hello world  |
| System.out.println("Hello, Etixi") | print: Hello, Etixi |

#### **Variables**

                    PS C:\WINDOWS\system32> jshell
                    |  Welcome to JShell -- Version 17.0.6
                    |  For an introduction type: /help intro

                    jshell> int myFirstNumber = 5;
                    myFirstNumber ==> 5

                    jshell> System.out.println("myFirstNumber")
                    myFirstNumber

                    jshell> System.out.println(myFirstNumber)
                    5

                    jshell> int myFirstNumber = 10;
                    myFirstNumber ==> 10

                    jshell> System.out.println(myFirstNumber)
                    10

                    jshell> int myFirstNumber = 1000;
                    myFirstNumber ==> 1000

                    jshell> System.out.println(myFirstNumber)
                    1000

                    jshell> /list


                    jshell> int myFirstNumber = 10 + 5;
                    myFirstNumber ==> 15

                    jshell> System.out.println(myFirstNumber)
                    15

                    jshell> int myFirstNumber = (10 + 5) + (2 * 10);
                    myFirstNumber ==> 35

                    jshell> System.out.println(myFirstNumber)
                    35

#### **Starting out with expressions**

                    PS C:\WINDOWS\system32> jshell
                    |  Welcome to JShell -- Version 17.0.6
                    |  For an introduction type: /help intro

                    jshell> int myFirstNumber = (10 + 5) + (2 * 10);
                    myFirstNumber ==> 35

                    jshell> int mySecondNumber = 12;
                    mySecondNumber ==> 12

                    jshell> int myThirdNumber = 6;
                    myThirdNumber ==> 6

                    jshell> /var
                    |    int myFirstNumber = 35
                    |    int mySecondNumber = 12
                    |    int myThirdNumber = 6

                    jshell> int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
                    myTotal ==> 53

                    jshell> myThirdNumber = myFirstNumber * 2;
                    myThirdNumber ==> 70

                    jshell> int myLastOne = 1000 - myTotal;
                    myLastOne ==> 947

                    jshell> System.out.println(myLastOne);
                    947

### **Primitive Types**

#### **Types primitifs dev Java**
+ En Java, les types primitifs sont les types dev données les plus basiques.
+ Les huit types dev données primitifs en Java sont présentés dans le tableau ci-dessous, répertoriés par type dev données stockées chacun :

| Nombre entier        | Nombre réel (virgule flottante ou décimale) |
|----------------------|---------------------------------------------|
| octet                |                                             |
| short                | float                                       |
| int                  | double                                      |
| long                 |                                             |
| **Caractère unique** | **Valeur booléenne**                        |
| char                 | boolean                                     |


                PS C:\WINDOWS\system32> jshell
                |  Welcome to JShell -- Version 17.0.6
                |  For an introduction type: /help intro

                jshell> int myvalue = 1000;
                myvalue ==> 1000

                jshell> int myMinIntValue = Integer.MIN_VALUE;
                myMinIntValue ==> -2147483648

                jshell> int myMaxIntValue = Integer.MAX_VALUE;
                myMaxIntValue ==> 2147483647

                jshell> System.out.println("Integer Minimum Value = " + myMinIntValue)
                Integer Minimum Value = -2147483648

                jshell> System.out.println("Integer Maximum Value = " + myMaxIntValue)
                Integer Maximum Value = 2147483647

                jshell> System.out.println("Integer Value Range  = (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")" );
                Integer Value Range  = (-2147483648 to 2147483647)

                jshell> System.out.println(
                ...> "Integer Value Range ("
                ...> +
                ...> Integer.MIN_VALUE
                ...> +
                ...> " to "
                ...> +
                ...> Integer.MAX_VALUE
                ...> +
                ...> ")"
                ...> );
                Integer Value Range (-2147483648 to 2147483647)

#### **Wrapper Classes**
+ Java utilise le concept dev classe wrapper, pour l'ensemble dev ses huit types dev données primitifs.
+ Une `classe wrapper` fournit des opérations simples, ainsi que quelques informations dev base sur le type dev données primitives, qui ne peuvent pas être stockées sur la primitive elle-même.
+ Nous avons vu `MIN_VALUE` et `MAX_VALUE`, sont des éléments dev ces informations dev base, pour le type dev données int.
+ Les types primitifs et leurs classes wrapper respectives sont indiqués dans le tableau ci-dessous.


| Primitive | Wrapper class |
|-----------|---------------|
| byte      | Byte          |
| short     | Short         |
| char      | Char          |
| int       | Integer       |
| long      | Long          |
| float     | Float         |
| double    | Double        |
| boolean   | Boolean       |

#### **Sous-débordement et débordement en Java**
+ La valeur maximale, lorsqu'elle dépasse la valeur minimale, et continue simplement le traitement sans erreur.
+ La valeur minimale, lorsqu'elle dépasse, revient à la valeur maximale et continue le traitement.
+ Ce n'est généralement pas un comportement que vous souhaitez vraiment, et en tant que développeur, vous devez être conscient que cela peut se produire et choisir le type dev données approprié.


            jshell> System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
            Busted Max Value = -2147483648

            jshell> System.out.println("Busted Min Value = " + (myMinIntValue - 1));
            Busted Min Value = 2147483647

            jshell> System.out.println("Integer Maximum Value = " + Integer.MAX_VALUE);
            Integer Maximum Value = 2147483647

            jshell> int myMaxIntTest = 2147483648;
            |  Error:
            |  integer number too large
            |  int myMaxIntTest = 2147483648;
            |                     ^


            jshell> int myMaxIntTest = 2147483647;
            myMaxIntTest ==> 2147483647

            jshell> int myMaxIntTest = 2_147_483_647;
            myMaxIntTest ==> 2147483647

            jshell>

### **byte, short, int, long**

+ Nous avons déjà dit que Java avait quatre types dev données primitifs utilisés pour les nombres entiers, à savoir : byte, short, int et long.

   
| Nombre entier - Type dev données | Classe d'emballage | Ce qui est remarquable|
|---------------------------------|--------------------|----------------------|
| byte                            |Byte|A la plus petite portée.|
| short                           |Short||
| int                             |Integer|Type dev données par défaut dev Java pour les nombres entiers.|
| long                            |Long|A la plus grande portée.|


+ Ils sont répertoriés ici dans ce tableau, selon la plage dev valeurs que le type prendra en charge, l'octet prend en charge la plus petite plage et le long prend en charge la plus grande plage.

#### **Taille des types primitifs et largeur**
+ La taille, ou largeur, est la quantité d'espace qui détermine (ou limite) la plage dev valeurs dont nous avons discuté.

| Data Type | Width(in bits) | Min Value | Max Value           |                                                   
|-----------|----------------|--|---------------------|
| byte      | 8              | -128 | 127                 |
| short     | 16             | -32768 | 32767               |
| int       | 32             | -214748364 | 2147483647          |
| long      | 64             | -9223372036854775808 | 9223372036854775807 |

                
            jshell> System.out.println("Integer Value Range  = (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")" );
            Integer Value Range  = (-2147483648 to 2147483647)

            jshell> System.out.println("Integer Value Range  = (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")" );
            Integer Value Range  = (-128 to 127)

            jshell> System.out.println("Integer Value Range  = (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")" );
            Integer Value Range  = (-32768 to 32767)

            jshell> long myLongValue = 100L;
            myLongValue ==> 100

            jshell> System.out.println("A long has a width of " + Long.SIZE);
            A long has a width of 64

            jshell> System.out.println("Long Value Range  = (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")" );
            Long Value Range  = (-9223372036854775808 to 9223372036854775807)

            jshell> myLongValue = 100L;
            myLongValue ==> 100

            jshell> long bigLongLiteralValue = 2_147_483_647;
            bigLongLiteralValue ==> 2147483647

            jshell> short bigshortLiteralValue = 32767;
            bigshortLiteralValue ==> 32767


#### **Casting in Java**

+ Caster signifie traiter ou convertir un nombre, d'un type à un autre. Nous mettons le type que nous voulons que le numéro soit, entre parenthèses comme ceci:
    + `(byte) (myMinByteValue / 2);`
+ D'autres langages ont également du casting, c'est une pratique courante et pas seulement une affaire dev Java.


        jshell> short myMinShortValue = Short.MIN_VALUE; int myMinIntValue = Integer.MIN_VALUE;
        myMinShortValue ==> -32768
        myMinIntValue ==> -2147483648


        jshell> byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;
        myMinByteValue ==> -128
        myMaxByteValue ==> 127

        jshell> short firstShort = 1; int firstInteger = 2;
        firstShort ==> 1
        firstInteger ==> 2

        jshell> byte firstByte = 1, secondByte = 2;
        firstByte ==> 1
        secondByte ==> 2

        jshell> int myTotal = (myMinIntValue / 2);
        myTotal ==> -1073741824


        jshell> byte myNewByteValue = (myMinByteValue / 2);
        |  Error:
        |  incompatible types: possible lossy conversion from int to byte
        |  byte myNewByteValue = (myMinByteValue / 2);
        |                         ^----------------^

        jshell> byte myNewByteValue = (byte) (myMinByteValue / 2);
        myNewByteValue ==> -64

        jshell> short myNewShortValue = (myMinShortValue / 2);
        |  Error:
        |  incompatible types: possible lossy conversion from int to short
        |  short myNewShortValue = (myMinShortValue / 2);
        |                           ^-----------------^

        jshell> short myNewShortValue = (short) (myMinShortValue / 2);
        myNewShortValue ==> -16384

#### **Primitive Types Challenge**

        PS C:\WINDOWS\system32> jshell
        |  Welcome to JShell -- Version 17.0.6
        |  For an introduction type: /help intro

        jshell> byte byteValue = 10;
        byteValue ==> 10

        jshell> short shortValue = 20;
        shortValue ==> 20

        jshell> int intValue = 50;
        intValue ==> 50

        jshell> long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        longTotal ==> 50800

        jshell> int sumOfThree = byteValue + shortValue + intValue;
        sumOfThree ==> 80

        jshell> longTotal = 50000L + (10 * sumOfThree);
        longTotal ==> 50800

        jshell> short shortTotal = (10000 + 10 * (byteValue + shortValue + intValue));
        |  Error:
        |  incompatible types: possible lossy conversion from int to short
        |  short shortTotal = (10000 + 10 * (byteValue + shortValue + intValue));
        |                      ^----------------------------------------------^

        jshell> short shortTotal = (short) (10000 + 10 * (byteValue + shortValue + intValue));
        shortTotal ==> 10800

#### **Float and Double Primitives**

+ La précision fait référence au format et à la quantité d'espace occupé par le type concerné. Cela montre la largeur dev chacun des types à virgule flottante et leurs plages. Les plages sont affichées dans la notation scientifique Java, que nous montrons ci-dessous en bleu.

| Data Type | Width(in bits) | Min Value | Max Value              |
|-----------|----------------|-----------|------------------------|
| float     | 32             | 1.4E-45   | 3.4028235E38           |
| double    | 64             | 4.9E-324  | 1.7976931348623157E308 |

+ Vous pouvez voir la notation électronique suivie d'un nombre positif ou négatif.


      PS C:\WINDOWS\system32> jshell
      |  Welcome to JShell -- Version 17.0.6
      |  For an introduction type: /help intro

      jshell> System.out.println("Float Value Range(" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
      Float Value Range(1.4E-45 to 3.4028235E38)

      jshell> System.out.println("Double Value Range(" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");
      Double Value Range(4.9E-324 to 1.7976931348623157E308)

      jshell> int myIntValue = 5; float myFloatValue = 5; double myDoubleValue = 5;
      myIntValue ==> 5
      myFloatValue ==> 5.0
      myDoubleValue ==> 5.0

      jshell> myFloatValue = 5f;
      myFloatValue ==> 5.0

      jshell> myDoubleValue = 5d;
      myDoubleValue ==> 5.0

      jshell> float myOtherFloatValue = 5.25;
      |  Error:
      |  incompatible types: possible lossy conversion from double to float
      |  float myOtherFloatValue = 5.25;
      |                            ^--^

      jshell> float myOtherFloatValue = (float) 5.25;
      myOtherFloatValue ==> 5.25


#### **Floating Point Precision and a Challenge**

      PS C:\WINDOWS\system32> jshell
      |  Welcome to JShell -- Version 17.0.6
      |  For an introduction type: /help intro

      jshell> int myIntValue = 5; float myFloatValue = 5f; double myDoubleValue = 5d;
      myIntValue ==> 5
      myFloatValue ==> 5.0
      myDoubleValue ==> 5.0

      jshell> myIntValue = 5 / 2;
      myIntValue ==> 2

      jshell> myFloatValue = 5f / 2f;
      myFloatValue ==> 2.5

      jshell> myDoubleValue = 5d / 2d;
      myDoubleValue ==> 2.5

      jshell> myIntValue = 5 / 3;
      myIntValue ==> 1

      jshell> myFloatValue = 5f / 3f;
      myFloatValue ==> 1.6666666

      jshell> myDoubleValue = 5d / 3d;
      myDoubleValue ==> 1.6666666666666667

      jshell> myDoubleValue = 5.00 / 3.00;
      myDoubleValue ==> 1.6666666666666667

      jshell> myDoubleValue = 5.00 / 3;
      myDoubleValue ==> 1.6666666666666667

      jshell> double numberOfPounds = 200d;
      numberOfPounds ==> 200.0

      jshell> double convertedKilograms = numberOfPounds * 0.45356237d;
      convertedKilograms ==> 90.712474

      jshell> System.out.println("Converted Kilograms = " + convertedKilograms);
      Converted Kilograms = 90.712474

      jshell> double anotherNumber = 3_000_000.4_567_890d;
      anotherNumber ==> 3000000.456789

#### **The char and boolean Primitive Data Types**

+ Ce tableau est un résumé rapide des différences entre le caractère et la chaîne.

| Char                               | String                              |
|------------------------------------|-------------------------------------|
| Contient un et un seul caractères. | Peut contenir plusieurs caractères. |
| Littéral entre guillemets simples. | Littéral entre guillemets doubles. |

+ Il existe trois façons d'attribuer une valeur à char: 
  + Chacune dev ces méthodes représente le stockage dev la lettre, D majuscule, en mémoire.

|Type d'affectation| Exemple dev code         |
|------------------|-------------------------|
|un caractère littéral| char myChar = 'D';      |
|une valeur Unicode| char myChar = '\u0044'; |
|une valeur entière| char myChar = 68;       |

      PS C:\WINDOWS\system32> jshell
      |  Welcome to JShell -- Version 17.0.6
      |  For an introduction type: /help intro

      jshell> char mychar = 'D';
      mychar ==> 'D'

      jshell> char mychar = 'DD';
      |  Error:
      |  unclosed character literal
      |  char mychar = 'DD';
      |                ^

      jshell> char myUnicode = '\u0044';
      myUnicode ==> 'D'

      jshell> char myDecimalCode = 68;
      myDecimalCode ==> 'D'

      jshell> char mySimpleChar = '?';
      mySimpleChar ==> '?'

      jshell> char myUnicodeChar = '\u003F';
      myUnicodeChar ==> '?'

      jshell> char myDecimlalchar = 63;
      myDecimlalchar ==> '?'

      jshell> System.out.println("My values are " + mySimpleChar + myUnicodeChar + myDecimlalchar);
      My values are ???

      jshell> boolean myTrueBooleanValue = true;
      myTrueBooleanValue ==> true

      jshell> boolean myFalseBooleanValue = false;
      myFalseBooleanValue ==> false

      jshell> boolean isCustomerOverTwentyOne = true;
      isCustomerOverTwentyOne ==> true

#### **Primitives Types Recap and the String Data Type**

      PS C:\WINDOWS\system32> jshell
      |  Welcome to JShell -- Version 17.0.6
      |  For an introduction type: /help intro

      jshell> String myString = "This is a string";
      myString ==> "This is a string"

      jshell> System.out.println("myString is equal to " + myString);
      myString is equal to This is a string

      jshell> myString = myString + ", and this is more.";
      myString ==> "This is a string, and this is more."

      jshell> System.out.println("myString is equal to " + myString);
      myString is equal to This is a string, and this is more.

      jshell> myString = "I wish I had \u00241,000,000.00";
      myString ==> "I wish I had $1,000,000.00"

      jshell> {
        ...>     String numberString = "250.55";
        ...>     numberString = numberString + "49.45";
        ...>     System.out.println(numberString);
        ...> }
        250.5549.45

      jshell> String numberString = "250.55"; numberString = numberString + "49.45"; System.out.println(numberString);
      numberString ==> "250.55"
      numberString ==> "250.5549.45"
      250.5549.45

      jshell> int myInt = "10";
      |  Error:
      |  incompatible types: java.lang.String cannot be converted to int
      |  int myInt = "10";
      |              ^--^

      jshell> String lastString = "10"; int myInt = 50;
      lastString ==> "10"
      myInt ==> 50

      jshell> lastString = lastString + myInt;
      lastString ==> "1050"

      jshell> double doubleNumber = 120.47; lastString = lastString + doubleNumber;
      doubleNumber ==> 120.47
      lastString ==> "1050120.47"


#### **Operators, Operands and Expressions**

+ Ce tableau montre les cinq opérateurs que nous venons d'examiner. 
+ Pour tous les types numériques (nombres entiers et décimaux), les opérateurs sont des opérateurs mathématiques comme indiqué.

| Operator | Numeric Types  | char           | boolean | String        |
|----------|----------------|----------------|---------|---------------|
| +        | Addition       | Addition       | n/a     | Concatenation |
| -        | Subtraction    | Subtraction    | n/a     | n/a           |
| *        | Multiplication | Multiplication | n/a     | n/a           |
| /        | Division       | Division       | n/a     | n/a           |
| %        | Reste(Modulo)  | Reste(Modulo)  | n/a     | n/a           |


        PS C:\WINDOWS\system32> jshell
        |  Welcome to JShell -- Version 17.0.6
        |  For an introduction type: /help intro

        jshell> int result = 1 + 2; // 1 + 2 = 3
        result ==> 3

        jshell> int previousResult = result;
        previousResult ==> 3

        jshell> result = result - 1; // 3 - 1 = 2
        result ==> 2

        jshell> System.out.println("previousResult = " + previousResult)
        previousResult = 3

        jshell> char firstChar = 'A' ; char secondChar = 'B';
        firstChar ==> 'A'
        secondChar ==> 'B'

        jshell> System.out.println(firstChar + secondChar);
        131

        jshell> System.out.println("" + firstChar + secondChar);
        AB

        jshell> result = 2;
        result ==> 2

        jshell> result = result * 10; // 2 * 10 = 20
        result ==> 20

        jshell> result = result / 4; // 20 / 4 = 5
        result ==> 5

        jshell> result = 5;
        result ==> 5

        jshell> result = result % 3; // the remainder of (5 % 3) = 2
        result ==> 2


#### **Abbreviating Operators**


| Opérateur abrégé (ou abrégé)                    |Exemple dev code|
|-------------------------------------------------|----------------------|
| Opérateur d'incrémentation post-correction      |result++;|
| Opérateur d'affectation composé avec le signe + |résultat += 1;|
| Opérateur dev décrémentation post-correction     |résultat--;|
| Opérateur d'affectation composé avec le signe - |result-=1;|


        jshell> {
            ...>     int result = 1;
            ...>     result = result + 1;
            ...>     System.out.println("result = " + result);
            ...> }
        result = 2

        jshell> {
            ...>     int result = 1;
            ...>     result++;
            ...>     System.out.println("result = " + result);
            ...> }
        result = 2

        jshell> {
            ...>     int result = 1;
            ...>     result--;
            ...>     System.out.println("result = " + result);
            ...> }
        result = 0

        jshell> {
            ...>     int result = 1;
            ...>     result -= 1;
            ...>     System.out.println("result = " + result);
            ...> }
        result = 0

        jshell> {
            ...>     int result = 1;
            ...>     result += 1;
            ...>     System.out.println("result = " + result);
            ...> }
        result = 2

        jshell> {
            ...>     int result = 1;
            ...>     result += 5;
            ...>     System.out.println("result = " + result);
            ...> }
            result = 6

        jshell> {
            ...>     int result = 10;
            ...>     result += 5;
            ...>     System.out.println("result = " + result);
            ...> }
        result = 15

        jshell> {
            ...>     int result = 10;
            ...>     result -= 7;
            ...>     System.out.println("result = " + result);
            ...> }
        result = 3

        jshell> {
            ...>     int result = 10;
            ...>     result -= 5.5;
            ...>     System.out.println("result = " + result);
            ...> }
        result = 4

        jshell> {
            ...>     int result = 10;
            ...>     result = result - 5.5;
            ...>     System.out.println("result = " + result);
            ...> }
        |  Error:
        |  incompatible types: possible lossy conversion from double to int
        |      result = result - 5.5;
        |               ^----------^

        jshell> {
            ...>     int result = 10;
            ...>     result = (int) (result - 5.5);
            ...>     System.out.println("result = " + result);
            ...> }
        result = 4

        jshell> {
            ...>     double result = 10;
            ...>     result -= 5.5;
            ...>     System.out.println("result = " + result);
            ...> }
        result = 4.5

        jshell> {
            ...>     double result = 10;
            ...>     result *= 1.5;
            ...>     System.out.println("result = " + result);
            ...> }
        result = 15.0

        jshell> {
            ...>     double result = 10;
            ...>     result /= 1.5;
            ...>     System.out.println("result = " + result);
            ...> }
        result = 6.666666666666667