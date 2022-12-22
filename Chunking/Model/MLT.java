package Model;

import java.util.Collection;
import java.util.TreeSet;

public class MLT {

	private TreeSet<String> mots;
	private int taille;

	public MLT() {
		/* initialisation des mots communs contenus dans la base de données 
		 * et mise à jour de la taille de la collection. */
		this("accordéon");
		mots.add("calendrier");
		mots.add("aspirateur");
		mots.add("caméléon");
		mots.add("crocodile");
		mots.add("dentifrice");
		mots.add("dinosaure");
		mots.add("distributeur");
		mots.add("harmonica");
		mots.add("imprimante");
		mots.add("épouvantail");
		mots.add("macaroni");
		mots.add("mariage");
		mots.add("médicament");
		mots.add("ordinateur");
		mots.add("parachute");
		mots.add("photographie");
		mots.add("rhinocéros");
		mots.add("technologie");
		mots.add("tentacule");
		mots.add("trampoline");
		mots.add("ventilateur");
		mots.add("apiculteur");
		mots.add("médecine");
		mots.add("étudiant");
		mots.add("ingénieur");
		mots.add("mécanique");
		mots.add("avocate");
		mots.add("boulangerie");
		mots.add("pharmacien");
		taille = mots.size();
	}

	public MLT(String mot) {
		mots = new TreeSet<String>();
		mots.add(mot);
		taille = mots.size();
	}

	public MLT(Collection<String> mots) {
		mots = new TreeSet<String>();
		this.mots.addAll(mots);
		taille = mots.size();
	}

	public boolean existe(String s) {
		// renvoie true si mots contient s, false sinon
		return mots.contains(s);
	}

	public Collection<String> getMots() {
		return mots;
	}

	public void setMots(TreeSet<String> mots) {
		this.mots = mots;
	}

	public String toString() {
		// retourne une chaîne de caractère contenant les mots sous forme de liste verticale
		TreeSet<String> copy = (TreeSet<String>) mots.clone(); 
		String res = "";
		if(copy.isEmpty())
			return "";
		for(int i=0 ; i<taille ; i++) {
			if(i<taille-1)
				res += copy.first() + "\n";
			else
				res += copy.first();
			copy.remove(copy.first());
		}
		return res;
	}

	// test des méthodes 
	/*public static void main(String[] args) {
		MLT memoire = new MLT();
		// test de toString()
		System.out.println(memoire);
		// test de existe()
		System.out.println(memoire.existe("aspirateur")); // doit retourner true
		System.out.println(memoire.existe("dentifrice")); // doit retourner true
		System.out.println(memoire.existe("lit")); // doit retourner false
	}*/
}
