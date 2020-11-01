package Solid3;
import java.util.HashMap;
import java.util.Map;

import Solid3.Symptom;

public class Covid19Pacient extends Pacient {
	String name;
	Map<Symptom, Integer> symptoms = new HashMap<Symptom, Integer>();

	public Covid19Pacient(String name, int years) {
		super(name, years);
	}

	public void addSymptom(Symptom p, Integer w) {
		symptoms.put(p, w);
	}

	public void showSymptoms() {
		for (Symptom s : symptoms.keySet())
			s.show();
	}

	public void cure() {
		for (Symptom c : symptoms.keySet()) {
			if(c instanceof Curable)
			((Curable) c).cure();
		}
	}

}
