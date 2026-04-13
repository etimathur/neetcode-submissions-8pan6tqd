class Solution {
    public int[] sortArray(int[] nums) {
        return mergeArray(nums, 0, nums.length-1);
    }

    public static int[] mergeArray(int[] ar, int l, int r)
    {
        if(l<r){
            int mid = (l+r)/2;
            mergeArray(ar,l,mid);
            mergeArray(ar,mid+1,r);
            merge(ar,l,mid,r);
        }
        return ar;
    }
    public static void merge(int[] arr, int l,int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;

        int[] la = new int[n1];
        int[] ra = new int[n2];

        for(int i =0; i<n1; i++)
            la[i] = arr[l+i];

        for(int j=0; j<n2; j++)
            ra[j] = arr[mid+1+j];

        int i = 0, j= 0, k = l;
        while (i<n1 && j <n2){
            if(la[i]<=ra[j]){
                arr[k] = la[i];
                k++;
                i++;
            }
            else {
                arr[k] = ra[j];
                k++;
                j++;
            }
            
        }
        while(i<n1){
                arr[k] = la[i];
                k++;
                i++;
            }
            while(j<n2){
                arr[k] = ra[j];
                k++;
                j++;
            }
    }
}