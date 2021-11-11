package Arrays;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int target = 9;
		int[] twoSum = twoSum(arr, target);
		for (int i : twoSum)
			System.out.println(i);

		hashmap(arr, target);
	}

	private static int[] hashmap(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			
			if (map.containsKey(nums[i])) {
				
				return new int[] { map.get(nums[i]), i };
			} else 
			{
				map.put(target - nums[i], i);
			}
		}
		return nums;
	}

	private static int[] twoSum(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { 0, 0 };
	}

}
