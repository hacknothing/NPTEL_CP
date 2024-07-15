package NPTEL_CP;

import java.util.Arrays;

public class Reversort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        ReverSort(nums);

    }

    private static void ReverSort(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            int minIndex = minimum(i,nums);
            reverseArray(nums,i,minIndex);
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void reverseArray(int[] nums, int i, int minIndex) {
        while(i<=minIndex)
        {
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
            i++;
            minIndex--;
        }
    }

    private static int minimum(int i,int[] nums) {
        int min=i;
        while(i< nums.length)
        {
            if(nums[i]<nums[min])
            {
                min=i;
            }
            i++;
        }
        return min;
    }
}
