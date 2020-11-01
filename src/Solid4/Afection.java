package Solid4;
import java.util.Map;

public class Afection implements Afectioninterface {

	public double CalculateAfection(Map<Gaixotasuna,Integer> gaixotasuna) {
		double afection=0;
		int elems =0;
		for (Gaixotasuna g:gaixotasuna.keySet())
			if(g.getCovidImpact()>50) {
				afection = afection +g.getSeverityIndex()*gaixotasuna.get(g);
				elems++;
			}
			return afection /elems;
	}
}
