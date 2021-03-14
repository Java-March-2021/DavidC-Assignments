import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJavaTest {

	public static void main(String[] args) {
		int[] nums = {3,5,1,2,7,9,8,13,25,32};
		int bound = 10;
		ArrayList<String> getNames = new ArrayList<>(Arrays.asList ("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
		int lowerbound = 55;
		int upperbound = 100;
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		PuzzleJava.numSum(nums);
		PuzzleJava.trimSum(nums, bound);
		PuzzleJava.getNames(getNames);
		PuzzleJava.getAlphabet();
		PuzzleJava.getRandom(lowerbound,upperbound);
		PuzzleJava.randomString(alphabet);
		PuzzleJava.randomStringGenerator(alphabet);
	}
}
