
public class RemoveDuplicatesSolution {
	public static int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;
        
        int count = 1;
        // result = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] != nums[i+1])
            {
               
                count++;
            }
        }
    
        return count;
    }
	public static void main(String[] args)
	{	int[] a = {1,1,2};
		System.out.println(removeDuplicates(a));
		}
}

