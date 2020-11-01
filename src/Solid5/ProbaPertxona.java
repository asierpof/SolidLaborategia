package Solid5;

public class ProbaPertxona {
	public static void main(String[] args) {
		IncrementInterface cp = new Increment();
		PacientYear p = new Pertsona("asier","66");
		System.out.println("impact= "+cp.CalculateIncrement(40, p));

	}
}
