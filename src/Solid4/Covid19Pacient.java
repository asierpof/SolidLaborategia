package Solid4;

import java.util.HashMap;
import java.util.Map;


public class Covid19Pacient extends Pacient {
	String name;

	public Covid19Pacient(String name, int years) {
		super(name, years);
	}

	Map<Gaixotasuna, Integer> gaixotasuna = new HashMap<Gaixotasuna, Integer>();

	public void addGaixotasuna(Gaixotasuna g, Integer pisua) {
		gaixotasuna.put(g, pisua);
	}
	double calcCovid19Impact(Afectioninterface ca,IncrementInterface incr) {
		double afection = 0;
		double increment = 0;
		double impact;
		// calculate afection
		afection = ca.CalculateAfection(gaixotasuna);
		// calculate increment
		increment = incr.CalculateIncrement(afection, this);
		// calculate impact
		impact = afection + increment;
		return impact;
	}
}
