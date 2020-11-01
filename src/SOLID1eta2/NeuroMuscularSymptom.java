package SOLID1eta2;

public class NeuroMuscularSymptom implements Gaixotasuna {
	private int covidImpact;
	private int severityIndex;
	private int affectedDays=8;
	public NeuroMuscularSymptom(int covidImpact, int severityIndex) {
		super();
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
	}
	public int getCovidImpact1() {
		return covidImpact;
	}
	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}
	public int getCovidImpact() {
		return covidImpact;
	}
	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}
	@Override
	public int getSeverityIndex() {
		return severityIndex;
	}
	public int getaffectedDays() {
		return affectedDays; 
	}

}
