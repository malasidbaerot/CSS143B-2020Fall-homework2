public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
     */

    // Do not change signature (function name, parameters type, and return type)
    public static int [] colorSort(int [] nums){
        if(nums.length==0|| nums.length==1){
            return nums;
        }
        int start=0;
        int end= nums.length-1;
        int index=0;
        while(index<=end && start<end){
            if(nums[index]==0){
                nums[index]= nums[start];
                nums[start]=0;
                start++;
                index++;
            }
            else if(nums[index]==2){
                nums[index]=nums[end];
                nums[end]=2;
                end--;
            }
            else if(nums[index]==1){
                index++;
            }
        }
        return nums;
    }
}