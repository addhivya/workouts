package Assignment4;

import java.util.HashMap;

public class Assignment4 {

    /**
     * The deadline of assignment4 is 10/12/2018 23:59 PST.
     * Please feel free to contact Zane and Amanda for any questions.
     */

    /*
     * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
     * s = "leetcode" return 0.
     * s = "loveleetcode" return 2.
     */
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] text = s.toCharArray();
        int i = 0;
        while (text.length != i) {
            if (map.containsKey(text[i])) {
                map.put(text[i], -1);
            } else {
                map.put(text[i], i);
            }
            i++;
        }
        int min = Integer.MAX_VALUE;
        for (Character m : map.keySet()) {
            if (map.get(m) >= 0 && map.get(m) < min) {
                min = map.get(m);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    /*
     *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * Input: 38 Output: 2
     * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */
    public int addDigits(int n) {
        int countDigit = 0;
        while (n > 0) {
            countDigit = countDigit + n % 10;
            n = n / 10;
        }
        if (countDigit >= 10) {
            return addDigits(countDigit);
        } else {
            return countDigit;
        }
    }

    /*
     *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *  Input: [0,1,0,3,12] Output: [1,3,12,0,0]
     */
    public void moveZeroes(int[] nums) {
        int[] numsOutput = moveZeroesToEnd(nums);
        for (int m = 0; m < numsOutput.length; m++) {
            System.out.println(numsOutput[m]);
        }
    }

    public int[] moveZeroesToEnd(int[] nums) {
       int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (j == nums.length - 1) break;
            for (j = i + 1; j < nums.length; j++) {
                while (nums[i] != 0) {
                    break;
                }
                if (nums[i] == 0) {
                    if (nums[j] != 0) {
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                    } else {
                        continue;
                    }
                }
            }
        }
        return nums;
    }

    /*
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad" Output: "bab" Note: "aba" is also a valid answer.
     */
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        boolean matched = false;
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j < s.length() - i + 1; j++) {
                String str = s.substring(j, j + i);
                if (isPalindrome(str)) {
                    start = j;
                    end = j + i;
                    matched = true;
                    break;
                }
            }
            if (matched) {
                break;
            }
        }
        String res = s.substring(start, end);
        return res;
    }


    private boolean isPalindrome(String str) {
        char[] text = str.toCharArray();
        int j = text.length - 1;
        int i = 0;
        while (i <= j) {
            if (text[i] != text[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /*
     * You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * Given input matrix = [ [1,2,3],
  			      [4,5,6],
  			      [7,8,9] ],
     * rotate the input matrix in-place such that it becomes: [  [7,4,1],
  								 [8,5,2],
  								  [9,6,3] ],
     */
    public int[][] rotate(int[][] matrix) {
        int column = matrix.length - 1;
        int level = 0;
        int totallevel = matrix.length / 2;
        while (level < totallevel) {
            for (int i = level; i < column; i++) {
                swap(level, i, i, column, matrix);
                swap(level, i, column, column - i + level, matrix);
                swap(level, i, column - i + level, level, matrix);
            }
            --column;
            ++level;
        }
        return matrix;
    }

    private void swap(int i, int j, int a, int b, int matrix[][]) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[a][b];
        matrix[a][b] = temp;
    }

}