package Solid5;

	public class Pertsona implements PacientYear{
		 String name, adina;
		 public Pertsona(String izena,String adina) {
			 this.name=izena;
			 this.adina=adina;
		 }
		@Override
		public String getYear() {
			return this.adina;
		}
		

}
