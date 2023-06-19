public class IncrementLargeInteger {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Start from the rightmost digit
        for (int i = n - 1; i >= 0; i--) {
            // Increment the digit by 1
            digits[i]++;
            
            // If the digit is less than 10, no carry required
            if (digits[i] < 10) {
                return digits;
            }
            
            // Carry occurs, set the current digit to 0 and continue to the next digit
            digits[i] = 0;
        }
        
        // If we reach this point, it means there is a carry from the leftmost digit
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // Set the leftmost digit to 1
        return newDigits;
    }
    
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        System.out.print("Output: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}