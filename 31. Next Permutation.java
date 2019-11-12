import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
    	int ascendIndex = 0;
    	int minNumBeforeAscend = nums[nums.length - 1];
    	int minIndexBeforeAscend = nums.length - 1;
        for (int i = nums.length - 1; i > 0; i--) {
        	
			if (nums[i] > nums[i-1]) {
				ascendIndex = i - 1;
			System.out.println(ascendIndex);
				break;
			}
		}
        for (int i = nums.length - 1; i > ascendIndex; i--) {
        	if (nums[minIndexBeforeAscend] <= nums[ascendIndex]) {
				minIndexBeforeAscend--;
				minNumBeforeAscend = nums[minIndexBeforeAscend];
			}
        	if (minNumBeforeAscend > nums[i] && nums[i] > nums[ascendIndex]) {
				minNumBeforeAscend = nums[i];
				minIndexBeforeAscend = i;
				
				
			}
		}
        System.out.print(minIndexBeforeAscend);
        if (minIndexBeforeAscend==0) {
        	Arrays.parallelSort(nums, 0, nums.length);
        	return;
		}
        swap(nums, ascendIndex, minIndexBeforeAscend);
        

        Arrays.parallelSort(nums, ascendIndex+1, nums.length);

    }
    
    public void swap(int[] nums,int a,int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
}
