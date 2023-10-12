class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

            int sum = 0;
            for(int i=0;i<nums.length;i+=2){

                sum += nums[i];
            }

            return sum;
    }

    public static void main(String args[]){
        Solution set = new Solution();
        int[] nums1 = {1,4,3,2};
        int[] nums2 = {6,2,6,5,1,2};

            System.out.println("Output: " + set.arrayPairSum(nums1));

            System.out.println("Output: " + set.arrayPairSum(nums2));
    }
}