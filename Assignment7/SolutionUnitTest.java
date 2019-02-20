package Assignment7;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class SolutionUnitTest {

    Solution s = new Solution();

    @Test
    public void testMergeInterval() {
        List<Solution.Interval> input = new ArrayList<>();
        input.add(s.new Interval(1, 3));
        input.add(s.new Interval(2, 6));
        input.add(s.new Interval(8, 10));
        input.add(s.new Interval(15, 18));

        List<Solution.Interval> output = new ArrayList<>();
        output.add(s.new Interval(1, 6));
        output.add(s.new Interval(8, 10));
        output.add(s.new Interval(15, 18));

        List<Solution.Interval> actualOutput = s.merge(input);

        System.out.println(actualOutput.size());
        assertEquals(output.size(), actualOutput.size());
        assertEquals(output.get(2).start, actualOutput.get(0).start);
        assertEquals(output.get(2).end, actualOutput.get(0).end);
        assertEquals(output.get(1).start, actualOutput.get(1).start);
        assertEquals(output.get(1).end, actualOutput.get(1).end);
        assertEquals(output.get(0).start, actualOutput.get(2).start);
        assertEquals(output.get(0).end, actualOutput.get(2).end);
    }

    @Test
    public void testMedian() {
        int[] array1 = {15, 20, 25, 30};
        int[] array2 = {10, 17, 22, 25};
        double output = s.findMedianSortedArrays(array1, array2);
        assertTrue(output == 21.00);
    }
}
