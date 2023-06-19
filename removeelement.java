public class removeelement {
    public int removeElement(int[] nums, int val) {
        int k = 0;  // variable to track the number of elements not equal to val
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];  // overwrite the element at index k with the current element
                k++;  // increment k
            }
        }
        
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        
        removeelement solution = new removeelement();
        int k = solution.removeElement(nums, val);
        
        System.out.println("Number of elements not equal to val: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
