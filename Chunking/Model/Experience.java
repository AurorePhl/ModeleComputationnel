package Model;


public class Experience {
	MDT mdt;
	float txReussite;
	String typePresentation,chPresentee;
	
	public Experience(String type,String ch) {
		typePresentation=type;
		chPresentee=ch;
		txReussite=(float) 0.0;
		mdt=new MDT();
	}
	
	public void passation() {
		mdt.encode(chPresentee);
		for(float v:mdt.getMct().getActivation().values()) {
			txReussite+=v;
		}
		txReussite/=mdt.getMct().getActivation().size();
	}
	
	public String toString() {
		return "type : "+typePresentation+", taux de réussite : "+String.valueOf(txReussite);
	}

	/*
	 * public static void main(String[] args) { Experience exp1=new
	 * Experience("mots","as-pi-ra-teur-ca-me-le-on"); Experience exp2=new
	 * Experience("syllabes","pi-as-ra-teur-ca-on-le-me"); exp1.passation();
	 * exp2.passation(); System.out.println("expe1 : "+exp1+", expe2 : "+exp2); }
	 */

}

