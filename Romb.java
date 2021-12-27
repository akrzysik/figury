public class Romb extends Figura {
	private double a, b;

	public Romb(Punkt p, double na, double nb) {
		super(p);
    a = na;
    b = nb;
	}
	
  public double pole() {
		return a * b;
	}

	public void powieksz(double ile) {
		a *= ile;
		b *= ile;
	}

	public String toString() {

		return "Romb(" + a + ", " + b + ")" + super.toString();
	}
}
