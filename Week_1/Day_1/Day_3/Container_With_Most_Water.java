class Solution {
    public int maxArea(int[] height) {

        int maxWater = 0;

        for (int left = 0, right = height.length - 1; left < right; ) {

            int width = right - left;

            int minHeight;

            if (height[left] < height[right]) {
                minHeight = height[left];
            } else {
                minHeight = height[right];
            }

            int area = width * minHeight;

            if (area > maxWater) {
                maxWater = area;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}
