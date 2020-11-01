package SOLID1eta2;

public class RespiratorySymptom implements Gaixotasuna {
	private int covidImpact;
	private int severityIndex;
	private int affectedDays = 5;
	public RespiratorySymptom(int covidImpact, int severityIndex) {
		super();
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
	}
	public int getCovidImpact() {
		return covidImpact;
	}
	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}
	public int getSeverityIndex() {
		return severityIndex;
	}
	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}
	public int getaffectedDays() {
		return affectedDays; 
	}

}
