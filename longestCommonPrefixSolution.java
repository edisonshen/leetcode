
public class longestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs.length == 0 || strs == null)
        {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
        {
            int j = 0 ;
            while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j)== strs[i].charAt(j) )
            {
                j++;
            }
        
            if (j == 0) 
            {
            return "";
            }
            prefix = strs[i].substring(0,j);
        } 
        return prefix;
        
    }
    
}

