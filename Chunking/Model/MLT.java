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
		mots.add("tentacule");
		mots.add("rhinocéros");
		mots.add("imprimante");
		mots.add("caméléon");
		mots.add("aspirateur");
		mots.add("photographie");
		mots.add("référentiel");
		mots.add("hélicoptère");
		mots.add("multicolore");
		mots.add("vétérinaire");
		mots.add("escalader");
		mots.add("macaroni");
		mots.add("ventilateur");
		mots.add("hippopotame");
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
		TreeSet<String> collection = mots;
		String res = "";
		if(collection.isEmpty())
			return "";
		for(int i=0 ; i<taille ; i++) {
			if(collection.isEmpty())
				return res+="";
			res += collection.first() + "\n";
			collection.remove(collection.first());
		}
		return res;
	}

	public static void main(String[] args) {
		MLT memoire = new MLT();
		System.out.println(memoire);
	}
}
