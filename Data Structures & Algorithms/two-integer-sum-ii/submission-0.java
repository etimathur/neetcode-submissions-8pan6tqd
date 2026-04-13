class Solution {
    public int[] twoSum(int[] number, int target) {
        for(int i = 0; i < number.length; i++) {
            for(int j = i+1 ; j < number.length; j++) {
                if((number[i] + number[j] == target))
                    return new int[] { i + 1,j + 1};
            }
        }
        return new int[2];
    }
}
