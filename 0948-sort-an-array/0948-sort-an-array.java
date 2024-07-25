class Solution {
    public int[] sortArray(int[] nums) {     
        //step 1 => convert the array into max heap for ascending order- heapify(it will let it satisfy the heap property)
        // step 2 => swap the first and last and heapify for the remaning elements
        // call heapify for all the non leaf nodes
        int n=nums.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(i,n,nums);
        }
        //heap sort
        heapSort(nums);
        return nums;
    }
    //this is for max heap
    public static void heapify(int i,int n, int arr[]){
        int left= 2*i+1;
        int right= 2*i+2;
        int maxidx=i;
        if(left<n && arr[left]> arr[maxidx]){
            maxidx=left;
        }
        if(right<n && arr[right]> arr[maxidx]){
            maxidx=right;
        }
        if(maxidx!=i){
            int temp=arr[maxidx];
            arr[maxidx]=arr[i];
            arr[i]=temp;
            heapify(maxidx, n, arr);
        }
    }

//a[] is now a max heap--> sort it
    public static void heapSort(int a[]){
        int n=a.length;
        for(int i=n-1;i>0;i--){
            int temp=a[0];
            a[0]=a[i];
            a[i]=temp;
            heapify(0,i,a);
        }
    }
}