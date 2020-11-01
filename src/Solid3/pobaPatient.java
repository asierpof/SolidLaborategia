package Solid3;

public class pobaPatient {
 public static void main (String [] args) {
	 Curable sintoma = new Symptomcure("eztula",6,5);
	 Curable sintoma1 = new Symptomcure("sukarra",8,9);
	 Symptom cu= new IncurableSymptom("tristura",3, 0);
	 Covid19Pacient cp = new Covid19Pacient("asier",20);
	 cp.addSymptom((Symptom)sintoma, 5);
	 cp.addSymptom((Symptom)sintoma1, 6);
	 cp.addSymptom( cu, 2);
	 cp.showSymptoms();
	 cp.cure();
 }
}
