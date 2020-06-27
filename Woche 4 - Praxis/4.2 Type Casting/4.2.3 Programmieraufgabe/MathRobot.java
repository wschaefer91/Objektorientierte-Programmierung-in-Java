public class MathRobot {
	public double div(String a, String b) {
		double ergebnis = 0.0;

		double aDouble = Double.parseDouble(a);
		double bDouble = Double.parseDouble(b);

		double zwischenergebnis = aDouble / bDouble;
		ergebnis = zwischenergebnis / 2.0;

		return ergebnis;
	}
}
