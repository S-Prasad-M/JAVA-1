class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        boolean result[] = new boolean[len];
        for(int i=0; i<len;i++)
        {
            int temp[] = new int[len];
            for(int j=0;j<len;j++)
            {
                if(j==i)
                temp[j] = candies[j]+extraCandies;
                else
                temp[j] = candies[j];
            }
            int max = 0;
            for(int k=0; k<len; k++)
            {
                if(temp[k]>max)
                {
                    max = temp[k];
                }
            }
            if(max == temp[i])
            result[i] = true;
            else
            result[i] = false;
        }
        return result;
    }
}
