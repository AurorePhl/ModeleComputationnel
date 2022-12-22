package Model;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.sql.*;

public class MLT {
	
	private TreeSet<String> mots;
	private int taille;
	
	public MLT() {
		mots = new TreeSet<String>();
		mots.add("dentifrice");
		
		taille=mots.size();
	}
	
	public MLT(String mot) {
		mots = new TreeSet<String>();
		mots.add(mot);
		taille++;
	}
	
	public MLT(Collection<String> mots) {
		mots = new TreeSet<String>();
		this.mots.addAll(mots);
		taille = taille+mots.size();
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

	public static void main(String[] args) {
		/*MLT memoire = new MLT();
		System.out.println(memoire);
		System.out.println(memoire.existe("aspirateur"));
		System.out.println(memoire.existe("dentifrice"));
		System.out.println(memoire.existe("lit"));*/
	}
}
