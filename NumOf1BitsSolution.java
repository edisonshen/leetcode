
public class NumOf1BitsSolution {
	public int hammingWeight(int n)
	{
		if (n == 0) return 0;
		int count = 0;
		while (n != 0)
		{
			n = n & (n-1);
			count ++;
		}
		return count;
		
		
		
//		if(n==0) return 0;
//		int count = 0;
//		while (n != 0)
//		{
//			n = n & (n-1);
//			count++;
//		}
//		return count;
	}
}
