import java.lang.Math;
public class PythagoreanTheorem {
	public double calculateHypotenuse(int legA, int legB) {
		long sumOfSides = (legA*legA + legB*legB);
		double squareRoot = Math.sqrt(sumOfSides);
		System.out.println("Hypotenuse is: " + squareRoot);
		return squareRoot;
	}
}
