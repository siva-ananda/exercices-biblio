package be.steformations.java_data.biblio.tests;

import be.steformations.java_data.biblio.interfaces.GestionnaireBibliotheque;
import be.steformations.laura.biblio.managers.GestionnaireBibliothequeJpa;

public class FabriqueTests {

	public static GestionnaireBibliotheque getGestionnaireBibliotheque() {
      return new GestionnaireBibliothequeJpa();
	}
}
