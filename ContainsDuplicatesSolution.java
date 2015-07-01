import java.util.*;


public class ContainsDuplicatesSolution {
	public boolean containsDuplicate(int[] nums)
	{
		Set<Integer> hash = new HashSet<Integer>();
		int len = nums.length;
		for (int i = 0 ; i < len; i++)
		{
			if(hash.contains(nums[i]))
			{
				return true;
			}else hash.add(nums[i]);
		}
		return false;
	}
}
