class Solution {
    public void reverseString(char[] a) {
        int j = a.length - 1;
        for(int i = 0; i< a.length/2 && j>=0; i++) {
            char t = a[i];
            a[i] =a[j];
            a[j] = t;
            j--;
        } 

    }
}