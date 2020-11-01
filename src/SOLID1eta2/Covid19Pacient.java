package SOLID1eta2;
import java.util.HashMap;
import java.util.Map;

import Solid3.Symptom;

public class Covid19Pacient extends Pacient {
	String name;

	public Covid19Pacient(String name, int years) {
		super(name, years);
	}

	Map<Gaixotasuna, Integer> gaixotasuna = new HashMap<Gaixotasuna, Integer>();

	public void addGaixotasuna(Gaixotasuna g, Integer pisua) {
		gaixotasuna.put(g, pisua);
	}

	double calcCovid19Impact() {
		double afection = 0;
		double increment = 0;
		double impact;
		Afection af = new Afection();
		Increment in = new Increment();
		// calculate afection
		afection = af.CalculateAfection(gaixotasuna);
		// calculate increment
		increment = in.CalculateIncrement(afection, this);
		// calculate impact
		if (getYears() > 10)
			impact = afection + increment;
		else
			impact = 0;
		return impact;
	}

	int sanatedDays(Gaixotasuna g) {
		return g.getaffectedDays();
	}


}
