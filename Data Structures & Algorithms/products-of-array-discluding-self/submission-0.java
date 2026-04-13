class Solution {
    public int[] productExceptSelf(int[] num) {
        int[] a = new int[num.length];
        int[] b = new int[num.length];
        int p =1;
        a[0] = 1;
        b[num.length -1] = 1;
        for(int i =1; i< num.length; i++)
        {
            a[i] = num[i - 1] * a[i - 1];
        }
        p = 1;
        for(int i =num.length -2; i>= 0; i--)
        {
            b[i] = num[i + 1] * b[i + 1];
        }
        for(int i =0; i< num.length; i++)
        {
            num[i] = a[i]*b[i];
        }
        return num;
    }
}  
