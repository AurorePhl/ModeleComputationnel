package Model;

import java.util.Map;

public class MDT {
	MCT mct;
	MLT mlt;
	
	public MDT() {
		mct=new MCT();
		mlt=new MLT();
	}
	
	public void stocker(String s) {
		if(mct.getElementsPresents()==3) {
		String s1=mct.getOrdre().get(0),s2=mct.getOrdre().get(1),s3=mct.getOrdre().get(2);
		if(!traite(s1,s2,s3,s))
			mct.stocker(s);
		}
		else if(mct.getElementsPresents()==4) {
			String s1=mct.getOrdre().get(1),s2=mct.getOrdre().get(2),s3=mct.getOrdre().get(3);
			if(!traite(s1,s2,s3,s))
				mct.stocker(s);
			}
		else mct.stocker(s);
	}
		
		
	
	public boolean traite(String s1, String s2,String s3, String s) {
		if (mlt.existe(s1+s2+s3+s)) {
			mct.enleve(s1);
			mct.enleve(s2);
			mct.enleve(s3);
			mct.stocker(s1+s2+s3+s);
			return true;
		}
		return false;
		
		
	}
	
	public Map<String, Float> encode(String ch) {
		int i,j=0;
		for(i=0;i<ch.length();i++) {
			if(ch.charAt(i)=='-') {
				stocker(ch.substring(j,i));
				j=i+1;
			}
			
		}
		stocker(ch.substring(j,i));
		return mct.getActivation();
		}
	
/*
 * public static void main(String[] args) { MDT mdt1=new MDT(); MDT mdt2=new
 * MDT(); System.out.println( mdt1.encode("as-pi-ra-teur-ca-me-le-on")+
 * mdt1.mct.getOrdre().toString());
 * System.out.println(mdt2.encode("pi-as-ra-teur-ca-on-le-me")+mdt2.mct.getOrdre
 * ().toString()); }
 */
}
