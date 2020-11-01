package Solid4;

public class Increment implements IncrementInterface {

	public double CalculateIncrement(double afection, Pacient p) {
		double increment = 0;
		if(p.getYears()>65)
			increment=afection*0.5;
		if(p.getYears()<=65 && p.getYears()>=45)
			increment=afection*0.3;
		return increment;
	}
}
