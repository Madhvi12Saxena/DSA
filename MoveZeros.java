public class MoveZeros {
    public static void MoveZeros(int[] nums) {
        int index = 0; // Index to keep track of the position for the next non-zero element

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // If the current element is non-zero, move it to the next available position
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill the remaining positions with zeros
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeros(nums);
        for (int num : nums) {
            System.out.print(num + " "); // Output: 1 3 12 0 0
        }
    }
}
