import java.util.*;
public class find_dublicate {
    public static void main(String[] args) {

        int [] nums = {1,3,4,2,2};

        Arrays.sort(nums);

        System.out.println(dublicate(nums));
    }
    static int dublicate(int[]nums){

        for (int i = 0; i<nums.length; i++){

            if(nums[i]== nums[i+1]){

                return nums[i];
            }
        }

        return 0;

    }
}
