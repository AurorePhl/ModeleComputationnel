package Model;

public class Simulation {

	private float txmots, txsyllabes;
	private int nbsimu;
	private String ch;
	// private Map<Experience,Integer> expe; ?? -> Integer : nbsimu
	
	public Simulation(String ch, int nbsimu){
		// constructeur, ch l’ensemble des chaînes présentées séparées par MOTS ou SYLLABES
		if(nbsimu<0 || ch.equals("") || ch==null) {
			throw new IllegalArgumentException("nbsimu<0 ou chaine non conforme");
		}
		this.ch=ch;
		this.nbsimu=nbsimu;
		for(int i=0;i<ch.length();i++) {
			if(ch.substring(i,i+4).equals("MOTS")) {
				
			}
			if(ch.substring(i,i+8).equals("SYLLABES")) {
				
			}
		}
	}
	
	public String toString() {
		// montre les tx de réussite par condition
		return "";
	}
	
}
