package Solid4;

public class ProbaCovid19Patient {
	public static void main(String[] args) {
		Gaixotasuna g1 = new CardioVascularSymptom(40, 5);
		Gaixotasuna g2 = new NeuroMuscularSymptom(60, 5);

		Covid19Pacient cp = new Covid19Pacient("asier", 23);
		cp.addGaixotasuna(g1, 5);
		cp.addGaixotasuna(g2, 6);
		Afectioninterface af = new Afection();
		Afectioninterface af1 = new Afection1();
		IncrementInterface incr = new Increment();
		System.out.println("impact= "+cp.calcCovid19Impact(af, incr));
		System.out.println("impact= "+cp.calcCovid19Impact(af1, incr));

	}
}
