/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
public class TwoSum {

	public static void main(String[] args) {
		int [] nums = {2,7,11,15};
		int target = 9;
		int[] index = new int[2];
		
		index = twoSum(nums, target);
		
		System.out.print(index[0] + " " + index[1]);
		
		
	}
	
	  public static int[] twoSum(int[] nums, int target) {
		  int [] index = new int[2];
		  
		  for(int i = 0; i < nums.length; i++) {
			  for(int j = 0; j < nums.length; j++) {
				  //make sure it's not the current element
				  if((i != j))
				  {
					  int one = nums[i];
					  int two = nums[j];
					  
					  if((one + two) == target) {			  
						  index[0] = j;
						  index[1] = i;
						  break;
					  }
				  }
			  }
		  }

	        return index;
	    }

}
