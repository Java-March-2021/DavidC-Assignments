import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
	public static int numSum(int[] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println(nums);
		return sum;
	}
	public static ArrayList<Integer> trimSum(int[] nums, int bound){
		ArrayList<Integer> newList = new ArrayList<Integer>();
			for(int num: nums) {
				if(num < bound) {
					newList.add(num);
				}	
			}
			return newList;
	}
	public static void getNames(ArrayList<String> names) {
		Collections.shuffle(names);
		System.out.println(names);
		for(int i = 0; i < names.size(); i++) {
			String c = names.get(i);
				if(c.length() > 5) {
				System.out.println(c);
			}
		}
	}
	
	
	public static void getAlphabet() {
	ArrayList<Character> alphabet = new ArrayList<Character>();
	for(char ch = 'a'; ch <= 'z'; ++ch) {
		alphabet.add(ch);
			}
	System.out.println(alphabet);
	Collections.shuffle(alphabet);
	System.out.println(alphabet);
	System.out.println(alphabet.get(25));
	System.out.println(alphabet.get(0));
		if(alphabet.get(0) == 'a') {
			System.out.println("Vowel Bonanza!");
		}
		if(alphabet.get(0) == 'e') {
			System.out.println("Vowel Bonanza!");
		}
		if(alphabet.get(0) == 'i') {
			System.out.println("Vowel Bonanza!");
		}
		if(alphabet.get(0) == 'o') {
			System.out.println("Vowel Bonanza!");
		}
		if(alphabet.get(0) == 'u') {
			System.out.println("Vowel Bonanza!");
		}
}
//	● Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
	public static int[] getRandom(int lowerbound, int upperbound) {
		int[] arr = new int[10];
		int offset = upperbound - lowerbound;
		Random r = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(offset) + lowerbound;
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		return arr;
		}

	public static String randomString(String chars){
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int length = 5;
			for(int i = 0; i < length; i++) {
				int index = random.nextInt(alphabet.length());
				char randomChar = alphabet.charAt(index);
				sb.append(randomChar);
			}
//			System.out.println(sb);
			String randomString = sb.toString();
			return randomString;	
	}

	public static void randomStringGenerator(String chars) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		ArrayList<String> rng = new ArrayList<String>();
		for(int i = 0; i < 10; i++) {
			rng.add(randomString(alphabet));
	}
		System.out.println(rng);
}	
}


