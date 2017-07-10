package be.steformations.laura.biblio.entities;

import java.util.Date;
import java.util.List;

public class LivreImpl implements be.steformations.java_data.biblio.interfaces.Livre {

	private String code;
	private String titre;
	private short nombreDePages;
	private short numeroEdition;
	private Date dateDeParution;
	private CollectionImpl collection;
	public List<AuteurImpl> auteurs;
	
	
	@Override
	public String getCode() {
		return this.code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String getTitre() {
		return this.titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Override
	public short getNombreDePages() {
		return this.nombreDePages;
	}
	
	public void setNombreDePages(short nombreDePages) {
		this.nombreDePages = nombreDePages;
	}

	@Override
	public short getNumeroEdition() {
		return this.numeroEdition;
	}
	
	public void setNumeroEdition(short numeroEdition) {
		this.numeroEdition = numeroEdition;
	}

	@Override
	public Date getDateDeParution() {
		return this.dateDeParution;
	}

	public void setDateDeParution(Date dateDeParution) {
		this.dateDeParution = dateDeParution;
	}
	
	@Override
	public CollectionImpl getCollection() {
		return this.collection;
	}
	
	public void setCollection(CollectionImpl collection) {
		this.collection = collection;
	}

	@Override
	public List<? extends AuteurImpl> getAuteurs() {
		if(this.auteurs == null){
			this.auteurs = new java.util.ArrayList<>();
		}
		return this.auteurs;
	}

	public void setAuteurs(List<AuteurImpl> auteurs) {
		this.auteurs = auteurs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((auteurs == null) ? 0 : auteurs.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((collection == null) ? 0 : collection.hashCode());
		result = prime * result + ((dateDeParution == null) ? 0 : dateDeParution.hashCode());
		result = prime * result + nombreDePages;
		result = prime * result + numeroEdition;
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
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
		LivreImpl other = (LivreImpl) obj;
		if (auteurs == null) {
			if (other.auteurs != null)
				return false;
		} else if (!auteurs.equals(other.auteurs))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (collection == null) {
			if (other.collection != null)
				return false;
		} else if (!collection.equals(other.collection))
			return false;
		if (dateDeParution == null) {
			if (other.dateDeParution != null)
				return false;
		} else if (!dateDeParution.equals(other.dateDeParution))
			return false;
		if (nombreDePages != other.nombreDePages)
			return false;
		if (numeroEdition != other.numeroEdition)
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Livre [code=" + code + ", titre=" + titre + ", nombreDePages=" + nombreDePages + ", numeroEdition="
				+ numeroEdition + ", dateDeParution=" + dateDeParution + ", collection=" + collection + "]";
	}
}
