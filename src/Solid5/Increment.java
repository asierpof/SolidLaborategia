package Solid5;

public class Increment implements IncrementInterface {

	public double CalculateIncrement(double afection, PacientYear p) {
		if(Integer.parseInt(p.getYear())>65)
			return afection*0.5;
		return 0;
		
	}
}
