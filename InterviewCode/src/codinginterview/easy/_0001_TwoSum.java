package codinginterview.easy;

import java.util.HashMap;

public class _0001_TwoSum {

	public int[] twoSum1(int[] nums, int target) {
		int key = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			key = target - nums[i];
			for (int j = i + 1; j < nums.length; j++)
				if (key == nums[j])
					return new int[] { i, j };
		}
		return new int[] {};
	}

	public int[] twoSum2(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length - 1; i++) {
			
			if(map.containsKey(target-nums[i]))
				return new int[] {map.get(target-nums[i]),i};
			
			map.put(nums[i], i);
		}
		return new int[] {};
	}

	
	public static void main(String[] args) {

		System.out.println("Welcome to Two Sum Program!!");

		_0001_TwoSum obj = new _0001_TwoSum();
		int nums[] = { 2, 11, 7, 15 };
		int target = 9;

		System.out.println("First Solution Output");
		for(int index:obj.twoSum1(nums, target)) {
			System.out.print(index + " ");
		}
		System.out.println("\nSecond Solution Output");
		for(int index:obj.twoSum2(nums, target)) {
			System.out.print(index + " ");
		}
	}
}
