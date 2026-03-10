
/*
Problem: Two Sum
Link: https://leetcode.com/problems/two-sum/
Topic: Array, HashMap

Approach:
Use a HashMap to store numbers and their indices.
For each number, check if the complement exists.

Time Complexity: O(n)
Space Complexity: O(n)
*/
import java.util.HashMap;

public class TwoSum {

  public static int[] twoSum(int[] nums, int target) {

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {

      int complement = target - nums[i];

      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
      }

      map.put(nums[i], i);
    }

    return new int[] {};
  }

}