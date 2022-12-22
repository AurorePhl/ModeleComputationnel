package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class MCT {
	HashMap<String,Float> activation;
	ArrayList<String> ordre;
	int elementsPresents;
	float pActu=(float) 0.5;
	
	public MCT() {
		activation=new HashMap<String,Float>();
		ordre=new ArrayList<String>();
		elementsPresents=0;
	}
	
	public void stocker(String s) {
		if(elementsPresents==4) {
			float min=1;
			int supp=0;
			for(int i=0;i<4;i++) {
				if(activation.get(ordre.get(i))<=min) {
					min=activation.get(ordre.get(i));
					supp=i;
				}
			}
			ordre.remove(supp);
			elementsPresents--;
		}
		actualisation();
		ordre.add(s);
		activation.put(s, (float) 1);
		elementsPresents++;
		
	}
	
	public void actualisation() {
		for(Entry<String, Float> s:activation.entrySet()) {
			if(!ordre.contains(s.getKey()))
				s.setValue(s.getValue()*pActu);
			else
				s.setValue(s.getValue()*(float)(1-(ordre.indexOf(s.getKey())*0.1+0.01*Math.random())));
		}
	}

	public HashMap<String, Float> getActivation() {
		return activation;
	}


	public ArrayList<String> getOrdre() {
		return ordre;
	}




public int getElementsPresents() {
		return elementsPresents;
	}

public static void main(String[] args) {
	MCT mct=new MCT();
	mct.stocker("a");
	mct.stocker("b");
	mct.stocker("c");
	System.out.println(mct.elementsPresents+"ordre "+mct.getOrdre().toString()+" activation "+mct.getActivation().toString());
	mct.stocker("d");
	System.out.println(mct.elementsPresents+"ordre "+mct.getOrdre().toString()+" activation "+mct.getActivation().toString());
	mct.stocker("e");
	System.out.println(mct.elementsPresents+"ordre "+mct.getOrdre().toString()+" activation "+mct.getActivation().toString());
	mct.stocker("f");
	System.out.println(mct.elementsPresents+"ordre "+mct.getOrdre().toString()+" activation "+mct.getActivation().toString());
	mct.stocker("g");
	System.out.println(mct.elementsPresents+"ordre "+mct.getOrdre().toString()+" activation "+mct.getActivation().toString());
	mct.stocker("h");
	System.out.println(mct.elementsPresents+"ordre "+mct.getOrdre().toString()+" activation "+mct.getActivation().toString());
	mct.stocker("i");
	System.out.println(mct.elementsPresents+"ordre "+mct.getOrdre().toString()+" activation "+mct.getActivation().toString());
	mct.stocker("j");
	System.out.println(mct.elementsPresents+"ordre "+mct.getOrdre().toString()+" activation "+mct.getActivation().toString());
}
}
