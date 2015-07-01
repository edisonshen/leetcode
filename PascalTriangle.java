import java.util.*;


public class PascalTriangle {
	public List<List<Integer>> generate(int numRows)
	{
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (numRows<=0)
			return result;
		int j;
		int i;
		for(j = 0; j < numRows; j++)
		{
			List<Integer> row = new ArrayList<Integer>();
			row.add(1);
		}
		for (i = 1; i < j ; i++)
		{
			List<Integer> prerow = row.get(j-1);
			
		}
		
	}
}
