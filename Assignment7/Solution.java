package Assignment7;

import java.util.*;

public class Solution {

    class Interval {
        int start;
        int end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        boolean isEven = (nums1.length + nums2.length) % 2 == 0;
        int median = (nums1.length + nums2.length) / 2;
        int last = 0;
        int i = 0, j = 0;
        int counter = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                if (counter == median) {
                    return getMedian(nums1, i, isEven, last);
                }
                last = nums1[i];
                i++;

            } else {
                if (counter == median) {
                    return getMedian(nums2, j, isEven, last);
                }
                last = nums2[j];
                j++;

            }
            counter++;
        }
        if (i == nums1.length) {
            return oneArray(j, nums2, median, isEven, last, i + j);
        } else {
            return oneArray(i, nums1, median, isEven, last, i + j);
        }
    }

    private double getMedian(int[] nums, int i, boolean isEven, int last) {
        if (isEven) {
            System.out.print("The median is " + "(" + "" + last + "+" + "" + nums[i] + ")" + "/" + "2" + "=");
            return (((double) last + nums[i]) / 2);
        } else {
            System.out.print("The median is");
            return nums[i];
        }
    }

    private double oneArray(int n, int[] arr, int median, boolean isEven, int last, int counter) {
        while (counter != median) {
            n++;
            last = arr[n];
            counter++;
        }
        return getMedian(arr, n, isEven, last);
    }


    public List<Interval> merge(List<Interval> intervals) {
        Stack<Interval> stack = new Stack<>();
        for (int i = 0; intervals.size() - 1 >= i; i++) {
            if (stack.isEmpty()) {
                stack.push(intervals.get(i));
            }
            if (intervals.get(i).start >= stack.peek().start && intervals.get(i).start <= stack.peek().end) {
                if (intervals.get(i).end > stack.peek().end) {
                    Interval customize = new Interval(stack.peek().start, intervals.get(i).end);
                    stack.pop();
                    stack.push(customize);
                }
            } else {
                stack.push(intervals.get(i));
            }
        }

        List<Interval> result = new ArrayList<>();
        while (!stack.isEmpty()) {
            result.add(stack.peek());
            stack.pop();
        }
        return result;
    }


    class Sorting implements Comparator<Interval> {
        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[] = {1,5};
        int b[] = {2,4};
        double res = solution.findMedianSortedArrays(a, b);
        System.out.println(res);

        List<Interval> list = new ArrayList<>();
        list.add(solution.new Interval(8, 14));
        list.add(solution.new Interval(2, 3));
        list.add(solution.new Interval(6, 13));
        list.add(solution.new Interval(3, 3));
        Collections.sort(list, solution.new Sorting());
        List<Interval> result = solution.merge(list);
        System.out.println("Final Merging Intervals");
        for (Interval i : result)
            System.out.println("{" + i.start + "," + i.end + "}");
    }
}

