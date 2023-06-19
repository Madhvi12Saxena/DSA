import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store the complement of each number
        // and its corresponding index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the hashmap
            if (map.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }
            
            // Store the number and its index in the hashmap
            map.put(nums[i], i);
        }
        
        // No solution found, return an empty array
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums, target);

        // Print the result
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Numbers: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
