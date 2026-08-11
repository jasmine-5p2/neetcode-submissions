class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] res = new int[nums.length - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        int left = 0;
        int index = 0;

        for (int right = 0; right < nums.length; right++) {

            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[right]) {
                dq.pollLast();
            }

            dq.offerLast(right);

            if (dq.peekFirst() < left) {
                dq.pollFirst();
            }

            if (right - left + 1 == k) {
                res[index] = nums[dq.peekFirst()];
                index++;
                left++;
            }
        }

        return res;
    }
}