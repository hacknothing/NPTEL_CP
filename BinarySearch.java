package NPTEL_CP;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int key = 1;
        int index = binarySearch(nums,key,0,nums.length);
        System.out.println(index+1);
    }

    private static int binarySearch(int[] nums, int key,int start,int end) {
        if(start <= end )
        {
            int mid = (start+end)/2;
            if(nums[mid]==key)
            {
                return mid;
            }
            else{

                return nums[mid] < key ? binarySearch(nums, key, mid + 1, end) : binarySearch(nums, key, start, mid-1);
            }
        }
        else {
            return -1;
        }

    }
}
