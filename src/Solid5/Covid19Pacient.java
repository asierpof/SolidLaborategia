package Solid5;

import java.util.HashMap;
import java.util.Map;


public class Covid19Pacient  {
	Map<Gaixotasuna, Integer> gaixotasuna = new HashMap<Gaixotasuna, Integer>();
	public void addGaixotasuna(Gaixotasuna g, Integer pisua) {
		gaixotasuna.put(g, pisua);
	}
	double calcCovid19Impact(Afectioninterface ca,IncrementInterface incr,PacientYear p) {
		double afection = 0;
		double increment = 0;
		double impact;
		// calculate afection
		afection = ca.CalculateAfection(gaixotasuna);
		// calculate increment
		increment = incr.CalculateIncrement(afection, p);
		// calculate impact
		impact = afection + increment;
		return impact;
	}
}
