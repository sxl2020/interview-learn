package tag_01_arraries.code_002_removeDuplicates;

public class RemoveDuplicates_s2_19_03_11 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int p1 = 0;
        for (int p2 = 1; p2 < nums.length; p2++){
            if (nums[p2] != nums[p1]){
                nums[++p1] = nums[p2];
            }
        }
        return p1+ 1;
    }
}
