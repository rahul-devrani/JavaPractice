import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        swap(nums, 4, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int nums[],int a,int b){
         int temp =nums[a];
         nums[a] = nums[b];
         nums[b] = temp;
    }
    
}
