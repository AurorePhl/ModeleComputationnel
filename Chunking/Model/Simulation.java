package Model;

import java.util.HashMap;
import java.util.TreeSet;

public class Simulation {

	private float txmots, txsyllabes;
	private int nbsimu;
	private String ch;
	private HashMap<String,Integer> sessions; 
	private Experience xp;
	
	public Simulation(int nbsimu) {
		this.nbsimu=nbsimu;
		if(nbsimu<0) {
			throw new IllegalArgumentException("nbsimu<0 ou chaine non conforme");
		}
		for(int nb=0;nb<nbsimu;nb++) {
			initSessions();
			ch=sessions.toString();
			for(int i=0;i<sessions.size();i++) {
				if(ch.substring(i,i+4).equals("mots")) {
					
					xp = new Experience(ch.substring(i,i+4),ch.substring(i));
					xp.passation();
				}
				if(ch.substring(i,i+8).equals("syllabes")) {
					
				}
			}
		}
	}
	
	public Simulation(String ch, int nbsimu){
		// constructeur, ch l’ensemble des chaînes présentées séparées par MOTS ou SYLLABES
		this.ch=ch;
		this.nbsimu=nbsimu;
		if(nbsimu<0) {
			throw new IllegalArgumentException("nbsimu<0 ou chaine non conforme");
		}
		for(int nb=0;nb<nbsimu;nb++) {
			initSessions();
			for(int i=0;i<ch.length();i++) {
				if(ch.substring(i,i+4).equals("mots")) {
					
					xp = new Experience(ch.substring(i,i+4),ch.substring(i));
					xp.passation();
				}
				if(ch.substring(i,i+8).equals("syllabes")) {
					
				}
			}
		}
	}
	
	private void initSessions(){
		sessions = new HashMap<String,Integer>();
		TreeSet<Integer> cpt = new TreeSet<Integer>();
		for(int i=0;i<4;) {
			int numSession = 1+ (int) (Math.random() * 4);
			if(sessions.containsValue(numSession)) {
				if(cpt.contains(numSession))
					i++;
				else
					cpt.add(numSession);
			}
			else {
				if(numSession==1)
					sessions.put("mot:as-pi-ra-teur;mot:ca-mé-lé-on", numSession);
				else if(numSession==2)
					sessions.put("mot:rhi-no-cé-ros;mot:im-pri-man-te", numSession);
				else if(numSession==3)
					sessions.put("syllabe:ce-le-ta-cu;syllabe:ti-den-fri-ten", numSession);
				else
					sessions.put("syllabe:fé-tiel-to-phie;syllabe:ré-gra-ren-pho", numSession);
			}
			
		}
		System.out.println(sessions.toString());
	}
	
	public String toString() {
		// montre les tx de réussite par condition
		return String.valueOf(xp.getTxReussite());
	}
	
	public static void main(String[] args) {
		Simulation s1 = new Simulation("",2);
	}
	
}
