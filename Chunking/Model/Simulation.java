package Model;

import java.util.TreeMap;

public class Simulation {

	private float txmots, txsyllabes;
	private int nbsimu, cptSimu;
	private String ch;
	private TreeMap<String,Integer> sessions; 
	private Experience xp;
	private String ordre;
	
	public Simulation(int nbsimu) {
		this.nbsimu=nbsimu;
		txmots=0;
		txsyllabes=0;
		if(nbsimu<0) {
			throw new IllegalArgumentException("nbsimu<0 ou chaine non conforme");
		}
		for(cptSimu=0;cptSimu<nbsimu;cptSimu++) {
			initSessions();
			System.out.println(preToString());
			int j=0;
			for(;j<ch.length();) {
				if(ch.substring(j,j+4).equals("mot:")) {
					String chPresentee = "";
					int cpt=j+4;
					for(;ch.charAt(cpt)!=' ';cpt++) {
						chPresentee+=ch.charAt(cpt);
					}
					xp = new Experience(ch.substring(j,j+3),chPresentee);
					xp.passation();
					txmots=txmots+xp.getTxReussite();
					System.out.println(toString());
					j=cpt+1;
				}
				else if(ch.substring(j,j+8).equals("syllabe:")) {
					String chPresentee = "";
					int cpt=j+8;
					for(;ch.charAt(cpt)!=' ';cpt++) {
						chPresentee+=ch.charAt(cpt);
					}
					xp = new Experience(ch.substring(j,j+7),chPresentee);
					xp.passation();
					txsyllabes=txsyllabes+xp.getTxReussite();
					System.out.println(toString());
					j=cpt+1;
				}
			}
		}
		System.out.println(finToString());
	}
	
	private void initSessions(){
		sessions = new TreeMap<String,Integer>();
		ch="";
		ordre="";
		for(int i=0;i<4;) {
			int numSession = 1+ (int) (Math.random() * 4);
			if(!(sessions.containsValue(numSession))) {
				if(numSession==1) {
					sessions.put("mot:as-pi-ra-teur-ca-mé-lé-on", numSession);
					ch+="mot:as-pi-ra-teur-ca-mé-lé-on ";
					i++;
					ordre+=1;
				}
				else if(numSession==2) {
					sessions.put("mot:rhi-no-cé-ros-im-pri-man-te", numSession);
					ch+="mot:rhi-no-cé-ros-im-pri-man-te ";
					i++;
					ordre+=2;
				}
				else if(numSession==3) {
					sessions.put("syllabe:ce-le-ta-cu-ti-den-fri-ten", numSession);
					ch+="syllabe:ce-le-ta-cu-ti-den-fri-ten ";
					i++;
					ordre+=3;
				}
				else {
					sessions.put("syllabe:fé-tiel-to-phie-ré-gra-ren-pho", numSession);
					ch+="syllabe:fé-tiel-to-phie-ré-gra-ren-pho ";
					i++;
					ordre+=4;
				}
			}
			
		}
	}
	
	public String toString() {
		// montre les tx de réussite par condition
		return xp.toString();
	}
	
	private String preToString() {
		/*indique le numéro de la simulation 
		 * et l'ordre de passation des sessions pour chaque simulation*/
		return "Simulation "+String.valueOf(cptSimu+1)+" :\nordre de passation : "+ordre;
	}
	
	private String finToString() {
		/*indique les moyennes de taux de réussites et la moyenne totale*/
		float averageTxmots = txmots/(nbsimu*2);
		float averageTxsyllabes = txsyllabes/(nbsimu*2);
		return "Moyennes des taux :\ntype : mots, moyenne des taux de réussite : "+String.valueOf(averageTxmots)
		+"\ntype : syllabes, moyenne des taux de réussite : "+String.valueOf(averageTxsyllabes)
		+"\nmoyenne totales des taux de réussite : "+String.valueOf((averageTxmots+averageTxsyllabes)/2);
	}
	
	public static void main(String[] args) {
		Simulation test = new Simulation(15);
	}
	
}
