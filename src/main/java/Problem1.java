public class Problem1 {

    /*
    This program takes an array of colors and sorts them in order of color 1,2,3. To avoid using more than one loop i
    went with a while loop and checked using start and end to move along the array. If the index in the array was equal
    to 0 i would take the value of nums[index] and move it to num[start] and from there i would move start and index
    so that it would change the next index. If the nums[index] is equal to 2 i set its value to the end of the array and
     then moved the value of end to the left. If the nums[index]=1 nothing happens except for the updating of the index.
     */

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