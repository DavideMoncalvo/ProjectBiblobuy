package DM.demos;

import java.io.IOException;
import java.io.PrintWriter;

public class TestBiblo {

	public static void main(String[] args) {

		Article l1 = new Livre(10, 2, "fabulous", "25852582", "splendore", "margaret mazzantini", "mondadori",
				"romanzo");
		Article l2 = new Livre(10, 2, "fabulous", "25852582", "splendore", "margaret mazzantini", "mondadori",
				"romanzo");
		Article d1 = new DvD(12, 3, "larmes au yeaux", "125252", "Titanic", "i don't know", "DiCaprio, Winslet",
				"love story");
		Article c1 = new CD(9.99, 1, "spacca", "969582", "Me", "Jane", "Virgin", "Hindi");
		Panier panier = new Panier();
		panier.ajouterArticle(l1);
		panier.ajouterArticle(l2);
		panier.ajouterArticle(d1);
		panier.ajouterArticle(c1);
		System.out.println(panier);

		panier.enleverArticle(c1);
		System.out.println(panier);

		try (PrintWriter pw = new PrintWriter("Panier.txt")) {

			pw.println(panier.toString());

		} catch (IOException exc) {

			exc.printStackTrace();
			System.out.println(exc.getMessage());
		}
	}
}