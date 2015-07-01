import java.util.Arrays;


public class MarjortiyElementSolution {
	public static int marjorityElement(int[] nums)
	{
		if(nums.length == 1) return nums[0];
		
		Arrays.sort(nums);
		int count = 1;
		
		for(int i = 0; i< nums.length; i++)
		{
			if(nums[i] == nums[i+1])
			{
				count ++;
				if (count > nums.length/2) return nums[i];
				
			}else count = 1;
			
		}
		return -1;

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if(nums.length == 1) return nums[0];
//		
//		Arrays.sort(nums);
//		int count = 1;
//		
//		for (int i = 0; i < nums.length - 1; i++)
//		{
//			if(nums[i] == nums[i+1])
//			{
//				count++;
//				if (count > (nums.length)/2) return nums[i];
//			}else
//			{
//				count = 1;
//				
//			}
//		}
//		return 0;
	}
	public static void main(String[] args)
	{
		int[] nums= {3,2,3,2,5,3,3};
		System.out.println(marjorityElement(nums));
	}
}
