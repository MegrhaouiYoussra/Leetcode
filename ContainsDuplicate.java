import java.util.HashSet;

/*
Problem: Contains Duplicate
Link: https://leetcode.com/problems/contains-duplicate/
Topic: Array, HashSet

Approach:
Use a HashSet to store seen numbers.
If a number already exists in the set, return true.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class ContainsDuplicate {

  public static boolean containsDuplicate(int[] nums) {

    HashSet<Integer> set = new HashSet<>();

    for (int num : nums) {
      if (set.contains(num)) {
        return true;
      }

      set.add(num);
    }

    return false;
  }
}