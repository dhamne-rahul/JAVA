package MultiThreading.BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr={0,10,15,2,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int ans=0;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            {
                return arr[mid];
            }
            else if(arr[mid]<arr[mid+1])
            {
                start=mid+1;
            }
            else{
                end=mid;
            }
        }  
        return -1;
    }
}
