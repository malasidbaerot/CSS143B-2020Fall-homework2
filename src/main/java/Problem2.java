public class Problem2 {

    /*
    For this program the goal was to remove additional numbers that occur multiple times. Since the array is already
     sorted, all i had to do was go through and check if the array is if nums[index] is not equal to nums[index+1].The
      forloop checks one less than the size of the index becuase we want to check for nums[end-1]!= nums[end].
      Index starts at 1 because we know the first value is unique. in the forloop every instance where the condition
      stated previously is true, the future index is set to nums[i+1] and index is also updated.
     */

    public static int remove(int [] nums){
        int index=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[index++]= nums[i+1];
            }
        }
        return index;
    }
}
