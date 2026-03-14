class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false; // Negative numbers are not palindromes
        if (x == 0) return true; // Zero is a palindrome

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            x /= 10; // Remove the last digit
        }

        return original == reversed; // Check if the original number is equal to the reversed number
    }
}

//OR
class Solution {
    public boolean isPalindrome(int x) {
       

        int n=x;
        int rev=0;

        while(n>0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }

        return  rev==x
        }
    }
}
