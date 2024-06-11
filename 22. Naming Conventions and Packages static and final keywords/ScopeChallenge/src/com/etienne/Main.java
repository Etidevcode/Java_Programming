package com.etienne;

import java.util.Scanner;


/**
 * Écrivez un petit programme pour lire un entier au clavier
 *       (à l'aide du scanner) et imprimez le tableau des multiplications pour ce numéro.
 *         Le tableau doit aller de 1 à 12.
 *
 *          Vous êtes autorisé à utiliser une variable appelée scanner pour votre
 *          Instance de scanner. Vous pouvez utiliser autant d'autres variables que vous le souhaitez.
 *          besoin, mais ils doivent tous être appelés x. Cela inclut tout
 *          instances de classe et variables de contrôle de boucle que vous pouvez décider
 *          utiliser.
 *
 *          Si vous utilisez une classe, la classe peut être appelée X (majuscule), mais
 *          toutes ses instances doivent être appelées x (minuscules).
 *
 *          Toutes les méthodes que vous créez doivent également être appelées x.
 *
 *          Supplément optionnel :
 *          Modifiez votre programme pour que TOUTES les variables (y compris le scanner
 *          exemple) sont appelés x.
 */
public class Main {

    public static void main(String[] args) {


        X x = new X(new Scanner(System.in));
        x.x();
    }
}
