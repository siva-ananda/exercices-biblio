package be.steformations.laura.biblio.entities;

import java.util.Date;
import java.util.List;

public class EmprunteurImpl implements be.steformations.java_data.biblio.interfaces.Emprunteur {

	private Integer id;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private String telephone;
	private String email;
	private List<LivreImpl> livres;
	
	@Override
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String getPrenom() {
		return this.prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	@Override
	public Date getDateDeNaissance() {
		return this.dateDeNaissance;
	}
	
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	@Override
	public String getTelephone() {
		return this.telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<LivreImpl> getLivres() {
		if(this.livres == null){
			this.livres = new java.util.ArrayList<>();
		}
		return this.livres;
	}

	public void setLivres(List<LivreImpl> livres) {
		this.livres = livres;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateDeNaissance == null) ? 0 : dateDeNaissance.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
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
		EmprunteurImpl other = (EmprunteurImpl) obj;
		if (dateDeNaissance == null) {
			if (other.dateDeNaissance != null)
				return false;
		} else if (!dateDeNaissance.equals(other.dateDeNaissance))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Emprunteur [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", dateDeNaissance=" + dateDeNaissance
				+ ", telephone=" + telephone + ", email=" + email + "]";
	}

}
