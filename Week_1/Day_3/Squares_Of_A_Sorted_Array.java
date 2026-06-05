class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        int left=0;
        int right=n-1;
        int j=n-1;
        while(left<=right)
        {
        int sqrL=nums[left]*nums[left];
        int sqrR=nums[right]*nums[right];
        if(sqrL>=sqrR)
        {
            res[j]=sqrL;
            left++;
        }
        else
        {
            res[j]=sqrR;
            right--; 
        }
        j--;
        }
        return res;
          
    }
}
