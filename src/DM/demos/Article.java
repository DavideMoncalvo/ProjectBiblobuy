package DM.demos;

public class Article {

	private double prixHT;
	private int stock;
	private String description;
	private String reference;

	public Article(double prixHT, int stock, String description, String reference) {
		this.prixHT = prixHT;
		this.stock = stock;
		this.description = description;
		this.reference = reference;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = this.stock + stock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "Article : " + getClass().getSimpleName() + "\t prixHT = " + prixHT 
				+ "\t description = " + description + "\t reference = " + reference;
	}

}