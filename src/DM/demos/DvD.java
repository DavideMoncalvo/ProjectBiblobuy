package DM.demos;

public class DvD extends Article {

	private String title;
	private String directeur;
	private String acteurs;
	private String genre;

	public DvD(double prixHT, int stock, String description, String reference, String title, String directeur,
			String acteurs, String genre) {
		super(prixHT, stock, description, reference);
		this.title = title;
		this.directeur = directeur;
		this.acteurs = acteurs;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public String getDirecteur() {
		return directeur;
	}

	public String getActeurs() {
		return acteurs;
	}

	public String getGenre() {
		return genre;
	}

	@Override
	public String toString() {
		return "\n"+super.toString() +"\t title = " + title + "\t directeur = " + directeur + "\t acteurs = " + acteurs + "\t genre " + genre;
	}

}
