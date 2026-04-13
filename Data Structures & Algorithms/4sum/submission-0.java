class Solution {
    public List<List<Integer>> fourSum(int[] n, int target) {
        
        Arrays.sort(n);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i =0; i < n.length; i++) {
            if(i > 0 && n[i] == n[i-1]) continue;

            for(int j = i+1; j< n.length; j++) {
                if( j > i + 1 && n[j] == n[j-1]) continue;

                int l = j+1, r = n.length - 1;
                while( l < r) {
                    long s = (long) n[i] + n[j] + n[l] + n[r];
                    if(s == target) {
                        res.add(Arrays.asList(n[i], n[j], n[l], n[r]));
                        l++;
                        r--;
                        while( l < r && n[l] == n[l-1]) l++;
                        while( l < r && n[r] == n[r+1]) r--;
                    }
                    else if(s < target){
                        l++;
                    }
                    else
                        r--;
                }
            }

        }
        return res;
    }
}