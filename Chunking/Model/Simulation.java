package Model;

import java.util.TreeMap;
import java.util.TreeSet;

public class Simulation {

	private float txmots, txsyllabes;
	private int nbsimu;
	private String ch;
	private TreeMap<String,Integer> sessions; 
	private Experience xp;
	
	public Simulation(int nbsimu) {
		this.nbsimu=nbsimu;
		if(nbsimu<0) {
			throw new IllegalArgumentException("nbsimu<0 ou chaine non conforme");
		}
		for(int nb=0;nb<nbsimu;nb++) {
			initSessions();
			int j=0;
			for(;j<ch.length();) {
				if(ch.substring(j,j+4).equals("mot:")) {
					String chPresentee = "";
					int cpt=j+4;
					for(;ch.charAt(cpt)!=' ';cpt++) {
						chPresentee+=ch.charAt(cpt);
					}
					System.out.println(chPresentee);
					xp = new Experience(ch.substring(j,j+3),chPresentee);
					xp.passation();
					System.out.println(toString());
					j=cpt+1;
				}
				if(ch.substring(j,j+8).equals("syllabe:")) {
					String chPresentee = "";
					int cpt=j+8;
					for(;ch.charAt(cpt)!=' ';cpt++) {
						chPresentee+=ch.charAt(cpt);
					}
					System.out.println(chPresentee);
					xp = new Experience(ch.substring(j,j+7),chPresentee);
					xp.passation();
					System.out.println(toString());
					j=cpt+1;
				}
			}
		}
	}
	
	private void initSessions(){
		sessions = new TreeMap<String,Integer>();
		ch="";
		for(int i=0;i<4;) {
			int numSession = 1+ (int) (Math.random() * 4);
			if(!(sessions.containsValue(numSession))) {
				if(numSession==1) {
					sessions.put("mot:as-pi-ra-teur, mot:ca-mé-lé-on", numSession);
					ch+="mot:as-pi-ra-teur mot:ca-mé-lé-on ";
					i++;
					System.out.println("ajout de 1");
				}
				else if(numSession==2) {
					sessions.put("mot:rhi-no-cé-ros, mot:im-pri-man-te", numSession);
					ch+="mot:rhi-no-cé-ros mot:im-pri-man-te ";
					i++;
					System.out.println("ajout de 2");
				}
				else if(numSession==3) {
					sessions.put("syllabe:ce-le-ta-cu, syllabe:ti-den-fri-ten", numSession);
					ch+="syllabe:ce-le-ta-cu syllabe:ti-den-fri-ten ";
					i++;
					System.out.println("ajout de 3");
				}
				else {
					sessions.put("syllabe:fé-tiel-to-phie, syllabe:ré-gra-ren-pho", numSession);
					ch+="syllabe:fé-tiel-to-phie syllabe:ré-gra-ren-pho ";
					i++;
					System.out.println("ajout de 4");
				}
			}
			
		}
	}
	
	public String toString() {
		// montre les tx de réussite par condition
		return String.valueOf(xp.getTxReussite());
	}
	
	public static void main(String[] args) {
		Simulation test = new Simulation(1);
	}
	
}
