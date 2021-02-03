import java.lang.Math;

public class PythagoreanTheorem {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
    	double squareLegC = (legA * legA) + (legB * legB);
    	double legC = Math.sqrt(squareLegC);
    	return (legC);
    }
}