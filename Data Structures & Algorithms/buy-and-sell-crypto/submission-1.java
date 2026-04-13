class Solution {
    public int maxProfit(int[] price) {
        if(price.length <= 1)
            return 0;
        int m = price[1] - price[0], min = price[0];
        for(int i =0; i< price.length; i++) {
            if(m < (price[i] - min))
                m = price[i] - min; 
            if(min > price[i])
                min = price[i];
        }
        if(m < 0)
            return 0;
        return m;
    }
}
