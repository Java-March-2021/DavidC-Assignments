import java.util.ArrayList;
public class BasicJava {
	public static void getArray() {
		int i = 1;
		while(i < 256) {
			System.out.println(i);
			i++;
		}
	}
	public static void getOdd() {
		for(int i = 1; i < 256; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
		
	public static int printSum() {
		int sum = 0;
		for(int i = 0; i < 256; i++) {
			sum = sum + i;
			System.out.println("New number: " + i + "Sum: " + sum);
		}
		return sum;
		}
	public static void arrayIterate(int[] nums) {
		for(int val: nums) {
			System.out.println(val);
		}
		}
	public static int Maxnum(int[] nums) {
		int max = 0;
		for(int val: nums) {
			if(val > max) {
				max = val;
			}
		}
		return max;
	}
	public static double GetAvg(int[] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		double avg = sum/nums.length;
		System.out.println("Average: " + avg);
		return avg;
	}
	public static ArrayList<Integer> OddArray() {
		ArrayList<Integer> y = new ArrayList<Integer>();
		for(int i = 0; i < 256; i++) {
			if(i % 2 != 0);
			y.add(i);
		}
		return y;
		}
	
	public static void GreaterY(int[] nums, int y) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > y) {
				System.out.println(nums[i]);
			}
			}
		}
	public static int ValSquare(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
			System.out.println(nums);
		}
		return 0;
	}
	public static void NoNeg(int[] negnums) {
		for(int i = 0; i < negnums.length; i++) {
			if(negnums[i] < 0) {
				negnums[i] = 0;
			}
		System.out.println(negnums);
		}
	}
	public static void MaxMinAvg(int[] negnums) {
		int max = Maxnum(negnums);
		int min = 0;
		for(int i = 0; i < negnums.length; i++) {
			if(negnums[i] < min) {
				min = negnums[i];
			}
		}
		double avg = GetAvg(negnums);
		System.out.println(String.format("%o %o %d", max, min, avg));
	}
	public static void Shifty(int[] negnums) {
		for(int i = 0; i < negnums.length; i++) {
			negnums[i] = negnums[i-1];
			System.out.println(negnums);
		}
	}
}
				
				
		
	
		

	

	

