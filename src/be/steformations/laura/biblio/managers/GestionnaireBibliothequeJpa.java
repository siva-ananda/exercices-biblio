package be.steformations.laura.biblio.managers;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import be.steformations.java_data.biblio.interfaces.Auteur;
import be.steformations.java_data.biblio.interfaces.Collection;
import be.steformations.java_data.biblio.interfaces.Emprunteur;
import be.steformations.java_data.biblio.interfaces.Livre;
import be.steformations.java_data.biblio.interfaces.Reservation;
import be.steformations.laura.biblio.entities.AuteurImpl;
import be.steformations.laura.biblio.entities.CollectionImpl;
import be.steformations.laura.biblio.entities.LivreImpl;

public class GestionnaireBibliothequeJpa implements be.steformations.java_data.biblio.interfaces.GestionnaireBibliotheque {

	private EntityManager em;
	
	public GestionnaireBibliothequeJpa() {
		super();
		this.em = Persistence.createEntityManagerFactory("postgresql_eclipselink").createEntityManager();
	}
	
	@Override
	public Auteur getAuteurByPrenomAndNom(String prenom, String nom) {
		AuteurImpl auteur = null;
		TypedQuery<AuteurImpl> query = em.createNamedQuery("getAuteurByPrenomAndNom", AuteurImpl.class);
		query.setParameter(1, prenom);
		query.setParameter(2, nom);
		try {
			auteur = query.getSingleResult();
		} catch(javax.persistence.NoResultException e){}
		return auteur;
	}

	@Override
	public Auteur getAuteurByCode(int code) {
		return em.find(AuteurImpl.class, code);
	}

	@Override
	public List<? extends Auteur> getAllAuteurs() {
		TypedQuery<AuteurImpl> query = em.createNamedQuery("getAllAuteurs", AuteurImpl.class);
		return query.getResultList();
	}

	@Override
	public Auteur addAuteur(String prenom, String nom) {
		AuteurImpl auteur = null;
		if (prenom != null && nom != null && this.getAuteurByPrenomAndNom(prenom, nom) == null){
			auteur = new AuteurImpl();
			auteur.setPrenom(prenom);
			auteur.setNom(nom);
			
			this.em.getTransaction().begin();
			this.em.persist(auteur);
			this.em.getTransaction().commit();	
			}
		return auteur;
	}

	@Override
	public void removeAuteur(int code) {
		AuteurImpl auteur = (AuteurImpl)this.getAuteurByCode(code);
		if (auteur != null){
			this.em.getTransaction().begin();
			this.em.remove(auteur);
			this.em.getTransaction().commit();
		}
	}

	@Override
	public Collection getCollectionByNom(String nom) {
		CollectionImpl coll = null;
		TypedQuery<CollectionImpl> query = em.createNamedQuery("getCollectionByNom", CollectionImpl.class);
		query.setParameter(1, nom);
		try {
			coll = query.getSingleResult();
		} catch(javax.persistence.NoResultException e){}
		return coll;
	}

	@Override
	public Collection getCollectionByCode(int code) {
		return em.find(CollectionImpl.class, code);
	}

	@Override
	public List<? extends Collection> getAllCollections() {
		TypedQuery<CollectionImpl> query = em.createNamedQuery("getAllCollections", CollectionImpl.class);
		return query.getResultList();
	}

	@Override
	public Collection addCollection(String nom) {
		CollectionImpl coll = null;
		if (nom != null && this.getCollectionByNom(nom) == null){
			coll = new CollectionImpl();
			coll.setNom(nom);
			
			this.em.getTransaction().begin();
			this.em.persist(coll);
			this.em.getTransaction().commit();	
			}
		return coll;
	}

	@Override
	public void removeCollection(int code) {
		CollectionImpl coll = (CollectionImpl)this.getCollectionByCode(code);
		if (coll != null){
			this.em.getTransaction().begin();
			this.em.remove(coll);
			this.em.getTransaction().commit();
		}
	}

	@Override
	public Livre getLivreByCode(String code) {
		LivreImpl livre = null;
		TypedQuery<LivreImpl> query = em.createNamedQuery("getLivreByCode", LivreImpl.class);
		query.setParameter(1, code);
		try {
			livre = query.getSingleResult();
		} catch(javax.persistence.NoResultException e){}
		return livre;
	}

	@Override
	public List<? extends Livre> getAllLivres() {
		TypedQuery<LivreImpl> query = em.createNamedQuery("getAllLivres", LivreImpl.class);
		return query.getResultList();
	}
	// TODO ne marche pas

	@Override
	public List<? extends Livre> searchLivres(Integer auteur, Integer collection, String partieDuTitre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Livre addLivre(String titre, short nombreDePages, Date dateDeParution, int idCollection, short numeroEdition,
			List<Integer> auteurs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLivre(String code) {
		// TODO Auto-generated method stub

	}

	@Override
	public Emprunteur getEmprunteurByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Emprunteur addEmprunteur(String prenom, String nom, String email, Date ddn, String telephone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends Reservation> getReservationsByEmprunteurCode(int code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends Reservation> getReservationsByLivreCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation getReservationByCode(int code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation addReservation(int emprunteur, String livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeReservation(int reservation) {
		// TODO Auto-generated method stub

	}

}
