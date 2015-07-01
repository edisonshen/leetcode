import java.util.*;


public class HappyNumberSolution {
	public static boolean isHappy(int n)
	{
		int sum = 0;
		int count = 0;
		int mod;
		Set<Integer> prevSum = new HashSet<Integer>();
		while(n != 0)
		{
			mod = n % 10;
			n = (int)(n / 10);
			sum += mod * mod;
			count ++;
		}
		sum = sum + count * count ;
		prevSum.add(sum);
		while(!prevSum.contains(sum))
		{
			if( sum == 1)
			{
			return true;
			}else if (sum != 1){
				return false;
			}
		}
		
		
	}
	public static void main (String[] args)
	{
		int n = 19;
		System.out.println(isHappy(n));
	}
	
}
