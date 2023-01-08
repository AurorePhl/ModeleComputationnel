package Model;

import java.util.TreeMap;

public class Simulation {

	private float txmots, txsyllabes;
	private int nbsimu, cptSimu;
	private String ch, ordre;
	private TreeMap<String,Integer> sessions; 
	private Experience xp;
	
	public Simulation(int nbsimu) {
		/* initialise les attributs et procède à nb simulation(s) de l'expérience */
		this.nbsimu=nbsimu;
		txmots=0;
		txsyllabes=0;
		if(nbsimu<0) {
			throw new IllegalArgumentException("nbsimu<0");
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
		/* initialise l'ordre de passation des sessions pour une simulation,
		 * une TreeMap contenant chaque session en clé associée au numéro de la session,
		 * la chaîne contenant chaque session de la simulation sous la forme : 
		 * mot:session ou syllabe:session. */
		sessions = new TreeMap<String,Integer>();
		ch="";
		ordre="";
		for(int i=0;i<4;) {
			int numSession = 1+ (int) (Math.random() * 4);
			if(!(sessions.containsValue(numSession))) {
				if(numSession==1) {
					sessions.put("as-pi-ra-teur-ca-mé-lé-on", numSession);
					ch+="mot:as-pi-ra-teur-ca-mé-lé-on ";
					i++;
					ordre+=1;
				}
				else if(numSession==2) {
					sessions.put("rhi-no-cé-ros-im-pri-man-te", numSession);
					ch+="mot:rhi-no-cé-ros-im-pri-man-te ";
					i++;
					ordre+=2;
				}
				else if(numSession==3) {
					sessions.put("ce-le-ta-cu-ti-den-fri-ten", numSession);
					ch+="syllabe:ce-le-ta-cu-ti-den-fri-ten ";
					i++;
					ordre+=3;
				}
				else {
					sessions.put("fé-tiel-to-phie-ré-gra-ren-pho", numSession);
					ch+="syllabe:fé-tiel-to-phie-ré-gra-ren-pho ";
					i++;
					ordre+=4;
				}
			}
			
		}
	}
	
	private int calculPourcentage(float value) {
		float res = value*100;
		if(res%10<5)
			return (int)(res);
		return ((int) (res))+1;
		
	}
	
	public String toString() {
		/* retourne les taux de réussite pour chaque session */
		return "session : "+sessions.get(xp.getChPresentee())+", "+xp.toString()+" soit "+calculPourcentage(xp.getTxReussite())+"%";
	}
	
	private String preToString() {
		/* retourne le numéro de la simulation 
		 * et l'ordre de passation des sessions pour chaque simulation */
		return "Simulation "+String.valueOf(cptSimu+1)+" :\nordre de passation : "+ordre;
	}
	
	private String finToString() {
		/* retourne les moyennes de taux de réussite pour les sessions sans chunking et avec chunking,
		 * ainsi que la moyenne totale de tous les taux de réussite */
		float averageTxmots = txmots/(nbsimu*2);
		float averageTxsyllabes = txsyllabes/(nbsimu*2);
		float averageTotal = (averageTxmots+averageTxsyllabes)/2;
		return "Moyennes des taux :\ntype : mots, taux de réussite moyen : "+calculPourcentage(averageTxmots)+"% ("+String.valueOf(averageTxmots)+")"
		+"\ntype : syllabes, taux de réussite moyen : "+calculPourcentage(averageTxsyllabes)+"% ("+String.valueOf(averageTxsyllabes)+")"
		+"\ntaux de réussite moyen tout type confondu : "+calculPourcentage(averageTotal)+"% ("+String.valueOf(averageTotal)+")";
	}
	
	public static void main(String[] args) {
		Simulation test = new Simulation(15);
	}
	
}
