class Solution {
    // public boolean isPalindrome(int x) {
    //     String s = Integer.toString(x);
    //     int left = 0, right = s.length() - 1;

    //     while(left < right) {
    //         if (s.charAt(left) != s.charAt(right)) {
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true;
    // }

    public boolean isPalindrome(int x) {
        String value = String.valueOf(x);

        StringBuilder sb = new StringBuilder(value);

        return sb.reverse().toString().equals(value);
    }
}