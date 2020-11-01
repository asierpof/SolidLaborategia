package Solid5;

import java.util.Map;

public class Afection1 implements Afectioninterface {
	public double CalculateAfection(Map<Gaixotasuna,Integer> gaixotasuna) {
		double afection=0;
		int elems =0;
		for (Gaixotasuna g:gaixotasuna.keySet())
			//covidImpact >30 bereizteko Afection klase originaletik.
			if(g.getCovidImpact()>30) {
				afection = afection +g.getSeverityIndex()*gaixotasuna.get(g);
				elems++;
			}
			return afection /elems;
	}
}
