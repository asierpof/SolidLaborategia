package Solid3;

public class Symptomcure extends Symptom implements Curable {

	public Symptomcure(String name, int covidImpact, int severityIndex) {
		super(name, covidImpact, severityIndex);
		// TODO Auto-generated constructor stub
	}
	public void cure(){
		System.out.println("treatment applied to: "+name);
		}

}
