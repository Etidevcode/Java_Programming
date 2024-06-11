package com.etienne;

// Défi:
// Dans la déclaration d'interface suivante, quelle est la visibilité de :
//
// 1. l'interface accessible ?
// 2. la variable int SOME_CONSTANT ?
// 3. méthodeA ?
// 4. méthodeB et méthodeC ?
//
// Astuce : repensez au cours sur les interfaces avant de répondre.
public interface Accessible {

	int SOME_CONSTANT = 100;
	public void methodA();
	void methodB();
	boolean methodC();
}
