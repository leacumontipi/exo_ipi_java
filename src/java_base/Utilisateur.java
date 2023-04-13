package java_base;

import java.io.Serializable;

public class Utilisateur implements Serializable {
	private static final long ID = 1L;
	private String nom;
	private String prenom;
	private CompteBancaire cb;
	
	public Utilisateur(String nom, String prenom, CompteBancaire cb) {
		this.nom = nom;
		this.prenom = prenom;
		this.cb = cb;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public CompteBancaire getCb() {
		return cb;
	}
	
	public void setCb(CompteBancaire cb) {
		this.cb = cb;
	}
	
	@Override
	public String toString() {
		return "Utilisateur [ID=" + ID + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
}
