package NPTEL_CP;

public class LinerSearch {
    public static void main(String[] args) {
        int[] nums={1,3,2,4,57,5};
        int key = 4;
        int index=linearSearch(nums,key);
        if(index==-1)
        {
            System.out.println("not found");
        }
        else {
            System.out.println("Found at "+index+1);
        }
    }

    //Linear search algorithm implementation


    private static int linearSearch(int[] nums,int key) {
        for(int i=0;i<nums.length;i++)
        {
            if(key == nums[i])
            {
                return i;
            }
        }
        return -1;
    }
}
