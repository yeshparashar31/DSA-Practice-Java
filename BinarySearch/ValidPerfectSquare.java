/*
LeetCode 367 - Valid Perfect Square

Pattern: Binary Search

Time Complexity: O(log n)
Space Complexity: O(1)
*/


class Solution {
    public boolean isPerfectSquare(int num) {

        long low = 1;
        long high = num;

        while(low <= high)
        {
            long mid = low + (high - low) / 2;

            long square = mid * mid;

            if(square == num)
            {
                return true;
            }
            else if(square < num)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        return false;
    }
}
