package NPTEL_CP;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] nums={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int key = 5;
        int ans = Dim(nums,key);



    }

    private static int Dim(int[][] nums,int key)
    {
        int index =-1;
        for(int i=0;i< nums.length;i++) {
            int len = nums[i].length - 1;

            if (nums[i][len] >= key) {
                index = searchBinary(nums[i], key, 0, len + 1);
                if (index == -1) {
                    return -1;
                } else {
                    return index;
                }
            }
        }
        return -1;
    }


    private static int searchBinary(int[] nums, int key,int start,int end) {
        if(start<=end)
        {
            int mid = (start + end)/2;
            if(nums[mid]==key)
            {
                return mid;

            }
            else {
                if(nums[mid] < key)
                {
                   return searchBinary(nums, key, mid + 1, end);
                }
                else {
                   return searchBinary(nums,key,start,mid-1);
                }
            }
        }
        else {
           return -1;
        }

    }
}
