package fr.demos.poe.projet.librairie.metier;

import java.time.LocalDate;

public class Livre extends Article {

	private String isbn;
	private String format;
	private LocalDate dateParution;
	private String auteur;
	private String editeur;
	private String genre;

	// Constructeur d'un livre materialise 

	public Livre(String ref, double prixHT, String nom, String image, Etat etat, Integer stock, String isbn, String format, LocalDate dateParution, String auteur, String editeur, String genre) {
		super(ref, prixHT, nom, image, etat, stock);
		
		this.isbn = isbn;
		this.format = isbn;
		this.dateParution= dateParution;
		this.auteur = auteur;
		this.editeur = editeur;
		this.genre = genre;
	}


	// Constructeur d'un livre dematerialise

	public Livre(String ref, double prixHT, String nom, String image, String format, String url, String auteur, String editeur) {
		super(ref, prixHT, nom, image, format, url);
		this.auteur = auteur;
		this.editeur = editeur;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public LocalDate getDateParution() {
		return dateParution;
	}

	public void setDateParution(LocalDate dateParution) {
		this.dateParution = dateParution;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuteur() {
		return auteur;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livre other = (Livre) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "(" + auteur + ", " + editeur + ")";

	}


}
