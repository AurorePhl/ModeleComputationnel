package Model;

import java.util.TreeMap;

public class Simulation {

	private float txmots, txsyllabes;
	private int nbsimu, cptSimu;
	private String ch, ordre;
	private TreeMap<String,Integer> sessions; 
	private Experience xp;
	
	public Simulation(int nbsimu) {
		/* initialise les attributs et proc�de � nb simulation(s) de l'exp�rience */
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
		/* initialise l'ordre de passation des sessions pour une simulation,
		 * une TreeMap contenant chaque session en cl� associ�e au num�ro de la session,
		 * la chaine contenant chaque session de la simulation sous la forme : 
		 * mot:session ou syllabe:session. */
		sessions = new TreeMap<String,Integer>();
		ch="";
		ordre="";
		for(int i=0;i<4;) {
			int numSession = 1+ (int) (Math.random() * 4);
			if(!(sessions.containsValue(numSession))) {
				if(numSession==1) {
					sessions.put("as-pi-ra-teur-ca-m�-l�-on", numSession);
					ch+="mot:as-pi-ra-teur-ca-m�-l�-on ";
					i++;
					ordre+=1;
				}
				else if(numSession==2) {
					sessions.put("rhi-no-c�-ros-im-pri-man-te", numSession);
					ch+="mot:rhi-no-c�-ros-im-pri-man-te ";
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
					sessions.put("f�-tiel-to-phie-r�-gra-ren-pho", numSession);
					ch+="syllabe:f�-tiel-to-phie-r�-gra-ren-pho ";
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
		/* retourne les tx de r�ussite pour chaque session */
		return "session : "+sessions.get(xp.getChPresentee())+", "+xp.toString()+" soit "+calculPourcentage(xp.getTxReussite())+"%";
	}
	
	private String preToString() {
		/* retourne le num�ro de la simulation 
		 * et l'ordre de passation des sessions pour chaque simulation */
		return "Simulation "+String.valueOf(cptSimu+1)+" :\nordre de passation : "+ordre;
	}
	
	private String finToString() {
		/*retourne les moyennes de taux de r�ussites pour les sessions sans chunking et avec chunking,
		 * ainsi que la moyenne totale de tous les taux de r�ussites */
		float averageTxmots = txmots/(nbsimu*2);
		float averageTxsyllabes = txsyllabes/(nbsimu*2);
		float averageTotal = (averageTxmots+averageTxsyllabes)/2;
		return "Moyennes des taux :\ntype : mots, taux de r�ussite moyen : "+calculPourcentage(averageTxmots)+"% ("+String.valueOf(averageTxmots)+")"
		+"\ntype : syllabes, taux de r�ussite moyen : "+calculPourcentage(averageTxsyllabes)+"% ("+String.valueOf(averageTxsyllabes)+")"
		+"\ntaux de r�ussite moyen tous types confondus : "+calculPourcentage(averageTotal)+"% ("+String.valueOf(averageTotal)+")";
	}
	
	public static void main(String[] args) {
		Simulation test = new Simulation(15);
	}
	
}
