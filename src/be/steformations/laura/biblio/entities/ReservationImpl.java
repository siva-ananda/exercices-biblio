package be.steformations.laura.biblio.entities;

import java.util.Date;

public class ReservationImpl implements be.steformations.java_data.biblio.interfaces.Reservation {

	private Integer id;
	private EmprunteurImpl emprunteur;
	private LivreImpl livre;
	private Date dateDeReservation;
	
	@Override
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public EmprunteurImpl getEmprunteur() {
		return this.emprunteur;
	}
	
	public void setEmprunteur(EmprunteurImpl emprunteur) {
		this.emprunteur = emprunteur;
	}

	@Override
	public LivreImpl getLivre() {
		return this.livre;
	}
	
	public void setLivre(LivreImpl livre) {
		this.livre = livre;
	}

	@Override
	public Date getDateDeReservation() {
		return this.dateDeReservation;
	}

	public void setDateDeReservation(Date dateDeReservation) {
		this.dateDeReservation = dateDeReservation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateDeReservation == null) ? 0 : dateDeReservation.hashCode());
		result = prime * result + ((emprunteur == null) ? 0 : emprunteur.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((livre == null) ? 0 : livre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReservationImpl other = (ReservationImpl) obj;
		if (dateDeReservation == null) {
			if (other.dateDeReservation != null)
				return false;
		} else if (!dateDeReservation.equals(other.dateDeReservation))
			return false;
		if (emprunteur == null) {
			if (other.emprunteur != null)
				return false;
		} else if (!emprunteur.equals(other.emprunteur))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (livre == null) {
			if (other.livre != null)
				return false;
		} else if (!livre.equals(other.livre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", emprunteur=" + emprunteur + ", livre=" + livre + ", dateDeReservation="
				+ dateDeReservation + "]";
	}
	
}
