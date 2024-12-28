//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Read the number of test cases
        sc.nextLine();        // Consume the newline character after reading the integer

        while (t-- > 0) {
            String s = sc.nextLine(); // Read the input string

            // Remove surrounding quotes from the string
            String str = s.substring(1, s.length() - 1);

            Solution obj = new Solution(); // Create an object of the Solution class
            String ans = obj.reverseWords(str); // Reverse the words in the string

            // Print the result with surrounding quotes
            System.out.println("\"" + ans + "\"");
            System.out.println("~"); // Print separator
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (word.length() > 0) {
                    result.append(reverse(word.toString()));
                    result.append(' ');
                    word.setLength(0); 
                }
            } else {
                word.append(c);
            }
        }

        if (word.length() > 0) {
            result.append(reverse(word.toString()));
        }

        return result.toString().trim();
    }

    public String reverse(String S) {
        char[] arr = S.toCharArray();
        int n = arr.length;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }
        char[] ans = new char[n];
        for (int i = 0; i < n; i++) {
            ans[i] = stack.pop();
        }
        return new String(ans);
    }
}
