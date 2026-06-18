/*
LeetCode 1047 - Remove All Adjacent Duplicates In String

Pattern: Stack

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray())
        {
            if(!stack.isEmpty() &&
               stack.peek() == ch)
            {
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char ch : stack)
        {
            sb.append(ch);
        }

        return sb.toString();
    }
}
