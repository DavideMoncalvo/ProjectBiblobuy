package DM.demos;

import java.util.ArrayList;
import java.util.List;

public class Panier {
	List<Article> articles;
	
	public Panier(){
		articles  = new ArrayList<Article>();
	}
	
	public void ajouterArticle(Article article){
		articles.add(article);
		article.setStock(-1);
		System.out.println("Article restant en stock = " + article.getStock());
	}
	
	public void enleverArticle(Article article){
		articles.remove(article);
		article.setStock(+1);
		System.out.println("Article restant en stock = " + article.getStock());
	}

	@Override
	public String toString() {
		return "Panier \t" + articles +"\n";
		
	}
	
}