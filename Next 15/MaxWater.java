class MaxWater {
    public int maxArea(int[] ht) {
        int max = 0;
        int r = ht.length-1;
        int l = 0;

        int vol, width;
        while(l<r){
            width = r - l;
            if(ht[l] > ht[r]){
                max = Math.max(max, width * ht[r]);
                r--;
            }
            else{
                max = Math.max(max, width * ht[l]);
                l++;
            }

        }
        return max;
    }
}