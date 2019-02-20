package Assignment4;

public class Assignment4Tests {

    private Assignment4 assignment4;

    Assignment4Tests() {
        assignment4 = new Assignment4();
    }

    public void callTestsInOrder() throws UnitTestFailureException {
        this.longestPalindromeTests();
        this.addDigitsTests();
        this.moveZerosToEndTests();
        this.firstUniqueCharTests();
        this.rotateTests();
    }

    void longestPalindromeTests() throws UnitTestFailureException {
        String[] inputs = {"aaa", "ababba", "divyaad", "banana", "ssasssas", "xyz", "NaveenAbAneevaN"};
        String[] outputs = {"aaa", "abba", "aa", "anana", "sasssas", "x", "NaveenAbAneevaN"};
        int i = 0;
        for (String input : inputs) {
            String actualOutput = assignment4.longestPalindrome(input);
            if (!actualOutput.equals(outputs[i])) {
                throw new UnitTestFailureException(String.format("For index %d Value should be %s but %s", i, outputs[i], actualOutput));
            }
            i++;
        }
        System.out.println("Yayyyyyy !!! All CatTest cases passed for longestPalindrome");
    }

    void firstUniqueCharTests() throws UnitTestFailureException {
        String[] inputs = {"leetcode", "loveleetcode", "soumya", "ababc", "abab", "aaa", "a"};
        int[] outputs = {0, 2, 0, 4, -1, -1, 0};
        int i = 0;
        for (String input : inputs) {
            int actualOutput = assignment4.firstUniqChar(input);
            if (actualOutput != outputs[i]) {
                throw new UnitTestFailureException(String.format("For index %d Value should be %s but %s", i, outputs[i], actualOutput));
            }
            i++;
        }
        System.out.println("Yayyyyyy !!! All CatTest cases passed for firstUniqueChar");
    }

    void addDigitsTests() throws UnitTestFailureException {
        int[] inputs = {1567, 923923223, 232300329, 1000, 0000, 21, 10, 23232, 1, 9999};
        int[] outputs = {1, 8, 6, 1, 0, 3, 1, 3, 1, 9};
        int i = 0;
        for (int input : inputs) {
            int actualOutput = assignment4.addDigits(input);
            if (actualOutput != outputs[i]) {
                throw new UnitTestFailureException(String.format("For index %d Value should be %s but %s", i, outputs[i], actualOutput));
            }
            i++;
        }
        System.out.println("Yayyyyyy !!! All CatTest cases passed for addDigits");
    }


    void moveZerosToEndTests() throws UnitTestFailureException {
        int[][] inputs = {{0, 1, 0, 3, 12}, {0, 1, 0}, {1, 1, 1}, {0, 0}, {10, 10, 10}, {0, 1}, {0}, {1}, {1, 0}};
        int[][] outputs = {{1, 3, 12, 0, 0}, {1, 0, 0}, {1, 1, 1}, {0, 0}, {10, 10, 10}, {1, 0}, {0}, {1}, {1, 0}};
        int i = 0;
        for (int[] input : inputs) {
            int[] actualOutput = assignment4.moveZeroesToEnd(input);
            boolean isPassed = true;
            for (int j = 0; j < actualOutput.length; j++) {
                if (actualOutput[j] != outputs[i][j]) {
                    isPassed = false;
                    System.out.println(
                            String.format("Failing for %d, in index %d. Value should be %d but %d", i, j, actualOutput[j], outputs[i][j]));
                    break;
                }
            }
            if (!isPassed) {
                throw new UnitTestFailureException(String.format("For index %d Value should be %s but %s", i, outputs[i], actualOutput));
            }
            i++;
        }
        System.out.println("Yayyyyyy !!! All CatTest cases passed for moveZeroesToEnd");
    }

    void rotateTests() throws UnitTestFailureException {
        int[][][] inputs = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}}};
        int[][][] outputs = {{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}, {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}}};
        int i = 0;
        for (int[][] input : inputs) {
            int[][] actualOutput = assignment4.rotate(input);
            boolean isPassed = true;
            for (int j = 0; j < actualOutput.length; j++) {
                for (int k = 0; k < actualOutput[j].length; k++) {
                    if (actualOutput[j][k] != outputs[i][j][k]) {
                        isPassed = false;
                        System.out.println(
                                String.format("Failing for %d, in index %d. Value should be %d but %d", i, j, actualOutput[j], outputs[i][j]));
                        break;
                    }
                }
            }
            if (!isPassed) {
                throw new UnitTestFailureException(String.format("For index %d Value should be %s but %s", i, outputs[i], actualOutput));
            }
            i++;
        }
        System.out.println("Yayyyyyy !!! All CatTest cases passed for rotate Matrix");
    }

    public static void main(String[] args) throws UnitTestFailureException {
        Assignment4Tests tests = new Assignment4Tests();
        tests.callTestsInOrder();
    }
}
