package Solid5;

public class CardioVascularSymptom implements Gaixotasuna {
	private int covidImpact;
	private int severityIndex;
	private int affectedDays=10;
	public CardioVascularSymptom(int covidImpact, int severityIndex) {
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
