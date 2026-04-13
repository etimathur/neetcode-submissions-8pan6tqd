class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new ArrayList<>();

        for(int i =0; i< num.length; i++) {
            if(num[i] > 0) break;
            else if( i > 0 && num[i] == num[i-1]) continue;
            int l = i + 1, r = num.length - 1;
            while (l < r) {
                int sum = num[i] + num[l] + num[r];
                if(sum > 0)
                    r--;
                else if (sum < 0)
                    l++;
                else {
                    res.add(Arrays.asList(num[i], num[l], num[r]));
                    l++;
                    r--;
                    while (l < r && num[l] == num[l - 1]) {
                        l++;
                    }
                }
            }
        }

        return res;
    } 
}
