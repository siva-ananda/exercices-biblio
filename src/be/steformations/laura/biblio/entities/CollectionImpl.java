package be.steformations.laura.biblio.entities;

import java.util.List;

public class CollectionImpl implements be.steformations.java_data.biblio.interfaces.Collection {

	private Integer id;
	private String nom;
	private List<LivreImpl> livresCol;
	
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

	public List<LivreImpl> getLivresCol() {
		if(this.livresCol == null){
			this.livresCol = new java.util.ArrayList<>();
		}
		return this.livresCol;
	}

	public void setLivresCol(List<LivreImpl> livresCol) {
		this.livresCol = livresCol;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
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
		CollectionImpl other = (CollectionImpl) obj;
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
		return true;
	}

	@Override
	public String toString() {
		return "Collection [id=" + id + ", nom=" + nom + "]";
	}

}
