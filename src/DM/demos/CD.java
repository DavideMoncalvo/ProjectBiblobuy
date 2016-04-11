package DM.demos;

public class CD extends Article {
	private String title;
	private String auteur;
	private String editeur;
	private String genre;

	public CD(double prixHT, int stock, String description, String reference, String title, String auteur,
			String editeur, String genre) {
		super(prixHT, stock, description, reference);
		this.title = title;
		this.auteur = auteur;
		this.editeur = editeur;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public String getAuteur() {
		return auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public String getGenre() {
		return genre;
	}

	@Override
	public String toString() {
		return "\n" + super.toString() + "\t title = " + title + "\t auteur = " + auteur + "\t editeur = " + editeur
				+ "\t genre = " + genre;
	}
}
